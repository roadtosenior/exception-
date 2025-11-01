# 1 Что такое Exception Handling?

* Механизм который позволяет ловить и обрабатывать ошибки в программе чтобы он не завершалась аваринно
* Цель сохранить нормальную работу программы и давать информацию о возникших ошибках 

# 2 Иерархии Исключении

* Object
*     Throwable
*         Error
*         Exception
*             Checked
*             Unchecked

* **Trowable базовый класс для всех ошибок и исключений** 
* **Error ошибки которые не предусмотрены для обработки в программе
* Exception ошиби которые можно обработать в программе
* Checked ошибки которые проверяются при компиляции
* Unckecked ошибки которые не проверяются при компиляции**

При Checked исключениях компилятор требует чтобы мы либо обработали исключение с помощью try catch 
либо же использовали trows чтобы пробросить его выше по стеку

**IOException
SQLException
ClassNotFoundException**

При Unchecked исключениях компилятор не требует обязательной обработки

**NullPointerException
ArithmeticException
ArrayIndexOutOfBoundsException**

Errors возникают при серьезных проблемах в работе JVM и обычно не обрабатываются
**OutOfMemoryError
StackOverflowError**

# 3 Блоки try catch finally
 `try{} catch(YourException e){}`
* Блок try содержит код который может вызвать исключение
* Блок catch содержит код для обработки исключения


# 4 оператор throw позволяет явно выбросить исключение 
* throw new IllegalArgumentException("Неверный аргумент");

# 5 оператор throws используется в сигнатуре метода чтобы указать что метод может выбросить исключение
* public void myMethod() throws IOException {}

# 6 Пользовательские исключения
`public class MyCustomException extends Exception {
    MyCustomException(String message) {
        super(message);
    }
}`

7 как не стоить ловить исключения
* Не ловите общие исключения такие как Exception или Throwable так как это затруднит откладку и так же если вы знаете именно какое исключение могут возникнуть то лучше использовать именно его 

