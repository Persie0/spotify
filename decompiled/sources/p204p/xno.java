package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xno {

    /* JADX INFO: renamed from: a */
    public static final yno f263698a;

    static {
        AtomicReference atomicReference = yno.f274486a;
        ec21 ec21Var = new ec21();
        while (!atomicReference.compareAndSet(null, ec21Var) && atomicReference.get() == null) {
        }
        f263698a = (yno) yno.f274486a.get();
    }
}
