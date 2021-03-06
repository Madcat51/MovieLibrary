package site.madcat.movielibrary.ui.homeFragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import by.kirich1409.viewbindingdelegate.viewBinding
import site.madcat.movielibrary.R
import site.madcat.movielibrary.databinding.FragmentHomeBinding
import site.madcat.movielibrary.domain.MovieEntity

class HomeFragment : Fragment() {
    private val binding by viewBinding(FragmentHomeBinding::bind)
    private lateinit var recyclerView: RecyclerView
    private val adapter=HomeAdapter()
    var swipeRefreshLayout: SwipeRefreshLayout?=null
    private val homeFragmentPresenter=HomeFragmentPresenter()
    private var controller: Controller?=null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Controller) {
            controller=context
        } else {
            //todo
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        controller=null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeFragmentPresenter.onAttach(this)
        swipeRefresh()
    }

    private fun swipeRefresh() {
        swipeRefreshLayout=binding.swipeRefreshLayout
        swipeRefreshLayout?.setOnRefreshListener {
            controller?.refreshMovie()
            initView()
            swipeRefreshLayout?.isRefreshing=false
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        initView()
    }

    private fun initView() {
        recyclerView=binding.homeFragmentGenre1RecyclerView
        recyclerView.setLayoutManager(GridLayoutManager(context, 3))
        adapter.setData(homeFragmentPresenter.repository.movie)
        recyclerView.setAdapter(adapter)
        adapter?.setOnItemClickListener(object : HomeAdapter.IItemClickListener {
            override fun onItemClickListener(movie: MovieEntity) {
                controller?.loadMovie(movie)
            }
        })
    }

    fun updateAdapter() {
        adapter?.notifyDataSetChanged()
    }

    interface Controller {
        fun loadMovie(movie: MovieEntity?)
        fun refreshMovie()
    }

}



