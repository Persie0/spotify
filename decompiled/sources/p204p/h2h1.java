package p204p;

import android.os.Parcelable;
import android.os.RemoteException;
import com.comscore.streaming.ContentType;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import com.spotify.base.java.logging.Logger;
import com.spotify.contextmenu.platform.ContextMenuContentLoadException;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.outcome.outcomeapi.exceptions.HttpError;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes4.dex */
public final class h2h1 implements Function, Predicate, BiFunction, b671, Init, Function4, yh00 {

    /* JADX INFO: renamed from: b */
    public static h2h1 f86999b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f87008a;

    /* JADX INFO: renamed from: c */
    public static final h2h1 f87000c = new h2h1(1);

    /* JADX INFO: renamed from: d */
    public static final h2h1 f87001d = new h2h1(2);

    /* JADX INFO: renamed from: e */
    public static final h2h1 f87002e = new h2h1(3);

    /* JADX INFO: renamed from: f */
    public static final h2h1 f87003f = new h2h1(4);

    /* JADX INFO: renamed from: g */
    public static final h2h1 f87004g = new h2h1(5);

    /* JADX INFO: renamed from: h */
    public static final sy5 f87005h = new sy5(false, "", "");

    /* JADX INFO: renamed from: i */
    public static final h2h1 f87006i = new h2h1(7);

    /* JADX INFO: renamed from: t */
    public static final h2h1 f87007t = new h2h1(8);

    /* JADX INFO: renamed from: X */
    public static final h2h1 f86992X = new h2h1(9);

    /* JADX INFO: renamed from: Y */
    public static final h2h1 f86994Y = new h2h1(10);

    /* JADX INFO: renamed from: Z */
    public static final h2h1 f86996Z = new h2h1(11);

    /* JADX INFO: renamed from: L0 */
    public static final h2h1 f86980L0 = new h2h1(12);

    /* JADX INFO: renamed from: M0 */
    public static final h2h1 f86981M0 = new h2h1(13);

    /* JADX INFO: renamed from: N0 */
    public static final h2h1 f86982N0 = new h2h1(14);

    /* JADX INFO: renamed from: O0 */
    public static final h2h1 f86983O0 = new h2h1(15);

    /* JADX INFO: renamed from: P0 */
    public static final h2h1 f86984P0 = new h2h1(18);

    /* JADX INFO: renamed from: Q0 */
    public static final h2h1 f86985Q0 = new h2h1(19);

    /* JADX INFO: renamed from: R0 */
    public static final h2h1 f86986R0 = new h2h1(20);

    /* JADX INFO: renamed from: S0 */
    public static final h2h1 f86987S0 = new h2h1(21);

    /* JADX INFO: renamed from: T0 */
    public static final h2h1 f86988T0 = new h2h1(22);

    /* JADX INFO: renamed from: U0 */
    public static final h2h1 f86989U0 = new h2h1(23);

    /* JADX INFO: renamed from: V0 */
    public static final h2h1 f86990V0 = new h2h1(24);

    /* JADX INFO: renamed from: W0 */
    public static final h2h1 f86991W0 = new h2h1(25);

    /* JADX INFO: renamed from: X0 */
    public static final h2h1 f86993X0 = new h2h1(26);

    /* JADX INFO: renamed from: Y0 */
    public static final h2h1 f86995Y0 = new h2h1(27);

    /* JADX INFO: renamed from: Z0 */
    public static final h2h1 f86997Z0 = new h2h1(28);

    /* JADX INFO: renamed from: a1 */
    public static final h2h1 f86998a1 = new h2h1(29);

    public /* synthetic */ h2h1(int i) {
        this.f87008a = i;
    }

    /* JADX INFO: renamed from: a */
    public static Next m46494a(rpi rpiVar, epi epiVar) {
        if (epiVar instanceof bpi) {
            return Next.m15606h(rpi.m76188a(rpiVar, ((bpi) epiVar).f29478a, false, null, null, 14));
        }
        if (epiVar instanceof cpi) {
            cwi cwiVar = ((cpi) epiVar).f40561a;
            return Next.m15606h(rpi.m76188a(rpi.m76188a(rpi.m76188a(rpiVar, null, false, null, null, 15), null, cwiVar.f42764e, null, null, 13), null, false, cwiVar.f42762c, null, 11));
        }
        if (epiVar instanceof dpi) {
            return Next.m15606h(rpi.m76188a(rpiVar, null, false, null, ((dpi) epiVar).f51338a, 7));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ac A[LOOP:4: B:89:0x0189->B:101:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01de A[LOOP:5: B:104:0x01b5->B:116:0x01de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x0200  */
    /* JADX WARN: Code duplicated, block: B:124:0x020d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0217  */
    /* JADX WARN: Code duplicated, block: B:131:0x0225  */
    /* JADX WARN: Code duplicated, block: B:132:0x0229  */
    /* JADX WARN: Code duplicated, block: B:134:0x022c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0233  */
    /* JADX WARN: Code duplicated, block: B:138:0x023e  */
    /* JADX WARN: Code duplicated, block: B:139:0x024b A[LOOP:7: B:125:0x0211->B:139:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x025c A[PHI: r2
      0x025c: PHI (r2v67 java.util.List) = (r2v70 java.util.List), (r2v71 java.util.List) binds: [B:142:0x025a, B:188:0x030e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x025f  */
    /* JADX WARN: Code duplicated, block: B:147:0x026a  */
    /* JADX WARN: Code duplicated, block: B:150:0x027b A[LOOP:8: B:145:0x0264->B:150:0x027b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x0281  */
    /* JADX WARN: Code duplicated, block: B:156:0x0292  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:166:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:174:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:177:0x02f2 A[LOOP:12: B:172:0x02db->B:177:0x02f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:185:0x0303  */
    /* JADX WARN: Code duplicated, block: B:188:0x030e  */
    /* JADX WARN: Code duplicated, block: B:435:0x0763  */
    /* JADX WARN: Code duplicated, block: B:438:0x076f A[LOOP:26: B:433:0x075d->B:438:0x076f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:442:0x077a  */
    /* JADX WARN: Code duplicated, block: B:443:0x077c  */
    /* JADX WARN: Code duplicated, block: B:445:0x0780  */
    /* JADX WARN: Code duplicated, block: B:535:0x01b0 A[EDGE_INSN: B:535:0x01b0->B:103:0x01b0 BREAK  A[LOOP:4: B:89:0x0189->B:101:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x01e2 A[EDGE_INSN: B:537:0x01e2->B:118:0x01e2 BREAK  A[LOOP:5: B:104:0x01b5->B:116:0x01de], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x024e A[EDGE_INSN: B:541:0x024e->B:140:0x024e BREAK  A[LOOP:7: B:125:0x0211->B:139:0x024b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x027f A[EDGE_INSN: B:546:0x027f->B:152:0x027f BREAK  A[LOOP:8: B:145:0x0264->B:150:0x027b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x02f6 A[EDGE_INSN: B:561:0x02f6->B:179:0x02f6 BREAK  A[LOOP:12: B:172:0x02db->B:177:0x02f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x0772 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x076d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x018f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0199  */
    /* JADX WARN: Code duplicated, block: B:94:0x019c  */
    /* JADX WARN: Code duplicated, block: B:96:0x019f  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v43, types: [p.b221] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r4v34, types: [p.b221] */
    /* JADX WARN: Type inference failed for: r6v65, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v66, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v71, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: b */
    public static Next m46495b(hiy0 hiy0Var, eoj eojVar) {
        int i;
        Object next;
        boolean z;
        Integer num;
        Object next2;
        ArrayList arrayList;
        Iterator it;
        int i2;
        int i3;
        Integer numValueOf;
        Integer num2;
        Object next3;
        String str;
        Object next4;
        Integer numValueOf2;
        String string;
        jyn0 jyn0Var;
        Object next5;
        Iterator it2;
        int i4;
        Iterator it3;
        int i5;
        ArrayList arrayList2;
        List list;
        xyn0 xyn0VarM28519s;
        Iterator it4;
        int i6;
        ?? SingletonList;
        ?? arrayList3;
        Iterator it5;
        int i7;
        Integer numValueOf3;
        boolean z2;
        Iterator it6;
        Object next6;
        xyn0 xyn0Var;
        List listM43700N0;
        Iterator it7;
        jyn0 jyn0Var2;
        String uri;
        myn0 myn0Var;
        jyn0 jyn0Var3;
        String uri2;
        myn0 myn0Var2;
        jyn0 jyn0Var4;
        String str2;
        List<xyn0> list2 = hiy0Var.f91909i;
        List<myn0> list3 = hiy0Var.f91903c;
        String str3 = hiy0Var.f91901a;
        if (eojVar instanceof unj) {
            return hiy0Var.equals(hiy0.f91896M0) ? Next.m15606h(((unj) eojVar).f232183a) : Next.m15608j();
        }
        if (!(eojVar instanceof znj)) {
            if (eojVar instanceof wnj) {
                wnj wnjVar = (wnj) eojVar;
                boolean z3 = wnjVar.f253194e;
                String str4 = wnjVar.f253192c;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it8 = rkk.m75768t(list3, b9m.m28519s(hiy0Var)).iterator();
                int i8 = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i8 = -1;
                        break;
                    }
                    myn0 myn0Var3 = (myn0) it8.next();
                    jyn0 jyn0Var5 = myn0Var3 instanceof jyn0 ? (jyn0) myn0Var3 : null;
                    if (wj50.m88271j(jyn0Var5 != null ? jyn0Var5.f117441c.getUri() : null, str4)) {
                        break;
                    }
                    i8++;
                }
                Integer numValueOf4 = Integer.valueOf(i8);
                if (i8 == -1) {
                    numValueOf4 = null;
                }
                Iterator it9 = list3.iterator();
                do {
                    if (!it9.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it9.next();
                    myn0 myn0Var4 = (myn0) next4;
                    jyn0Var = myn0Var4 instanceof jyn0 ? (jyn0) myn0Var4 : null;
                } while (!wj50.m88271j(jyn0Var != null ? jyn0Var.f117441c.getUri() : null, str4));
                myn0 myn0Var5 = (myn0) next4;
                if (myn0Var5 == null) {
                    return Next.m15608j();
                }
                jyn0 jyn0Var6 = (jyn0) myn0Var5;
                int iIndexOf = list3.indexOf(myn0Var5);
                List<??> list4 = wnjVar.f253190a;
                List listM43714b1 = g6f.m43714b1(list3, iIndexOf + (z3 ? 1 : 0));
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(list4, 10));
                for (?? r12 : list4) {
                    arrayList4.add(new jyn0(jyn0Var6.f117439a, jyn0Var6.f117440b, r12, r12 instanceof ikz0 ? ((ikz0) r12).mo28935f() : false, h6f.m46716M(wnjVar.f253193d), 80));
                }
                ArrayList<Parcelable> arrayListM43700N0 = g6f.m43700N0(g6f.m43715c1((list3.size() - iIndexOf) - (z3 ? 1 : 0), list3), g6f.m43700N0(arrayList4, listM43714b1));
                if (wnjVar.f253195f) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : arrayListM43700N0) {
                        myn0 myn0Var6 = (myn0) obj;
                        jyn0 jyn0Var7 = myn0Var6 instanceof jyn0 ? (jyn0) myn0Var6 : null;
                        if (!wj50.m88271j(jyn0Var7 != null ? jyn0Var7.f117441c.getUri() : null, str4)) {
                            arrayList5.add(obj);
                        }
                    }
                    arrayListM43700N0 = arrayList5;
                }
                ArrayList<Parcelable> arrayList6 = new ArrayList(i6f.m49804T(arrayListM43700N0, 10));
                for (Parcelable parcelableM54800c : arrayListM43700N0) {
                    jyn0 jyn0Var8 = parcelableM54800c instanceof jyn0 ? (jyn0) parcelableM54800c : null;
                    if (wj50.m88271j(jyn0Var8 != null ? jyn0Var8.f117441c.getUri() : null, str4)) {
                        parcelableM54800c = jyn0.m54800c((jyn0) parcelableM54800c, false, null, false, 63);
                    }
                    arrayList6.add(parcelableM54800c);
                }
                Iterator it10 = rkk.m75768t(arrayList6, b9m.m28519s(hiy0Var)).iterator();
                int i9 = 0;
                while (true) {
                    if (!it10.hasNext()) {
                        i9 = -1;
                        break;
                    }
                    myn0 myn0Var7 = (myn0) it10.next();
                    jyn0 jyn0Var9 = myn0Var7 instanceof jyn0 ? (jyn0) myn0Var7 : null;
                    if (wj50.m88271j(jyn0Var9 != null ? jyn0Var9.f117441c.getUri() : null, str4)) {
                        break;
                    }
                    i9++;
                }
                Integer numValueOf5 = Integer.valueOf(i9);
                if (i9 == -1) {
                    numValueOf5 = null;
                }
                if (numValueOf5 != null) {
                    int iIntValue = numValueOf5.intValue();
                    if (!z3) {
                        iIntValue -= list4.size();
                    }
                    numValueOf2 = Integer.valueOf(iIntValue);
                } else {
                    numValueOf2 = null;
                }
                Integer numValueOf6 = ((wnjVar.f253191b || !arrayList4.isEmpty()) && numValueOf4 != null) ? Integer.valueOf(numValueOf2 != null ? numValueOf2.intValue() : numValueOf4.intValue()) : null;
                ArrayList arrayList7 = new ArrayList(i6f.m49804T(arrayList6, 10));
                for (Parcelable parcelableM54800c2 : arrayList6) {
                    if (parcelableM54800c2 instanceof jyn0) {
                        jyn0 jyn0Var10 = (jyn0) parcelableM54800c2;
                        b221 b221Var = jyn0Var10.f117441c;
                        if (wj50.m88271j(b221Var.getUri(), str4) && (b221Var instanceof ikz0)) {
                            parcelableM54800c2 = jyn0.m54800c(jyn0Var10, false, null, false, ContentType.SHORT_FORM_ON_DEMAND);
                        }
                    }
                    arrayList7.add(parcelableM54800c2);
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj2 : arrayList7) {
                    myn0 myn0Var8 = (myn0) obj2;
                    jyn0 jyn0Var11 = myn0Var8 instanceof jyn0 ? (jyn0) myn0Var8 : null;
                    if (jyn0Var11 == null || (string = jyn0Var11.f117441c.getUri()) == null) {
                        string = UUID.randomUUID().toString();
                    }
                    if (hashSet.add(string)) {
                        arrayList8.add(obj2);
                    }
                }
                return Next.m15607i(hiy0.m47645c(hiy0Var, arrayList8, null, null, numValueOf6, false, 14331), linkedHashSet);
            }
            if (eojVar instanceof xnj) {
                SearchConfiguration searchConfiguration = hiy0Var.f91905e;
                return searchConfiguration == null ? Next.m15608j() : Next.m15605a(Collections.singleton(new knj(str3, searchConfiguration)));
            }
            if (!(eojVar instanceof vnj)) {
                if (eojVar instanceof tnj) {
                    for (myn0 myn0Var9 : list3) {
                        if (!(myn0Var9 instanceof kyn0) && !(myn0Var9 instanceof lyn0)) {
                            if (hiy0Var.f91897L0) {
                                return Next.m15605a(bk5.m29624m1(new onj[]{new gnj(str3), new nnj("User pressed back button")}));
                            }
                            jyn0 jyn0Var12 = myn0Var9 instanceof jyn0 ? (jyn0) myn0Var9 : null;
                            b221 b221Var2 = jyn0Var12 != null ? jyn0Var12.f117441c : null;
                            pkw0 pkw0Var = b221Var2 instanceof pkw0 ? (pkw0) b221Var2 : null;
                            return ((pkw0Var != null ? pkw0Var.mo28938y1() : 0) == 2 || (b221Var2 instanceof it8)) ? Next.m15605a(bk5.m29624m1(new onj[]{new gnj(str3), new mnj(str3, hiy0Var.f91900Z)})) : Next.m15608j();
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if (!(eojVar instanceof ynj)) {
                    if (eojVar instanceof boj) {
                        return Next.m15606h(hiy0.m47645c(hiy0Var, null, null, null, null, false, 14335));
                    }
                    if (eojVar instanceof aoj) {
                        return Next.m15605a(bk5.m29624m1(new onj[]{new inj(str3), new bnj(1, b9m.m28524y(hiy0Var))}));
                    }
                    if (eojVar instanceof coj) {
                        return Next.m15605a(bk5.m29624m1(new onj[]{new jnj(str3), new bnj(2, b9m.m28524y(hiy0Var))}));
                    }
                    if (eojVar instanceof doj) {
                        return Next.m15605a(Collections.singleton(new nnj("Skipped")));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                xyn0 xyn0Var2 = ((ynj) eojVar).f274463a;
                Iterator it11 = list2.iterator();
                int i10 = 0;
                while (true) {
                    if (!it11.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (wj50.m88271j(((xyn0) it11.next()).f267388b, xyn0Var2.f267388b)) {
                        i = i10;
                        break;
                    }
                    i10++;
                }
                ArrayList arrayList9 = new ArrayList(i6f.m49804T(list2, 10));
                for (xyn0 xyn0Var3 : list2) {
                    arrayList9.add(xyn0.m92422c(xyn0Var3, wj50.m88271j(xyn0Var2.f267388b, xyn0Var3.f267388b)));
                }
                return Next.m15607i(hiy0.m47645c(hiy0Var, null, arrayList9, null, 0, false, 14079), Collections.singleton(new lnj(str3, i, ((xyn0) list2.get(i)).f267388b)));
            }
            jyn0 jyn0Var13 = ((vnj) eojVar).f243149a;
            String str5 = jyn0Var13.f117439a;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            ArrayList arrayList10 = new ArrayList(list3);
            Iterator it12 = arrayList10.iterator();
            while (true) {
                if (!it12.hasNext()) {
                    next = null;
                    break;
                }
                next = it12.next();
                myn0 myn0Var10 = (myn0) next;
                if ((myn0Var10 instanceof jyn0) && wj50.m88271j(((jyn0) myn0Var10).f117441c.getUri(), jyn0Var13.f117441c.getUri())) {
                    break;
                }
            }
            myn0 myn0Var11 = (myn0) next;
            jyn0 jyn0VarM54800c = myn0Var11 instanceof jyn0 ? (jyn0) myn0Var11 : null;
            if (jyn0VarM54800c == null) {
                List listM43714b2 = g6f.m43714b1(list2, 1);
                ArrayList arrayList11 = new ArrayList(i6f.m49804T(listM43714b2, 10));
                Iterator it13 = listM43714b2.iterator();
                while (it13.hasNext()) {
                    arrayList11.add(((xyn0) it13.next()).f267388b);
                }
                z = false;
                jyn0VarM54800c = jyn0.m54800c(jyn0Var13, false, arrayList11, false, 95);
            } else {
                z = false;
            }
            jyn0 jyn0VarM54800c2 = jyn0.m54800c(jyn0VarM54800c, z, null, z, 119);
            Iterator it14 = arrayList10.iterator();
            int i11 = 0;
            while (true) {
                if (!it14.hasNext()) {
                    i11 = -1;
                    break;
                }
                myn0 myn0Var12 = (myn0) it14.next();
                if ((myn0Var12 instanceof jyn0) && wj50.m88271j(((jyn0) myn0Var12).f117439a, str5)) {
                    break;
                }
                i11++;
            }
            Integer numValueOf7 = Integer.valueOf(i11);
            if (i11 == -1) {
                numValueOf7 = null;
            }
            if (myn0Var11 == null) {
                if (numValueOf7 == null) {
                    Iterator it15 = hiy0Var.f91904d.iterator();
                    do {
                        if (!it15.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it15.next();
                    } while (!wj50.m88271j(((giy0) next3).f80274a, str5));
                    giy0 giy0Var = (giy0) next3;
                    arrayList10 = g6f.m43700N0(arrayList10, bk5.m29582E0(new myn0[]{(giy0Var == null || (str = giy0Var.f80275b) == null) ? null : new kyn0(str), jyn0VarM54800c2, lyn0.f138078a}));
                } else {
                    arrayList10.add(numValueOf7.intValue(), jyn0VarM54800c2);
                }
            }
            ArrayList arrayList12 = arrayList10;
            if (myn0Var11 != null) {
                num = null;
                Iterator it16 = ((jyn0) myn0Var11).f117444f.iterator();
                loop27: while (true) {
                    if (!it16.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it16.next();
                    String str6 = (String) next2;
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it17 = list2.iterator();
                        while (it17.hasNext()) {
                            if (wj50.m88271j(((xyn0) it17.next()).f267388b, str6)) {
                                break loop27;
                            }
                        }
                    }
                }
                String str7 = (String) next2;
                if (str7 != null) {
                    arrayList = new ArrayList(i6f.m49804T(list2, 10));
                    for (xyn0 xyn0Var4 : list2) {
                        arrayList.add(xyn0.m92422c(xyn0Var4, wj50.m88271j(xyn0Var4.f267388b, str7)));
                    }
                }
                it = list2.iterator();
                i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (((xyn0) it.next()).f267389c) {
                        i3 = i2;
                        break;
                    }
                    i2++;
                }
                numValueOf = Integer.valueOf(i3);
                if (i3 != -1) {
                    num2 = numValueOf;
                } else {
                    num2 = num;
                }
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    linkedHashSet2.add(new lnj(str3, iIntValue2, ((xyn0) list2.get(iIntValue2)).f267388b));
                }
                linkedHashSet2.add(new enj(jyn0VarM54800c2));
                return Next.m15607i(hiy0.m47645c(hiy0Var, arrayList12, list2, null, null, false, 16123), linkedHashSet2);
            }
            arrayList = new ArrayList(i6f.m49804T(list2, 10));
            int i12 = 0;
            for (Object obj3 : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                arrayList.add(xyn0.m92422c((xyn0) obj3, i12 == 0));
                i12 = i13;
            }
            num = null;
            list2 = arrayList;
            it = list2.iterator();
            i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((xyn0) it.next()).f267389c) {
                    i3 = i2;
                    break;
                }
                i2++;
            }
            numValueOf = Integer.valueOf(i3);
            if (i3 != -1) {
                num2 = numValueOf;
            } else {
                num2 = num;
            }
            if (num2 != null) {
                int iIntValue3 = num2.intValue();
                linkedHashSet2.add(new lnj(str3, iIntValue3, ((xyn0) list2.get(iIntValue3)).f267388b));
            }
            linkedHashSet2.add(new enj(jyn0VarM54800c2));
            return Next.m15607i(hiy0.m47645c(hiy0Var, arrayList12, list2, null, null, false, 16123), linkedHashSet2);
        }
        znj znjVar = (znj) eojVar;
        jyn0 jyn0Var14 = znjVar.f284512a;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        ArrayList<Parcelable> arrayList13 = new ArrayList(i6f.m49804T(list3, 10));
        for (Parcelable parcelableM54800c3 : list3) {
            if (parcelableM54800c3 instanceof jyn0) {
                jyn0 jyn0Var15 = (jyn0) parcelableM54800c3;
                if (wj50.m88271j(jyn0Var15.f117441c.getUri(), jyn0Var14.f117441c.getUri()) && (jyn0Var14.f117441c instanceof ikz0)) {
                    parcelableM54800c3 = jyn0.m54800c(jyn0Var15, !jyn0Var14.f117442d, null, false, 119);
                }
            }
            arrayList13.add(parcelableM54800c3);
        }
        boolean z4 = true;
        boolean z5 = znjVar.f284513b;
        ?? r4 = jyn0Var14.f117441c;
        boolean z6 = jyn0Var14.f117442d;
        b221 b221Var3 = jyn0Var14.f117441c;
        if (r4 instanceof bej) {
            bej bejVar = (bej) r4;
            if (bejVar.f26375t) {
                linkedHashSet3.add(new cnj(bejVar, !z6));
            }
        }
        Iterator it18 = rkk.m75768t(list3, b9m.m28519s(hiy0Var)).iterator();
        int i14 = 0;
        while (true) {
            if (!it18.hasNext()) {
                i14 = -1;
                break;
            }
            myn0 myn0Var13 = (myn0) it18.next();
            jyn0 jyn0Var16 = myn0Var13 instanceof jyn0 ? (jyn0) myn0Var13 : null;
            if (wj50.m88271j(jyn0Var16 != null ? jyn0Var16.f117441c.getUri() : null, b221Var3.getUri())) {
                break;
            }
            i14++;
        }
        Integer numValueOf8 = Integer.valueOf(i14);
        if (i14 == -1) {
            numValueOf8 = null;
        }
        Iterator it19 = arrayList13.iterator();
        while (true) {
            if (!it19.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it19.next();
            myn0 myn0Var14 = (myn0) next5;
            if ((myn0Var14 instanceof jyn0) && wj50.m88271j(((jyn0) myn0Var14).f117441c.getUri(), b221Var3.getUri())) {
                break;
            }
        }
        jyn0 jyn0Var17 = next5 instanceof jyn0 ? (jyn0) next5 : null;
        if (jyn0Var17 == null) {
            return Next.m15608j();
        }
        if (!(r4 instanceof gkx) || z6 || jyn0Var14.f117443e) {
            Integer num3 = z5 ? null : numValueOf8;
            it2 = list3.iterator();
            i4 = 0;
            while (true) {
                if (it2.hasNext()) {
                    i4 = -1;
                    break;
                }
                myn0Var2 = (myn0) it2.next();
                if (myn0Var2 instanceof jyn0) {
                    jyn0Var4 = (jyn0) myn0Var2;
                } else {
                    jyn0Var4 = null;
                }
                if (jyn0Var4 != null) {
                    str2 = jyn0Var4.f117439a;
                } else {
                    str2 = null;
                }
                if (wj50.m88271j(str2, jyn0Var14.f117439a)) {
                    break;
                }
                i4++;
            }
            it3 = list3.iterator();
            i5 = 0;
            while (true) {
                if (it3.hasNext()) {
                    i5 = -1;
                    break;
                }
                myn0Var = (myn0) it3.next();
                if (myn0Var instanceof jyn0) {
                    jyn0Var3 = (jyn0) myn0Var;
                } else {
                    jyn0Var3 = null;
                }
                if (jyn0Var3 != null) {
                    uri2 = jyn0Var3.f117441c.getUri();
                } else {
                    uri2 = null;
                }
                if (wj50.m88271j(uri2, b221Var3.getUri())) {
                    break;
                }
                i5++;
            }
            linkedHashSet3.add(new hnj(str3, jyn0Var14, i5 - i4));
            arrayList2 = new ArrayList(i6f.m49804T(arrayList13, 10));
            for (Parcelable parcelableM54800c4 : arrayList13) {
                if (linkedHashSet3.isEmpty()) {
                    it7 = linkedHashSet3.iterator();
                    while (it7.hasNext()) {
                        if (((onj) it7.next()) instanceof fnj) {
                            if (parcelableM54800c4 instanceof jyn0) {
                                jyn0Var2 = (jyn0) parcelableM54800c4;
                            } else {
                                jyn0Var2 = null;
                            }
                            if (jyn0Var2 != null) {
                                uri = jyn0Var2.f117441c.getUri();
                            } else {
                                uri = null;
                            }
                            if (wj50.m88271j(uri, b221Var3.getUri())) {
                                break;
                            }
                            parcelableM54800c4 = jyn0.m54800c((jyn0) parcelableM54800c4, false, null, z4, 63);
                            break;
                        }
                        z4 = true;
                    }
                }
                arrayList2.add(parcelableM54800c4);
                z4 = true;
            }
            list = hiy0Var.f91910t;
            xyn0VarM28519s = b9m.m28519s(hiy0Var);
            listM43700N0 = list;
            if (xyn0VarM28519s == null) {
                arrayList3 = listM43700N0;
            } else {
                it4 = list2.iterator();
                i6 = 0;
                while (true) {
                    if (it4.hasNext()) {
                        i6 = -1;
                        break;
                    }
                    if (wj50.m88271j(((xyn0) it4.next()).f267388b, xyn0VarM28519s.f267388b)) {
                        break;
                    }
                    i6++;
                }
                if (i6 == 0) {
                    List<String> list5 = jyn0Var14.f117444f;
                    SingletonList = new ArrayList();
                    for (String str8 : list5) {
                        it6 = list2.iterator();
                        do {
                            if (it6.hasNext()) {
                                next6 = null;
                                break;
                            }
                            next6 = it6.next();
                        } while (!wj50.m88271j(((xyn0) next6).f267388b, str8));
                        xyn0Var = (xyn0) next6;
                        if (xyn0Var != null) {
                            SingletonList.add(xyn0Var);
                        }
                    }
                } else {
                    SingletonList = Collections.singletonList(xyn0VarM28519s);
                }
                if (z6) {
                    arrayList3 = new ArrayList(list);
                    for (xyn0 xyn0Var5 : SingletonList) {
                        it5 = arrayList3.iterator();
                        i7 = 0;
                        while (true) {
                            if (it5.hasNext()) {
                                i7 = -1;
                                break;
                            }
                            if (wj50.m88271j(((xyn0) it5.next()).f267388b, xyn0Var5.f267388b)) {
                                break;
                            }
                            i7++;
                        }
                        numValueOf3 = Integer.valueOf(i7);
                        if (i7 != -1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            numValueOf3 = null;
                        }
                        if (numValueOf3 != null) {
                            arrayList3.remove(numValueOf3.intValue());
                        }
                    }
                } else {
                    listM43700N0 = g6f.m43700N0(SingletonList, list);
                    arrayList3 = listM43700N0;
                }
            }
            hiy0 hiy0VarM47645c = hiy0.m47645c(hiy0Var, arrayList2, null, arrayList3, num3, false, 13819);
            linkedHashSet3.add(new anj(b9m.m28521v(hiy0VarM47645c), b9m.m28522w(hiy0VarM47645c)));
            return Next.m15607i(hiy0VarM47645c, linkedHashSet3);
        }
        if (!jyn0Var17.f117445g) {
            boolean z7 = !z5;
            xyn0 xyn0VarM28519s2 = b9m.m28519s(hiy0Var);
            String str9 = xyn0VarM28519s2 != null ? xyn0VarM28519s2.f267388b : null;
            ArrayList arrayList14 = new ArrayList();
            for (myn0 myn0Var15 : list3) {
                String uri3 = myn0Var15 instanceof jyn0 ? ((jyn0) myn0Var15).f117441c.getUri() : null;
                if (uri3 != null) {
                    arrayList14.add(uri3);
                }
            }
            gkx gkxVar = (gkx) r4;
            linkedHashSet3.add(new fnj(r4, z7, str9, arrayList14, gkxVar.mo28936g0(), gkxVar.mo28933C0()));
        }
        it2 = list3.iterator();
        i4 = 0;
        while (true) {
            if (it2.hasNext()) {
                i4 = -1;
                break;
            }
            myn0Var2 = (myn0) it2.next();
            if (myn0Var2 instanceof jyn0) {
                jyn0Var4 = (jyn0) myn0Var2;
            } else {
                jyn0Var4 = null;
            }
            if (jyn0Var4 != null) {
                str2 = jyn0Var4.f117439a;
            } else {
                str2 = null;
            }
            if (wj50.m88271j(str2, jyn0Var14.f117439a)) {
                break;
                break;
            }
            i4++;
        }
        it3 = list3.iterator();
        i5 = 0;
        while (true) {
            if (it3.hasNext()) {
                i5 = -1;
                break;
            }
            myn0Var = (myn0) it3.next();
            if (myn0Var instanceof jyn0) {
                jyn0Var3 = (jyn0) myn0Var;
            } else {
                jyn0Var3 = null;
            }
            if (jyn0Var3 != null) {
                uri2 = jyn0Var3.f117441c.getUri();
            } else {
                uri2 = null;
            }
            if (wj50.m88271j(uri2, b221Var3.getUri())) {
                break;
                break;
            }
            i5++;
        }
        linkedHashSet3.add(new hnj(str3, jyn0Var14, i5 - i4));
        arrayList2 = new ArrayList(i6f.m49804T(arrayList13, 10));
        while (r2.hasNext()) {
            if (linkedHashSet3.isEmpty()) {
                it7 = linkedHashSet3.iterator();
                while (it7.hasNext()) {
                    if (((onj) it7.next()) instanceof fnj) {
                        if (parcelableM54800c4 instanceof jyn0) {
                            jyn0Var2 = (jyn0) parcelableM54800c4;
                        } else {
                            jyn0Var2 = null;
                        }
                        if (jyn0Var2 != null) {
                            uri = jyn0Var2.f117441c.getUri();
                        } else {
                            uri = null;
                        }
                        if (wj50.m88271j(uri, b221Var3.getUri())) {
                            break;
                            break;
                        }
                        parcelableM54800c4 = jyn0.m54800c((jyn0) parcelableM54800c4, false, null, z4, 63);
                        break;
                        break;
                    }
                    z4 = true;
                }
            }
            arrayList2.add(parcelableM54800c4);
            z4 = true;
        }
        list = hiy0Var.f91910t;
        xyn0VarM28519s = b9m.m28519s(hiy0Var);
        listM43700N0 = list;
        if (xyn0VarM28519s == null) {
            arrayList3 = listM43700N0;
        } else {
            it4 = list2.iterator();
            i6 = 0;
            while (true) {
                if (it4.hasNext()) {
                    i6 = -1;
                    break;
                }
                if (wj50.m88271j(((xyn0) it4.next()).f267388b, xyn0VarM28519s.f267388b)) {
                    break;
                    break;
                }
                i6++;
            }
            if (i6 == 0) {
                List<String> list6 = jyn0Var14.f117444f;
                SingletonList = new ArrayList();
                while (r3.hasNext()) {
                    it6 = list2.iterator();
                    do {
                        if (it6.hasNext()) {
                            next6 = null;
                            break;
                        }
                        next6 = it6.next();
                    } while (!wj50.m88271j(((xyn0) next6).f267388b, str8));
                    xyn0Var = (xyn0) next6;
                    if (xyn0Var != null) {
                        SingletonList.add(xyn0Var);
                    }
                }
            } else {
                SingletonList = Collections.singletonList(xyn0VarM28519s);
            }
            if (z6) {
                arrayList3 = new ArrayList(list);
                while (r2.hasNext()) {
                    it5 = arrayList3.iterator();
                    i7 = 0;
                    while (true) {
                        if (it5.hasNext()) {
                            i7 = -1;
                            break;
                        }
                        if (wj50.m88271j(((xyn0) it5.next()).f267388b, xyn0Var5.f267388b)) {
                            break;
                            break;
                        }
                        i7++;
                    }
                    numValueOf3 = Integer.valueOf(i7);
                    if (i7 != -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        numValueOf3 = null;
                    }
                    if (numValueOf3 != null) {
                        arrayList3.remove(numValueOf3.intValue());
                    }
                }
            } else {
                listM43700N0 = g6f.m43700N0(SingletonList, list);
                arrayList3 = listM43700N0;
            }
        }
        hiy0 hiy0VarM47645c2 = hiy0.m47645c(hiy0Var, arrayList2, null, arrayList3, num3, false, 13819);
        linkedHashSet3.add(new anj(b9m.m28521v(hiy0VarM47645c2), b9m.m28522w(hiy0VarM47645c2)));
        return Next.m15607i(hiy0VarM47645c2, linkedHashSet3);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f87008a) {
            case 8:
                return new k2y(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            default:
                return new pqm0((e07) obj, (Boolean) obj2);
        }
    }

    @Override // p204p.b671
    /* JADX INFO: renamed from: d */
    public void mo28282d(fyf fyfVar, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-2101003086);
        int i2 = (xq00Var.m91766g(this) ? 32 : 16) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fyfVar.invoke(xq00Var, 6);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cr3(this, fyfVar, i, 1);
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((wkc) obj);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f87008a) {
            case 7:
                return ((e301) obj).f55572b;
            case 12:
                return ((bza) obj) instanceof zya;
            case 19:
                lbm lbmVar = (lbm) obj;
                lbmVar.getClass();
                try {
                    return ((nu30) lbmVar.f131687a).m65672c2();
                } catch (RemoteException unused) {
                    return false;
                }
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objInvoke;
        eyl0 eyl0Var = (eyl0) obj;
        oqe oqeVar = new oqe((q2q0) obj2, (Boolean) obj3, (d5x0) obj4, 2);
        eyl0Var.getClass();
        if (eyl0Var instanceof dyl0) {
            objInvoke = oqeVar.invoke(eyl0Var);
        } else {
            if (!(eyl0Var instanceof byl0)) {
                throw new NoWhenBranchMatchedException();
            }
            objInvoke = (byl0) eyl0Var;
        }
        return (eyl0) objInvoke;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        String str;
        switch (this.f87008a) {
            case 1:
                return (ContextTrack) ((xul0) obj).mo49278b();
            case 2:
                if (!((e301) obj).f55572b) {
                    return Maybe.m23363f(g41.f76312a);
                }
                MaybeEmpty maybeEmpty = MaybeEmpty.f8264a;
                wj50.m88279p(maybeEmpty);
                return maybeEmpty;
            case 3:
                return lau.f131415a;
            case 4:
                return ((id3) obj).f100926j;
            case 5:
                xul0 xul0Var = (xul0) obj;
                boolean z = true;
                if (xul0Var.mo49279c() && ((api) xul0Var.mo49278b()).getType() != xfr.f261077Z) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 19:
            case 22:
            case 25:
            default:
                p2x0 p2x0Var = (p2x0) obj;
                if (p2x0Var instanceof k2x0) {
                    return lau.f131415a;
                }
                if (p2x0Var instanceof m2x0) {
                    return (List) ((m2x0) p2x0Var).f139474a;
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                return new sw7();
            case 11:
                return new g0l(((Boolean) obj).booleanValue());
            case 14:
                return (ihs0) obj;
            case 18:
                return Boolean.valueOf(dxf1.m37222K((Map) obj));
            case 20:
                return Boolean.valueOf(((pe01) obj).f176601r == 4);
            case 21:
                m8z m8zVar = (m8z) obj;
                String str2 = m8zVar.f141176c;
                if (str2 == null || str2.length() == 0) {
                    return new m8z(null);
                }
                return wl51.m88491o1(str2).toString().length() < 3 ? new m8z(null) : m8zVar;
            case 23:
                return Boolean.valueOf(((jc81) obj).f111018c);
            case 24:
                return ror.f201340a;
            case 26:
                o2x0 o2x0Var = (o2x0) obj;
                if (o2x0Var.f161171a.f149852O0) {
                    r780 r780Var = (r780) o2x0Var.f161172b;
                    if (r780Var == null || (str = r780Var.f196464b) == null) {
                        throw new IllegalStateException("Response body is null.");
                    }
                    return str;
                }
                throw new HttpException(o2x0Var);
            case 27:
                Throwable contextMenuContentLoadException = (Throwable) obj;
                if (contextMenuContentLoadException instanceof HttpError) {
                    contextMenuContentLoadException = new ContextMenuContentLoadException(contextMenuContentLoadException);
                }
                return Single.error(contextMenuContentLoadException);
            case 28:
                Logger.m3967c((Throwable) obj, "GetState failed, suppressing further player state emissions", new Object[0]);
                return Observable.never();
        }
    }
}
