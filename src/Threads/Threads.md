## Threads
- Threads means small processes.
- If we want to do some process execution parallelly, Then we use threads at that time. For eg: suppose you are calling two functions. The moment first functions start executing, it will block the further code. And once first function has executed properly, then second function will start executing. But what if we want to run both the functions at the same time. At that time we use something called threads.
- Threads priority range ranges from 1 to 10.
- 5 is considered normal priority. So it is the default priority for every thread.
- Using getPriority() we can see the priority of a specific thread.
- Thread is a class which implements runnable and runnable has a method which is called run.