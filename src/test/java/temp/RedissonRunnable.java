package temp;

import org.redisson.Redisson;

public interface RedissonRunnable {

    void run(Redisson redisson);

}
