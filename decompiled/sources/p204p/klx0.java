package p204p;

import androidx.compose.p002ui.geometry.Offset;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class klx0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final klx0 f123974L0;

    /* JADX INFO: renamed from: M0 */
    public static final klx0 f123975M0;

    /* JADX INFO: renamed from: N0 */
    public static final klx0 f123976N0;

    /* JADX INFO: renamed from: O0 */
    public static final klx0 f123977O0;

    /* JADX INFO: renamed from: P0 */
    public static final klx0 f123978P0;

    /* JADX INFO: renamed from: Q0 */
    public static final klx0 f123979Q0;

    /* JADX INFO: renamed from: R0 */
    public static final klx0 f123980R0;

    /* JADX INFO: renamed from: S0 */
    public static final klx0 f123981S0;

    /* JADX INFO: renamed from: T0 */
    public static final klx0 f123982T0;

    /* JADX INFO: renamed from: U0 */
    public static final klx0 f123983U0;

    /* JADX INFO: renamed from: V0 */
    public static final klx0 f123984V0;

    /* JADX INFO: renamed from: W0 */
    public static final klx0 f123985W0;

    /* JADX INFO: renamed from: X */
    public static final klx0 f123986X;

    /* JADX INFO: renamed from: X0 */
    public static final klx0 f123987X0;

    /* JADX INFO: renamed from: Y */
    public static final klx0 f123988Y;

    /* JADX INFO: renamed from: Y0 */
    public static final klx0 f123989Y0;

    /* JADX INFO: renamed from: Z */
    public static final klx0 f123990Z;

    /* JADX INFO: renamed from: Z0 */
    public static final klx0 f123991Z0;

    /* JADX INFO: renamed from: a1 */
    public static final klx0 f123992a1;

    /* JADX INFO: renamed from: b */
    public static final klx0 f123993b;

    /* JADX INFO: renamed from: b1 */
    public static final klx0 f123994b1;

    /* JADX INFO: renamed from: c */
    public static final klx0 f123995c;

    /* JADX INFO: renamed from: c1 */
    public static final klx0 f123996c1;

    /* JADX INFO: renamed from: d */
    public static final klx0 f123997d;

    /* JADX INFO: renamed from: e */
    public static final klx0 f123998e;

    /* JADX INFO: renamed from: f */
    public static final klx0 f123999f;

    /* JADX INFO: renamed from: g */
    public static final klx0 f124000g;

    /* JADX INFO: renamed from: h */
    public static final klx0 f124001h;

    /* JADX INFO: renamed from: i */
    public static final klx0 f124002i;

    /* JADX INFO: renamed from: t */
    public static final klx0 f124003t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124004a;

    static {
        int i = 2;
        f123993b = new klx0(i, 0);
        f123995c = new klx0(i, 1);
        f123997d = new klx0(i, 2);
        f123998e = new klx0(i, 3);
        f123999f = new klx0(i, 4);
        f124000g = new klx0(i, 5);
        f124001h = new klx0(i, 6);
        f124002i = new klx0(i, 7);
        f124003t = new klx0(i, 8);
        f123986X = new klx0(i, 9);
        f123988Y = new klx0(i, 10);
        f123990Z = new klx0(i, 11);
        f123974L0 = new klx0(i, 12);
        f123975M0 = new klx0(i, 13);
        f123976N0 = new klx0(i, 14);
        f123977O0 = new klx0(i, 15);
        f123978P0 = new klx0(i, 16);
        f123979Q0 = new klx0(i, 17);
        f123980R0 = new klx0(i, 18);
        f123981S0 = new klx0(i, 19);
        f123982T0 = new klx0(i, 20);
        f123983U0 = new klx0(i, 21);
        f123984V0 = new klx0(i, 22);
        f123985W0 = new klx0(i, 23);
        f123987X0 = new klx0(i, 24);
        f123989Y0 = new klx0(i, 25);
        f123991Z0 = new klx0(i, 26);
        f123992a1 = new klx0(i, 27);
        f123994b1 = new klx0(i, 28);
        f123996c1 = new klx0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ klx0(int i, int i2) {
        super(i);
        this.f124004a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        clx0 clx0Var;
        String str;
        ?? arrayList;
        switch (this.f124004a) {
            case 0:
                vlx0 vlx0Var = (vlx0) obj2;
                boolean z = ((ilx0) obj).f103518e;
                return z != vlx0Var.f242620e ? Next.m15606h(vlx0.m85978c(vlx0Var, null, null, z, 47)) : Next.m15608j();
            case 1:
                vlx0 vlx0Var2 = (vlx0) obj2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ylx0 ylx0Var = vlx0Var2.f242618c;
                wlx0 wlx0Var = ylx0Var instanceof wlx0 ? (wlx0) ylx0Var : null;
                if (wlx0Var != null) {
                    Long l = wlx0Var.f252639b;
                    if (l == null || wlx0Var.f252640c != null || wlx0Var.f252641d) {
                        clx0Var = null;
                    } else {
                        long jLongValue = l.longValue();
                        wit0 wit0Var = wlx0Var.f252638a;
                        clx0Var = new clx0(wit0Var.f251745a, jLongValue + wit0Var.f251749e);
                    }
                    if (clx0Var != null) {
                        linkedHashSet.add(clx0Var);
                    }
                }
                return First.m15575c(vlx0.m85978c(vlx0Var2, null, null, false, 31), linkedHashSet);
            case 2:
                ((c7u) obj).f35022c = (qe10) obj2;
                return w2a1.f247311a;
            case 3:
                ((c7u) obj).f35024e = ((kb3) obj2).f121073a;
                return w2a1.f247311a;
            case 4:
                ((c7u) obj).f35023d = ((ib3) obj2).f100421a;
                return w2a1.f247311a;
            case 5:
                return new n6f(((jiu) obj).f112826d.f50025b);
            case 6:
                return Next.m15608j();
            case 7:
                mfy0 mfy0Var = (mfy0) obj2;
                return First.m15575c(mfy0Var, Collections.singleton(new pey0(mfy0Var.f143239a)));
            case 8:
                return Boolean.valueOf(zky0.m96347a((PlayerState) obj).equals(zky0.m96347a((PlayerState) obj2)));
            case 9:
                yny0 yny0Var = (yny0) obj2;
                return new boy0(yny0Var.f274528a, yny0Var.f274529b);
            case 10:
                return (pvy0) obj2;
            case 11:
                return (i5z0) obj2;
            case 12:
                return w2a1.f247311a;
            case 13:
                return null;
            case 14:
                return ufc1.m82980w(((tjm0) obj).f220966c, (b250) obj2);
            case 15:
                return (v9z0) obj2;
            case 16:
                jaz0 jaz0Var = (jaz0) obj;
                return new kaz0(jaz0Var.f110601a, ((laz0) vie1.m85619a((qho) obj2)).f131474a, jaz0Var.f110602b, jaz0Var.f110603c);
            case 17:
                tbz0 tbz0Var = (tbz0) obj2;
                return new ubz0(tbz0Var.f218972a, tbz0Var.f218973b.disallowSeekingReasons().isEmpty(), tbz0Var.f218974c, tbz0Var.f218975d.f17060a);
            case 18:
                icz0 icz0Var = (icz0) obj2;
                return new jcz0(icz0Var.f100901a, icz0Var.f100902b.disallowSeekingReasons().isEmpty(), icz0Var.f100903c, ((kcz0) obj).f121570a, icz0Var.f100904d.f17060a);
            case 19:
                pqm0 pqm0Var = (pqm0) obj2;
                int i = ((udz0) obj).f229350a;
                String str2 = (String) pqm0Var.f180350a;
                tny0 tny0Var = (tny0) pqm0Var.f180351b;
                if (tny0Var instanceof sny0) {
                    return new wdz0(i, null, str2);
                }
                if (tny0Var instanceof rny0) {
                    return new wdz0(i, Integer.valueOf(((rny0) tny0Var).f201023a), str2);
                }
                if (tny0Var instanceof qny0) {
                    return new vdz0(str2);
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                return xq81.m91820a((xq81) obj2, ((lez0) obj).f132770a);
            case 21:
                nfz0 nfz0Var = (nfz0) obj2;
                return new nfz0(nfz0Var.f153486a, ((mfz0) obj).f143244b, nfz0Var.f153487b);
            case 22:
                hz80 hz80Var = (hz80) obj;
                List list = (List) obj2;
                if (hz80Var == null || (str = hz80Var.f96825a) == null) {
                    str = "";
                }
                if (list != null) {
                    arrayList = new ArrayList(i6f.m49804T(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((dx80) it.next()).f53899c);
                    }
                } else {
                    arrayList = lau.f131415a;
                }
                return new nfz0(str, 1, arrayList);
            case 23:
                aiz0 aiz0Var = (aiz0) obj;
                return Next.m15606h(ciz0.m32908a((ciz0) obj2, null, 0L, 0L, 0L, false, false, false, false, aiz0Var.f16116b, null, 0L, 0L, aiz0Var.f16115a, null, 12031));
            case 24:
                aiz0 aiz0Var2 = (aiz0) obj;
                return First.m15574b(ciz0.m32908a((ciz0) obj2, null, 0L, 0L, 0L, false, false, false, false, aiz0Var2.f16116b, null, 0L, 0L, aiz0Var2.f16115a, null, 12031));
            case 25:
                long j = ((Offset) obj2).f493a;
                return w2a1.f247311a;
            case 26:
                ziz0 ziz0Var = (ziz0) obj2;
                return new yiz0(ziz0Var.f283304a, ziz0Var.f283305b, ziz0Var.f283306c);
            case 27:
                return new fjz0(((Boolean) obj2).booleanValue());
            case 28:
                api apiVar = (api) obj;
                api apiVar2 = (api) obj2;
                return Boolean.valueOf(wj50.m88271j(apiVar != null ? apiVar.mo26689e() : null, apiVar2 != null ? apiVar2.mo26689e() : null));
            default:
                Collection collection = (List) obj;
                List list2 = (List) obj2;
                if (collection == null) {
                    collection = lau.f131415a;
                }
                return g6f.m43700N0(list2, collection);
        }
    }
}
