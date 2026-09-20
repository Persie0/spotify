package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lei extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final lei f132553L0;

    /* JADX INFO: renamed from: M0 */
    public static final lei f132554M0;

    /* JADX INFO: renamed from: N0 */
    public static final lei f132555N0;

    /* JADX INFO: renamed from: O0 */
    public static final lei f132556O0;

    /* JADX INFO: renamed from: P0 */
    public static final lei f132557P0;

    /* JADX INFO: renamed from: Q0 */
    public static final lei f132558Q0;

    /* JADX INFO: renamed from: R0 */
    public static final lei f132559R0;

    /* JADX INFO: renamed from: S0 */
    public static final lei f132560S0;

    /* JADX INFO: renamed from: T0 */
    public static final lei f132561T0;

    /* JADX INFO: renamed from: U0 */
    public static final lei f132562U0;

    /* JADX INFO: renamed from: V0 */
    public static final lei f132563V0;

    /* JADX INFO: renamed from: W0 */
    public static final lei f132564W0;

    /* JADX INFO: renamed from: X */
    public static final lei f132565X;

    /* JADX INFO: renamed from: X0 */
    public static final lei f132566X0;

    /* JADX INFO: renamed from: Y */
    public static final lei f132567Y;

    /* JADX INFO: renamed from: Y0 */
    public static final lei f132568Y0;

    /* JADX INFO: renamed from: Z */
    public static final lei f132569Z;

    /* JADX INFO: renamed from: Z0 */
    public static final lei f132570Z0;

    /* JADX INFO: renamed from: a1 */
    public static final lei f132571a1;

    /* JADX INFO: renamed from: b */
    public static final lei f132572b;

    /* JADX INFO: renamed from: b1 */
    public static final lei f132573b1;

    /* JADX INFO: renamed from: c */
    public static final lei f132574c;

    /* JADX INFO: renamed from: c1 */
    public static final lei f132575c1;

    /* JADX INFO: renamed from: d */
    public static final lei f132576d;

    /* JADX INFO: renamed from: e */
    public static final lei f132577e;

    /* JADX INFO: renamed from: f */
    public static final lei f132578f;

    /* JADX INFO: renamed from: g */
    public static final lei f132579g;

    /* JADX INFO: renamed from: h */
    public static final lei f132580h;

    /* JADX INFO: renamed from: i */
    public static final lei f132581i;

    /* JADX INFO: renamed from: t */
    public static final lei f132582t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132583a;

    static {
        int i = 1;
        f132572b = new lei(i, 0);
        f132574c = new lei(i, 1);
        f132576d = new lei(i, 2);
        f132577e = new lei(i, 3);
        f132578f = new lei(i, 4);
        f132579g = new lei(i, 5);
        f132580h = new lei(i, 6);
        f132581i = new lei(i, 7);
        f132582t = new lei(i, 8);
        f132565X = new lei(i, 9);
        f132567Y = new lei(i, 10);
        f132569Z = new lei(i, 11);
        f132553L0 = new lei(i, 12);
        f132554M0 = new lei(i, 13);
        f132555N0 = new lei(i, 14);
        f132556O0 = new lei(i, 15);
        f132557P0 = new lei(i, 16);
        f132558Q0 = new lei(i, 17);
        f132559R0 = new lei(i, 18);
        f132560S0 = new lei(i, 19);
        f132561T0 = new lei(i, 20);
        f132562U0 = new lei(i, 21);
        f132563V0 = new lei(i, 22);
        f132564W0 = new lei(i, 23);
        f132566X0 = new lei(i, 24);
        f132568Y0 = new lei(i, 25);
        f132570Z0 = new lei(i, 26);
        f132571a1 = new lei(i, 27);
        f132573b1 = new lei(i, 28);
        f132575c1 = new lei(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lei(int i, int i2) {
        super(i);
        this.f132583a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f132583a) {
            case 0:
                return w2a1.f247311a;
            case 1:
                jpz0.m54007u((mpz0) obj, 0);
                return w2a1.f247311a;
            case 2:
                return ((j3i) obj).f108403a;
            case 3:
                List list = (List) obj;
                return new oei((luh) pei.f176758a.f200132e.invoke(list.get(0)), (pfa0) pei.f176759b.f200132e.invoke(list.get(1)), (i3i) pei.f176760c.f200132e.invoke(list.get(2)));
            case 4:
                return ((j3i) obj).f108403a;
            case 5:
                return ((j3i) obj).f108403a;
            case 6:
                return Boolean.valueOf(obj instanceof luh);
            case 7:
                if (obj != null) {
                    return (luh) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concert.Concert");
            case 8:
                return Boolean.valueOf(obj instanceof pfa0);
            case 9:
                if (obj != null) {
                    return (pfa0) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concertlocation.Location");
            case 10:
                return Boolean.valueOf(obj instanceof i3i);
            case 11:
                if (obj != null) {
                    return (i3i) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concertmarketing.ConcertCover");
            case 12:
                return w2a1.f247311a;
            case 13:
                return w2a1.f247311a;
            case 14:
                return ((sfi) obj).f208588a;
            case 15:
                return ((sfi) obj).f208588a;
            case 16:
                return ((sfi) obj).f208588a;
            case 17:
                return ((sfi) obj).f208588a;
            case 18:
                return pfi.f177058o;
            case 19:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 20:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 21:
                return Boolean.valueOf(obj instanceof luh);
            case 22:
                if (obj != null) {
                    return (luh) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concert.Concert");
            case 23:
                return Boolean.valueOf(obj instanceof pfa0);
            case 24:
                if (obj != null) {
                    return (pfa0) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concertlocation.Location");
            case 25:
                return Boolean.valueOf(obj instanceof v140);
            case 26:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 27:
                ggi ggiVar = (ggi) obj;
                return new hgi(ggiVar.f79677a, ggiVar.f79678b, lv21.f137205b);
            case 28:
                qf40 qf40Var = ((ggi) obj).f79679c;
                ArrayList arrayList = new ArrayList(i6f.m49804T(qf40Var, 10));
                Iterator<E> it = qf40Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(new j3i((String) it.next()));
                }
                return arrayList;
            default:
                return ((bl90) obj).f28133c;
        }
    }
}
