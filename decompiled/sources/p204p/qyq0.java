package p204p;

import android.content.Intent;
import com.google.protobuf.Empty;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.BiFunction;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfigDummy$ResolveDummyRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamStartResponseOuterClass$StreamStartResponse;
import com.spotify.thestage.vtec.logic.VtecAndroidToWebMessage$PlaybackStatusChanged;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class qyq0 implements Function, Init, tn61, lir, BiFunction, Predicate, eo91, w1j0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194015a;

    /* JADX INFO: renamed from: b */
    public static final qyq0 f194006b = new qyq0(0);

    /* JADX INFO: renamed from: c */
    public static final qyq0 f194007c = new qyq0(1);

    /* JADX INFO: renamed from: d */
    public static final qyq0 f194008d = new qyq0(2);

    /* JADX INFO: renamed from: e */
    public static final qyq0 f194009e = new qyq0(3);

    /* JADX INFO: renamed from: f */
    public static final qyq0 f194010f = new qyq0(4);

    /* JADX INFO: renamed from: g */
    public static final qyq0 f194011g = new qyq0(6);

    /* JADX INFO: renamed from: h */
    public static final qyq0 f194012h = new qyq0(7);

    /* JADX INFO: renamed from: i */
    public static final qyq0 f194013i = new qyq0(8);

    /* JADX INFO: renamed from: t */
    public static final qyq0 f194014t = new qyq0(9);

    /* JADX INFO: renamed from: X */
    public static final qyq0 f194000X = new qyq0(10);

    /* JADX INFO: renamed from: Y */
    public static final qyq0 f194002Y = new qyq0(11);

    /* JADX INFO: renamed from: Z */
    public static final qyq0 f194004Z = new qyq0(12);

    /* JADX INFO: renamed from: L0 */
    public static final qyq0 f193988L0 = new qyq0(13);

    /* JADX INFO: renamed from: M0 */
    public static final qyq0 f193989M0 = new qyq0(14);

    /* JADX INFO: renamed from: N0 */
    public static final qyq0 f193990N0 = new qyq0(15);

    /* JADX INFO: renamed from: O0 */
    public static final qyq0 f193991O0 = new qyq0(16);

    /* JADX INFO: renamed from: P0 */
    public static final qyq0 f193992P0 = new qyq0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final qyq0 f193993Q0 = new qyq0(18);

    /* JADX INFO: renamed from: R0 */
    public static final qyq0 f193994R0 = new qyq0(20);

    /* JADX INFO: renamed from: S0 */
    public static final qyq0 f193995S0 = new qyq0(21);

    /* JADX INFO: renamed from: T0 */
    public static final qyq0 f193996T0 = new qyq0(22);

    /* JADX INFO: renamed from: U0 */
    public static final qyq0 f193997U0 = new qyq0(23);

    /* JADX INFO: renamed from: V0 */
    public static final qyq0 f193998V0 = new qyq0(24);

    /* JADX INFO: renamed from: W0 */
    public static final qyq0 f193999W0 = new qyq0(25);

    /* JADX INFO: renamed from: X0 */
    public static final qyq0 f194001X0 = new qyq0(26);

    /* JADX INFO: renamed from: Y0 */
    public static final qyq0 f194003Y0 = new qyq0(27);

    /* JADX INFO: renamed from: Z0 */
    public static final qyq0 f194005Z0 = new qyq0(28);

    public /* synthetic */ qyq0(int i) {
        this.f194015a = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m74218a(StringBuilder sb, rp60 rp60Var) throws IOException {
        List listMo25528e = rp60Var.mo25528e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo25528e) {
            if (((hr60) obj).getKind() == 2) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        g6f.m43752x0(arrayList, sb, null, "context(", ") ", hrl0.f94466Y, 50);
    }

    /* JADX INFO: renamed from: b */
    public static void m74219b(StringBuilder sb, String str) {
        sb.append(gga.m44680s(qti0.m73841e(str)));
    }

    /* JADX INFO: renamed from: c */
    public static void m74220c(StringBuilder sb, rp60 rp60Var) {
        List listMo25531k = ((cpv0) rp60Var).mo25531k();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo25531k) {
            hr60 hr60Var = (hr60) obj;
            if (hr60Var.getKind() == 1 || hr60Var.getKind() == 3) {
                arrayList.add(obj);
            }
        }
        hr60 hr60Var2 = (hr60) g6f.m43747t0(0, arrayList);
        if (hr60Var2 != null) {
            sb.append(m74225j(hr60Var2.getType(), false));
            sb.append(".");
        }
        hr60 hr60Var3 = (hr60) g6f.m43747t0(1, arrayList);
        if (hr60Var3 != null) {
            sb.append("(");
            sb.append(m74225j(hr60Var3.getType(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    /* JADX INFO: renamed from: e */
    public static wa81 m74221e() {
        return !wl51.m88496t0("profile", "release", false) ? jmj0.f113900a : wv4.f255393a;
    }

    /* JADX INFO: renamed from: f */
    public static String m74222f(vvq vvqVar) throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = vvqVar.mo25528e().iterator();
        Object obj = null;
        Object obj2 = null;
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                obj = obj2;
                break;
            }
            Object next = it.next();
            if (((hr60) next).getKind() == 3) {
                if (z) {
                    break;
                }
                z = true;
                obj2 = next;
            }
        }
        hr60 hr60Var = (hr60) obj;
        if (hr60Var != null) {
            sb.append(m74225j(hr60Var.getType(), false));
            sb.append(".");
        }
        g6f.m43752x0(oqg1.m67642k(vvqVar), sb, ", ", "(", ")", hrl0.f94452L0, 48);
        sb.append(" -> ");
        sb.append(m74225j(vvqVar.mo25530i(), false));
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m74223h(qr60 qr60Var) throws IOException {
        StringBuilder sb = new StringBuilder();
        m74218a(sb, qr60Var);
        sb.append(qr60Var instanceof br60 ? "var " : "val ");
        m74220c(sb, qr60Var);
        m74219b(sb, qr60Var.getName());
        sb.append(": ");
        sb.append(m74225j(qr60Var.mo25530i(), false));
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0050  */
    /* JADX INFO: renamed from: i */
    public static void m74224i(StringBuilder sb, up60 up60Var, z400 z400Var, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        boolean z3;
        if (up60Var.getTypeParameters().size() < list.size()) {
            ife ifeVar = (ife) up60Var;
            if (ifeVar.mo28587A().getDeclaringClass() != null) {
                sb2 = sb;
                z3 = z2;
                m74224i(sb2, qpv0.f191387a.mo54112b(ifeVar.mo28587A().getDeclaringClass()), z400Var.m95305e(), g6f.m43729k0(list, up60Var.getTypeParameters().size()), false, z3);
                sb2.append(".");
                sb2.append(gga.m44680s(z400Var.m95306g()));
            } else {
                sb2 = sb;
                z3 = z2;
                sb2.append(gga.m44682u(z400.m95300f(z400Var)));
            }
        } else {
            sb2 = sb;
            z3 = z2;
            sb2.append(gga.m44682u(z400.m95300f(z400Var)));
        }
        m74227l(sb2, g6f.m43714b1(list, up60Var.getTypeParameters().size()), z, z3);
    }

    /* JADX INFO: renamed from: j */
    public static String m74225j(sr60 sr60Var, boolean z) throws IOException {
        z400 z400Var;
        AbstractC1969i7 abstractC1969i7 = (AbstractC1969i7) sr60Var;
        if (abstractC1969i7.mo32815I()) {
            AbstractC1969i7 abstractC1969i7Mo32817N = abstractC1969i7.mo32817N();
            wj50.m88279p(abstractC1969i7Mo32817N);
            return m74225j(abstractC1969i7Mo32817N, true);
        }
        AbstractC1969i7 abstractC1969i7Mo32817N2 = abstractC1969i7.mo32817N();
        AbstractC1969i7 abstractC1969i7Mo32820Q = abstractC1969i7.mo32820Q();
        if (abstractC1969i7Mo32817N2 != null && abstractC1969i7Mo32820Q != null) {
            String strM74226k = m74226k(abstractC1969i7Mo32817N2);
            String strM74226k2 = m74226k(abstractC1969i7Mo32820Q);
            if (wj50.m88271j(strM74226k, bm51.m29801l0(strM74226k2, "?", ""))) {
                return bm51.m29801l0(strM74226k2, "?", "!");
            }
            if (bm51.m29796g0(strM74226k2, "?", false)) {
                if (wj50.m88271j(strM74226k + '?', strM74226k2)) {
                    return strM74226k + '!';
                }
            }
            if (wj50.m88271j("(" + strM74226k + ")?", strM74226k2)) {
                return s571.m77251j("(", strM74226k, ")!");
            }
            String strM44681t = gga.m44681t(strM74226k, strM74226k2, new mqv0(strM74226k, 0), new mqv0(strM74226k, 1), hrl0.f94454N0);
            if (strM44681t != null) {
                return strM44681t;
            }
            return "(" + strM74226k + ".." + strM74226k2 + ')';
        }
        StringBuilder sb = new StringBuilder();
        sr60 sr60VarMo32821g = abstractC1969i7.mo32821g();
        if (sr60VarMo32821g != null) {
            sb.append(sr60VarMo32821g);
            sb.append(" /* = ");
        }
        kq60 kq60VarMo27067y = sr60Var.mo27067y();
        if (kq60VarMo27067y instanceof ur60) {
            m74219b(sb, ((ur60) kq60VarMo27067y).f233241c);
            if (sr60Var.mo27066q()) {
                sb.append("?");
            } else if (abstractC1969i7.mo32813C()) {
                sb.append(" & Any");
            }
        } else if (kq60VarMo27067y instanceof up60) {
            up60 up60Var = (up60) kq60VarMo27067y;
            if (abstractC1969i7.mo32814G()) {
                z400Var = qm41.f190095b;
            } else {
                up60 up60VarMo32812A = abstractC1969i7.mo32812A();
                if (up60VarMo32812A == null) {
                    up60VarMo32812A = up60Var;
                }
                String strMo29110D = up60VarMo32812A.mo29110D();
                z400Var = strMo29110D != null ? new z400(strMo29110D) : null;
            }
            if (z400Var == null) {
                z400Var = new z400(((cq60) up60Var).f40745b.getName());
            }
            if (z400Var.m95307h(rm41.f200444k) && wj50.m88271j(bjg1.m29428O(z400Var), si00.f209308d) && !sr60Var.mo27065K().contains(xr60.f265273c)) {
                if (abstractC1969i7.mo27066q()) {
                    sb.append("(");
                }
                if (abstractC1969i7.mo32816M()) {
                    sb.append("suspend ");
                }
                g6f.m43752x0(g6f.m43731l0(1, abstractC1969i7.mo27065K()), sb, null, "(", ") -> ", null, 114);
                sb.append(g6f.m43687A0(abstractC1969i7.mo27065K()));
                if (abstractC1969i7.mo27066q()) {
                    sb.append(")?");
                }
            } else {
                m74224i(sb, up60Var, z400Var, sr60Var.mo27065K(), sr60Var.mo27066q(), z);
            }
        } else if (kq60VarMo27067y instanceof tr60) {
            z400 z400Var2 = ((tr60) kq60VarMo27067y).f222990a.f269048a;
            z400Var2.getClass();
            g6f.m43752x0(z400.m95300f(z400Var2), sb, ".", null, null, hrl0.f94453M0, 60);
            sb = sb;
            m74227l(sb, sr60Var.mo27065K(), sr60Var.mo27066q(), z);
        } else {
            sb.append("???");
        }
        if (abstractC1969i7.mo32821g() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m74226k(sr60 sr60Var) {
        return m74225j(sr60Var, false);
    }

    /* JADX INFO: renamed from: l */
    public static void m74227l(StringBuilder sb, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            g6f.m43752x0(list, sb2, null, "<", ">", new lqv0(z2), 50);
        }
        if (z) {
            sb2.append("?");
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object next;
        String str;
        switch (this.f194015a) {
            case 0:
                CollectionPlatformEsperantoItemsResponse collectionPlatformEsperantoItemsResponse = (CollectionPlatformEsperantoItemsResponse) obj;
                int iM6895o = collectionPlatformEsperantoItemsResponse.m6875n().m6895o();
                return (200 > iM6895o || iM6895o >= 300) ? Completable.m23286j(new Exception(collectionPlatformEsperantoItemsResponse.m6875n().m6896q())) : CompletableEmpty.f7437a;
            case 1:
                return Boolean.FALSE;
            case 2:
                return nat0.f152116a;
            case 3:
            case 5:
            case 7:
            case 9:
            case 13:
            case 14:
            case 17:
            case 19:
            case 21:
            case 22:
            default:
                return new rsd1((Throwable) obj);
            case 4:
                xul0 xul0Var = (xul0) obj;
                boolean z = true;
                if (xul0Var.mo49279c()) {
                    api apiVar = (api) xul0Var.mo49278b();
                    if (!apiVar.mo26697m() && !apiVar.mo26709y().contains("audio/media")) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                return ((faw0) ((eaw0) obj)).callSingle("spotify.remote_config.esperanto.proto.RemoteConfigDummyResolve", "ResolveDummyProperty", EsRemoteConfigDummy$ResolveDummyRequest.m20403n()).map(kxq0.f127576h).toObservable();
            case 8:
                return (gmr0) ((xul0) obj).mo49278b();
            case 10:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 11:
                return Boolean.valueOf(((String) obj).equals("1"));
            case 12:
                return new byl0((Throwable) obj);
            case 15:
                return new u331(Boolean.valueOf(((List) obj).contains(new q121("minus"))));
            case 16:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (((api) next).mo26697m()) {
                        return xul0.m92200a(next);
                    }
                }
                next = null;
                return xul0.m92200a(next);
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return StreamStartResponseOuterClass$StreamStartResponse.m21693p(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.stream_reporting_esperanto.proto.StreamStartResponseOuterClass.StreamStartResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 20:
                return Integer.valueOf(((m951) obj).getFormat());
            case 23:
                return ((Optional) obj).map(klr0.f123947d);
            case 24:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isBuffering()) {
                    str = "buffering";
                } else if (playerState.isPaused()) {
                    str = "paused";
                } else {
                    str = playerState.isPlaying() ? "playing" : "loading";
                }
                return new hzq0(new VtecAndroidToWebMessage$PlaybackStatusChanged(str, hdi.m47210B(playerState)));
        }
    }

    @Override // p204p.eo91
    /* JADX INFO: renamed from: d */
    public bo91 mo39549d(zov0 zov0Var) {
        return null;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((wst0) obj);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Set set = dd41.f47702f;
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        String strM35712j = r46.m74726U(dataString).m35712j();
        String str = strM35712j != null ? strM35712j : "";
        return tm4.m81101y(c81.class, new k81(str, xoc1.f263908I5.m83614b("spotify:internal:parental-control:manage-blocked-content:search:".concat(str)), k1n0.f118397b));
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f194015a) {
            case 17:
                return ((gv31) obj).f84603b == 1;
            default:
                return ((e301) obj).f55572b;
        }
    }

    public qyq0(ku0 ku0Var) {
        this.f194015a = 29;
    }

    @Override // p204p.lir
    public boolean test(Object obj, Object obj2) {
        return !wj50.m88271j(((d4z0) obj).f45274c, ((d4z0) obj2).f45274c);
    }

    @Override // com.spotify.mobius.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return k621.m55575c((k621) obj, null, (h1u) obj2, null, null, null, null, false, null, null, 0, null, 16381);
    }
}
