package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CanEatAspect {
	

    @Around("@annotation(annotations.CanEat)")
    public Object checkForPoisonousFoods(final ProceedingJoinPoint pjp) throws Throwable {
		return pjp.proceed();
    }


}
