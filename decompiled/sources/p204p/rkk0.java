package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rkk0 extends ri00 implements eh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f200086h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rkk0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f200086h = i4;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        h600 h600VarMo49777a;
        switch (this.f200086h) {
            case 0:
                return (hv31) ((i4t0) this.f78014b).get();
            case 1:
                return (lo51) ((i4t0) this.f78014b).get();
            case 2:
                return (luk) ((i4t0) this.f78014b).get();
            case 3:
                return (h1d0) ((i4t0) this.f78014b).get();
            case 4:
                return (wt80) ((i4t0) this.f78014b).get();
            case 5:
                return (yz80) ((i4t0) this.f78014b).get();
            case 6:
                return (ud80) ((i4t0) this.f78014b).get();
            case 7:
                return (gcu0) ((i4t0) this.f78014b).get();
            case 8:
                return (aq51) ((i4t0) this.f78014b).get();
            case 9:
                return (vpx) ((i4t0) this.f78014b).get();
            case 10:
                return (di40) ((i4t0) this.f78014b).get();
            case 11:
                return (l89) ((i4t0) this.f78014b).get();
            case 12:
                return (mv4) ((i4t0) this.f78014b).get();
            case 13:
                return (fiz) ((i4t0) this.f78014b).get();
            case 14:
                return (fiz) ((i4t0) this.f78014b).get();
            case 15:
                return (luk) ((i4t0) this.f78014b).get();
            case 16:
                return (qre0) ((i4t0) this.f78014b).get();
            case 17:
                return (Context) ((i4t0) this.f78014b).get();
            case 18:
                return (luk) ((i4t0) this.f78014b).get();
            case 19:
                return (xv4) ((i4t0) this.f78014b).get();
            case 20:
                return (luk) ((i4t0) this.f78014b).get();
            case 21:
                return Long.valueOf(((nok0) this.f78014b).m65241a());
            case 22:
                ((nok0) this.f78014b).getClass();
                return Long.valueOf(mjx0.m62029g(System.currentTimeMillis()));
            case 23:
                mwx0 mwx0Var = ((vwp) this.f78014b).f245520a.f287041n1;
                if (mwx0Var != null && mwx0Var.f147896c != null) {
                    mwx0Var.m63071c();
                    if (mwx0Var.f147896c != null) {
                        throw new IllegalStateException("Loader is already running.");
                    }
                    mwx0Var.f147896c = mwx0Var.f147894a.subscribe(new xc5(mwx0Var, 17));
                }
                return w2a1.f247311a;
            case 24:
                ((b7l0) this.f78014b).m28390f();
                return w2a1.f247311a;
            case 25:
                ((b7l0) this.f78014b).m28390f();
                return w2a1.f247311a;
            case 26:
                y0m0 y0m0Var = (y0m0) this.f78014b;
                l5j0 l5j0Var = y0m0Var.f268011a;
                if (y0m0Var.f268015e == null && (l5j0Var.mo58245h() instanceof i5j0)) {
                    l5j0Var.mo58253p(l5j0Var.mo58245h());
                }
                return w2a1.f247311a;
            case 27:
                y0m0 y0m0Var2 = (y0m0) this.f78014b;
                c7j0 c7j0Var = y0m0Var2.f268012b;
                l5j0 l5j0Var2 = y0m0Var2.f268011a;
                k5j0 k5j0VarMo58245h = l5j0Var2.mo58245h();
                c7j0Var.f34940b.mo33104m((k5j0VarMo58245h == null || (h600VarMo49777a = k5j0VarMo58245h.mo49777a()) == null) ? null : h600VarMo49777a.f87940a);
                l5j0Var2.mo58247j();
                y0m0Var2.f268013c.m89135a();
                return w2a1.f247311a;
            case 28:
                ((g5m0) this.f78014b).mo28382f();
                return w2a1.f247311a;
            default:
                ((g5m0) this.f78014b).m43615p();
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkk0(Object obj, int i) {
        super(0, obj, nok0.class, "currentTimeMonotonic", "currentTimeMonotonic()J", 0, 0);
        this.f200086h = i;
        switch (i) {
            case 22:
                super(0, obj, nok0.class, "currentTimeWallClock", "currentTimeWallClock()J", 0, 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkk0(b7l0 b7l0Var, int i) {
        super(0, b7l0Var, b7l0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
        this.f200086h = i;
        switch (i) {
            case 25:
                super(0, b7l0Var, b7l0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkk0(i4t0 i4t0Var, int i) {
        super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
        this.f200086h = i;
        switch (i) {
            case 2:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 3:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 4:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 5:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 6:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 7:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 8:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 9:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 10:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 11:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 12:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 13:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 14:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 15:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 16:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 17:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 18:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 19:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            default:
                break;
        }
    }
}
