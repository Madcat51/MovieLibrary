package site.madcat.movielibrary.ui.activity


import site.madcat.movielibrary.domain.Movie
import site.madcat.movielibrary.domain.MovieRepository
import site.madcat.movielibrary.App
import site.madcat.movielibrary.ui.homeFragment.HomeFragment
import site.madcat.movielibrary.ui.homeFragment.HomeFragmentPresenter
import java.util.*


class MovieActivityPresenter : MovieActivityContract.MovieActivityInterface {
    private var view: MovieActivity?=null
    private lateinit var repository: MovieRepository


    override fun onAttach(view: MovieActivity) {
        this.view=view
        repository=(view.application as App).repository
    }

    override fun onDetach() {
        view=null
    }

    override fun fillRepository() {
        if (repository.cash.size == 0) {
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 1",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1243",
                    4.4.toLong(),
                    123,
                    5
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 2",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1234",
                    4.3.toLong(),
                    12311,
                    5
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 3",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1294",
                    4.2.toLong(),
                    123111,
                    5
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 4",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1834",
                    4.8.toLong(),
                    12322,
                    5
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 5",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "2234",
                    4.1.toLong(),
                    1232,
                    5
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 6",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "3234",
                    4.2.toLong(),
                    1223,
                    5
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 7",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "4234",
                    4.3.toLong(),
                    12223,
                    5
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 8",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "6234",
                    4.9.toLong(),
                    12333,
                    4
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 1",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1243",
                    4.4.toLong(),
                    123,
                    4
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 2",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1234",
                    4.3.toLong(),
                    12311,
                    4
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 3",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1294",
                    4.2.toLong(),
                    123111,
                    4
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 4",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1834",
                    4.8.toLong(),
                    12322,
                    4
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "Название фильма 5",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "2234",
                    4.1.toLong(),
                    1232,
                    4
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw6",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "3234",
                    4.2.toLong(),
                    1223,
                    3
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw7",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "4234",
                    4.3.toLong(),
                    12223,
                    3
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw8",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "6234",
                    4.9.toLong(),
                    12333,
                    3
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw1",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1243",
                    4.4.toLong(),
                    123,
                    3
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw2",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1234",
                    4.3.toLong(),
                    12311,
                    3
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw3",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1294",
                    4.2.toLong(),
                    123111,
                    3
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw4",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1834",
                    4.8.toLong(),
                    12322,
                    3
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw5",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "2234",
                    4.1.toLong(),
                    1232,
                    3
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw6",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "3234",
                    4.2.toLong(),
                    1223,
                    3
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw7",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "4234",
                    4.3.toLong(),
                    12223,
                    2
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw8",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "6234",
                    4.9.toLong(),
                    12333,
                    2
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw1",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1243",
                    4.4.toLong(),
                    123,
                    2
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw2",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1234",
                    4.3.toLong(),
                    12311,
                    2
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw3",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1294",
                    4.2.toLong(),
                    123111,
                    2
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw4",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "1834",
                    4.8.toLong(),
                    12322,
                    1
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw5",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "2234",
                    4.1.toLong(),
                    1232,
                    1
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw6",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "3234",
                    4.2.toLong(),
                    1223,
                    1
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw7",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "4234",
                    4.3.toLong(),
                    12223,
                    2
                )
            )
            repository.addMovie(
                Movie(
                    UUID.randomUUID().toString(),
                    "qwerw8",
                    "Объект TPrinterPreview (невизуальный компонент) позволяет записывать данные для печати в буфер для последующего вывода их на экран либо на принтер. TPrinterPreview имеет все функции и свойства объекта TPrinter. Вы можете использовать объект TPrinterPreview как TPrinter за исключением некоторых деталей. В TPrinter Printer.Canvas.Handle и Printer.Handle одинаковы, а в TPrinterPreview PrinterPreview.Canvas.Handle представляет собой метафайл, в котором записаны данные, и PrinterPreview.Handle, который представляет собой Printer.Handle. По этой причине используйте PrinterPreview.Canvas.Handle для операций, связанных с рисованием (напр. DrawText, DrawTexteEx), и используйте PrinterPreview.Handle в функциях, которые возвращают информацию о возможностях принтера (напр. GetDeviceCaps). Глобальная функция PrinterPreview возвращает объект по умолчанию PrinterPreview, который отображает данные в форме предварительного просмотра, принятой по умолчанию.",
                    "6234",
                    4.9.toLong(),
                    12333,
                    1
                )
            )

        }
    }


}