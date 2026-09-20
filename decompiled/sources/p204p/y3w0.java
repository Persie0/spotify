package p204p;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.net.URLEncoder;

/* JADX INFO: loaded from: classes6.dex */
public final class y3w0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268990a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f268991b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f268992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3w0(int i, Object obj, Object obj2) {
        super(1);
        this.f268990a = i;
        this.f268992c = obj;
        this.f268991b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v18, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List, p.qf40] */
    /* JADX WARN: Type inference failed for: r24v0, types: [p.o6j0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f268990a;
        int i2 = 4;
        int i3 = 3;
        ?? r7 = 0;
        int i4 = 2;
        boolean z = false;
        z = false;
        z = false;
        int i5 = 1;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f268992c;
        Object obj3 = this.f268991b;
        switch (i) {
            case 0:
                return (ry8) ((f6v) obj2).invoke(((f220) obj3).f65091a);
            case 1:
                return (ry8) ((tsv) obj2).invoke(((f220) obj3).f65091a);
            case 2:
                return exb.m40222t(new bjc0(((w4w0) obj2).f247902b.mo33180a(((ofx) obj3).f164918a, true), i4w0.f98602Q0));
            case 3:
                ?? r12 = (qf40) obj2;
                ((uw70) obj).mo30902e(((AbstractC2282q6) r12).mo33075a(), new m8v0(i4, r12), new m8v0(i3, r12), new fyf(new C2027jt(17, (z080) obj3, r12), true, 802480018));
                return w2a1Var;
            case 4:
                adw0 adw0Var = (adw0) ((fdw0) obj3).f68584c.get(((Number) obj).intValue());
                ((cxq0) obj2).getClass();
                if (adw0Var instanceof ycw0) {
                    return ((ycw0) adw0Var).f271586a.f69388c.f66138c;
                }
                if (wj50.m88271j(adw0Var, zcw0.f281579a)) {
                    return "warning_message";
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                d850 d850Var = (d850) obj;
                String str = (String) obj2;
                Bundle bundleM70529j = pp91.m70529j(new pqm0("entity-uri", str));
                String str2 = xoc1.f264092g5.f243453a;
                ?? n6j0Var = d850Var != null ? new n6j0(d850Var) : 0;
                if (str2 == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                if (str == null) {
                    throw new IllegalStateException("title was not set!");
                }
                p6j0 p6j0Var = new p6j0(str2, str, false, false, 0, 0, false, null, null, n6j0Var);
                w9r0 w9r0Var = (w9r0) obj3;
                z9j0 z9j0Var = (z9j0) w9r0Var.f249252b;
                if (z9j0Var.mo47349j((m500) w9r0Var.f249254d)) {
                    z9j0Var.mo47348i(p6j0Var, bundleM70529j);
                } else {
                    k5m0.m55539d((k5m0) w9r0Var.f249253c, p6j0Var, bundleM70529j, 4);
                }
                return w2a1Var;
            case 6:
                mpz0 mpz0Var = (mpz0) obj;
                if (((psx0) obj2) instanceof lsx0) {
                    jpz0.m54010x(mpz0Var, (String) obj3);
                    jpz0.m53987a(mpz0Var);
                }
                return w2a1Var;
            case 7:
                abs0 abs0Var = (abs0) obj2;
                x0h1.m89578u(n5h1.m63737m((m500) abs0Var.f14178b), null, 0, new hrt0(abs0Var, (String) obj3, r7, 20), 3);
                return w2a1Var;
            case 8:
                ((mi80) ((w9r0) obj3).f249253c).getClass();
                return ((hkg0) obj).m47814e((String) obj2, "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
            case 9:
                x1p0 x1p0Var = (x1p0) obj2;
                x0h1.m89578u(n5h1.m63737m((m500) x1p0Var.f257247b), (luk) x1p0Var.f257250e, 0, new hrt0(x1p0Var, (String) obj3, r7, 23), 2);
                return w2a1Var;
            case 10:
                ((xh1) obj2).f261414a.mo47342b("spotify:internal:your-library:messaging", (d850) obj, pp91.m70529j(new pqm0("extra_bottom_sheet_message", new une1((String) obj3))));
                return w2a1Var;
            case 11:
                tlw0 tlw0Var = (tlw0) obj;
                tlw0 tlw0Var2 = (tlw0) obj3;
                ulw0 ulw0Var = (ulw0) obj2;
                if (ulw0Var.f231673s.contains(tlw0Var.f221531a.f224336l)) {
                    int iM38547C = edb.m38547C(1);
                    if (iM38547C == 0) {
                        int iOrdinal = ulw0Var.m83410f().ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (((int) (tlw0Var.m81079b() & 4294967295L)) == ((int) (4294967295L & tlw0Var2.m81079b()))) {
                            }
                        } else if (((int) (tlw0Var.m81079b() >> 32)) == ((int) (tlw0Var2.m81079b() >> 32))) {
                        }
                    } else if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                aaq0 aaq0Var = (aaq0) obj2;
                cxq0 cxq0Var = (cxq0) aaq0Var.f13908b;
                c700 c700Var = (c700) cxq0Var.f43080b;
                k3q0 k3q0Var = (k3q0) cxq0Var.f43081c;
                String str3 = (String) aaq0Var.f13909c;
                String str4 = (String) obj3;
                if (!c700Var.m31611T()) {
                    ipu0 ipu0Var = (ipu0) k3q0Var.mo25006a();
                    ipu0Var.m49706b1(pp91.m70529j(new pqm0("episode_uri", str3), new pqm0("transcript_uri", str4)));
                    ipu0Var.mo63162p1(c700Var, "read_along_report_issue_dialog");
                }
                return w2a1Var;
            case 13:
                kz00 kz00Var = (kz00) obj;
                if (kz00Var.equals(jz00.f117531a)) {
                    C2529wd c2529wd = (C2529wd) obj2;
                    etw0 etw0Var = (etw0) obj3;
                    ((dtw0) c2529wd.f250163d).m36866a((Application) c2529wd.f250160a, etw0Var.f62815a, qlk.m73233l(etw0Var.f62815a, null));
                } else if (!kz00Var.equals(iz00.f107098a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1Var;
            case 14:
                String str5 = ((osw0) obj2).f168909c;
                Set set = msw0.f146871a;
                String string = Uri.parse(str5).buildUpon().appendEncodedPath((String) obj).build().toString();
                if (msw0.m62781c(string)) {
                    ((WebView) obj3).loadUrl(string);
                }
                return w2a1Var;
            case 15:
                m8x0 m8x0Var = (m8x0) obj3;
                ((j8x0) obj2).f110038e.m42750h(m8x0Var.f141167v, m8x0Var.f141161p, m8x0Var.f141162q, rfg1.m75429D(m8x0Var.f141151f.m26118a()), m8x0Var.f141146a, m8x0Var.f141169x, m8x0Var.f141170y, 1, (d850) obj);
                return w2a1Var;
            case 16:
                return (sax0) ((qe70) obj2).invoke((dcm0) obj3, (Bundle) obj);
            case 17:
                jiv0 jiv0Var = new jiv0((p2b) obj3, 28);
                n7x0 n7x0Var = n7x0.f151262e;
                qzv0 qzv0Var = qzv0.f194315c1;
                LinkedHashMap linkedHashMap = ((f220) obj).f65092b;
                linkedHashMap.put(tq31.class, l5h1.m58231o(n7x0Var, gbu.f78413a, jiv0Var, qzv0Var));
                cwt cwtVar = (cwt) obj2;
                if (cwtVar != null) {
                    linkedHashMap.put(zv20.class, cwtVar);
                }
                return w2a1Var;
            case 18:
                return fag1.m41151B(((pex0) obj2).f176879c, ((lus0) obj3).f137150a, (lex0) obj);
            case 19:
                Throwable th = (Throwable) obj;
                y9r0 y9r0Var = (y9r0) obj2;
                if (y9r0Var != null && y9r0Var.m93159b(2)) {
                    ((gh00) obj3).invoke(new q2c1(th));
                }
                return w2a1Var;
            case 20:
                return fag1.m41151B((pgo) obj2, ((ajx0) obj3).f16371a, (xix0) obj);
            case 21:
                return new qlt0(i4, (uwf) obj2, (vwf) obj3);
            case 22:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                wlx0 wlx0Var = (wlx0) obj2;
                Long l = wlx0Var.f252639b;
                wit0 wit0Var = wlx0Var.f252638a;
                Long lValueOf = l != null ? Long.valueOf(jCurrentTimeMillis - l.longValue()) : null;
                ((gh00) obj3).invoke(new olx0(new ftw0(lValueOf != null ? lValueOf.longValue() : wit0Var.f251749e, zBooleanValue ? 2 : 3, wit0Var.f251745a), jCurrentTimeMillis));
                return w2a1Var;
            case 23:
                k35 k35Var = (k35) obj;
                pjo pjoVar = (pjo) ((tnx0) obj2).f222103i.get(k35Var);
                if (pjoVar != null) {
                    return pjoVar;
                }
                pjo pjoVar2 = (pjo) ((Map) obj3).get(k35Var);
                return pjoVar2 == null ? njo.f154639a : pjoVar2;
            case 24:
                ((Boolean) obj).booleanValue();
                ((gh00) obj2).invoke(((gpx0) obj3).f83265c ? rox0.f201359a : wox0.f253610a);
                return w2a1Var;
            case 25:
                ((nlv0) obj2).f155174a = true;
                ((gh00) obj3).invoke((whu0) obj);
                return w2a1Var;
            case 26:
                s5o0.m77291r((s5o0) obj, (t5o0) obj2, 0, 0, new snx0((vay0) obj3, 8), 4);
                return w2a1Var;
            case 27:
                yby0 yby0Var = (yby0) obj2;
                String str6 = (String) obj3;
                yby0Var.f271317b.getClass();
                Charset charset = vuc.f244913a;
                try {
                    str6.getClass();
                    String strName = charset.name();
                    strName.getClass();
                    String strConcat = "https://scannables.scdn.co/uri/800/".concat(URLEncoder.encode(str6, strName));
                    wby0 wby0Var = (wby0) yby0Var.f271318c.mo25006a();
                    c700 c700VarMo15683g0 = yby0Var.f271316a.mo15683g0();
                    wby0Var.f249911S1 = strConcat;
                    wby0Var.f249912T1 = str6;
                    wby0Var.mo63162p1(c700VarMo15683g0, "ScannableImageDialogFragment");
                    return w2a1Var;
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            case 28:
                DrawScope drawScope = (DrawScope) obj;
                uk4 uk4VarM91259a = xk4.m91259a();
                kqi0 kqi0Var = (kqi0) obj3;
                uk4VarM91259a.m83310o(1);
                vbn0.m85168c(uk4VarM91259a, new tiv0(0.0f, 0.0f, Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)), Float.intBitsToFloat((int) (4294967295L & drawScope.mo295n()))));
                vbn0 vbn0Var = (vbn0) ((rv41) obj2).getValue();
                if (vbn0Var != null) {
                    uk4VarM91259a.m83299d(vbn0Var, ((Offset) kqi0Var.getValue()).f493a);
                }
                DrawScope.m282x0(drawScope, uk4VarM91259a, n6f.m63765b(n6f.f150862b, 0.6f, 0.0f, 0.0f, 0.0f, 14), null, 60);
                return w2a1Var;
            default:
                qsp qspVar = (qsp) ((hmh0) obj);
                qspVar.f192162a = klx0.f124002i;
                oyn0 oyn0Var = (oyn0) obj3;
                qspVar.f192165d = new bfy0(oyn0Var, z ? 1 : 0);
                qspVar.f192166e = new bfy0(oyn0Var, i5);
                lfy0 lfy0Var = (lfy0) obj2;
                FlowEventSources.Companion companion = FlowEventSources.f5713a;
                luk lukVar = lfy0Var.f133026b;
                fiz[] fizVarArr = {new uli(rxf1.m76634s(lfy0Var.f133025a.f260426a), i2)};
                companion.getClass();
                qspVar.f192163b = new C1045b(lukVar, fizVarArr);
                return w2a1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3w0(xre xreVar, gh00 gh00Var, wlx0 wlx0Var) {
        super(1);
        this.f268990a = 22;
        this.f268992c = wlx0Var;
        this.f268991b = gh00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y3w0(th00 th00Var, dcm0 dcm0Var) {
        super(1);
        this.f268990a = 16;
        this.f268992c = (qe70) th00Var;
        this.f268991b = dcm0Var;
    }
}
