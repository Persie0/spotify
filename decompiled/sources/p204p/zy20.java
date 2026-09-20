package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class zy20 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final zy20 f287446L0;

    /* JADX INFO: renamed from: M0 */
    public static final zy20 f287447M0;

    /* JADX INFO: renamed from: N0 */
    public static final zy20 f287448N0;

    /* JADX INFO: renamed from: O0 */
    public static final zy20 f287449O0;

    /* JADX INFO: renamed from: P0 */
    public static final zy20 f287450P0;

    /* JADX INFO: renamed from: Q0 */
    public static final zy20 f287451Q0;

    /* JADX INFO: renamed from: R0 */
    public static final zy20 f287452R0;

    /* JADX INFO: renamed from: S0 */
    public static final zy20 f287453S0;

    /* JADX INFO: renamed from: T0 */
    public static final zy20 f287454T0;

    /* JADX INFO: renamed from: U0 */
    public static final zy20 f287455U0;

    /* JADX INFO: renamed from: V0 */
    public static final zy20 f287456V0;

    /* JADX INFO: renamed from: W0 */
    public static final zy20 f287457W0;

    /* JADX INFO: renamed from: X */
    public static final zy20 f287458X;

    /* JADX INFO: renamed from: X0 */
    public static final zy20 f287459X0;

    /* JADX INFO: renamed from: Y */
    public static final zy20 f287460Y;

    /* JADX INFO: renamed from: Y0 */
    public static final zy20 f287461Y0;

    /* JADX INFO: renamed from: Z */
    public static final zy20 f287462Z;

    /* JADX INFO: renamed from: Z0 */
    public static final zy20 f287463Z0;

    /* JADX INFO: renamed from: a1 */
    public static final zy20 f287464a1;

    /* JADX INFO: renamed from: b */
    public static final zy20 f287465b;

    /* JADX INFO: renamed from: b1 */
    public static final zy20 f287466b1;

    /* JADX INFO: renamed from: c */
    public static final zy20 f287467c;

    /* JADX INFO: renamed from: c1 */
    public static final zy20 f287468c1;

    /* JADX INFO: renamed from: d */
    public static final zy20 f287469d;

    /* JADX INFO: renamed from: e */
    public static final zy20 f287470e;

    /* JADX INFO: renamed from: f */
    public static final zy20 f287471f;

    /* JADX INFO: renamed from: g */
    public static final zy20 f287472g;

    /* JADX INFO: renamed from: h */
    public static final zy20 f287473h;

    /* JADX INFO: renamed from: i */
    public static final zy20 f287474i;

    /* JADX INFO: renamed from: t */
    public static final zy20 f287475t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f287476a;

    static {
        int i = 2;
        f287465b = new zy20(i, 0);
        f287467c = new zy20(i, 1);
        f287469d = new zy20(i, 2);
        f287470e = new zy20(i, 3);
        f287471f = new zy20(i, 4);
        f287472g = new zy20(i, 5);
        f287473h = new zy20(i, 6);
        f287474i = new zy20(i, 7);
        f287475t = new zy20(i, 8);
        f287458X = new zy20(i, 9);
        f287460Y = new zy20(i, 10);
        f287462Z = new zy20(i, 11);
        f287446L0 = new zy20(i, 12);
        f287447M0 = new zy20(i, 13);
        f287448N0 = new zy20(i, 14);
        f287449O0 = new zy20(i, 15);
        f287450P0 = new zy20(i, 16);
        f287451Q0 = new zy20(i, 17);
        f287452R0 = new zy20(i, 18);
        f287453S0 = new zy20(i, 19);
        f287454T0 = new zy20(i, 20);
        f287455U0 = new zy20(i, 21);
        f287456V0 = new zy20(i, 22);
        f287457W0 = new zy20(i, 23);
        f287459X0 = new zy20(i, 24);
        f287461Y0 = new zy20(i, 25);
        f287463Z0 = new zy20(i, 26);
        f287464a1 = new zy20(i, 27);
        f287466b1 = new zy20(i, 28);
        f287468c1 = new zy20(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy20(int i, int i2) {
        super(i);
        this.f287476a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        long jM75452v;
        jiu jiuVar;
        m340 m340Var;
        w240 w240Var;
        String entityUri;
        m0v m0vVar;
        ufu ufuVar;
        List list;
        t140 t140Var;
        m340 m340Var2;
        z240 z240VarM60640a;
        w240 w240Var2;
        int i = this.f287476a;
        w2a1 w2a1Var = w2a1.f247311a;
        n6fVar = null;
        n6f n6fVar = null;
        switch (i) {
            case 0:
                return Next.m15606h((ky20) obj2);
            case 1:
                return First.m15575c((ky20) obj2, Collections.singleton(vy20.f245900a));
            case 2:
                dku dkuVar = ((jiu) obj).f112826d;
                int iOrdinal = ((ixu) obj2).ordinal();
                if (iOrdinal == 0) {
                    jM75452v = dkuVar.f50025b;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jM75452v = dkuVar.f50025b;
                } else {
                    jM75452v = rfg1.m75452v(dkuVar.f50025b, t430.f216889b);
                }
                return new n6f(jM75452v);
            case 3:
                return Integer.valueOf(((Number) obj).intValue());
            case 4:
                return (ta30) obj2;
            case 5:
                return (hb30) obj2;
            case 6:
                le30 le30Var = (le30) obj;
                return Next.m15607i(new xe30(le30Var), Collections.singleton(new id30(le30Var.f132439a.f69506a)));
            case 7:
                return First.m15575c((xe30) obj2, bk5.m29624m1(new td30[]{nd30.f152645a, new id30(((le30) obj).f132439a.f69506a)}));
            case 8:
                return w2a1Var;
            case 9:
                Object objM96523K = zn91.m96523K((Bundle) obj, "parcelable", a540.class);
                wj50.m88279p(objM96523K);
                return (Parcelable) objM96523K;
            case 10:
                ((b7u) obj).f24388b = (ta40) obj2;
                return w2a1Var;
            case 11:
                ((b7u) obj).f24387a = (qe10) obj2;
                return w2a1Var;
            case 12:
                ((b7u) obj).f24390d = ((luj) obj2).f137095a;
                return w2a1Var;
            case 13:
                m7f m7fVar = (m7f) obj2;
                ((b7u) obj).f24389c = m7fVar != null ? m7fVar.f140771a : null;
                return w2a1Var;
            case 14:
                pe10 pe10Var = (pe10) obj2;
                return pe10Var instanceof xoz0 ? pe10Var : obj;
            case 15:
                return null;
            case 16:
                return null;
            case 17:
                return null;
            case 18:
                return null;
            case 19:
                s840 s840Var = (s840) obj;
                r840 r840Var = (r840) obj2;
                String str = s840Var.f206541a;
                String str2 = s840Var.f206542b;
                ArrayList arrayList = r840Var.f196708b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (r840Var.f196709c.contains(((w1r) obj3).f247170a)) {
                        arrayList2.add(obj3);
                    }
                }
                String str3 = s840Var.f206544d;
                p840 p840Var = r840Var.f196707a;
                return new t840(str, str2, arrayList2, str3, p840Var.f174863c, p840Var.f174864d);
            case 20:
                fb40 fb40Var = (fb40) obj;
                ab40 ab40Var = (ab40) obj2;
                blt0 blt0Var = fb40Var.f67707a;
                int iHashCode = blt0Var.f28286a.hashCode();
                List listM46720Q = h6f.m46720Q(n0e1.m63417Y(0, 36), new bge1(iHashCode, iHashCode >> 31));
                Long l = fb40Var.f67708b;
                return new gb40(blt0Var, fb40Var.f67711e, ab40Var.f13995a, opo.m67576z(g6f.m43736n1(g6f.m43714b1(listM46720Q, n0e1.m63437n(l == null ? 0 : (l == null || fb40Var.f67709c != null || fb40Var.f67710d) ? ((ArrayList) listM46720Q).size() : (int) ((ab40Var.f13996b - l.longValue()) / ((long) 1000)), 0, 36)))));
            case 21:
                pe10 pe10Var2 = (pe10) obj2;
                return pe10Var2 instanceof tud1 ? pe10Var2 : obj;
            case 22:
                pe10 pe10Var3 = (pe10) obj2;
                return pe10Var3 instanceof dq20 ? pe10Var3 : obj;
            case 23:
                return (an40) obj;
            case 24:
                xx40 xx40Var = (xx40) obj;
                wx40 wx40Var = (wx40) obj2;
                v140 v140Var = wx40Var.f255932a;
                erc1 erc1Var = wx40Var.f255933b;
                if (erc1Var == null || (w240Var2 = erc1Var.f62082d) == null || (jiuVar = w240Var2.f247222a) == null) {
                    jiuVar = (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (w240Var = m340Var.f139525b) == null) ? null : w240Var.f247222a;
                }
                nx40 nx40Var = xx40Var.f266854a;
                String str4 = (erc1Var == null || (m340Var2 = erc1Var.f62079a) == null || (z240VarM60640a = m340Var2.m60640a(a340.f11861b)) == null) ? null : z240VarM60640a.f278475a.f198763a;
                if (v140Var == null || (entityUri = v140Var.f236243a) == null) {
                    entityUri = xx40Var.f266854a.getEntityUri();
                } else {
                    if (entityUri.length() <= 0) {
                        entityUri = null;
                    }
                    if (entityUri == null) {
                        entityUri = xx40Var.f266854a.getEntityUri();
                    }
                }
                String str5 = entityUri;
                String str6 = (v140Var == null || (list = v140Var.f236246d) == null || (t140Var = (t140) g6f.m43745s0(list)) == null) ? null : t140Var.f216153a;
                n6f n6fVar2 = (jiuVar == null || (ufuVar = jiuVar.f112823a) == null) ? null : new n6f(ufuVar.f229876c);
                if (jiuVar != null && (m0vVar = jiuVar.f112824b) != null) {
                    n6fVar = new n6f(m0vVar.f138757a);
                }
                return new yx40(nx40Var, str4, str5, str6, n6fVar2, n6fVar);
            case 25:
                ez40 ez40Var = (ez40) obj;
                oz40 oz40Var = (oz40) obj2;
                String str7 = ez40Var.f64266a;
                ArrayList arrayList3 = ez40Var.f64267b;
                String str8 = ez40Var.f64268c;
                oz40 oz40VarM68613a = oz40.m68613a(oz40Var, str7, arrayList3, str8, null, false, false, cuf1.m33917q(str8, oz40Var.f172074d, arrayList3), 56);
                return First.m15575c(oz40VarM68613a, Collections.singleton(new xy40(oz40VarM68613a.f172071a)));
            case 26:
                ou41 ou41Var = (ou41) obj;
                Bundle bundle = (Bundle) obj2;
                ou41 ou41Var2 = bundle != null ? (ou41) zn91.m96523K(bundle, "campfire_interceptor_model", ou41.class) : null;
                return ((ou41Var2 instanceof cu41) || (ou41Var2 instanceof tt41) || ou41Var2 == null) ? ou41Var : ou41Var2;
            case 27:
                hk50 hk50Var = (hk50) obj;
                gk50 gk50Var = (gk50) obj2;
                f4m0 f4m0Var = hk50Var.f92352a;
                String str9 = hk50Var.f92353b;
                String str10 = hk50Var.f92354c;
                return new mk50(f4m0Var, str9, str10 != null ? new jk50(str10, gk50Var.f80735a, gk50Var.f80736b) : kk50.f123512a, opo.m67574x(hk50Var.f92355d), hk50Var.f92356e);
            case 28:
                return ((oqg0) obj).m67631a((String) obj2);
            default:
                return ((oqg0) obj).m67631a((String) obj2);
        }
    }
}
