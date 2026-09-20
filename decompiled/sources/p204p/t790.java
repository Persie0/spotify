package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity;
import com.spotify.lyrics.offlineimpl.database.LyricsDatabase_Impl;
import com.spotify.mobius.coroutines.DispatcherWorker;
import java.util.Arrays;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class t790 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f217729a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f217730b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t790(Object obj, int i) {
        super(0);
        this.f217729a = i;
        this.f217730b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f217729a) {
            case 0:
                return (ry8) ((w4n) ((ol9) this.f217730b).f166794e).get();
            case 1:
                hb11 hb11Var = (hb11) ((C1790du) this.f217730b).f52930h;
                w2a1 w2a1Var = w2a1.f247311a;
                hb11Var.mo46962a(w2a1Var);
                return w2a1Var;
            case 2:
                eb90 eb90Var = (eb90) this.f217730b;
                return new e560(26, (fiz) ((wg61) ((li80) eb90Var.f57865c).f133742d).getValue(), (bb90) eb90Var.f57864b.get());
            case 3:
                li80 li80Var = (li80) this.f217730b;
                ze90 ze90Var = (ze90) li80Var.f133740b;
                return (ze90Var.m95976k() && ze90Var.m95969d()) ? xtm0.m92074U(((vmz) li80Var.f133741c).m86024a("listening-activity", false), new x1w((fbk) null, li80Var, 19)) : new ysk(Boolean.FALSE, 27);
            case 4:
                ze90 ze90Var2 = (ze90) this.f217730b;
                bji bjiVar = ze90Var2.f281979q;
                if (bjiVar != null) {
                    return (ze90) bjiVar.mo29483e(new au3(ze90Var2, 13));
                }
                return null;
            case 5:
                ((tz60) this.f217730b).dispose();
                return w2a1.f247311a;
            case 6:
                hzd0 hzd0Var = new hzd0();
                bm90 bm90Var = (bm90) this.f217730b;
                hzd0Var.mo33104m(new ebf0((ern0) pwb.m71227l(nau.f152117a)));
                m12 m12Var = bm90Var.f28472b;
                hzd0 hzd0Var2 = (hzd0) m12Var.f138799e;
                fbk fbkVar = null;
                if (!m12Var.f138796b) {
                    hzd0Var2.mo49264n(z8g1.m95591k(xtm0.m92074U(((tq80) ((kq80) m12Var.f138798d)).m81306d(), new x1w(fbkVar, m12Var, 25)), 3), new iz0(m12Var, 22));
                    m12Var.f138796b = true;
                }
                hzd0Var.mo49264n(hzd0Var2, new c53(hzd0Var, 8));
                d670 d670Var = bm90Var.f28473c;
                return z2h1.m95219z(new bjc0(new ct3(((z4p) d670Var.f45617b).m95362a(hzd0Var), ((ocq) d670Var.f45618c).m66721a(hzd0Var), w9h1.m87517y(new C1873fu(26), null, null, 3), hzd0Var, (ao20) ((w4n) d670Var.f45619d).get()), new t690(bm90Var, 14)), mi21.m61822f(1.0f, cxh0.f43038a), null, 4);
            case 7:
                return (t9p0) ((i4t0) ((bmx) this.f217730b).f28646d).get();
            case 8:
                efk0 efk0Var = ((hn90) this.f217730b).f93265E1;
                if (efk0Var != null) {
                    return new dfk0(efk0Var.f59064d.incrementAndGet());
                }
                wj50.m88260d0("nowPlayingVisibilityStateUpdater");
                throw null;
            case 9:
                mo90 mo90Var = (mo90) ((to90) this.f217730b).f222206b.get();
                if (mo90Var != null) {
                    qo90 qo90Var = mo90Var.f145631a;
                    x0h1.m89578u(qo90Var.f190842L0, null, 0, new vsr(qo90Var, null, 21), 3);
                }
                return w2a1.f247311a;
            case 10:
                mwx0 mwx0Var = ((c5a0) this.f217730b).f34113b;
                if (mwx0Var.f147896c != null) {
                    mwx0Var.m63071c();
                    if (mwx0Var.f147896c != null) {
                        throw new IllegalStateException("Loader is already running.");
                    }
                    mwx0Var.f147896c = mwx0Var.f147894a.subscribe(new xc5(mwx0Var, 17));
                }
                return w2a1.f247311a;
            case 11:
                xj21[] xj21VarArr = (xj21[]) this.f217730b;
                return hhg1.m47533l((xj21[]) Arrays.copyOf(xj21VarArr, xj21VarArr.length));
            case 12:
                Object obj = (d6a0) this.f217730b;
                w3x0 w3x0Var = obj instanceof w3x0 ? (w3x0) obj : null;
                if (w3x0Var != null) {
                    return w3x0Var.serialize();
                }
                return null;
            case 13:
                return ((s4a0) ((sdo) this.f217730b).f208048b).serialize();
            case 14:
                return new DispatcherWorker((luk) ((pk0) this.f217730b).f178339g);
            case 15:
                return new cjc0((dut) ((w4n) ((z13) this.f217730b).f278218c).get(), z3a0.f278824M0);
            case 16:
                bq70 bq70Var = (bq70) this.f217730b;
                return ((yoe1) bq70Var.f29722c).m94281c((Context) bq70Var.f29721b);
            case 17:
                return new en2((nvc) this.f217730b);
            case 18:
                dc40 dc40Var = (dc40) this.f217730b;
                if (!(dc40Var instanceof bc40)) {
                    if (dc40Var instanceof cc40) {
                        return ufc1.m82967e((Drawable) ((cc40) dc40Var).f36305a.invoke());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Bitmap bitmap = (Bitmap) ((bc40) dc40Var).f25774a.invoke();
                if (bitmap != null) {
                    return new rh9(bitmap);
                }
                return null;
            case 19:
                return (LocationManager) ((cha0) this.f217730b).f37970a.getSystemService("location");
            case 20:
                return new av91("", "", new dv91("hit", 1), new bv91("close_app", 1, Collections.singletonMap("app", "music")), ((x9g0) this.f217730b).f259363b, st91.f213865b, System.currentTimeMillis());
            case 21:
                Context context = ((ora0) this.f217730b).f168516a;
                try {
                    Context applicationContext = context.getApplicationContext();
                    zk1 zk1Var = new zk1(context.getApplicationContext());
                    zk1Var.m96268L();
                    return s1v.m76988a(applicationContext, "accountswitching_logged_out_usernames", zk1Var.m96280f(), q1v.f184410b, r1v.f194925b);
                } catch (Exception e) {
                    Logger.m3967c(e, "AccountSwitching: logged out usernames store could not be created", new Object[0]);
                    return null;
                }
            case 22:
                return (kv91) ((rva0) this.f217730b).f203027a.get();
            case 23:
                s4b0 s4b0Var = (s4b0) this.f217730b;
                bji bjiVar2 = s4b0Var.f205543b;
                if (bjiVar2 != null) {
                    return (s4b0) bjiVar2.mo29483e(new c3f(s4b0Var, 14));
                }
                return null;
            case 24:
                h6b0 h6b0Var = (h6b0) this.f217730b;
                bji bjiVar3 = h6b0Var.f88058c;
                if (bjiVar3 != null) {
                    return (h6b0) bjiVar3.mo29483e(new c3f(h6b0Var, 15));
                }
                return null;
            case 25:
                t6b0 t6b0Var = (t6b0) this.f217730b;
                bji bjiVar4 = t6b0Var.f217527b;
                if (bjiVar4 != null) {
                    return (t6b0) bjiVar4.mo29483e(new c3f(t6b0Var, 16));
                }
                return null;
            case 26:
                w7b0 w7b0Var = (w7b0) this.f217730b;
                bji bjiVar5 = w7b0Var.f248625b;
                if (bjiVar5 != null) {
                    return (w7b0) bjiVar5.mo29483e(new c3f(w7b0Var, 17));
                }
                return null;
            case 27:
                return new bcb0((LyricsDatabase_Impl) this.f217730b);
            case 28:
                egb0 egb0Var = (egb0) this.f217730b;
                if (egb0Var.f59295e.mo55547g(egb0Var.f59296f)) {
                    egb0Var.f59295e.mo55546f();
                } else {
                    egb0Var.f59294d.mo47345e();
                }
                return w2a1.f247311a;
            default:
                ((LyricsFullscreenPageActivity) this.f217730b).finish();
                return w2a1.f247311a;
        }
    }
}
