package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SchedulerPoolFactory {

    /* JADX INFO: renamed from: a */
    public static final boolean f10174a;

    public static final class SystemPropertyAccessor implements Function<String, String> {
        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            return System.getProperty((String) obj);
        }
    }

    static {
        boolean zEquals = true;
        try {
            String str = (String) new SystemPropertyAccessor().mo98394apply("rx3.purge-enabled");
            if (str != null) {
                zEquals = "true".equals(str);
            }
        } catch (Throwable th) {
            Exceptions.m23404a(th);
        }
        f10174a = zEquals;
    }
}
