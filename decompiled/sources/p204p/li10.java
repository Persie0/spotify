package p204p;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class li10 extends dz8 implements o35 {

    /* JADX INFO: renamed from: A */
    public final Account f133686A;

    /* JADX INFO: renamed from: z */
    public final Set f133687z;

    /* JADX WARN: Illegal instructions before constructor call */
    public li10(Context context, Looper looper, int i, twy twyVar, wj10 wj10Var, xj10 xj10Var, int i2) {
        synchronized (nvg1.f158892g) {
            try {
                if (nvg1.f158893h == null) {
                    nvg1.f158893h = new nvg1(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        nvg1 nvg1Var = nvg1.f158893h;
        Object obj = uj10.f230857d;
        ig31.m50506x(wj10Var);
        ig31.m50506x(xj10Var);
        super(context, looper, nvg1Var, i, new c4d1(wj10Var, 7), new bqe1(xj10Var), twyVar.m81808n0());
        this.f133686A = null;
        Set setM81784F = twyVar.m81784F();
        Iterator it = setM81784F.iterator();
        while (it.hasNext()) {
            if (!setM81784F.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f133687z = setM81784F;
    }
}
