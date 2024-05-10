## Question 1
when the thread started, run() function is starting and the task is to sleep for 10 sec but when the main thread go to interrupt() part the exception hapening and the try catch get it, so the "Thread was interrupted!" printed, always after try catch all tasks in the finally part are done too, so the "Thread will be finished here!!!" printed.
The output of the code is like this:

    Thread was interrupted!

    Thread will be finished here!!!

## Question 2
when the run() method of a Runnable object is invoked directly, it's starting on the main thread so after run() method is done, "Running in: main" will be printed.
why? because the phrase set in code for printing is this:

 "Running in: " + Thread.currentThread().getName() 
 
 and Thread.currentThread().getName() give the name of a thread is running and here beacuse you didn't initiate run() method in thread object, it runs in main thread and the getname() method return "main".
The output of the code is like this:

    Running in: main

## Question 3    
when the start() method call for a thread, that thread starts and the run() method of it's class is done.
In this code, after thread.start() we called join() method in a try catch, the join() method force the main thread to wait for the thread who call join() method for, for example now we writed "thread.join()" in the code, so the main thread must wait for the thread we made before, to finish all tasks and then continue the code.
We write the try catch, so that even if an exception occurs in the middle of our code, it will not terminate.
when the run() method of joinThread class runs, it prints " Running in: Thread_0" beacuse now the thread we made (named Thread_0) is running.
after the thread ends it prints "Back to: main" beacuse after Thread_0 was done, the main thread continue the code and we get back to main thread so when we call this:
Thread.currentThread().getName()  
it prints "main".
The output of the code is like this:

    Running in: Thread_0
    Back in: main
    
