package p204p;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Empty;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.signup.signup.p150v2.proto.FieldError;
import com.spotify.signup.signup.p150v2.proto.ValidateAccountResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class mmq0 implements Function, Predicate, BiFunction, tpk, BiPredicate, t6l0, rq31, Function4, Init, InterfaceC2491vd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145228a;

    /* JADX INFO: renamed from: b */
    public static final mmq0 f145218b = new mmq0(0);

    /* JADX INFO: renamed from: c */
    public static final mmq0 f145220c = new mmq0(1);

    /* JADX INFO: renamed from: d */
    public static final mmq0 f145221d = new mmq0(2);

    /* JADX INFO: renamed from: e */
    public static final mmq0 f145222e = new mmq0(3);

    /* JADX INFO: renamed from: f */
    public static final mmq0 f145223f = new mmq0(4);

    /* JADX INFO: renamed from: g */
    public static final mmq0 f145224g = new mmq0(5);

    /* JADX INFO: renamed from: h */
    public static final mmq0 f145225h = new mmq0(6);

    /* JADX INFO: renamed from: i */
    public static final mmq0 f145226i = new mmq0(7);

    /* JADX INFO: renamed from: t */
    public static final mmq0 f145227t = new mmq0(8);

    /* JADX INFO: renamed from: X */
    public static final mmq0 f145211X = new mmq0(9);

    /* JADX INFO: renamed from: Y */
    public static final mmq0 f145213Y = new mmq0(10);

    /* JADX INFO: renamed from: Z */
    public static final mmq0 f145215Z = new mmq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final mmq0 f145199L0 = new mmq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final mmq0 f145200M0 = new mmq0(13);

    /* JADX INFO: renamed from: N0 */
    public static final mmq0 f145201N0 = new mmq0(14);

    /* JADX INFO: renamed from: O0 */
    public static final mmq0 f145202O0 = new mmq0(15);

    /* JADX INFO: renamed from: P0 */
    public static final mmq0 f145203P0 = new mmq0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final mmq0 f145204Q0 = new mmq0(17);

    /* JADX INFO: renamed from: R0 */
    public static final mmq0 f145205R0 = new mmq0(18);

    /* JADX INFO: renamed from: S0 */
    public static final mmq0 f145206S0 = new mmq0(19);

    /* JADX INFO: renamed from: T0 */
    public static final mmq0 f145207T0 = new mmq0(20);

    /* JADX INFO: renamed from: U0 */
    public static final mmq0 f145208U0 = new mmq0(21);

    /* JADX INFO: renamed from: V0 */
    public static final mmq0 f145209V0 = new mmq0(22);

    /* JADX INFO: renamed from: W0 */
    public static final mmq0 f145210W0 = new mmq0(23);

    /* JADX INFO: renamed from: X0 */
    public static final mmq0 f145212X0 = new mmq0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final mmq0 f145214Y0 = new mmq0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final mmq0 f145216Z0 = new mmq0(26);

    /* JADX INFO: renamed from: a1 */
    public static final mmq0 f145217a1 = new mmq0(27);

    /* JADX INFO: renamed from: b1 */
    public static final mmq0 f145219b1 = new mmq0(28);

    public /* synthetic */ mmq0(int i) {
        this.f145228a = i;
    }

    @Override // p204p.InterfaceC2491vd
    /* JADX INFO: renamed from: a */
    public String mo62321a() {
        return "fb_extend_sso_token";
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f145228a) {
            case 8:
                g0j g0jVar = (g0j) obj;
                Boolean bool = (Boolean) obj2;
                if (!g0jVar.f75382b || g0jVar == g0j.f75374Z) {
                    return Boolean.FALSE;
                }
                wj50.m88279p(bool);
                return Boolean.valueOf(!bool.booleanValue());
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
        }
    }

    @Override // p204p.InterfaceC2491vd
    /* JADX INFO: renamed from: b */
    public String mo62322b() {
        return "oauth/access_token";
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((xvc1) obj);
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public Object mo26363k(Object obj) {
        return ((p3x0) obj).m69093g();
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f145228a) {
            case 1:
                return ((Boolean) obj).booleanValue();
            case 3:
                Collection collectionValues = ((Map) obj).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((ozw0) it.next()) instanceof mzw0) {
                            return false;
                        }
                    }
                }
                return true;
            case 4:
                return !((iqx) ((gqx) obj)).f104863f;
            case 6:
                return !((Boolean) ((pqm0) obj).f180351b).booleanValue();
            case 15:
                return !((s431) obj).f205436i.isEmpty();
            case 20:
                return !((iqx) ((gqx) obj)).f104863f;
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        pwd1 pwd1Var = swd1Var.f214650a;
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        int iMax = !(view2 != null ? wj50.m88271j(view2.getTag(R.id.snackbarContainerTag_noInsets), Boolean.TRUE) : false) ? Math.max(pwd1Var.mo51806g(519).f53851d, pwd1Var.mo51806g(8).f53851d) : 0;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.snackbar_floating_margin_horizontal);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.snackbar_floating_margin_bottom);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = dimensionPixelSize2 + iMax;
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
        view.setLayoutParams(marginLayoutParams);
        return swd1Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public /* bridge */ /* synthetic */ Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        return w2a1.f247311a;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int iIntValue;
        y6s0 w6s0Var;
        switch (this.f145228a) {
            case 0:
                return Boolean.valueOf(dxf1.m37216E((Map) obj));
            case 2:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Integer num = ((d0w) entry.getValue()).f44086r;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = ((d0w) entry.getValue()).f44085q;
                    }
                    if (iIntValue == ((d0w) entry.getValue()).f44085q) {
                        boolean z = ((d0w) entry.getValue()).f44087s;
                        hvi0 hvi0Var = cks.f39079b;
                        w6s0Var = new x6s0(z, cks.m33187f(jwg1.m54449D(((d0w) entry.getValue()).f44085q, ils.SECONDS)));
                    } else {
                        hvi0 hvi0Var2 = cks.f39079b;
                        int i = ((d0w) entry.getValue()).f44085q;
                        ils ilsVar = ils.SECONDS;
                        w6s0Var = new w6s0(cks.m33187f(jwg1.m54449D(i, ilsVar)), cks.m33187f(jwg1.m54449D(((d0w) entry.getValue()).f44085q - iIntValue, ilsVar)), ((d0w) entry.getValue()).f44087s);
                    }
                    linkedHashMap.put(key, w6s0Var);
                }
                return linkedHashMap;
            case 5:
                return (hav0) ((p2x0) obj).m68969b(v8v0.f238735t, v8v0.f238718X);
            case 7:
                return ((e301) obj).f55571a;
            case 11:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 14:
                ValidateAccountResponse validateAccountResponse = (ValidateAccountResponse) obj;
                int iM21414o = validateAccountResponse.m21414o();
                int i2 = iM21414o == 0 ? -1 : v621.f237714b[edb.m38547C(iM21414o)];
                if (i2 == 1) {
                    return new avy(ke2.f121778b);
                }
                me2 me2Var = me2.f142573b;
                if (i2 != 2) {
                    return new avy(me2Var);
                }
                int iM21407p = validateAccountResponse.m21413n().m21407p();
                int i3 = iM21407p != 0 ? v621.f237713a[edb.m38547C(iM21407p)] : -1;
                if (i3 != 1) {
                    if (i3 == 2) {
                        return new avy(je2.f111436b);
                    }
                    if (i3 != 3) {
                        return new avy(me2Var);
                    }
                    return new avy(me2Var);
                }
                String strM43753y0 = g6f.m43753y0(validateAccountResponse.m21413n().m21406o().m21396o(), "\n", null, null, xr11.f265213X0, 30);
                ae50 ae50VarM21396o = validateAccountResponse.m21413n().m21406o().m21396o();
                if (!ae50VarM21396o.isEmpty()) {
                    Iterator<E> it = ae50VarM21396o.iterator();
                    while (it.hasNext()) {
                        if (((FieldError) it.next()).m21365n() == 10) {
                            return new avy(new le2(strM43753y0));
                        }
                    }
                }
                return new avy(new ie2(strM43753y0));
            case 18:
                return new ub51((hdn0) obj);
            case 21:
                v5q0 v5q0Var = (v5q0) obj;
                return new tv81(new uv81(v5q0Var.f237572b, v5q0Var.f237571a, v5q0Var.f237573c));
            case 23:
                return Boolean.TRUE;
            default:
                return (gg3) obj;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        return wj50.m88271j(((ContextTrack) obj).uri(), ((ContextTrack) obj2).uri());
    }
}
