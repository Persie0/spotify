package p204p;

import android.os.Build;
import android.view.View;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.productstate.ConvertProductStateValueException;
import com.spotify.musicvideos.musicvideowidget.proto.p114v1.NpvWidgetResponse;
import com.spotify.musicvideos.musicvideowidget.proto.p114v1.VideoCard;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class olr0 implements Function, Predicate, BiFunction, tpk, yh00, t6l0, ceu, l5w0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f166907a;

    /* JADX INFO: renamed from: b */
    public static final olr0 f166898b = new olr0(0);

    /* JADX INFO: renamed from: c */
    public static final olr0 f166899c = new olr0(1);

    /* JADX INFO: renamed from: d */
    public static final olr0 f166900d = new olr0(2);

    /* JADX INFO: renamed from: e */
    public static final olr0 f166901e = new olr0(3);

    /* JADX INFO: renamed from: f */
    public static final olr0 f166902f = new olr0(4);

    /* JADX INFO: renamed from: g */
    public static final olr0 f166903g = new olr0(5);

    /* JADX INFO: renamed from: h */
    public static final olr0 f166904h = new olr0(6);

    /* JADX INFO: renamed from: i */
    public static final olr0 f166905i = new olr0(7);

    /* JADX INFO: renamed from: t */
    public static final olr0 f166906t = new olr0(8);

    /* JADX INFO: renamed from: X */
    public static final olr0 f166891X = new olr0(9);

    /* JADX INFO: renamed from: Y */
    public static final olr0 f166893Y = new olr0(10);

    /* JADX INFO: renamed from: Z */
    public static final olr0 f166895Z = new olr0(11);

    /* JADX INFO: renamed from: L0 */
    public static final olr0 f166879L0 = new olr0(12);

    /* JADX INFO: renamed from: M0 */
    public static final olr0 f166880M0 = new olr0(13);

    /* JADX INFO: renamed from: N0 */
    public static final olr0 f166881N0 = new olr0(14);

    /* JADX INFO: renamed from: O0 */
    public static final olr0 f166882O0 = new olr0(15);

    /* JADX INFO: renamed from: P0 */
    public static final olr0 f166883P0 = new olr0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final olr0 f166884Q0 = new olr0(17);

    /* JADX INFO: renamed from: R0 */
    public static final olr0 f166885R0 = new olr0(18);

    /* JADX INFO: renamed from: S0 */
    public static final olr0 f166886S0 = new olr0(19);

    /* JADX INFO: renamed from: T0 */
    public static final olr0 f166887T0 = new olr0(20);

    /* JADX INFO: renamed from: U0 */
    public static final olr0 f166888U0 = new olr0(21);

    /* JADX INFO: renamed from: V0 */
    public static final olr0 f166889V0 = new olr0(22);

    /* JADX INFO: renamed from: W0 */
    public static final olr0 f166890W0 = new olr0(23);

    /* JADX INFO: renamed from: X0 */
    public static final olr0 f166892X0 = new olr0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final olr0 f166894Y0 = new olr0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final olr0 f166896Z0 = new olr0(26);

    /* JADX INFO: renamed from: a1 */
    public static final olr0 f166897a1 = new olr0(27);

    public /* synthetic */ olr0(int i) {
        this.f166907a = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public static dhg0 m67302a(String str, st91 st91Var) {
        List listM96902b;
        bu91 bu91Var;
        zt91 zt91Var = (zt91) g6f.m43689C0(st91Var.f213866a);
        return new dhg0((zt91Var == null || (listM96902b = zt91Var.m96902b()) == null || (bu91Var = (bu91) g6f.m43689C0(listM96902b)) == null) ? null : bu91Var.f31067d, str, st91Var);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean zM45947s;
        switch (this.f166907a) {
            case 0:
                try {
                    zM45947s = gwg1.m45947s((String) obj);
                    break;
                } catch (ConvertProductStateValueException e) {
                    Logger.m3967c(e, "Unable to extract product state", new Object[0]);
                    zM45947s = true;
                }
                return Boolean.valueOf(zM45947s);
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
            default:
                jne1 jne1Var = (jne1) ((Map) jne1.f114094g.getValue()).get((String) obj);
                if (jne1Var == null) {
                    jne1Var = jne1.f114096i;
                }
                return jne1Var.f114100c;
            case 2:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                return new lpt0(message);
            case 3:
                return new c4u0((nt30) obj);
            case 4:
                return new t1y(((Boolean) obj).booleanValue());
            case 9:
                return (ContextTrack) ((xul0) obj).mo49278b();
            case 10:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                }
            case 11:
                Object obj2 = ((gv31) obj).f84602a;
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 12:
                return xul0.m92200a(((zak) obj).f281082a);
            case 13:
                return new vhj0((Throwable) obj, null);
            case 14:
                return ((u031) obj).f225377a;
            case 15:
                return new vhj0((Throwable) obj, null);
            case 18:
                return Boolean.valueOf(((e301) obj).f55572b);
            case 19:
                return (Boolean) obj;
            case 20:
                return Boolean.valueOf(!((bv81) obj).f31305a.f170449d);
            case 21:
                return new lot0(((wmt0) obj).f252975c);
            case 22:
                zni0 zni0Var = (zni0) obj;
                NpvWidgetResponse npvWidgetResponse = zni0Var.f284508a;
                ae50 ae50VarM15956r = npvWidgetResponse.m15956r();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM15956r, 10));
                Iterator<E> it = ae50VarM15956r.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VideoCard) it.next()).m15962n());
                }
                String str = zni0Var.f284511d;
                ae50 ae50VarM15956r2 = npvWidgetResponse.m15956r();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM15956r2, 10));
                Iterator<E> it2 = ae50VarM15956r2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((VideoCard) it2.next()).m15962n());
                }
                return new f7k0(str, arrayList, arrayList2);
        }
    }

    @Override // p204p.l5w0
    /* JADX INFO: renamed from: b */
    public av91 mo31905b(st91 st91Var, tu41 tu41Var, String str) {
        return m67302a(str, st91Var).m36040g();
    }

    @Override // p204p.l5w0
    /* JADX INFO: renamed from: e */
    public av91 mo31908e(st91 st91Var, tu41 tu41Var, String str) {
        return m67302a(str, st91Var).m36041h(str);
    }

    @Override // p204p.l5w0
    /* JADX INFO: renamed from: f */
    public av91 mo58264f(String str, st91 st91Var) {
        return m67302a(str, st91Var).m36042i(str);
    }

    @Override // p204p.l5w0
    /* JADX INFO: renamed from: i */
    public av91 mo58265i(String str, st91 st91Var) {
        dhg0 dhg0VarM67302a = m67302a(str, st91Var);
        dv91 dv91Var = new dv91("swipe_left", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("like", 1, c95.m31821M(pft0.m69840u("item_to_be_liked", string))), dhg0VarM67302a.f49104b, dhg0VarM67302a.f49103a, System.currentTimeMillis());
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public Object mo26363k(Object obj) {
        return Double.valueOf(((p3x0) obj).m69093g());
    }

    @Override // p204p.ceu
    /* JADX INFO: renamed from: o */
    public void mo28685o(geu geuVar) {
        int i;
        String str = (String) geuVar.f79197d;
        int i2 = geuVar.f79194a;
        int length = str.length();
        if (i2 < length) {
            char cCharAt = str.charAt(i2);
            i = 0;
            while (k2h1.m55183p(cCharAt) && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    cCharAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char cCharAt2 = str.charAt(geuVar.f79194a);
            char cCharAt3 = str.charAt(geuVar.f79194a + 1);
            if (k2h1.m55183p(cCharAt2) && k2h1.m55183p(cCharAt3)) {
                geuVar.m44528f((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + 130));
                geuVar.f79194a += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cM44525c = geuVar.m44525c();
        int iM55186s = k2h1.m55186s(geuVar.f79194a, 0, str);
        if (iM55186s == 0) {
            if (!k2h1.m55184q(cM44525c)) {
                geuVar.m44528f((char) (cM44525c + 1));
                geuVar.f79194a++;
                return;
            } else {
                geuVar.m44528f((char) 235);
                geuVar.m44528f((char) (cM44525c - 127));
                geuVar.f79194a++;
                return;
            }
        }
        if (iM55186s == 1) {
            geuVar.m44528f((char) 230);
            geuVar.f79195b = 1;
            return;
        }
        if (iM55186s == 2) {
            geuVar.m44528f((char) 239);
            geuVar.f79195b = 2;
            return;
        }
        if (iM55186s == 3) {
            geuVar.m44528f((char) 238);
            geuVar.f79195b = 3;
        } else if (iM55186s == 4) {
            geuVar.m44528f((char) 240);
            geuVar.f79195b = 4;
        } else {
            if (iM55186s != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iM55186s)));
            }
            geuVar.m44528f((char) 231);
            geuVar.f79195b = 5;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f166907a) {
            case 1:
                return !(((hbt) obj) instanceof ebt);
            case 6:
                return ((Throwable) obj) instanceof CancellationException;
            case 7:
                return !((iqx) ((gqx) obj)).f104863f;
            default:
                return ((lcf) obj) instanceof hcf;
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        pwd1 pwd1Var = swd1Var.f214650a;
        evr evrVarMo57527f = pwd1Var.mo57527f();
        if (evrVarMo57527f != null && Build.VERSION.SDK_INT >= 28) {
            r35.m74616x(evrVarMo57527f.f63305a);
        }
        evr evrVarMo57527f2 = pwd1Var.mo57527f();
        int iM74618z = (evrVarMo57527f2 == null || Build.VERSION.SDK_INT < 28) ? 0 : r35.m74618z(evrVarMo57527f2.f63305a);
        evr evrVarMo57527f3 = pwd1Var.mo57527f();
        if (evrVarMo57527f3 != null && Build.VERSION.SDK_INT >= 28) {
            r35.m74617y(evrVarMo57527f3.f63305a);
        }
        evr evrVarMo57527f4 = pwd1Var.mo57527f();
        int iM74615w = (evrVarMo57527f4 == null || Build.VERSION.SDK_INT < 28) ? 0 : r35.m74615w(evrVarMo57527f4.f63305a);
        dx40 dx40VarMo51806g = pwd1Var.mo51806g(647);
        int i = dx40VarMo51806g.f53849b;
        int i2 = dx40VarMo51806g.f53851d;
        if (iM74618z < i) {
            iM74618z = i;
        }
        if (iM74615w < i2) {
            iM74615w = i2;
        }
        view.setPadding(0, iM74618z, 0, iM74615w);
        view.requestLayout();
        return swd1Var;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f166907a) {
            case 5:
                return (ContextTrack) obj;
            case 16:
                return (Integer) obj2;
            default:
                o491 o491Var = (o491) obj;
                return new k291(o491Var.f161596a, o491Var.f161597b, (rbu0) obj2);
        }
    }
}
