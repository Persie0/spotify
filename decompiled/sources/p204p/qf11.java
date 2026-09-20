package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.jam.internal.socialconnect.models.DetectedToken;
import com.spotify.libs.sociallistening.events.proto.JamResolveTokenResult;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class qf11 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f188094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f188095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f188096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf11(int i, Object obj, Object obj2) {
        super(1);
        this.f188094a = i;
        this.f188095b = obj;
        this.f188096c = obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        pef oefVar;
        pqm0[] pqm0VarArr;
        w2a1 w2a1Var;
        w2a1 w2a1Var2;
        b250 b250Var;
        b250 b250Var2;
        tx31 tx31Var;
        dy31 dy31Var;
        switch (this.f188094a) {
            case 0:
                ada adaVar = (ada) obj;
                if (!((ihk0) this.f188095b).f102313b && !(adaVar instanceof xca)) {
                    ((bus) this.f188096c).invoke(adaVar);
                }
                return w2a1.f247311a;
            case 1:
                tgj tgjVar = (tgj) obj;
                tgjVar.mo50174s1();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (tgjVar.mo295n() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tgjVar.mo295n() & 4294967295L));
                hg11 hg11Var = (hg11) this.f188095b;
                float fFloatValue = ((Number) hg11Var.f90998S0.m45912e()).floatValue() * fIntBitsToFloat;
                long j = hg11Var.f90994O0;
                scg1.m77786h(tgjVar, (ncg1) this.f188096c, new xk80(0, (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloatValue + fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), h6f.m46715L(new n6f(n6f.m63765b(j, 0.1f, 0.0f, 0.0f, 0.0f, 14)), new n6f(n6f.m63765b(j, 0.05f, 0.0f, 0.0f, 0.0f, 14)), new n6f(n6f.m63765b(j, 0.1f, 0.0f, 0.0f, 0.0f, 14))), null), 0.0f, hg11Var.f90997R0, 28);
                return w2a1.f247311a;
            case 2:
                fkf fkfVar = (fkf) this.f188095b;
                int iOrdinal = ((tef) obj).ordinal();
                if (iOrdinal == 0) {
                    oefVar = lef.f132542a;
                } else if (iOrdinal == 1) {
                    oefVar = new oef(fkfVar.f70533b);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oefVar = fkfVar.f70536e ? new nef(fkfVar.f70533b) : mef.f142695a;
                }
                ((ObservableEmitter) this.f188096c).onNext(new zkf(oefVar));
                return w2a1.f247311a;
            case 3:
                return ((nju) this.f188095b).mo26174a(new bl11(((ld7) this.f188096c).f132083b.m92862B0()));
            case 4:
                ArrayList arrayList = (ArrayList) this.f188095b;
                ((uw70) obj).mo30902e(arrayList.size(), new fw20(28, arrayList), new fw20(29, arrayList), new fyf(new C2027jt(19, (dut) this.f188096c, arrayList), true, 802480018));
                return w2a1.f247311a;
            case 5:
                gh00 gh00Var = ((si80) this.f188095b).f209377c;
                ak11 ak11Var = ((mo11) this.f188096c).f145545a;
                gh00Var.invoke(new l901(ak11Var.f16396a, ak11Var.f16401f));
                return w2a1.f247311a;
            case 6:
                nju njuVar = (nju) this.f188095b;
                y64 y64Var = ((z38) this.f188096c).f278813b;
                return njuVar.mo26174a(new jr11(y64Var.m92928r0(), y64Var.m92862B0()));
            case 7:
                k5m0.m55541i(((w5v) this.f188095b).f248203a, s571.m77250i((String) this.f188096c, ":credits"), ((d850) obj).f46380a.f279709a, null, false, 12);
                return w2a1.f247311a;
            case 8:
                tgj tgjVar2 = (tgj) obj;
                tgjVar2.mo50174s1();
                int iOrdinal2 = tgjVar2.getLayoutDirection().ordinal();
                if (iOrdinal2 == 0) {
                    pqm0VarArr = (pqm0[]) this.f188095b;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pqm0VarArr = (pqm0[]) this.f188096c;
                }
                DrawScope.m273U0(tgjVar2, tm4.m81093q((pqm0[]) Arrays.copyOf(pqm0VarArr, pqm0VarArr.length), 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, null, 0, 126);
                return w2a1.f247311a;
            case 9:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                m5r0 m5r0Var = (m5r0) this.f188095b;
                String str = ((vu11) this.f188096c).f244839z;
                if (str == null) {
                    str = "";
                }
                vqg1.m86218C(videoSurfaceView, m5r0Var, str);
                return w2a1.f247311a;
            case 10:
                String str2 = (String) obj;
                m021 m021Var = (m021) this.f188095b;
                if (str2.equals("https://support.spotify.com/article/explicit-content/plain/")) {
                    kv91 kv91Var = m021Var.f138491a;
                    fpg0 fpg0Var = m021Var.f138492b;
                    fpg0Var.getClass();
                    yt91 yt91VarM96903c = fpg0Var.f71851a.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("explicit_content_support_button", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                    dv91 dv91Var = new dv91("hit", 1);
                    String string = str2.toString();
                    kv91Var.mo57452p(new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()));
                } else if (str2.equals("https://support.spotify.com/article/managed-accounts/plain/")) {
                    kv91 kv91Var2 = m021Var.f138491a;
                    fpg0 fpg0Var2 = m021Var.f138492b;
                    fpg0Var2.getClass();
                    yt91 yt91VarM96903c2 = fpg0Var2.f71851a.m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("managed_accounts_support_button", null, null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                    dv91 dv91Var2 = new dv91("hit", 1);
                    String string2 = str2.toString();
                    kv91Var2.mo57452p(new av91("", "", dv91Var2, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string2 != null ? string2 : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()));
                }
                v0y.m84416d((v0y) this.f188096c, str2, false, 6);
                return w2a1.f247311a;
            case 11:
                Throwable th = (Throwable) obj;
                ((o611) this.f188095b).invoke(th);
                bqa bqaVar = (bqa) ((bwt0) this.f188096c).f31731d;
                bqaVar.m30233l(th, false);
                do {
                    Object objM83545c = unc.m83545c(bqaVar.mo30243v());
                    w2a1Var = w2a1.f247311a;
                    if (objM83545c == null) {
                        w2a1Var2 = null;
                    } else {
                        og21 og21Var = (og21) objM83545c;
                        if (og21Var instanceof ng21) {
                            ((ng21) og21Var).f153536b.m45754w0(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
                        }
                        w2a1Var2 = w2a1Var;
                    }
                } while (w2a1Var2 != null);
                return w2a1Var;
            case 12:
                s5o0.m77291r((s5o0) obj, (t5o0) this.f188095b, 0, 0, ((rc21) this.f188096c).f197712c1, 4);
                return w2a1.f247311a;
            case 13:
                b250 b250Var3 = (b250) obj;
                Map map = ((cf21) this.f188095b).f37241c;
                Object obj2 = this.f188096c;
                th00 th00Var = (th00) map.get(obj2.getClass());
                if (th00Var == null || (b250Var2 = (b250) th00Var.invoke(obj2, b250Var3)) == null) {
                    b250Var = b250Var2;
                    b250Var = fau.f67640b;
                }
                b250Var = b250Var2;
                fau fauVar = fau.f67640b;
                if ((b250Var.equals(fauVar) && fauVar.equals(fauVar)) || b250Var.equals(fauVar)) {
                    return fauVar;
                }
                return fauVar.equals(fauVar) ? b250Var : new lbf(b250Var, fauVar);
            case 14:
                g631 g631Var = (g631) this.f188096c;
                vp21 vp21Var = (vp21) this.f188095b;
                q831 q831Var = vp21Var.f243576d;
                q831 q831Var2 = vp21Var.f243576d;
                if (!q831Var.m72301f() || vp21Var.f243578f.mo55547g(vp21Var.f243573a)) {
                    q831Var2.m72307m(g631Var);
                } else {
                    q831Var2.m72305j(g631Var);
                }
                return w2a1.f247311a;
            case 15:
                s5o0 s5o0Var = (s5o0) obj;
                t5o0 t5o0Var = (t5o0) this.f188095b;
                r6r r6rVar = (r6r) this.f188096c;
                s5o0Var.m77293f(t5o0Var, s5o0Var.mo35990l0(r6rVar.f196345c), s5o0Var.mo35990l0(r6rVar.f196346d), 0.0f);
                return w2a1.f247311a;
            case 16:
                v3h1.m84577J((olp) obj, (xoi0) ((C1778dh) this.f188095b).f48929b, new lp21((rp81) this.f188096c, 5));
                return w2a1.f247311a;
            case 17:
                v5j v5jVar = (v5j) obj;
                bjc bjcVar = v5jVar.f237515e;
                z5j z5jVar = v5jVar.f237513c;
                if (((zq70) this.f188095b) == zq70.f285323a) {
                    AbstractC1895gf.m44546o(bjcVar, ((z5j) this.f188096c).f279582g, 0.0f, 0.0f, 6);
                    v5j.m84724e(v5jVar, z5jVar.f279579d, z5jVar.f279581f, 0.0f, 0.0f, 0.0f, 124);
                } else {
                    AbstractC1895gf.m44546o(bjcVar, z5jVar.f279580e, 0.0f, 0.0f, 6);
                    t7j.m80224j(v5jVar.f237516f, z5jVar.f279581f, 0.0f, 6);
                }
                v5jVar.m84728h(new vjr(null, "wrap"));
                v5jVar.m84727g(new vjr(null, "wrap"));
                return w2a1.f247311a;
            case 18:
                e760 e760Var = (e760) obj;
                p4p p4pVar = ((md31) this.f188095b).f142300d;
                List list = (List) this.f188096c;
                qre0 qre0Var = p4pVar.f173994a;
                b760 b760VarM12838t = JamResolveTokenResult.m12838t();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((DetectedToken) it.next()).token);
                }
                b760VarM12838t.m28361q(arrayList2);
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((DetectedToken) it2.next()).discoveryMethod);
                }
                b760VarM12838t.m28360m(arrayList3);
                if (e760Var instanceof c760) {
                    b760VarM12838t.m28363s("client");
                    String strMo29111F = qpv0.f191387a.mo54112b(((c760) e760Var).f34763a.getClass()).mo29111F();
                    b760VarM12838t.m28364t(strMo29111F != null ? strMo29111F : "Unknown");
                } else {
                    if (!(e760Var instanceof d760)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b760VarM12838t.m28363s("server");
                    d760 d760Var = (d760) e760Var;
                    int i = d760Var.f46002a;
                    String str3 = d760Var.f46003b;
                    b760VarM12838t.m28364t(i + ":" + (str3 != null ? str3 : "Unknown"));
                }
                qre0Var.m73616a(b760VarM12838t.build());
                return w2a1.f247311a;
            case 19:
                ComposeView composeView = (ComposeView) this.f188095b;
                kv50 kv50Var = (kv50) this.f188096c;
                composeView.setViewCompositionStrategy(mkr0.f144646T0);
                composeView.setContent(new fyf(new ef31((vh00) obj, kv50Var, 1), true, -1458498657));
                return w2a1.f247311a;
            case 20:
                kv50 kv50Var2 = new kv50(obj);
                ((if31) this.f188095b).mo26196b(new qf11(19, (ComposeView) this.f188096c, kv50Var2));
                return kv50Var2;
            case 21:
                Object obj3 = ((ff31) this.f188095b).f68899d2;
                if (obj3 != null) {
                    ((sxr) this.f188096c).invoke(obj3, obj);
                }
                return w2a1.f247311a;
            case 22:
                mpz0 mpz0Var = (mpz0) obj;
                wz41 wz41Var = (wz41) this.f188096c;
                String str4 = (String) this.f188095b;
                jpz0.m54000n(mpz0Var, str4 != null ? klh.m56834f(wz41Var.f256479f, ". ", str4) : wz41Var.f256479f);
                jpz0.m54007u(mpz0Var, 0);
                return w2a1.f247311a;
            case 23:
                ml31 ml31Var = (ml31) this.f188095b;
                ArrayList arrayList4 = ml31Var.f144749a.f233513d;
                ((uw70) obj).mo30902e(arrayList4.size(), new ol31(0, arrayList4), new ol31(1, arrayList4), new fyf(new pl31(arrayList4, ml31Var, (gh00) this.f188096c, 0), true, 802480018));
                return w2a1.f247311a;
            case 24:
                return fag1.m41151B((pgo) this.f188095b, ((bn31) this.f188096c).f28691a, (xm31) obj);
            case 25:
                return new xk31(((dn51) obj).f50692a, ((n6f) this.f188095b).f150873a, (vk31) this.f188096c, 4);
            case 26:
                ((qkp0) this.f188096c).f189633a.mo47342b(s571.m77251j("spotify:internal:track:", (String) g6f.m43687A0(wl51.m88477a1((String) this.f188095b, new String[]{":"}, 0, 6)), ":dna:report"), (d850) obj, null);
                return w2a1.f247311a;
            case 27:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1("SELECT * FROM SpecificDisabledFilterEntity WHERE id = ?");
                try {
                    ezx0VarMo63454G1.mo24842R(1, (String) this.f188095b);
                    int iM88306q = wjf1.m88306q(ezx0VarMo63454G1, "id");
                    int iM88306q2 = wjf1.m88306q(ezx0VarMo63454G1, "paths");
                    int iM88306q3 = wjf1.m88306q(ezx0VarMo63454G1, "revision");
                    int iM88306q4 = wjf1.m88306q(ezx0VarMo63454G1, "format");
                    if (ezx0VarMo63454G1.mo24841E1()) {
                        tx31Var = new tx31(ezx0VarMo63454G1.mo24844h1(iM88306q), (int) ezx0VarMo63454G1.getLong(iM88306q3), (int) ezx0VarMo63454G1.getLong(iM88306q4), ((v2z) ((sx31) this.f188096c).f214802c.getValue()).m84528a(ezx0VarMo63454G1.mo24844h1(iM88306q2)));
                        break;
                    } else {
                        tx31Var = null;
                    }
                    return tx31Var;
                } finally {
                    ezx0VarMo63454G1.close();
                }
            case 28:
                ((sx31) this.f188095b).f214801b.m61893B((yyx0) obj, (tx31) this.f188096c);
                return w2a1.f247311a;
            default:
                ezx0 ezx0VarMo63454G2 = ((yyx0) obj).mo63454G1("SELECT * FROM SpecificEnabledFilterEntity WHERE id = ?");
                try {
                    ezx0VarMo63454G2.mo24842R(1, (String) this.f188095b);
                    int iM88306q5 = wjf1.m88306q(ezx0VarMo63454G2, "id");
                    int iM88306q6 = wjf1.m88306q(ezx0VarMo63454G2, "paths");
                    int iM88306q7 = wjf1.m88306q(ezx0VarMo63454G2, "brand");
                    int iM88306q8 = wjf1.m88306q(ezx0VarMo63454G2, "model");
                    int iM88306q9 = wjf1.m88306q(ezx0VarMo63454G2, "deviceFormattedName");
                    int iM88306q10 = wjf1.m88306q(ezx0VarMo63454G2, "revision");
                    int iM88306q11 = wjf1.m88306q(ezx0VarMo63454G2, "format");
                    if (ezx0VarMo63454G2.mo24841E1()) {
                        dy31Var = new dy31(ezx0VarMo63454G2.mo24844h1(iM88306q5), ((v2z) ((cy31) this.f188096c).f43151c.getValue()).m84528a(ezx0VarMo63454G2.mo24844h1(iM88306q6)), ezx0VarMo63454G2.mo24844h1(iM88306q7), ezx0VarMo63454G2.mo24844h1(iM88306q8), ezx0VarMo63454G2.mo24844h1(iM88306q9), (int) ezx0VarMo63454G2.getLong(iM88306q10), (int) ezx0VarMo63454G2.getLong(iM88306q11));
                        break;
                    } else {
                        dy31Var = null;
                    }
                    return dy31Var;
                } finally {
                    ezx0VarMo63454G2.close();
                }
        }
    }
}
