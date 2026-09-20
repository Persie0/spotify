package p204p;

import android.content.res.Resources;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class ol0 implements cut {

    /* JADX INFO: renamed from: L0 */
    public y02 f166704L0;

    /* JADX INFO: renamed from: M0 */
    public final xiz f166705M0;

    /* JADX INFO: renamed from: N0 */
    public final twt f166706N0 = q0f1.m71838m(new C2279q3(this, 10));

    /* JADX INFO: renamed from: O0 */
    public final j2a1 f166707O0 = new j2a1();

    /* JADX INFO: renamed from: X */
    public final mo0 f166708X;

    /* JADX INFO: renamed from: Y */
    public final rb4 f166709Y;

    /* JADX INFO: renamed from: Z */
    public y02 f166710Z;

    /* JADX INFO: renamed from: a */
    public final Observable f166711a;

    /* JADX INFO: renamed from: b */
    public final w0e1 f166712b;

    /* JADX INFO: renamed from: c */
    public final lbk0 f166713c;

    /* JADX INFO: renamed from: d */
    public final pz0 f166714d;

    /* JADX INFO: renamed from: e */
    public final v02 f166715e;

    /* JADX INFO: renamed from: f */
    public final eju f166716f;

    /* JADX INFO: renamed from: g */
    public final Resources f166717g;

    /* JADX INFO: renamed from: h */
    public final xm0 f166718h;

    /* JADX INFO: renamed from: i */
    public final m500 f166719i;

    /* JADX INFO: renamed from: t */
    public final go0 f166720t;

    public ol0(Observable observable, w0e1 w0e1Var, lbk0 lbk0Var, pz0 pz0Var, v02 v02Var, eju ejuVar, Resources resources, xm0 xm0Var, m500 m500Var, go0 go0Var, mo0 mo0Var, rb4 rb4Var, gb00 gb00Var) {
        this.f166711a = observable;
        this.f166712b = w0e1Var;
        this.f166713c = lbk0Var;
        this.f166714d = pz0Var;
        this.f166715e = v02Var;
        this.f166716f = ejuVar;
        this.f166717g = resources;
        this.f166718h = xm0Var;
        this.f166719i = m500Var;
        this.f166720t = go0Var;
        this.f166708X = mo0Var;
        this.f166709Y = rb4Var;
        this.f166705M0 = vwf1.m86575i(new zux(k0e1.m54985d(observable), gb00Var.m44195a(), new jl0(3, 0, null), 1), pf0.f176896M0, new C2402t6(this, 13), null, new C2199o2(this, 13), 8);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f166707O0;
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: c */
    public final ywt mo24632c() {
        return this.f166706N0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: e */
    public final Object m67273e(x02 x02Var, boolean z, z650 z650Var, ibk ibkVar) {
        ml0 ml0Var;
        gb61 gb61Var;
        x02 x02Var2 = x02Var;
        if (ibkVar instanceof ml0) {
            ml0Var = (ml0) ibkVar;
            int i = ml0Var.f144729d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ml0Var.f144729d = i - Integer.MIN_VALUE;
            } else {
                ml0Var = new ml0(this, ibkVar);
            }
        } else {
            ml0Var = new ml0(this, ibkVar);
        }
        Object objM86755t = ml0Var.f144727b;
        int i2 = ml0Var.f144729d;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            wky wkyVar = new wky(x02Var2.f256758R0, x02Var2.f256763Z instanceof kdl, z);
            String str = x02Var2.f256769f;
            if (str.length() == 0) {
                str = x02Var2.f256770g;
            }
            this.f166720t.m45320a(wkyVar, !wl51.m88460J0(str) ? str : null, x02Var2.f256772i, x02Var2.f256766c, x02Var2.f256761X, x02Var2.f256773t, x02Var2.f256765b, x02Var2.f256760T0, x02Var2.f256756P0.f6349a, x02Var2.f256757Q0.f6351a, null, null, z650Var.f279709a);
            C2417tj c2417tj = new C2417tj(2, bzf1.m31020l(this.f166708X.f145508a.f156539a), x02Var2);
            ml0Var.f144726a = x02Var2;
            ml0Var.f144729d = 1;
            objM86755t = vyf1.m86755t(c2417tj, ml0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x02Var2 = ml0Var.f144726a;
            bga.m29073P(objM86755t);
        }
        kqy kqyVar = (kqy) objM86755t;
        if (kqyVar instanceof hqy) {
            jz1 jz1Var = (jz1) this.f166714d.mo25006a();
            k02 k02Var = new k02(x02Var2.f256772i, x02Var2.f256773t, x02Var2.f256766c, x02Var2.f256761X, x02Var2.f256765b, x02Var2.f256769f, "ad_npv");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ad-data", k02Var);
            jz1Var.m49706b1(bundle);
            this.f166713c.mo58667d(jz1Var, "AdsDsaDialogFragment");
        } else if (kqyVar instanceof dqy) {
            AbstractC1861fi abstractC1861fi = x02Var2.f256763Z;
            kdl kdlVar = abstractC1861fi instanceof kdl ? (kdl) abstractC1861fi : null;
            if (kdlVar != null && (gb61Var = kdlVar.f121693c.f120812d) != null) {
                this.f166718h.m91446c(this.f166719i, new ij40(gb61Var.f78213b, x02Var2.f256773t, x02Var2.f256765b, x02Var2.f256761X));
            }
        } else if (!(kqyVar instanceof fqy)) {
            if (kqyVar instanceof gqy) {
                y02 y02Var = this.f166710Z;
                if (y02Var != null) {
                    y02Var.invoke();
                }
            } else if (kqyVar instanceof iqy) {
                y02 y02Var2 = this.f166704L0;
                if (y02Var2 != null) {
                    y02Var2.invoke();
                }
            } else if (!(kqyVar instanceof jqy)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return w2a1.f247311a;
    }

    @Override // p204p.qy8
    public final uut getBehavior() {
        return this.f166705M0;
    }
}
