package p204p;

import android.content.Context;
import android.widget.Toast;
import com.spotify.music.R;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class nm01 implements dut {

    /* JADX INFO: renamed from: L0 */
    public final psp f155212L0;

    /* JADX INFO: renamed from: M0 */
    public final o2d f155213M0;

    /* JADX INFO: renamed from: N0 */
    public final pas0 f155214N0;

    /* JADX INFO: renamed from: O0 */
    public final gmx f155215O0;

    /* JADX INFO: renamed from: P0 */
    public final r3n0 f155216P0;

    /* JADX INFO: renamed from: Q0 */
    public final nc2 f155217Q0;

    /* JADX INFO: renamed from: R0 */
    public final aaq0 f155218R0;

    /* JADX INFO: renamed from: S0 */
    public final nbm0 f155219S0;

    /* JADX INFO: renamed from: T0 */
    public final bvn f155220T0;

    /* JADX INFO: renamed from: U0 */
    public final cvn f155221U0;

    /* JADX INFO: renamed from: V0 */
    public final ckn f155222V0;

    /* JADX INFO: renamed from: W0 */
    public final evn f155223W0;

    /* JADX INFO: renamed from: X */
    public final fjf0 f155224X;

    /* JADX INFO: renamed from: X0 */
    public final avn f155225X0;

    /* JADX INFO: renamed from: Y */
    public final bmh f155226Y;

    /* JADX INFO: renamed from: Y0 */
    public final qf50 f155227Y0;

    /* JADX INFO: renamed from: Z */
    public final z6g0 f155228Z;

    /* JADX INFO: renamed from: Z0 */
    public final String f155229Z0;

    /* JADX INFO: renamed from: a */
    public final Context f155230a;

    /* JADX INFO: renamed from: a1 */
    public final String f155231a1;

    /* JADX INFO: renamed from: b */
    public final z9j0 f155232b;

    /* JADX INFO: renamed from: b1 */
    public final boolean f155233b1;

    /* JADX INFO: renamed from: c */
    public final qhb0 f155234c;

    /* JADX INFO: renamed from: c1 */
    public final it9 f155235c1;

    /* JADX INFO: renamed from: d */
    public final tfm0 f155236d;

    /* JADX INFO: renamed from: d1 */
    public final i4t0 f155237d1;

    /* JADX INFO: renamed from: e */
    public final xuk f155238e;

    /* JADX INFO: renamed from: e1 */
    public final i4t0 f155239e1;

    /* JADX INFO: renamed from: f */
    public final q831 f155240f;

    /* JADX INFO: renamed from: f1 */
    public final pfm0 f155241f1;

    /* JADX INFO: renamed from: g */
    public final n011 f155242g;

    /* JADX INFO: renamed from: g1 */
    public final x1p0 f155243g1;

    /* JADX INFO: renamed from: h */
    public final ciu0 f155244h;

    /* JADX INFO: renamed from: h1 */
    public final String f155245h1;

    /* JADX INFO: renamed from: i */
    public final ynb f155246i;

    /* JADX INFO: renamed from: i1 */
    public final clq0 f155247i1;

    /* JADX INFO: renamed from: j1 */
    public final wg61 f155248j1;

    /* JADX INFO: renamed from: k1 */
    public final wg61 f155249k1;

    /* JADX INFO: renamed from: l1 */
    public di41 f155250l1;

    /* JADX INFO: renamed from: m1 */
    public di41 f155251m1;

    /* JADX INFO: renamed from: n1 */
    public final xiz f155252n1;

    /* JADX INFO: renamed from: o1 */
    public final wg61 f155253o1;

    /* JADX INFO: renamed from: p1 */
    public final wg61 f155254p1;

    /* JADX INFO: renamed from: q1 */
    public final xu91 f155255q1;

    /* JADX INFO: renamed from: r1 */
    public final cph f155256r1;

    /* JADX INFO: renamed from: t */
    public final alb f155257t;

    public nm01(Context context, z9j0 z9j0Var, qhb0 qhb0Var, tfm0 tfm0Var, xuk xukVar, q831 q831Var, n011 n011Var, ciu0 ciu0Var, ynb ynbVar, alb albVar, fjf0 fjf0Var, bmh bmhVar, z6g0 z6g0Var, psp pspVar, o2d o2dVar, pas0 pas0Var, gmx gmxVar, r3n0 r3n0Var, ya11 ya11Var, nc2 nc2Var, aaq0 aaq0Var, nbm0 nbm0Var, bvn bvnVar, cvn cvnVar, ckn cknVar, evn evnVar, avn avnVar, qf50 qf50Var, String str, String str2, boolean z, it9 it9Var, i4t0 i4t0Var, i4t0 i4t0Var2, pfm0 pfm0Var, hrw hrwVar, x1p0 x1p0Var) {
        this.f155230a = context;
        this.f155232b = z9j0Var;
        this.f155234c = qhb0Var;
        this.f155236d = tfm0Var;
        this.f155238e = xukVar;
        this.f155240f = q831Var;
        this.f155242g = n011Var;
        this.f155244h = ciu0Var;
        this.f155246i = ynbVar;
        this.f155257t = albVar;
        this.f155224X = fjf0Var;
        this.f155226Y = bmhVar;
        this.f155228Z = z6g0Var;
        this.f155212L0 = pspVar;
        this.f155213M0 = o2dVar;
        this.f155214N0 = pas0Var;
        this.f155215O0 = gmxVar;
        this.f155216P0 = r3n0Var;
        this.f155217Q0 = nc2Var;
        this.f155218R0 = aaq0Var;
        this.f155219S0 = nbm0Var;
        this.f155220T0 = bvnVar;
        this.f155221U0 = cvnVar;
        this.f155222V0 = cknVar;
        this.f155223W0 = evnVar;
        this.f155225X0 = avnVar;
        this.f155227Y0 = qf50Var;
        this.f155229Z0 = str;
        this.f155231a1 = str2;
        this.f155233b1 = z;
        this.f155235c1 = it9Var;
        this.f155237d1 = i4t0Var;
        this.f155239e1 = i4t0Var2;
        this.f155241f1 = pfm0Var;
        this.f155243g1 = x1p0Var;
        this.f155245h1 = mjd.m61968d(6, str, null);
        okj0 okj0Var = ya11Var.f270711a;
        aon aonVar = (aon) okj0Var.f166380a;
        jg31.m53271i(aonVar);
        xio xioVar = (xio) okj0Var.f166381b;
        jg31.m53271i(xioVar);
        hof hofVar = (hof) okj0Var.f166382c;
        jg31.m53271i(hofVar);
        this.f155247i1 = new clq0(aonVar, xioVar, hofVar, (dtj) okj0Var.f166383d, (q6u) okj0Var.f166384e, (hun0) okj0Var.f166385f, hrwVar, 16);
        int i = 3;
        this.f155248j1 = new wg61(new jm01(this, i));
        int i2 = 1;
        this.f155249k1 = new wg61(new jm01(this, i2));
        int i3 = 0;
        this.f155252n1 = axf1.m27398m(new ptw0(1, this, nm01.class, "externalState", "externalState(Lcom/spotify/campfire/chatpage/elements/sharecard/api/ShareCardElement$Props;)Lkotlinx/coroutines/flow/Flow;", 0, 0, 10), d901.f46619Y0, new km01(this, i3), null, new nnz0(this, 24), 8);
        this.f155253o1 = new wg61(new jm01(this, 2));
        this.f155254p1 = new wg61(new jm01(this, i3));
        this.f155255q1 = new xu91(new km01(this, i2), new a8z0(this, 9));
        fyf fyfVar = new fyf(new puz0(this, 5), true, -4247587);
        wpi0 wpi0Var = xwt.f266743a;
        this.f155256r1 = new cph(fyfVar, i);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f155255q1;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f155256r1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX INFO: renamed from: e */
    public final Object m64771e(bl01 bl01Var, xu01 xu01Var, boolean z, d850 d850Var, ibk ibkVar) {
        mm01 mm01Var;
        z650 z650Var;
        Integer numValueOf = Integer.valueOf(R.string.action_navigate_to_content_error);
        if (ibkVar instanceof mm01) {
            mm01Var = (mm01) ibkVar;
            int i = mm01Var.f144999c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mm01Var.f144999c = i - Integer.MIN_VALUE;
            } else {
                mm01Var = new mm01(this, ibkVar);
            }
        } else {
            mm01Var = new mm01(this, ibkVar);
        }
        Object obj = mm01Var.f144997a;
        int i2 = mm01Var.f144999c;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return w2a1Var;
            }
            bga.m29073P(obj);
            if (xu01Var == xu01.f265969b) {
                this.f155217Q0.m64107b(bl01Var.f28052a, null);
                return w2a1Var;
            }
            if (xu01Var == xu01.f265968a && z) {
                String str = bl01Var.f28052a;
                di41 di41Var = this.f155250l1;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                this.f155250l1 = x0h1.m89578u(this.f155238e, null, 0, new xay0(this, str, fbkVar, 25), 3);
                return w2a1Var;
            }
            kbm0 kbm0Var = this.f155219S0.get();
            String str2 = kbm0Var != null ? kbm0Var.f121231a : null;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (d850Var == null || (z650Var = d850Var.f46380a) == null) ? null : z650Var.f279709a;
            CompletableObserveOn completableObserveOnM70885b = this.f155212L0.m70885b(bl01Var.f28052a, str2, 2, str3 != null ? str3 : "");
            mm01Var.f144999c = 1;
            Object objM96565n = zn91.m96565n(completableObserveOnM70885b, mm01Var);
            yuk yukVar = yuk.f276404a;
            return objM96565n == yukVar ? yukVar : w2a1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
            na6.m63963k(true, "Invalid resource ID provided: %s", null);
            this.f155240f.m72305j(new g631(null, "", numValueOf, null, null, null, null, null, false));
            return w2a1Var;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m64772f(String str, cvt cvtVar, xu01 xu01Var, boolean z) {
        fbk fbkVar = null;
        if (xu01Var == xu01.f265969b) {
            this.f155217Q0.m64107b(str, null);
            return;
        }
        xu01 xu01Var2 = xu01.f265968a;
        xuk xukVar = this.f155238e;
        if (xu01Var == xu01Var2 && z) {
            di41 di41Var = this.f155250l1;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            this.f155250l1 = x0h1.m89578u(xukVar, null, 0, new xay0(this, str, fbkVar, 25), 3);
            return;
        }
        if (hyv.m49202b(str) && cvtVar != null) {
            di41 di41Var2 = this.f155251m1;
            if (di41Var2 != null) {
                di41Var2.mo26601e(null);
            }
            this.f155251m1 = x0h1.m89578u(xukVar, null, 0, new lmz0(this, str, cvtVar, fbkVar, 5), 3);
            return;
        }
        try {
            mjd.m61965a(this.f155232b, str, cvtVar != null ? m3h1.m60683w(cvtVar) : null, null);
        } catch (Exception unused) {
            Context context = this.f155230a;
            Toast.makeText(context, context.getString(R.string.action_navigate_to_content_error), 0).show();
            na6.m63971s("Campfire - Error when opening share. uri: ".concat(str));
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f155252n1;
    }
}
