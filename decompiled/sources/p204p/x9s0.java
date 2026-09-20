package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class x9s0 extends gb80 {

    /* JADX INFO: renamed from: b */
    public final Context f259436b;

    /* JADX INFO: renamed from: c */
    public final juk f259437c;

    /* JADX INFO: renamed from: d */
    public final oc80 f259438d;

    /* JADX INFO: renamed from: e */
    public final c9k f259439e;

    /* JADX INFO: renamed from: f */
    public final c9k f259440f;

    /* JADX INFO: renamed from: g */
    public sef0 f259441g;

    /* JADX INFO: renamed from: h */
    public sx30 f259442h;

    /* JADX INFO: renamed from: i */
    public final w9s0 f259443i;

    public x9s0(n9s0 n9s0Var, Context context, juk jukVar) {
        this.f259436b = context;
        this.f259437c = jukVar;
        this.f259438d = new oc80(n9s0Var, true);
        n5q n5qVar = xsr.f265651a;
        this.f259439e = kk40.m56661c(pvb0.f181680a);
        this.f259440f = kk40.m56661c(jukVar);
        this.f259443i = new w9s0(this);
    }

    /* JADX INFO: renamed from: e */
    public static final void m90266e(x9s0 x9s0Var, ta80 ta80Var) {
        x0h1.m89578u(x9s0Var.f259439e, null, 0, new s6r0(x9s0Var, ta80Var, null, 8), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final Object m90267f(x9s0 x9s0Var, ibk ibkVar) {
        u9s0 u9s0Var;
        sx30 sx30Var;
        if (ibkVar instanceof u9s0) {
            u9s0Var = (u9s0) ibkVar;
            int i = u9s0Var.f228267d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u9s0Var.f228267d = i - Integer.MIN_VALUE;
            } else {
                u9s0Var = new u9s0(x9s0Var, ibkVar);
            }
        } else {
            u9s0Var = new u9s0(x9s0Var, ibkVar);
        }
        Object objM77895m = u9s0Var.f228265b;
        int i2 = u9s0Var.f228267d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM77895m);
                x9s0Var.f259441g = new sef0(x9s0Var.f259436b);
                sx30Var = null;
                x0h1.m89578u(x9s0Var.f259440f, null, 0, new t9s0(x9s0Var, 0 == true ? 1 : 0, 1), 3);
                sef0 sef0Var = x9s0Var.f259441g;
                if (sef0Var != null) {
                    u9s0Var.f228264a = x9s0Var;
                    u9s0Var.f228267d = 1;
                    objM77895m = sef0Var.m77895m(u9s0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM77895m == yukVar) {
                        return yukVar;
                    }
                }
                x9s0Var.f259442h = sx30Var;
                return w2a1.f247311a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9s0Var = u9s0Var.f228264a;
            bga.m29073P(objM77895m);
            sx30Var = (sx30) objM77895m;
            x9s0Var.f259442h = sx30Var;
        } catch (IllegalStateException unused) {
        }
        return w2a1.f247311a;
    }

    @Override // p204p.gb80
    /* JADX INFO: renamed from: a */
    public final void mo31986a(gc80 gc80Var) {
        x0h1.m89578u(this.f259439e, null, 0, new rgp0(this, gc80Var, null, 7), 3);
    }

    @Override // p204p.gb80
    /* JADX INFO: renamed from: b */
    public final fb80 mo31987b() {
        return this.f259438d.f163857d;
    }

    @Override // p204p.gb80
    /* JADX INFO: renamed from: d */
    public final void mo31988d(gc80 gc80Var) {
        x0h1.m89578u(this.f259439e, null, 0, new s6r0(this, gc80Var, null, 9), 3);
    }
}
