package singleton;

/*It is used where only a single instance of a class
 *  is required to control the action throughout the execution.
 *   A singleton class shouldn't have multiple instances in any case
 *    and at any cost. Singleton classes are used for logging, driver objects,
 *    caching and thread pool, database connections.
*/

public class MySingleton {
	private static MySingleton myOnlyInstance = null;

	// Empty and private constructor makes sure new object cannot be made
	private MySingleton() {

	}

	public static MySingleton getInstance() {
		if (myOnlyInstance == null) {
			myOnlyInstance = new MySingleton();
		}

		return myOnlyInstance;
	}
}
