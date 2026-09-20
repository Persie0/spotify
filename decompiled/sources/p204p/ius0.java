package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes7.dex */
public final class ius0 implements ap80 {

    /* JADX INFO: renamed from: a */
    public final Context f106025a;

    /* JADX INFO: renamed from: b */
    public final ub80 f106026b;

    /* JADX INFO: renamed from: c */
    public final kq80 f106027c;

    /* JADX INFO: renamed from: d */
    public final k5m0 f106028d;

    /* JADX INFO: renamed from: e */
    public final t0k0 f106029e;

    /* JADX INFO: renamed from: f */
    public final v1k0 f106030f;

    /* JADX INFO: renamed from: g */
    public final xgq0 f106031g;

    /* JADX INFO: renamed from: h */
    public final yts0 f106032h;

    /* JADX INFO: renamed from: i */
    public di41 f106033i;

    public ius0(Context context, ub80 ub80Var, kq80 kq80Var, k5m0 k5m0Var, t0k0 t0k0Var, v1k0 v1k0Var, xgq0 xgq0Var, yts0 yts0Var) {
        this.f106025a = context;
        this.f106026b = ub80Var;
        this.f106027c = kq80Var;
        this.f106028d = k5m0Var;
        this.f106029e = t0k0Var;
        this.f106030f = v1k0Var;
        this.f106031g = xgq0Var;
        this.f106032h = yts0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m51699d(ius0 ius0Var, String str, ibk ibkVar) {
        hus0 hus0Var;
        boolean z;
        Throwable th;
        boolean z2;
        Object c6x0Var;
        if (ibkVar instanceof hus0) {
            hus0Var = (hus0) ibkVar;
            int i = hus0Var.f95458e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hus0Var.f95458e = i - Integer.MIN_VALUE;
            } else {
                hus0Var = new hus0(ius0Var, ibkVar);
            }
        } else {
            hus0Var = new hus0(ius0Var, ibkVar);
        }
        Object obj = hus0Var.f95456c;
        int i2 = hus0Var.f95458e;
        boolean z3 = false;
        if (i2 == 0) {
            bga.m29073P(obj);
            boolean zMo48713h = ((u0k0) ius0Var.f106029e).f225525a.mo48713h(u0k0.f225524b, false);
            boolean zM57999d = ius0Var.f106030f.f236405a.m57999d(ius0Var.f106025a);
            try {
                Single singleM90934c = ius0Var.f106031g.m90934c(srl0.PROMPTED_EXPERIENCES, 3, str);
                hus0Var.f95454a = zMo48713h;
                hus0Var.f95455b = zM57999d;
                hus0Var.f95458e = 1;
                Object objM96567o = zn91.m96567o(singleM90934c, hus0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
                z = zMo48713h;
                obj = objM96567o;
                z2 = zM57999d;
            } catch (Throwable th2) {
                z = zMo48713h;
                th = th2;
                z2 = zM57999d;
                c6x0Var = new c6x0(th);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = hus0Var.f95455b;
            z = hus0Var.f95454a;
            try {
                bga.m29073P(obj);
            } catch (Throwable th3) {
                th = th3;
                c6x0Var = new c6x0(th);
            }
        }
        c6x0Var = Boolean.valueOf(((xrl0) obj).f265371a);
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            na6.m63972t("Failed to get notification opt-in state", thM77348a);
        }
        Boolean bool = Boolean.TRUE;
        if (c6x0Var instanceof c6x0) {
            c6x0Var = bool;
        }
        boolean z4 = (z2 && ((Boolean) c6x0Var).booleanValue()) ? false : true;
        if (!z && z4) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: a */
    public final void mo26656a() {
        di41 di41Var = this.f106033i;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: m */
    public final void mo26658m() {
        di41 di41Var = this.f106033i;
        fbk fbkVar = null;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f106033i = x0h1.m89578u(this.f106026b, null, 0, new mep0(this, fbkVar, 29), 3);
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: n */
    public final void mo26659n() {
        di41 di41Var = this.f106033i;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }
}
