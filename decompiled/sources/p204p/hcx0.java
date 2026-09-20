package p204p;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class hcx0 {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f89927a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final AtomicLong f89928b = new AtomicLong(0);

    public hcx0(xre xreVar) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m47141a(ibk ibkVar) {
        gcx0 gcx0Var;
        long jMin;
        if (ibkVar instanceof gcx0) {
            gcx0Var = (gcx0) ibkVar;
            int i = gcx0Var.f78666c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gcx0Var.f78666c = i - Integer.MIN_VALUE;
            } else {
                gcx0Var = new gcx0(this, ibkVar);
            }
        } else {
            gcx0Var = new gcx0(this, ibkVar);
        }
        Object obj = gcx0Var.f78664a;
        int i2 = gcx0Var.f78666c;
        AtomicInteger atomicInteger = this.f89927a;
        AtomicLong atomicLong = this.f89928b;
        if (i2 == 0) {
            bga.m29073P(obj);
            long jCurrentTimeMillis = System.currentTimeMillis() - atomicLong.get();
            if (atomicLong.get() > 0 && jCurrentTimeMillis > 60000) {
                atomicInteger.set(0);
                atomicLong.set(0L);
            }
            int i3 = atomicInteger.get();
            if (i3 == 0) {
                jMin = 0;
            } else {
                jMin = Math.min((long) (Math.pow(2.0d, i3 - 1) * 200), 3200L);
            }
            if (jMin > 0) {
                gcx0Var.f78666c = 1;
                Object objM64619l = njg1.m64619l(jMin, gcx0Var);
                yuk yukVar = yuk.f276404a;
                if (objM64619l == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        atomicInteger.incrementAndGet();
        atomicLong.set(System.currentTimeMillis());
        return w2a1.f247311a;
    }
}
