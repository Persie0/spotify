package p204p;

import android.os.Bundle;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final class gh6 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final gh6 f79812L0;

    /* JADX INFO: renamed from: M0 */
    public static final gh6 f79813M0;

    /* JADX INFO: renamed from: N0 */
    public static final gh6 f79814N0;

    /* JADX INFO: renamed from: O0 */
    public static final gh6 f79815O0;

    /* JADX INFO: renamed from: P0 */
    public static final gh6 f79816P0;

    /* JADX INFO: renamed from: Q0 */
    public static final gh6 f79817Q0;

    /* JADX INFO: renamed from: R0 */
    public static final gh6 f79818R0;

    /* JADX INFO: renamed from: S0 */
    public static final gh6 f79819S0;

    /* JADX INFO: renamed from: T0 */
    public static final gh6 f79820T0;

    /* JADX INFO: renamed from: U0 */
    public static final gh6 f79821U0;

    /* JADX INFO: renamed from: V0 */
    public static final gh6 f79822V0;

    /* JADX INFO: renamed from: W0 */
    public static final gh6 f79823W0;

    /* JADX INFO: renamed from: X */
    public static final gh6 f79824X;

    /* JADX INFO: renamed from: X0 */
    public static final gh6 f79825X0;

    /* JADX INFO: renamed from: Y */
    public static final gh6 f79826Y;

    /* JADX INFO: renamed from: Y0 */
    public static final gh6 f79827Y0;

    /* JADX INFO: renamed from: Z */
    public static final gh6 f79828Z;

    /* JADX INFO: renamed from: Z0 */
    public static final gh6 f79829Z0;

    /* JADX INFO: renamed from: a1 */
    public static final gh6 f79830a1;

    /* JADX INFO: renamed from: b */
    public static final gh6 f79831b;

    /* JADX INFO: renamed from: b1 */
    public static final gh6 f79832b1;

    /* JADX INFO: renamed from: c */
    public static final gh6 f79833c;

    /* JADX INFO: renamed from: c1 */
    public static final gh6 f79834c1;

    /* JADX INFO: renamed from: d */
    public static final gh6 f79835d;

    /* JADX INFO: renamed from: e */
    public static final gh6 f79836e;

    /* JADX INFO: renamed from: f */
    public static final gh6 f79837f;

    /* JADX INFO: renamed from: g */
    public static final gh6 f79838g;

    /* JADX INFO: renamed from: h */
    public static final gh6 f79839h;

    /* JADX INFO: renamed from: i */
    public static final gh6 f79840i;

    /* JADX INFO: renamed from: t */
    public static final gh6 f79841t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79842a;

    static {
        int i = 2;
        f79831b = new gh6(i, 0);
        f79833c = new gh6(i, 1);
        f79835d = new gh6(i, 2);
        f79836e = new gh6(i, 3);
        f79837f = new gh6(i, 4);
        f79838g = new gh6(i, 5);
        f79839h = new gh6(i, 6);
        f79840i = new gh6(i, 7);
        f79841t = new gh6(i, 8);
        f79824X = new gh6(i, 9);
        f79826Y = new gh6(i, 10);
        f79828Z = new gh6(i, 11);
        f79812L0 = new gh6(i, 12);
        f79813M0 = new gh6(i, 13);
        f79814N0 = new gh6(i, 14);
        f79815O0 = new gh6(i, 15);
        f79816P0 = new gh6(i, 16);
        f79817Q0 = new gh6(i, 17);
        f79818R0 = new gh6(i, 18);
        f79819S0 = new gh6(i, 19);
        f79820T0 = new gh6(i, 20);
        f79821U0 = new gh6(i, 21);
        f79822V0 = new gh6(i, 22);
        f79823W0 = new gh6(i, 23);
        f79825X0 = new gh6(i, 24);
        f79827Y0 = new gh6(i, 25);
        f79829Z0 = new gh6(i, 26);
        f79830a1 = new gh6(i, 27);
        f79832b1 = new gh6(i, 28);
        f79834c1 = new gh6(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh6(int i, int i2) {
        super(i);
        this.f79842a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        m340 m340Var;
        z240 z240VarM60640a;
        switch (this.f79842a) {
            case 0:
                ((Number) obj2).intValue();
                return w2a1.f247311a;
            case 1:
                ((Number) obj2).intValue();
                return w2a1.f247311a;
            case 2:
                return new n6f(n6f.f150866f);
            case 3:
                return new n6f(((jiu) obj).f112823a.f229875b.f123093a);
            case 4:
                js6 js6Var = (js6) obj;
                ks6 ks6Var = (ks6) obj2;
                boolean z2 = js6Var.f115403b;
                String str = ks6Var.f125842a;
                String str2 = js6Var.f115402a;
                boolean zM88271j = wj50.m88271j(str, str2);
                if (zM88271j) {
                    z = ks6Var.f125845d;
                } else {
                    z = !z2;
                }
                ks6 ks6VarM57190a = ks6.m57190a(ks6Var, str2, null, null, z, !zM88271j ? z2 : ks6Var.f125846e, js6Var.f115404c, 6);
                return (zM88271j || str2.length() <= 0) ? Next.m15606h(ks6VarM57190a) : Next.m15607i(ks6VarM57190a, Collections.singleton(new jgt(str2)));
            case 5:
                js6 js6Var2 = (js6) obj;
                String str3 = js6Var2.f115402a;
                boolean z3 = js6Var2.f115403b;
                ks6 ks6VarM57190a2 = ks6.m57190a((ks6) obj2, str3, null, null, !z3, z3, js6Var2.f115404c, 6);
                String str4 = js6Var2.f115402a;
                return str4.length() > 0 ? First.m15575c(ks6VarM57190a2, Collections.singleton(new jgt(str4))) : First.m15574b(ks6VarM57190a2);
            case 6:
                return (cv41) obj2;
            case 7:
                return Next.m15606h((cv6) obj2);
            case 8:
                cv6 cv6Var = (cv6) obj2;
                x401 x401Var = new x401();
                av6 av6Var = cv6Var.f42314h;
                String str5 = cv6Var.f42308b;
                String str6 = cv6Var.f42307a;
                if (av6Var instanceof zu6) {
                    x401Var.add(new xft(str6, str5));
                }
                if (cv6Var.f42313g.f213202b.f154747d) {
                    x401Var.add(new flt(str6, str5));
                }
                return First.m15575c(cv6Var, n0e1.m63425d(x401Var));
            case 9:
                return Next.m15606h((dw6) obj2);
            case 10:
                ry6 ry6Var = (ry6) zn91.m96523K((Bundle) obj, "AudioLanguagePageElementStateKey", ry6.class);
                return ry6Var == null ? new ry6() : ry6Var;
            case 11:
                q97 q97Var = (q97) obj;
                return new r97(q97Var.f186514a, q97Var.f186515b, q97Var.f186516c, q97Var.f186517d, q97Var.f186518e, q97Var.f186520g, q97Var.f186521h, q97Var.f186522i, q97Var.f186523j, q97Var.f186524k, q97Var.f186525l, q97Var.f186526m, ((j2y) obj2).f108193a, q97Var.f186528o);
            case 12:
                return (ga7) obj;
            case 13:
                return ufc1.m82980w(((wim0) obj).f251684b, (b250) obj2);
            case 14:
                return null;
            case 15:
                return ufc1.m82980w(((yim0) obj).f273168c, (b250) obj2);
            case 16:
                return new jd7((hd7) obj, ((w1y) obj2).f247196a);
            case 17:
                qho qhoVar = (qho) obj2;
                String str7 = null;
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                erc1 erc1Var = ohoVar != null ? (erc1) ohoVar.f165512a : null;
                if (erc1Var != null && (m340Var = erc1Var.f62079a) != null && (z240VarM60640a = m340Var.m60640a(a340.f11860a)) != null) {
                    str7 = z240VarM60640a.f278475a.f198763a;
                }
                return new kd7(str7);
            case 18:
                return ufc1.m82980w(((zim0) obj).f283199c, (b250) obj2);
            case 19:
                return ufc1.m82980w(((ajm0) obj).f16290b, (b250) obj2);
            case 20:
                return new n6f(n6f.f150866f);
            case 21:
                return new n6f(rfg1.m75434d(4282079640L));
            case 22:
                return new n6f(rfg1.m75434d(4278190080L));
            case 23:
                return new n6f(n6f.f150866f);
            case 24:
                zl7 zl7Var = (zl7) ((sl7) obj2).f210311g.getValue();
                return zl7Var instanceof wl7 ? yl7.f273926a : zl7Var;
            case 25:
                return ufc1.m82980w(((bjm0) obj).f27720b, (b250) obj2);
            case 26:
                return ufc1.m82980w(((bjm0) obj).f27720b, (b250) obj2);
            case 27:
                eo7 eo7Var = (eo7) obj;
                k2y k2yVar = (k2y) obj2;
                String str8 = eo7Var.f61331a;
                String str9 = eo7Var.f61332b;
                String str10 = eo7Var.f61333c;
                String str11 = eo7Var.f61335e;
                boolean z4 = k2yVar.f118701b;
                return new fo7(str8, str9, str10, str11, !z4, k2yVar.f118700a, z4, eo7Var.f61337g, eo7Var.f61338h);
            case 28:
                return (w88) obj;
            default:
                mo8 mo8Var = (mo8) obj2;
                return Next.m15606h(glg1.m45168s((lo8) obj, mo8Var.f145615b, mo8Var.f145610Q0));
        }
    }
}
