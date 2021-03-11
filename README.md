# PC Assembly Line with Akka

Cost: 3 points + 1 points for bonus tasks.

Automatize PC assembly line with Akka Framework (use Java API).

Requirements:

* Create PC object and fill it with data from operation to operation.
* Make more than 2 levels-hierarchy of actors.
* Log all steps and meta info about Self and Sender with AkkaLogger.
* Create 1 actor (or more) for each step of process and 1 router to route all requests for assembling.
* Write Service layer with CompletableFutures in signatures (handle router answers or inbox events) where it is possible.
* Provide client code to call Service layer methods (your choice).
* Try with different dispatchers and pick one for your solution.
* Tune ForkJoin executor for your environment (change configuration).
* The choice should be based on performance tests ¹
* Throughput of assembly line should be more than 100 000 assembled PCs per second ¹
* Throughput of assembly line should be more than 1 000 000 assembled PCs per second ¹ 
  
¹ - optional points (5 points per subtask).
