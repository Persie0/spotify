package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class b37 {

    /* JADX INFO: renamed from: a */
    public final Context f22920a;

    /* JADX INFO: renamed from: b */
    public final k5m0 f22921b;

    /* JADX INFO: renamed from: c */
    public final mdf0 f22922c;

    /* JADX INFO: renamed from: d */
    public final w37 f22923d;

    /* JADX INFO: renamed from: e */
    public long f22924e;

    public b37(Context context, k5m0 k5m0Var, mdf0 mdf0Var, w37 w37Var) {
        this.f22920a = context;
        this.f22921b = k5m0Var;
        this.f22922c = mdf0Var;
        this.f22923d = w37Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m27998a(long j, ibk ibkVar) {
        a37 a37Var;
        if (ibkVar instanceof a37) {
            a37Var = (a37) ibkVar;
            int i = a37Var.f11890d;
            if ((i & Integer.MIN_VALUE) != 0) {
                a37Var.f11890d = i - Integer.MIN_VALUE;
            } else {
                a37Var = new a37(this, ibkVar);
            }
        } else {
            a37Var = new a37(this, ibkVar);
        }
        Object objM86755t = a37Var.f11888b;
        int i2 = a37Var.f11890d;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            nzx0 nzx0Var = new nzx0(new sqc0(this.f22922c, (fbk) null, 21));
            a37Var.f11887a = j;
            a37Var.f11890d = 1;
            objM86755t = vyf1.m86755t(nzx0Var, a37Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = a37Var.f11887a;
            bga.m29073P(objM86755t);
        }
        return new yvc0(j, ((ldf0) objM86755t).f132157a && lzj.m60353c(this.f22920a, "android.permission.RECORD_AUDIO") == 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m27999b(long j) {
        if (j <= this.f22924e || ((Number) this.f22923d.f247503a.getValue()).longValue() >= j) {
            return;
        }
        this.f22924e = j;
        this.f22922c.m61519a();
        k5m0.m55541i(this.f22921b, xoc1.f264211v4.f243453a, null, xud.m92149p(hdf0.f90132c), true, 2);
    }
}
