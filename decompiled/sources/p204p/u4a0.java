package p204p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes10.dex */
public final class u4a0 implements w4a0 {

    /* JADX INFO: renamed from: a */
    public final Object f226640a;

    /* JADX INFO: renamed from: b */
    public final qsz0 f226641b;

    public u4a0(gh00 gh00Var, qsz0 qsz0Var) {
        this.f226640a = gh00Var;
        this.f226641b = qsz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: c */
    public static final Object m82320c(u4a0 u4a0Var, Object obj, ibk ibkVar) {
        t4a0 t4a0Var;
        u4a0Var.getClass();
        if (ibkVar instanceof t4a0) {
            t4a0Var = (t4a0) ibkVar;
            int i = t4a0Var.f216957c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t4a0Var.f216957c = i - Integer.MIN_VALUE;
            } else {
                t4a0Var = new t4a0(u4a0Var, ibkVar);
            }
        } else {
            t4a0Var = new t4a0(u4a0Var, ibkVar);
        }
        Object obj2 = t4a0Var.f216955a;
        int i2 = t4a0Var.f216957c;
        if (i2 == 0) {
            bga.m29073P(obj2);
            for (v4a0 v4a0Var : u4a0Var.f226641b) {
            }
            return obj;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            bga.m29073P(obj2);
            return obj2;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    @Override // p204p.w4a0
    /* JADX INFO: renamed from: b */
    public final Observable mo28288b() {
        return k0e1.m54988g(new nzx0(new q0a0(this, null, 2)), dau.f47107a);
    }

    @Override // p204p.w4a0
    public final Bundle serialize() {
        return null;
    }

    @Override // p204p.w4a0
    /* JADX INFO: renamed from: a */
    public final void mo28287a(Bundle bundle) {
    }
}
