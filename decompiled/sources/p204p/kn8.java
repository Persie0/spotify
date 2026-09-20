package p204p;

import android.os.Bundle;
import com.spotify.mobius.First;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class kn8 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final kn8 f124326L0;

    /* JADX INFO: renamed from: M0 */
    public static final kn8 f124327M0;

    /* JADX INFO: renamed from: N0 */
    public static final kn8 f124328N0;

    /* JADX INFO: renamed from: O0 */
    public static final kn8 f124329O0;

    /* JADX INFO: renamed from: P0 */
    public static final kn8 f124330P0;

    /* JADX INFO: renamed from: Q0 */
    public static final kn8 f124331Q0;

    /* JADX INFO: renamed from: R0 */
    public static final kn8 f124332R0;

    /* JADX INFO: renamed from: S0 */
    public static final kn8 f124333S0;

    /* JADX INFO: renamed from: T0 */
    public static final kn8 f124334T0;

    /* JADX INFO: renamed from: U0 */
    public static final kn8 f124335U0;

    /* JADX INFO: renamed from: V0 */
    public static final kn8 f124336V0;

    /* JADX INFO: renamed from: W0 */
    public static final kn8 f124337W0;

    /* JADX INFO: renamed from: X */
    public static final kn8 f124338X;

    /* JADX INFO: renamed from: X0 */
    public static final kn8 f124339X0;

    /* JADX INFO: renamed from: Y */
    public static final kn8 f124340Y;

    /* JADX INFO: renamed from: Y0 */
    public static final kn8 f124341Y0;

    /* JADX INFO: renamed from: Z */
    public static final kn8 f124342Z;

    /* JADX INFO: renamed from: Z0 */
    public static final kn8 f124343Z0;

    /* JADX INFO: renamed from: a1 */
    public static final kn8 f124344a1;

    /* JADX INFO: renamed from: b */
    public static final kn8 f124345b;

    /* JADX INFO: renamed from: b1 */
    public static final kn8 f124346b1;

    /* JADX INFO: renamed from: c */
    public static final kn8 f124347c;

    /* JADX INFO: renamed from: c1 */
    public static final kn8 f124348c1;

    /* JADX INFO: renamed from: d */
    public static final kn8 f124349d;

    /* JADX INFO: renamed from: e */
    public static final kn8 f124350e;

    /* JADX INFO: renamed from: f */
    public static final kn8 f124351f;

    /* JADX INFO: renamed from: g */
    public static final kn8 f124352g;

    /* JADX INFO: renamed from: h */
    public static final kn8 f124353h;

    /* JADX INFO: renamed from: i */
    public static final kn8 f124354i;

    /* JADX INFO: renamed from: t */
    public static final kn8 f124355t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124356a;

    static {
        int i = 2;
        f124345b = new kn8(i, 0);
        f124347c = new kn8(i, 1);
        f124349d = new kn8(i, 2);
        f124350e = new kn8(i, 3);
        f124351f = new kn8(i, 4);
        f124352g = new kn8(i, 5);
        f124353h = new kn8(i, 6);
        f124354i = new kn8(i, 7);
        f124355t = new kn8(i, 8);
        f124338X = new kn8(i, 9);
        f124340Y = new kn8(i, 10);
        f124342Z = new kn8(i, 11);
        f124326L0 = new kn8(i, 12);
        f124327M0 = new kn8(i, 13);
        f124328N0 = new kn8(i, 14);
        f124329O0 = new kn8(i, 15);
        f124330P0 = new kn8(i, 16);
        f124331Q0 = new kn8(i, 17);
        f124332R0 = new kn8(i, 18);
        f124333S0 = new kn8(i, 19);
        f124334T0 = new kn8(i, 20);
        f124335U0 = new kn8(i, 21);
        f124336V0 = new kn8(i, 22);
        f124337W0 = new kn8(i, 23);
        f124339X0 = new kn8(i, 24);
        f124341Y0 = new kn8(i, 25);
        f124343Z0 = new kn8(i, 26);
        f124344a1 = new kn8(i, 27);
        f124346b1 = new kn8(i, 28);
        f124348c1 = new kn8(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn8(int i, int i2) {
        super(i);
        this.f124356a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        Set setSingleton;
        String str;
        long j;
        long j2;
        long j3;
        int i = this.f124356a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                lo8 lo8Var = (lo8) obj;
                mo8 mo8VarM45168s = glg1.m45168s(lo8Var, 0, null);
                if (((AbstractC2282q6) mo8VarM45168s.f145616c).mo33075a() > 1) {
                    setSingleton = Collections.singleton(new pn8(mo8VarM45168s.f145615b, lo8Var.f135341b));
                } else {
                    setSingleton = gbu.f78413a;
                }
                return First.m15575c(mo8VarM45168s, setSingleton);
            case 1:
                mr8 mr8Var = (mr8) obj;
                return new nr8(mr8Var.f146446a, mr8Var.f146447b, (p8e0) obj2);
            case 2:
                fs8 fs8Var = (fs8) obj;
                js8 js8Var = (js8) obj2;
                fs8Var.getClass();
                String str2 = fs8Var.f72798a;
                String str3 = fs8Var.f72800c;
                String str4 = js8Var.f115442a;
                Boolean bool = js8Var.f115443b;
                return new gs8(str3, str2, bool != null ? bool.booleanValue() : false, str4);
            case 3:
                uu41 uu41Var = (uu41) obj;
                v140 v140Var = (v140) obj2;
                return new js8(v140Var != null ? v140Var.f236243a : null, uu41Var != null ? Boolean.valueOf(uu41Var.f234107b) : null);
            case 4:
                gd90 gd90Var = (gd90) obj;
                ld90 ld90Var = (ld90) obj2;
                if (!(ld90Var instanceof hd90)) {
                    return null;
                }
                hd90 hd90Var = (hd90) ld90Var;
                if (hd90Var.f90078a == null || hd90Var.f90081d == null) {
                    return null;
                }
                char c = hd90Var.f90080c ? (char) 2 : (char) 1;
                String str5 = gd90Var.f78765b;
                st91 st91Var = st91.f213865b;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-listening-activity-indicator-chat-row";
                yt91VarM50626j.f276052f = "1.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                if (c == 1) {
                    str = "played";
                } else {
                    if (c != 2) {
                        throw null;
                    }
                    str = "playing";
                }
                yt91VarM50626j.f276048b = str;
                yt91VarM50626j.f276050d = str5;
                zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
                List listM46715L = h6f.m46715L("chat/list", "sidedrawer");
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a;
                nu91Var.f248108b = st91.f213865b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = listM46715L;
                return (ou91) nu91Var.m87248a();
            case 5:
                return rpg1.m76173n((qt5) obj, (ebf) obj2);
            case 6:
                qt5 qt5Var = (qt5) obj2;
                rt5 rt5Var = (rt5) ((Bundle) obj).getParcelable("artist_selection");
                return rt5Var == null ? rpg1.m76173n(qt5Var, new ebf(pho.f177693a, ut5.f233772a)) : rt5Var;
            case 7:
                return kkc0.m56695h0(new pqm0(0, Collections.singleton((String) obj)), new pqm0(1, Collections.singleton((String) obj2)));
            case 8:
                return (pe9) obj;
            case 9:
                return new oj9((v140) obj, (erc1) obj2);
            case 10:
                return new tl9(((sl9) obj).f210323b, ((tl9) obj2).f221395b);
            case 11:
                ufu ufuVar = ((jiu) obj).f112823a;
                int iOrdinal = ((ixu) obj2).ordinal();
                if (iOrdinal == 0) {
                    j = ufuVar.f229875b.f123093a;
                } else if (iOrdinal == 1) {
                    j = ufuVar.f229875b.f123095c;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j = ufuVar.f229875b.f123094b;
                }
                return new n6f(j);
            case 12:
                return (uz9) obj2;
            case 13:
                ufu ufuVar2 = ((jiu) obj).f112823a;
                int iOrdinal2 = ((ixu) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    j2 = ufuVar2.f229876c;
                } else if (iOrdinal2 == 1) {
                    j2 = ufuVar2.f229878e;
                } else {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j2 = ufuVar2.f229877d;
                }
                return new n6f(j2);
            case 14:
                return null;
            case 15:
                return null;
            case 16:
                return null;
            case 17:
                return (d7a) obj2;
            case 18:
                return new m7a((ee7) obj, (v140) obj2);
            case 19:
                ((x6u) obj).f258749c = (qe10) obj2;
                return w2a1Var;
            case 20:
                ((x6u) obj).f258750d = (lb3) obj2;
                return w2a1Var;
            case 21:
                return Boolean.TRUE;
            case 22:
                return Boolean.TRUE;
            case 23:
                return new nu41(((Boolean) obj2).booleanValue());
            case 24:
                return new n6f(((jiu) obj).f112824b.f138757a);
            case 25:
                ufu ufuVar3 = ((jiu) obj).f112823a;
                int iOrdinal3 = ((ixu) obj2).ordinal();
                if (iOrdinal3 == 0) {
                    j3 = ufuVar3.f229876c;
                } else if (iOrdinal3 == 1) {
                    j3 = ufuVar3.f229878e;
                } else {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j3 = ufuVar3.f229876c;
                }
                return new n6f(j3);
            case 26:
                return (jgb) obj2;
            case 27:
                return String.valueOf(!((Boolean) obj2).booleanValue());
            case 28:
                av31 av31Var = (av31) obj2;
                if (av31Var instanceof zu31) {
                    return new ojo(((zu31) av31Var).f286335a);
                }
                if (av31Var instanceof yu31) {
                    return new mjo(new jjo(ei6.m39073j("Failed to fetch capability: ", ((yu31) av31Var).f276272a)));
                }
                throw new NoWhenBranchMatchedException();
            default:
                ovb ovbVar = (ovb) obj2;
                boolean z = ovbVar.f170459a;
                String str6 = ovbVar.f170461c;
                List list = ovbVar.f170463e;
                String str7 = ovbVar.f170460b;
                if (!z) {
                    return new ivb(str7);
                }
                if (ovbVar.f170464f) {
                    return list.isEmpty() ? new hvb(str7, str6) : new fvb(str7, new evb(ovbVar.f170462d, list), str6);
                }
                return new jvb(str7);
        }
    }
}
