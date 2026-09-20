package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.Image;
import android.media.ImageReader;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import com.spotify.jam.internal.socialconnect.models.AcceptJamJoinResponse;
import com.spotify.jam.internal.socialconnect.models.AskToJoinResponse;
import com.spotify.jam.internal.socialconnect.models.PendingJoinRequest;
import com.spotify.jam.internal.socialconnect.models.RejectJamJoinResponse;
import com.spotify.jam.internal.socialconnect.models.RequestQueue;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.offline_esperanto.proto.EsOffline$GetItemsResponse;
import com.spotify.offline_esperanto.proto.EsOffline$Item;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryResponseHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class haz implements rwf, Predicate, Function, rem, zn70, hwf, l980, vhm0, tn61, cco0, BiFunction, vja1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89336a;

    /* JADX INFO: renamed from: b */
    public static final haz f89327b = new haz(0);

    /* JADX INFO: renamed from: c */
    public static final haz f89328c = new haz(1);

    /* JADX INFO: renamed from: d */
    public static final haz f89329d = new haz(2);

    /* JADX INFO: renamed from: e */
    public static final haz f89330e = new haz(3);

    /* JADX INFO: renamed from: f */
    public static final haz f89331f = new haz(5);

    /* JADX INFO: renamed from: g */
    public static final haz f89332g = new haz(6);

    /* JADX INFO: renamed from: h */
    public static final haz f89333h = new haz(7);

    /* JADX INFO: renamed from: i */
    public static final haz f89334i = new haz(8);

    /* JADX INFO: renamed from: t */
    public static final haz f89335t = new haz(9);

    /* JADX INFO: renamed from: X */
    public static final haz f89320X = new haz(10);

    /* JADX INFO: renamed from: Y */
    public static final haz f89322Y = new haz(11);

    /* JADX INFO: renamed from: Z */
    public static final haz f89324Z = new haz(12);

    /* JADX INFO: renamed from: L0 */
    public static final haz f89308L0 = new haz(14);

    /* JADX INFO: renamed from: M0 */
    public static final haz f89309M0 = new haz(15);

    /* JADX INFO: renamed from: N0 */
    public static final haz f89310N0 = new haz(16);

    /* JADX INFO: renamed from: O0 */
    public static final haz f89311O0 = new haz(17);

    /* JADX INFO: renamed from: P0 */
    public static final haz f89312P0 = new haz(18);

    /* JADX INFO: renamed from: Q0 */
    public static final haz f89313Q0 = new haz(19);

    /* JADX INFO: renamed from: R0 */
    public static final haz f89314R0 = new haz(20);

    /* JADX INFO: renamed from: S0 */
    public static final haz f89315S0 = new haz(21);

    /* JADX INFO: renamed from: T0 */
    public static final haz f89316T0 = new haz(22);

    /* JADX INFO: renamed from: U0 */
    public static final haz f89317U0 = new haz(23);

    /* JADX INFO: renamed from: V0 */
    public static final haz f89318V0 = new haz(24);

    /* JADX INFO: renamed from: W0 */
    public static final haz f89319W0 = new haz(25);

    /* JADX INFO: renamed from: X0 */
    public static final haz f89321X0 = new haz(26);

    /* JADX INFO: renamed from: Y0 */
    public static final haz f89323Y0 = new haz(27);

    /* JADX INFO: renamed from: Z0 */
    public static final haz f89325Z0 = new haz(28);

    /* JADX INFO: renamed from: a1 */
    public static final haz f89326a1 = new haz(29);

    public /* synthetic */ haz(int i) {
        this.f89336a = i;
    }

    /* JADX INFO: renamed from: o */
    public static l830 m46943o(z930 z930Var, String str) {
        Object next;
        t730 t730Var = z930Var.f280653a;
        r730 r730Var = t730Var != null ? t730Var.f217668b : null;
        q730 q730Var = r730Var instanceof q730 ? (q730) r730Var : null;
        if (q730Var != null) {
            ArrayList arrayList = q730Var.f186022b.f174553a;
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!wj50.m88271j(((o730) next).f162456b, str));
            o730 o730Var = (o730) next;
            if (o730Var != null) {
                ArrayList<o730> arrayListM43696J0 = g6f.m43696J0(arrayList, o730Var);
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayListM43696J0, 10));
                for (o730 o730Var2 : arrayListM43696J0) {
                    arrayList2.add(new PendingJoinRequest(o730Var2.f162456b, o730Var2.f162457c.name(), o730Var2.f162458d));
                }
                return new l830(new RequestQueue(arrayList2));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static Set m46944p(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = false;
        }
        return s601.m77312o0(new fww0(f5r0.class), new eww0(erc1.class), new eww0(v140.class), z3 ? new eww0(x430.class) : new fww0(x430.class), new eww0(yfj.class), z4 ? new fww0(thj.class) : null, z ? new eww0(p9c1.class) : null, z2 ? new eww0(g0w.class) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [p.r730, p.s730] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX INFO: renamed from: q */
    public static Next m46945q(z930 z930Var, l930 l930Var) {
        mye m830Var;
        String str;
        s730 s730Var;
        u730 u730Var;
        List list;
        List list2;
        Set setM15571a;
        List list3;
        l830 l830VarM46943o;
        o730 o730Var;
        u730 u730Var2;
        Object next;
        List list4;
        t730 t730Var = z930Var.f280653a;
        if (l930Var instanceof v830) {
            v830 v830Var = (v830) l930Var;
            return Next.m15605a(Effects.m15571a(new c830(v830Var.f238364a, v830Var.f238365b, v830Var.f238366c, v830Var.f238367d, v830Var.f238368e, v830Var.f238369f)));
        }
        if (l930Var instanceof y830) {
            return Next.m15605a(Effects.m15571a(new d830(((y830) l930Var).f270186a)));
        }
        if (l930Var instanceof s830) {
            s830 s830Var = (s830) l930Var;
            return Next.m15605a(Effects.m15571a(new b830(s830Var.f206530a, s830Var.f206531b)));
        }
        if (l930Var instanceof h930) {
            h930 h930Var = (h930) l930Var;
            return Next.m15605a(Effects.m15571a(new f830(h930Var.f88865a, h930Var.f88866b)));
        }
        String str2 = 0;
        str2 = 0;
        if (l930Var instanceof e930) {
            e930 e930Var = (e930) l930Var;
            r730 r730Var = t730Var != null ? t730Var.f217668b : null;
            return (!(r730Var instanceof q730) || ((q730) r730Var).f186022b.f174553a.isEmpty()) ? Next.m15608j() : Next.m15605a(Effects.m15571a(new e830(e930Var.f57351a)));
        }
        if (l930Var instanceof x830) {
            AskToJoinResponse askToJoinResponse = ((x830) l930Var).f259038a;
            return Next.m15605a(Effects.m15571a(new m830(askToJoinResponse != null ? askToJoinResponse.activeJoinRequest : null)));
        }
        int i = 2;
        int i2 = 1;
        if (l930Var instanceof w830) {
            xud xudVar = ((w830) l930Var).f248836a;
            boolean zEquals = xudVar.equals(x730.f258807c);
            hfw hfwVar = dfw.f48668a;
            if (!zEquals) {
                if (!(xudVar instanceof y730)) {
                    throw new NoWhenBranchMatchedException();
                }
                int iM38547C = edb.m38547C(((y730) xudVar).f269946c);
                if (iM38547C == 0) {
                    hfwVar = efw.f59133a;
                } else if (iM38547C != 1 && iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Next.m15605a(Effects.m15571a(new h830(hfwVar)));
        }
        boolean z = l930Var instanceof u830;
        n730 n730Var = n730.f151064a;
        if (z) {
            AcceptJamJoinResponse acceptJamJoinResponse = ((u830) l930Var).f227801b;
            if (acceptJamJoinResponse == null) {
                return Next.m15608j();
            }
            RequestQueue requestQueue = acceptJamJoinResponse.requestQueue;
            if (requestQueue == null || (list4 = requestQueue.requests) == null || list4.isEmpty()) {
                return Next.m15606h(new z930(t730Var != null ? t730.m80177a(t730Var, null, n730Var, 1) : new t730(str2, n730Var, i2)));
            }
            wj50.m88279p(requestQueue);
            return Next.m15605a(Effects.m15571a(new l830(requestQueue)));
        }
        if (l930Var instanceof t830) {
            t830 t830Var = (t830) l930Var;
            String str3 = t830Var.f217950a;
            zxc zxcVar = t830Var.f217951b;
            boolean zEquals2 = zxcVar.equals(v730.f238032b);
            hfw bfwVar = afw.f15235a;
            if (!zEquals2) {
                if (!(zxcVar instanceof w730)) {
                    throw new NoWhenBranchMatchedException();
                }
                int iM38547C2 = edb.m38547C(((w730) zxcVar).f248527b);
                if (iM38547C2 == 0) {
                    bfwVar = cfw.f37469a;
                } else if (iM38547C2 == 1) {
                    r730 r730Var2 = t730Var != null ? t730Var.f217668b : null;
                    q730 q730Var = r730Var2 instanceof q730 ? (q730) r730Var2 : null;
                    if (q730Var != null) {
                        Iterator it = q730Var.f186022b.f174553a.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!wj50.m88271j(((o730) next).f162456b, str3));
                        o730Var = (o730) next;
                    } else {
                        o730Var = null;
                    }
                    if (o730Var != null && (u730Var2 = o730Var.f162455a) != null) {
                        str2 = u730Var2.f227489b;
                    }
                    if (str2 == 0) {
                        str2 = str3;
                    }
                    bfwVar = new bfw(str2);
                } else if (iM38547C2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            HashSet hashSetM15571a = Effects.m15571a(new h830(bfwVar));
            if ((bfwVar instanceof bfw) && (l830VarM46943o = m46943o(z930Var, str3)) != null) {
                hashSetM15571a.add(l830VarM46943o);
            }
            return Next.m15605a(hashSetM15571a);
        }
        boolean z2 = l930Var instanceof j930;
        k830 k830Var = k830.f120242c;
        if (z2) {
            RejectJamJoinResponse rejectJamJoinResponse = ((j930) l930Var).f110083b;
            if (rejectJamJoinResponse == null) {
                return Next.m15608j();
            }
            RequestQueue requestQueue2 = rejectJamJoinResponse.requestQueue;
            if (requestQueue2 == null || (list3 = requestQueue2.requests) == null || list3.isEmpty()) {
                return Next.m15607i(new z930(t730Var != null ? t730.m80177a(t730Var, null, n730Var, 1) : new t730(str2, n730Var, i2)), Effects.m15571a(k830Var));
            }
            wj50.m88279p(requestQueue2);
            return Next.m15605a(Effects.m15571a(new l830(requestQueue2), k830Var));
        }
        if (l930Var instanceof i930) {
            i930 i930Var = (i930) l930Var;
            hxh hxhVar = i930Var.f99894b;
            boolean zEquals3 = hxhVar.equals(aa30.f13748c);
            gfw gfwVar = gfw.f79479a;
            if (zEquals3) {
                setM15571a = Effects.m15571a(new h830(gfwVar));
            } else {
                if (!(hxhVar instanceof ba30)) {
                    throw new NoWhenBranchMatchedException();
                }
                int iM38547C3 = edb.m38547C(((ba30) hxhVar).f25076c);
                if (iM38547C3 == 0) {
                    Set setM77306i0 = s601.m77306i0(k830Var);
                    l830 l830VarM46943o2 = m46943o(z930Var, i930Var.f99893a);
                    if (l830VarM46943o2 != null) {
                        setM77306i0.add(l830VarM46943o2);
                    }
                    setM15571a = setM77306i0;
                } else {
                    if (iM38547C3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    setM15571a = Effects.m15571a(new h830(gfwVar));
                }
            }
            return Next.m15605a(setM15571a);
        }
        if (l930Var instanceof g930) {
            return Next.m15606h(new z930(t730Var != null ? t730.m80177a(t730Var, null, n730Var, 1) : new t730(str2, n730Var, i2)));
        }
        if (l930Var instanceof f930) {
            return Next.m15608j();
        }
        if (l930Var instanceof b930) {
            ya60 ya60Var = ((b930) l930Var).f24751a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            RequestQueue requestQueue3 = ya60Var.f270818d;
            if (requestQueue3 == null || (list2 = requestQueue3.requests) == null || list2.isEmpty()) {
                z930Var = new z930(t730Var != null ? t730.m80177a(t730Var, null, n730Var, 1) : new t730(str2, n730Var, i2));
            } else {
                linkedHashSet.add(new l830(requestQueue3));
            }
            linkedHashSet.add(new m830(ya60Var.f270817c));
            return Next.m15607i(z930Var, linkedHashSet);
        }
        if (l930Var instanceof c930) {
            c930 c930Var = (c930) l930Var;
            switch (v930.f238833a[c930Var.f35377a.ordinal()]) {
                case 1:
                    if (t730Var == null || (s730Var = t730Var.f217667a) == null || (u730Var = s730Var.f206267b) == null) {
                        str = null;
                    } else {
                        str = u730Var.f227489b;
                        if (str == null) {
                            str = u730Var.f227488a;
                        }
                    }
                    Set setM77306i1 = s601.m77306i0(new m830(null));
                    if (str != null) {
                        setM77306i1.add(new i830(str));
                    }
                    return Next.m15605a(setM77306i1);
                case 2:
                case 3:
                case 4:
                    return Next.m15605a(Effects.m15571a(new m830(null), j830.f109783c));
                case 5:
                case 6:
                    RequestQueue requestQueue4 = c930Var.f35378b;
                    if (requestQueue4 == null || (list = requestQueue4.requests) == null || list.isEmpty()) {
                        return Next.m15606h(new z930(t730Var != null ? t730.m80177a(t730Var, null, n730Var, 1) : new t730(str2, n730Var, i2)));
                    }
                    wj50.m88279p(requestQueue4);
                    return Next.m15605a(Collections.singleton(new l830(requestQueue4)));
                case 7:
                    return Next.m15608j();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (l930Var instanceof k930) {
            return Next.m15608j();
        }
        if (l930Var instanceof d930) {
            s730 s730Var2 = ((d930) l930Var).f46652a;
            return Next.m15606h(new z930(t730Var != null ? t730.m80177a(t730Var, s730Var2, null, 2) : new t730(s730Var2, str2, i)));
        }
        if (l930Var instanceof a930) {
            r730 r730Var3 = ((a930) l930Var).f13460a;
            return Next.m15606h(new z930(t730Var != null ? t730.m80177a(t730Var, null, r730Var3, 1) : new t730(str2, r730Var3, i2)));
        }
        if (!(l930Var instanceof z830)) {
            throw new NoWhenBranchMatchedException();
        }
        gue gueVar = ((z830) l930Var).f280348a;
        boolean zEquals4 = gueVar.equals(z730.f280085f);
        ffw ffwVar = ffw.f69108a;
        if (zEquals4) {
            m830Var = new h830(ffwVar);
        } else {
            if (!(gueVar instanceof a830)) {
                throw new NoWhenBranchMatchedException();
            }
            int iM38547C4 = edb.m38547C(((a830) gueVar).f13182f);
            if (iM38547C4 == 0) {
                m830Var = new m830(null);
            } else {
                if (iM38547C4 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                m830Var = new h830(ffwVar);
            }
        }
        return Next.m15605a(Effects.m15571a(m830Var));
    }

    @Override // p204p.l980
    /* JADX INFO: renamed from: a */
    public List mo25890a(boolean z, boolean z2, YourLibraryResponseHeader yourLibraryResponseHeader, List list, List list2) {
        return lau.f131415a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        qas nasVar;
        switch (this.f89336a) {
            case 2:
                List<vbr> list = ((o810) obj).f162672a;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (vbr vbrVar : list) {
                    arrayList.add(new g5r(vbrVar.f239559a, vbrVar.f239560b, vbrVar.f239561c, vbrVar.f239562d, vbrVar.f239563e, vbrVar.f239564f));
                }
                return arrayList;
            case 3:
                q820 q820Var = (q820) obj;
                return new mot0(q820Var.f186221b, q820Var.f186220a, q820Var.f186222c);
            case 5:
                return p1j0.f173119a;
            case 8:
                return new lf3((av80) obj);
            case 9:
                return new sn90(tn90.f221912b);
            case 11:
                return new l7b0(((Boolean) obj).booleanValue());
            case 12:
                return Optional.empty();
            case 17:
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ke20 ke20Var = (ke20) ((xul0) it.next()).mo49283h();
                    if (ke20Var != null) {
                        arrayList2.add(ke20Var);
                    }
                }
                return arrayList2;
            case 19:
                List<EsOffline$Item> itemsList = ((EsOffline$GetItemsResponse) obj).getItemsList();
                int iM31820L = c95.m31820L(i6f.m49804T(itemsList, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (EsOffline$Item esOffline$Item : itemsList) {
                    String uri = esOffline$Item.getUri();
                    switch (iwk0.f106468b[esOffline$Item.m16167p().ordinal()]) {
                        case -1:
                        case 1:
                        case 2:
                        case 9:
                            nasVar = oas.f163453a;
                            break;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 3:
                            nasVar = mas.f141668a;
                            break;
                        case 4:
                            nasVar = las.f131402a;
                            break;
                        case 5:
                            nasVar = new nas(n0e1.m63436m(esOffline$Item.getSyncProgress() / 100.0f, 0.0f, 1.0f));
                            break;
                        case 6:
                        case 7:
                        case 8:
                            nasVar = pas.f175603a;
                            break;
                    }
                    linkedHashMap.put(uri, nasVar);
                }
                return linkedHashMap;
            case 20:
                return Boolean.TRUE;
            case 24:
                return ((thj) obj).f220443a;
            case 25:
                return new uq71((qro0) obj);
            case 28:
                return new uyp0((Throwable) obj);
            default:
                return Boolean.valueOf(((ciq0) obj) instanceof biq0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.zn70
    /* JADX INFO: renamed from: c */
    public Object mo36519c(rx10 rx10Var, fbk fbkVar) {
        ao70 ao70Var;
        ImageReader imageReader;
        if (fbkVar instanceof ao70) {
            ao70Var = (ao70) fbkVar;
            int i = ao70Var.f17593d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ao70Var.f17593d = i - Integer.MIN_VALUE;
            } else {
                ao70Var = new ao70(this, (ibk) fbkVar);
            }
        } else {
            ao70Var = new ao70(this, (ibk) fbkVar);
        }
        Object objM48221p = ao70Var.f17591b;
        int i2 = ao70Var.f17593d;
        if (i2 == 0) {
            bga.m29073P(objM48221p);
            long j = rx10Var.f203459u;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (j >> 32), (int) (j & 4294967295L), 1, 1);
            try {
                ao70Var.f17590a = imageReaderNewInstance;
                ao70Var.f17593d = 1;
                hqb hqbVar = new hqb(1, seg1.m77914f(ao70Var));
                hqbVar.m48222q();
                imageReaderNewInstance.setOnImageAvailableListener(new bo70(hqbVar), grl0.m45545r(looperMyLooper));
                Surface surface = imageReaderNewInstance.getSurface();
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(rfg1.m75429D(n6f.f150862b), PorterDuff.Mode.CLEAR);
                    Canvas canvas = ly3.f137948a;
                    ky3 ky3Var = new ky3();
                    ky3Var.f127640a = canvasLockHardwareCanvas;
                    rx10Var.m76594c(ky3Var, null);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    objM48221p = hqbVar.m48221p();
                    yuk yukVar = yuk.f276404a;
                    if (objM48221p == yukVar) {
                        return yukVar;
                    }
                    imageReader = imageReaderNewInstance;
                } catch (Throwable th) {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                imageReader = imageReaderNewInstance;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            imageReader = ao70Var.f17590a;
            try {
                bga.m29073P(objM48221p);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    mif1.m61875i(imageReader, th);
                    throw th4;
                }
            }
        }
        Bitmap bitmapM63027g = mwg1.m63027g((Image) objM48221p);
        mif1.m61875i(imageReader, null);
        return bitmapM63027g;
    }

    /* JADX INFO: renamed from: d */
    public void m46946d(int i) {
        if (4 > i) {
            Log.isLoggable("FirebaseCrashlytics", i);
        }
    }

    @Override // p204p.rem
    /* JADX INFO: renamed from: f */
    public Iterable mo30748f(Object obj) {
        qr60[] qr60VarArr = pn60.f179319h;
        return ((eab) obj).mo27377a().mo32019p();
    }

    /* JADX INFO: renamed from: g */
    public void m46947g() {
        m46946d(3);
    }

    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        return z2h1.m95213t((Executor) sef0Var.mo54440d(new eht0(ld80.class, Executor.class)));
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3 = (String) linkedHashMap.get("playlist_id");
        if (str3 == null || str3.length() != 22) {
            return null;
        }
        int length = str3.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str3.charAt(i);
            if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                return null;
            }
        }
        String str4 = (String) linkedHashMap.get("row_id");
        if (str4 == null) {
            return null;
        }
        return new wup0(str3, str4, mec0Var, str2, str);
    }

    /* JADX INFO: renamed from: k */
    public void m46948k() {
        m46946d(6);
    }

    /* JADX INFO: renamed from: m */
    public void m46949m() {
        m46948k();
    }

    /* JADX INFO: renamed from: n */
    public void m46950n() {
        m46946d(4);
    }

    /* JADX INFO: renamed from: r */
    public void m46951r() {
        m46946d(2);
    }

    /* JADX INFO: renamed from: s */
    public void m46952s() {
        m46946d(5);
    }

    /* JADX INFO: renamed from: t */
    public void m46953t() {
        m46946d(5);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f89336a) {
            case 1:
                return ((o2x0) obj).f161171a.f149852O0;
            default:
                return ((xul0) obj).mo49279c();
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new am81(((Number) obj).longValue(), ((Number) obj2).longValue());
    }

    @Override // p204p.vhm0
    /* JADX INFO: renamed from: b */
    public int mo30690b(lv70 lv70Var, int i) {
        return i;
    }
}
