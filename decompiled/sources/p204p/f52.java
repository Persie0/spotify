package p204p;

import android.app.Activity;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class f52 implements cvb0 {

    /* JADX INFO: renamed from: a */
    public final Activity f65902a;

    /* JADX INFO: renamed from: b */
    public final xre f65903b;

    /* JADX INFO: renamed from: c */
    public final vmz f65904c;

    /* JADX INFO: renamed from: d */
    public final zmn0 f65905d;

    /* JADX INFO: renamed from: e */
    public final c9k f65906e;

    /* JADX INFO: renamed from: f */
    public boolean f65907f;

    /* JADX INFO: renamed from: g */
    public di41 f65908g;

    public f52(Activity activity, xre xreVar, vmz vmzVar, luk lukVar, zmn0 zmn0Var) {
        this.f65902a = activity;
        this.f65903b = xreVar;
        this.f65904c = vmzVar;
        this.f65905d = zmn0Var;
        this.f65906e = kk40.m56661c(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
    
        if (r7.m96490z(r1, r9, r3, r0) == r5) goto L44;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m40742a(f52 f52Var, d92 d92Var, fbk fbkVar) {
        d52 d52Var;
        zr9 zr9Var;
        int i;
        zr9 zr9Var2;
        eug1 ms9Var;
        if (fbkVar instanceof d52) {
            d52Var = (d52) fbkVar;
            int i2 = d52Var.f45308e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d52Var.f45308e = i2 - Integer.MIN_VALUE;
            } else {
                d52Var = new d52(f52Var, fbkVar);
            }
        } else {
            d52Var = new d52(f52Var, fbkVar);
        }
        Object objM86757v = d52Var.f45306c;
        int i3 = d52Var.f45308e;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = d52Var.f45305b;
                zr9Var = d52Var.f45304a;
                bga.m29073P(objM86757v);
                Integer num = (Integer) objM86757v;
                voc1 voc1Var = x92.f259259b;
                if (y0h1.m92580r(f52Var.f65902a.getIntent())) {
                    ms9Var = new ms9(xoc1.f263917J6.f243453a);
                } else {
                    ms9Var = ns9.f157716b;
                }
                zmn0 zmn0Var = f52Var.f65905d;
                d52Var.f45304a = null;
                d52Var.f45305b = i;
                d52Var.f45308e = 2;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86757v);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM86757v);
        int iOrdinal = d92Var.ordinal();
        if (iOrdinal == 0) {
            zr9Var = null;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        zr9Var2 = zr9.f285584b;
                    } else {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f52Var.f65907f = true;
                        di41 di41Var = f52Var.f65908g;
                        if (di41Var != null) {
                            di41Var.mo26601e(null);
                        }
                        f52Var.f65908g = null;
                    }
                }
                zr9Var = null;
            } else {
                zr9Var2 = zr9.f285583a;
            }
            zr9Var = zr9Var2;
        }
        if (zr9Var != null) {
            C2417tj c2417tj = new C2417tj(9, qvf1.m74019p(f52Var.f65904c), f52Var);
            d52Var.f45304a = zr9Var;
            i = 0;
            d52Var.f45305b = 0;
            d52Var.f45308e = 1;
            objM86757v = vyf1.m86757v(c2417tj, d52Var);
            if (objM86757v != yukVar) {
                Integer num2 = (Integer) objM86757v;
                voc1 voc1Var2 = x92.f259259b;
                if (y0h1.m92580r(f52Var.f65902a.getIntent())) {
                    ms9Var = new ms9(xoc1.f263917J6.f243453a);
                } else {
                    ms9Var = ns9.f157716b;
                }
                zmn0 zmn0Var2 = f52Var.f65905d;
                d52Var.f45304a = null;
                d52Var.f45305b = i;
                d52Var.f45308e = 2;
            }
            return yukVar;
        }
        return w2a1.f247311a;
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: c */
    public final void mo25302c() {
        if (this.f65907f) {
            return;
        }
        this.f65908g = x0h1.m89578u(this.f65906e, null, 0, new C1819em(this, null, 13), 3);
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: d */
    public final void mo25303d() {
        di41 di41Var = this.f65908g;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: g */
    public final void mo25304g(ViewGroup viewGroup) {
    }
}
