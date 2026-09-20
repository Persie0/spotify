package p204p;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.spotify.player.esperanto.proto.EsPlay$PlayRequest;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.trending.p166v1.TrendingLocationSignalPayload;
import io.reactivex.rxjava3.functions.Function;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class skp implements Function, com.spotify.mobius.functions.Function, fi00, ak30, ys30, oj50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210177a;

    /* JADX INFO: renamed from: b */
    public Object f210178b;

    public /* synthetic */ skp(Object obj, int i) {
        this.f210177a = i;
        this.f210178b = obj;
    }

    /* JADX INFO: renamed from: l */
    public static int m78377l() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public void m78378a(StringBuilder sb, Iterator it) {
        bk60 bk60Var = (bk60) this.f210178b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(bk60.m29643d(entry.getKey()));
            sb.append("=");
            sb.append(bk60.m29643d(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) bk60Var.f27839a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(bk60.m29643d(entry2.getKey()));
                sb.append("=");
                sb.append(bk60.m29643d(entry2.getValue()));
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f210177a) {
            case 2:
                return qwp.m74090b((qwp) this.f210178b, (Throwable) obj);
            case 4:
                return (l780) ((j780) this.f210178b).apply((a780) obj);
            case 6:
                return ((uqw) this.f210178b).f233135a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Play", (EsPlay$PlayRequest) obj).map(xzk.f267678L0).map(use.f233607a1);
            case 10:
                i500 i500Var = (i500) this.f210178b;
                Object obj2 = i500Var.f98681T0;
                return obj2 instanceof sg0 ? ((sg0) obj2).mo34132s() : i500Var.m49699V0().f42745i;
            case 11:
                xul0 xul0Var = (xul0) obj;
                return xul0Var.mo49279c() ? new hzq0(((nl00) this.f210178b).m64711a((w8b) xul0Var.mo49278b())) : C2244p5.f174033a;
            default:
                return ((s5p) ((voi) this.f210178b)).m77299i();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m78379b(zj30 zj30Var) {
        ((ak30) this.f210178b).mo25400e(zj30Var);
    }

    @Override // p204p.ys30
    /* JADX INFO: renamed from: c */
    public fk30 mo25398c(fk30 fk30Var) {
        return ((rb5) ((b9k) this.f210178b).f24957c).m75154v(fk30Var).m42579b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m78380d(String str, TrendingLocationSignalPayload trendingLocationSignalPayload, ibk ibkVar) {
        xla0 xla0Var;
        if (ibkVar instanceof xla0) {
            xla0Var = (xla0) ibkVar;
            int i = xla0Var.f263083c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xla0Var.f263083c = i - Integer.MIN_VALUE;
            } else {
                xla0Var = new xla0(this, ibkVar);
            }
        } else {
            xla0Var = new xla0(this, ibkVar);
        }
        Object objM63324u = xla0Var.f263081a;
        int i2 = xla0Var.f263083c;
        if (i2 == 0) {
            bga.m29073P(objM63324u);
            byte[] byteArray = trendingLocationSignalPayload.toByteArray();
            cva cvaVar = gva.f84678b;
            rz80 rz80Var = new rz80("tny-location-update", (gva) null, gva.m45886d(0, byteArray, byteArray.length), 2);
            yz80 yz80Var = (yz80) this.f210178b;
            List listM44518y = geg1.m44518y(rz80Var);
            xla0Var.f263083c = 1;
            objM63324u = ((n090) yz80Var).m63324u(str, listM44518y, lau.f131415a, xla0Var);
            yuk yukVar = yuk.f276404a;
            if (objM63324u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM63324u);
        }
        p2x0 p2x0Var = (p2x0) objM63324u;
        if (p2x0Var instanceof m2x0) {
            return w2a1.f247311a;
        }
        if (p2x0Var instanceof k2x0) {
            return new c6x0(new RuntimeException(((k2x0) p2x0Var).f118699a.toString()));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.ak30
    /* JADX INFO: renamed from: e */
    public void mo25400e(zj30 zj30Var) {
        mj30 mj30Var = (mj30) zj30Var.f283345b.events().get(zj30Var.f283344a);
        if (mj30Var != null) {
            ((ij30) this.f210178b).mo44172a(mj30Var, zj30Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized u6x m78381f() {
        return u6x.m82466m((i070) ((f070) this.f210178b).m60482b());
    }

    /* JADX INFO: renamed from: g */
    public void m78382g() {
        m600.m60899h((m600) this.f210178b).m39059a();
    }

    @Override // p204p.oj50
    /* JADX INFO: renamed from: h */
    public float mo61924h(float f, float f2, float f3) {
        kiq kiqVar = (kiq) this.f210178b;
        return q3d0.m72108r(kiqVar.m56521j(), kiqVar.m56520i(), f3);
    }

    /* JADX INFO: renamed from: i */
    public synchronized boolean m78383i(int i) {
        Iterator it = Collections.unmodifiableList(((i070) ((f070) this.f210178b).f138791b).m49305q()).iterator();
        while (it.hasNext()) {
            if (((h070) it.next()).m46265r() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m78384j() {
        e72.m38010i0((sr4) this.f210178b, "loadable");
    }

    /* JADX INFO: renamed from: k */
    public synchronized h070 m78385k(uu60 uu60Var) {
        du60 du60VarM73766e;
        int iM78377l;
        try {
            du60VarM73766e = qsv0.m73766e(uu60Var);
            synchronized (this) {
                iM78377l = m78377l();
                while (m78383i(iM78377l)) {
                    iM78377l = m78377l();
                }
            }
            return (h070) g070VarM46263v.m60482b();
        } catch (Throwable th) {
            throw th;
        }
        hzl0 hzl0VarM83972q = uu60Var.m83972q();
        if (hzl0VarM83972q == hzl0.UNKNOWN_PREFIX) {
            hzl0VarM83972q = hzl0.TINK;
        }
        g070 g070VarM46263v = h070.m46263v();
        g070VarM46263v.m60484d();
        h070.m46259m((h070) g070VarM46263v.f138791b, du60VarM73766e);
        g070VarM46263v.m60484d();
        h070.m46262p((h070) g070VarM46263v.f138791b, iM78377l);
        g070VarM46263v.m60484d();
        h070.m46261o((h070) g070VarM46263v.f138791b);
        g070VarM46263v.m60484d();
        h070.m46260n((h070) g070VarM46263v.f138791b, hzl0VarM83972q);
        return (h070) g070VarM46263v.m60482b();
    }

    public String toString() {
        switch (this.f210177a) {
            case 18:
                Locale locale = Locale.US;
                kiq kiqVar = (kiq) this.f210178b;
                return String.format(locale, "clamp(%.2f, %.2f)", Float.valueOf(kiqVar.m56521j()), Float.valueOf(kiqVar.m56520i()));
            default:
                return super.toString();
        }
    }

    public skp(ak30 ak30Var) {
        this.f210177a = 14;
        ak30Var.getClass();
        this.f210178b = ak30Var;
    }

    public skp(int i) {
        this.f210177a = i;
        switch (i) {
            case 19:
                break;
            default:
                okr okrVar = okr.f166656d;
                this.f210178b = xqg1.m91843A().m67260a();
                break;
        }
    }

    public skp(Context context) {
        this.f210177a = 12;
        fp10 fp10Var = new fp10(GoogleSignInOptions.f1736X);
        fp10Var.m42319f();
        fp10Var.m42320g();
        this.f210178b = krg1.m57162g(context, fp10Var.m42315b());
    }

    public skp(wt80 wt80Var, vmz vmzVar, String str) {
        this.f210177a = 8;
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29509U();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        mu80 mu80Var = (mu80) wt80Var;
        fiz fizVarM62846k = mu80Var.m62846k(str, new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), null, null, false, null, c5u0.f34291a, null, 0, null, 478));
        n5q n5qVar = xsr.f265651a;
        int i = 0;
        fiz fizVarM62953p = mvl0.m62953p(oyf1.m68486s(new f9y(bzf1.m31027s(fizVarM62846k, kk40.m56661c(tlp.f221498c), new cs41(100L, 3000L), 1), i), new ic0(23)));
        yab yabVar = vmzVar.f242953a;
        fbk fbkVar = null;
        this.f210178b = g0g1.m43302g(fizVarM62953p, mvl0.m62953p(oyf1.m68486s(new kmx(yabVar, 4), new igd(3, 1, fbkVar))), mvl0.m62953p(oyf1.m68486s(new kmx(yabVar, 5), new ic0(22))), new d9y(this, fbkVar, i));
    }

    public skp(yaz yazVar, ei10 ei10Var) {
        this.f210177a = 25;
        this.f210178b = new m600(28, yazVar, ei10Var);
    }
}
