package p204p;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.car.app.model.Alert;
import com.comscore.streaming.ContentType;
import com.google.protobuf.Empty;
import com.spotify.analyzer_esperanto.proto.LoudnessResponseOuterClass$LoudnessResponse;
import com.spotify.authentication.login5esperanto.EsAccessTokenClient$ErrorResponse;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.music.R;
import com.spotify.p010ad.detection.esperanto.proto.AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;
import p000.C1398e;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes7.dex */
public final class net implements Function, a4a, Init, yh00, BiPredicate, ckv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153103a;

    /* JADX INFO: renamed from: b */
    public static final net f153093b = new net(0);

    /* JADX INFO: renamed from: c */
    public static final net f153095c = new net(1);

    /* JADX INFO: renamed from: d */
    public static final net f153096d = new net(2);

    /* JADX INFO: renamed from: e */
    public static final ev1 f153097e = new ev1(null);

    /* JADX INFO: renamed from: f */
    public static final net f153098f = new net(4);

    /* JADX INFO: renamed from: g */
    public static final net f153099g = new net(5);

    /* JADX INFO: renamed from: h */
    public static final net f153100h = new net(6);

    /* JADX INFO: renamed from: i */
    public static final net f153101i = new net(7);

    /* JADX INFO: renamed from: t */
    public static final net f153102t = new net(8);

    /* JADX INFO: renamed from: X */
    public static final net f153086X = new net(9);

    /* JADX INFO: renamed from: Y */
    public static final net f153088Y = new net(10);

    /* JADX INFO: renamed from: Z */
    public static final net f153090Z = new net(12);

    /* JADX INFO: renamed from: L0 */
    public static final net f153074L0 = new net(13);

    /* JADX INFO: renamed from: M0 */
    public static final net f153075M0 = new net(14);

    /* JADX INFO: renamed from: N0 */
    public static final net f153076N0 = new net(15);

    /* JADX INFO: renamed from: O0 */
    public static final net f153077O0 = new net(16);

    /* JADX INFO: renamed from: P0 */
    public static final net f153078P0 = new net(17);

    /* JADX INFO: renamed from: Q0 */
    public static final net f153079Q0 = new net(18);

    /* JADX INFO: renamed from: R0 */
    public static final net f153080R0 = new net(19);

    /* JADX INFO: renamed from: S0 */
    public static final net f153081S0 = new net(20);

    /* JADX INFO: renamed from: T0 */
    public static final net f153082T0 = new net(21);

    /* JADX INFO: renamed from: U0 */
    public static final net f153083U0 = new net(22);

    /* JADX INFO: renamed from: V0 */
    public static final net f153084V0 = new net(23);

    /* JADX INFO: renamed from: W0 */
    public static final net f153085W0 = new net(24);

    /* JADX INFO: renamed from: X0 */
    public static final net f153087X0 = new net(25);

    /* JADX INFO: renamed from: Y0 */
    public static final net f153089Y0 = new net(26);

    /* JADX INFO: renamed from: Z0 */
    public static final net f153091Z0 = new net(27);

    /* JADX INFO: renamed from: a1 */
    public static final net f153092a1 = new net(28);

    /* JADX INFO: renamed from: b1 */
    public static final net f153094b1 = new net(29);

    public /* synthetic */ net(int i) {
        this.f153103a = i;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m64273d(bb3 bb3Var) {
        return ((tl4) bb3Var.f25412b.getValue()).m81039i() == sl4.MINIMAL;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:110:0x0300  */
    /* JADX WARN: Code duplicated, block: B:113:0x0311  */
    /* JADX WARN: Code duplicated, block: B:116:0x033a  */
    /* JADX WARN: Code duplicated, block: B:117:0x033c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0344  */
    /* JADX WARN: Code duplicated, block: B:122:0x034a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0369  */
    /* JADX INFO: renamed from: a */
    public void m64274a(vp2 vp2Var, yp2 yp2Var, boolean z, boolean z2, gh00 gh00Var, xq00 xq00Var, int i) {
        yp2 yp2Var2;
        pgv0 pgv0VarM91796v;
        zp2 zp2Var;
        boolean z3;
        String str;
        Object objM91750T;
        Object objM91750T2;
        int i2;
        int i3;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(1102900605);
        ug5 ug5Var = xq00Var.f264811a;
        int i4 = 2;
        int i5 = i | (xq00Var.m91770i(vp2Var) ? 4 : 2) | (xq00Var.m91766g(yp2Var) ? 32 : 16) | (xq00Var.m91768h(z) ? 256 : 128) | (xq00Var.m91768h(z2) ? 2048 : 1024) | (xq00Var.m91770i(gh00Var) ? 16384 : 8192);
        if (xq00Var.m91752Y(i5 & 1, (i5 & 9363) != 9362)) {
            if (vp2Var instanceof tp2) {
                xq00Var.m91771i0(12326591);
                xq00Var.m91788r(false);
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v == null) {
                    return;
                } else {
                    zp2Var = new zp2(this, vp2Var, yp2Var, z, z2, gh00Var, i, 0);
                }
            } else if (vp2Var instanceof up2) {
                xq00Var.m91771i0(12462402);
                Object objM54977L = k0e1.m54977L(R.string.agent_row_ai_attribution_badge, xq00Var);
                xq00Var.m91771i0(-969424833);
                cxh0 cxh0Var = cxh0.f43038a;
                fxh0 fxh0VarM96866z = zsf1.m96866z(mi21.m61822f(1.0f, epv0.m39673I("row", cxh0Var)), 16, 8);
                up2 up2Var = (up2) vp2Var;
                List list = up2Var.f232560e;
                String str2 = up2Var.f232558c;
                String str3 = up2Var.f232557b;
                if (str3 != null) {
                    xq00Var.m91771i0(-653560186);
                    boolean zM91770i = ((i5 & 57344) == 16384) | xq00Var.m91770i(vp2Var);
                    Object objM91750T3 = xq00Var.m91750T();
                    if (zM91770i || objM91750T3 == obj) {
                        objM91750T3 = new aq2(gh00Var, vp2Var, 0);
                        xq00Var.m91793t0(objM91750T3);
                    }
                    fxh0VarM96866z = hdi.m47247x(fxh0VarM96866z, false, null, null, null, (eh00) objM91750T3, 15);
                    xq00Var.m91788r(false);
                } else if (str2 != null) {
                    xq00Var.m91771i0(-653434946);
                    boolean zM91770i2 = ((i5 & 57344) == 16384) | xq00Var.m91770i(vp2Var);
                    Object objM91750T4 = xq00Var.m91750T();
                    if (zM91770i2 || objM91750T4 == obj) {
                        objM91750T4 = new aq2(gh00Var, vp2Var, 1);
                        xq00Var.m91793t0(objM91750T4);
                    }
                    fxh0VarM96866z = hdi.m47247x(fxh0VarM96866z, false, null, null, null, (eh00) objM91750T4, 15);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-653327097);
                    xq00Var.m91788r(false);
                }
                fxh0 fxh0Var = fxh0VarM96866z;
                xq00Var.m91788r(false);
                boolean zM91770i3 = xq00Var.m91770i(vp2Var) | xq00Var.m91766g(objM54977L);
                Object objM91750T5 = xq00Var.m91750T();
                if (zM91770i3 || objM91750T5 == obj) {
                    objM91750T5 = new C1398e(i4, vp2Var, objM54977L);
                    xq00Var.m91793t0(objM91750T5);
                }
                fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0Var, false, (gh00) objM91750T5);
                zi5 zi5Var = bj5.f27610a;
                irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224763f), d7f0.f46142M0, xq00Var, 0);
                int iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m = xq00Var.m91778m();
                fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96644b);
                soh.f211194A.getClass();
                eh00 eh00Var = roh.f201257b;
                if (ug5Var == null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var);
                } else {
                    xq00Var.m91799w0();
                }
                yhh yhhVar = roh.f201262g;
                zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var);
                yhh yhhVar2 = roh.f201261f;
                zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
                Integer numValueOf = Integer.valueOf(iHashCode);
                yhh yhhVar3 = roh.f201265j;
                zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
                vlh vlhVar = roh.f201266k;
                zsf1.m96833D(vlhVar, xq00Var);
                yhh yhhVar4 = roh.f201259d;
                zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
                if (z) {
                    xq00Var.m91771i0(-1016204462);
                    k3h1.m55242a(0, up2Var.f232559d, xq00Var, null);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-1016147763);
                    xq00Var.m91788r(false);
                }
                if (1.0f <= 0.0d) {
                    kt40.m57301a("invalid weight; must be greater than zero");
                }
                cr70 cr70Var = new cr70(1.0f, true);
                Object objM91750T6 = xq00Var.m91750T();
                if (objM91750T6 == obj) {
                    objM91750T6 = ip2.f104362f;
                    xq00Var.m91793t0(objM91750T6);
                }
                fxh0 fxh0VarM96644b2 = zoz0.m96644b(cr70Var, false, (gh00) objM91750T6);
                aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224760c), d7f0.f46144O0, xq00Var, 0);
                int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96644b2);
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
                zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
                AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
                zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
                Object objM91750T7 = xq00Var.m91750T();
                if (objM91750T7 == obj) {
                    objM91750T7 = ip2.f104363g;
                    xq00Var.m91793t0(objM91750T7);
                }
                ahf1.m25932d(up2Var.f232556a, zoz0.m96644b(cxh0Var, false, (gh00) objM91750T7), leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138757a, new h171(5), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
                boolean zM91766g = xq00Var.m91766g(list);
                Object objM91750T8 = xq00Var.m91750T();
                if (zM91766g || objM91750T8 == obj) {
                    objM91750T8 = opo.m67574x(list);
                    xq00Var.m91793t0(objM91750T8);
                }
                qf40 qf40Var = (qf40) objM91750T8;
                if (qf40Var == null || !qf40Var.isEmpty()) {
                    Iterator<E> it = qf40Var.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((uix0) it.next()).f230830b) {
                                xq00Var.m91771i0(211611044);
                                k3h1.m55252k(qf40Var, z2, null, xq00Var, (i5 >> 6) & ContentType.LONG_FORM_ON_DEMAND);
                                xq00Var.m91788r(false);
                                z3 = false;
                            }
                        } else if (qf40Var.isEmpty()) {
                            z3 = false;
                            xq00Var.m91771i0(212253891);
                            xq00Var.m91788r(false);
                        } else {
                            xq00Var.m91771i0(211768214);
                            fxh0 fxh0VarM39673I = epv0.m39673I("role", cxh0Var);
                            objM91750T = xq00Var.m91750T();
                            if (objM91750T == obj) {
                                objM91750T = ip2.f104364h;
                                xq00Var.m91793t0(objM91750T);
                            }
                            fxh0 fxh0VarM96644b3 = zoz0.m96644b(fxh0VarM39673I, false, (gh00) objM91750T);
                            objM91750T2 = xq00Var.m91750T();
                            if (objM91750T2 == obj) {
                                objM91750T2 = ip2.f104365i;
                                xq00Var.m91793t0(objM91750T2);
                            }
                            String strM43753y0 = g6f.m43753y0(qf40Var, " • ", null, null, (gh00) objM91750T2, 30);
                            if71 if71Var = leu.m58818d(xq00Var).f64974j;
                            long j = leu.m58815a(xq00Var).f112824b.f138758b;
                            if (z2) {
                                i2 = 1;
                            } else {
                                i2 = Alert.DURATION_SHOW_INDEFINITELY;
                            }
                            ol80 ol80Var = new ol80(i2);
                            if (z2) {
                                i3 = 2;
                            } else {
                                i3 = 1;
                            }
                            ahf1.m25932d(strM43753y0, fxh0VarM96644b3, if71Var, j, new h171(5), null, i3, false, ol80Var, 0, null, xq00Var, 0, 0, 1696);
                            z3 = false;
                            xq00Var.m91788r(false);
                        }
                    }
                } else if (qf40Var.isEmpty()) {
                    xq00Var.m91771i0(211768214);
                    fxh0 fxh0VarM39673I2 = epv0.m39673I("role", cxh0Var);
                    objM91750T = xq00Var.m91750T();
                    if (objM91750T == obj) {
                        objM91750T = ip2.f104364h;
                        xq00Var.m91793t0(objM91750T);
                    }
                    fxh0 fxh0VarM96644b4 = zoz0.m96644b(fxh0VarM39673I2, false, (gh00) objM91750T);
                    objM91750T2 = xq00Var.m91750T();
                    if (objM91750T2 == obj) {
                        objM91750T2 = ip2.f104365i;
                        xq00Var.m91793t0(objM91750T2);
                    }
                    String strM43753y1 = g6f.m43753y0(qf40Var, " • ", null, null, (gh00) objM91750T2, 30);
                    if71 if71Var2 = leu.m58818d(xq00Var).f64974j;
                    long j2 = leu.m58815a(xq00Var).f112824b.f138758b;
                    if (z2) {
                        i2 = 1;
                    } else {
                        i2 = Alert.DURATION_SHOW_INDEFINITELY;
                    }
                    ol80 ol80Var2 = new ol80(i2);
                    if (z2) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    ahf1.m25932d(strM43753y1, fxh0VarM96644b4, if71Var2, j2, new h171(5), null, i3, false, ol80Var2, 0, null, xq00Var, 0, 0, 1696);
                    z3 = false;
                    xq00Var.m91788r(false);
                } else {
                    z3 = false;
                    xq00Var.m91771i0(212253891);
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(true);
                if (str3 != null) {
                    str = str3;
                }
                if (str != null) {
                    str = str2;
                    xq00Var.m91771i0(-1014746842);
                    yp2Var2 = yp2Var;
                    k3h1.m55255n(str, yp2Var2, null, xq00Var, i5 & ContentType.LONG_FORM_ON_DEMAND);
                    xq00Var.m91788r(z3);
                } else {
                    str = str2;
                    yp2Var2 = yp2Var;
                    xq00Var.m91771i0(-1014647859);
                    xq00Var.m91788r(z3);
                }
                xq00Var.m91788r(true);
                xq00Var.m91788r(z3);
            } else {
                yp2Var2 = yp2Var;
                xq00Var.m91771i0(15109957);
                xq00Var.m91788r(false);
            }
            pgv0VarM91796v.f177419d = zp2Var;
        }
        yp2Var2 = yp2Var;
        xq00Var.m91757b0();
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            zp2Var = new zp2(this, vp2Var, yp2Var2, z, z2, gh00Var, i, 1);
            pgv0VarM91796v.f177419d = zp2Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean z;
        boolean z2;
        switch (this.f153103a) {
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsAccessTokenClient$ErrorResponse.m3483u(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.authentication.login5esperanto.EsAccessTokenClient.ErrorResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 2:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse.m2303p(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass.SubscribeUserToCreatorTimestampResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 3:
            case 4:
            case 6:
            case 11:
            case 12:
            case 14:
            case 24:
            case 25:
            case 27:
            default:
                h4x h4xVar = (h4x) obj;
                if (!(h4xVar instanceof g4x)) {
                    return MaybeEmpty.f8264a;
                }
                g4x g4xVar = (g4x) h4xVar;
                return Maybe.m23363f(new l4x(g4xVar.f76544a, g4xVar.f76545b));
            case 5:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return LoudnessResponseOuterClass$LoudnessResponse.m3251q(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.analyzer_esperanto.proto.LoudnessResponseOuterClass.LoudnessResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 7:
                Logger.m3967c((Throwable) obj, "Assisted Curation Artist Loader failed.", new Object[0]);
                return Single.just(f06.f64554a);
            case 8:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr4);
                } catch (Exception e4) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e4);
                }
            case 9:
                lz71 lz71Var = (lz71) obj;
                if (lz71Var instanceof kz71) {
                    return new a040(((kz71) lz71Var).f128043a.f127714a);
                }
                if (!(lz71Var instanceof jz71)) {
                    throw new NoWhenBranchMatchedException();
                }
                Logger.m3966b("Failed to fetch id token. Response: %s", lz71Var);
                return new zz30(lz71Var.toString());
            case 10:
                return new s48(((Boolean) obj).booleanValue());
            case 13:
                return hjk.f92064a;
            case 15:
                return Boolean.valueOf(dxf1.m37244s("offline", (Map) obj));
            case 16:
                n2x0 n2x0Var = ((o2x0) obj).f161171a;
                if (n2x0Var.f149852O0) {
                    return w2a1.f247311a;
                }
                throw new IllegalStateException(s571.m77246e(n2x0Var.f149860d, "Failed to remove reaction - Status: "));
            case 17:
                List list = (List) obj;
                Object obj2 = list.get(0);
                sg5 sg5Var = sg5.f208721b;
                return new pqm0(Boolean.valueOf(obj2 == sg5Var), Boolean.valueOf(list.get(1) == sg5Var));
            case 18:
                String str = (String) obj;
                return str.length() > 0 ? new hzq0(new nzj(str)) : C2244p5.f174033a;
            case 19:
                return new usk((gmr0) obj);
            case 20:
                return -1;
            case 21:
                d7i d7iVar = (d7i) obj;
                c7i c7iVar = d7iVar.f46219t;
                String str2 = d7iVar.f46201b;
                String str3 = d7iVar.f46211l;
                String str4 = d7iVar.f46212m;
                if (d7iVar.f46215p.isEmpty()) {
                    z = true;
                    z2 = false;
                } else {
                    c7i c7iVar2 = d7iVar.f46219t;
                    if ((c7iVar2 != null ? c7iVar2.f34907e : 0) != 2) {
                        z2 = true;
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                }
                boolean z3 = d7iVar.f46214o;
                String str5 = d7iVar.f46206g;
                return new dl20(c7iVar, str2, str3, str4, z2, z3, ((str5 == null || str5.length() == 0) ? z : false) ^ z, d7iVar.f46220u, d7iVar.f46221v);
            case 22:
                return CompletableEmpty.f7437a;
            case 23:
                akr0 akr0Var = (akr0) obj;
                return Boolean.valueOf(!akr0Var.f16629b && akr0Var.f16630c);
            case 26:
                return new m5t((t6y0) obj);
            case 28:
                return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m64275b() {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    /* JADX INFO: renamed from: c */
    public Typeface m64276c(Context context, z74 z74Var) {
        if (!(z74Var instanceof z74)) {
            z74Var = null;
        }
        if (z74Var == null) {
            return null;
        }
        if (!z74Var.f280094c && z74Var.f280095d == null) {
            File file = z74Var.f280096e;
            z74Var.f280095d = Build.VERSION.SDK_INT >= 26 ? fz6.m43161q(file, context, z74Var.f280092a) : Typeface.createFromFile(file);
        }
        z74Var.f280094c = true;
        return z74Var.f280095d;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((y1d) obj);
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        switch (this.f153103a) {
            case 24:
                api apiVar = (api) obj;
                api apiVar2 = (api) obj2;
                return wj50.m88271j(apiVar.getName(), apiVar2.getName()) && wj50.m88271j(apiVar.mo26695k(), apiVar2.mo26695k()) && apiVar.mo26685G() && apiVar2.mo26685G();
            default:
                PlayerState playerState = (PlayerState) obj;
                PlayerState playerState2 = (PlayerState) obj2;
                return playerState.isPaused() == playerState2.isPaused() && wj50.m88271j(playerState.contextUri(), playerState2.contextUri());
        }
    }
}
