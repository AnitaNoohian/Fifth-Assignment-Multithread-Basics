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