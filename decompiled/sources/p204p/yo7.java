package p204p;

import com.spotify.kidsentitybanning.search.p087v1.ArtistEntity;
import com.spotify.kidsentitybanning.search.p087v1.SearchEntity;
import com.spotify.kidsentitybanning.search.p087v1.TrackEntity;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class yo7 {

    /* JADX INFO: renamed from: a */
    public final epx f274587a;

    public /* synthetic */ yo7(epx epxVar) {
        this.f274587a = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public Serializable m94272a(ae50 ae50Var, ibk ibkVar) {
        sox soxVar;
        oja1 oja1Var;
        ae50 ae50Var2;
        Iterator it;
        Object zry0Var;
        if (ibkVar instanceof sox) {
            soxVar = (sox) ibkVar;
            int i = soxVar.f212668e;
            if ((i & Integer.MIN_VALUE) != 0) {
                soxVar.f212668e = i - Integer.MIN_VALUE;
            } else {
                soxVar = new sox(this, ibkVar);
            }
        } else {
            soxVar = new sox(this, ibkVar);
        }
        Object objM94273b = soxVar.f212666c;
        int i2 = soxVar.f212668e;
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        if (i2 == 0) {
            bga.m29073P(objM94273b);
            if (!ae50Var.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator<E> it2 = ae50Var.iterator();
                while (it2.hasNext()) {
                    SearchEntity searchEntity = (SearchEntity) it2.next();
                    int iM12194o = searchEntity.m12194o();
                    int i6 = iM12194o == 0 ? -1 : rox.f201358a[edb.m38547C(iM12194o)];
                    if (i6 == 1) {
                        linkedHashSet.add(searchEntity.m12195p().getUri());
                        linkedHashSet2.add(searchEntity.m12195p().m12204n().getUri());
                    } else if (i6 == 2) {
                        linkedHashSet2.add(searchEntity.m12193n().getUri());
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        na6.m63957e("Expected entity type for search entity: " + searchEntity);
                    }
                }
                oja1 oja1Var2 = new oja1(linkedHashSet, linkedHashSet2);
                if (!linkedHashSet.isEmpty() || !linkedHashSet2.isEmpty()) {
                    soxVar.f212664a = ae50Var;
                    soxVar.f212665b = oja1Var2;
                    soxVar.f212668e = 1;
                    objM94273b = m94273b(linkedHashSet, linkedHashSet2, soxVar);
                    yuk yukVar = yuk.f276404a;
                    if (objM94273b == yukVar) {
                        return yukVar;
                    }
                    oja1Var = oja1Var2;
                    ae50Var2 = ae50Var;
                }
            }
            return lau.f131415a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oja1Var = soxVar.f212665b;
        ae50Var2 = soxVar.f212664a;
        bga.m29073P(objM94273b);
        gqx gqxVar = (gqx) objM94273b;
        LinkedHashSet linkedHashSet3 = oja1Var.f166025a;
        int iM31820L = c95.m31820L(i6f.m49804T(linkedHashSet3, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj : linkedHashSet3) {
            linkedHashMap.put(obj, (ks81) gqxVar.mo45449a(ks81.class, (String) obj).f72301b);
        }
        LinkedHashSet linkedHashSet4 = oja1Var.f166026b;
        int iM31820L2 = c95.m31820L(i6f.m49804T(linkedHashSet4, 10));
        if (iM31820L2 < 16) {
            iM31820L2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L2);
        for (Object obj2 : linkedHashSet4) {
            linkedHashMap2.put(obj2, (w46) gqxVar.mo45449a(w46.class, (String) obj2).f72301b);
        }
        LinkedHashSet linkedHashSet5 = oja1Var.f166025a;
        int iM31820L3 = c95.m31820L(i6f.m49804T(linkedHashSet5, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM31820L3 >= 16 ? iM31820L3 : 16);
        for (Object obj3 : linkedHashSet5) {
            linkedHashMap3.put(obj3, (bob1) gqxVar.mo45449a(bob1.class, (String) obj3).f72301b);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = ae50Var2.iterator();
        while (it3.hasNext()) {
            SearchEntity searchEntity2 = (SearchEntity) it3.next();
            int iM12194o2 = searchEntity2.m12194o();
            int i7 = iM12194o2 == 0 ? -1 : rox.f201358a[edb.m38547C(iM12194o2)];
            if (i7 == i5) {
                TrackEntity trackEntityM12195p = searchEntity2.m12195p();
                ks81 ks81Var = (ks81) linkedHashMap.get(trackEntityM12195p.getUri());
                String str = ks81Var != null ? ks81Var.f125870b : null;
                if (str == null || wl51.m88460J0(str)) {
                    it = it3;
                    zry0Var = null;
                } else {
                    String uri = trackEntityM12195p.m12204n().getUri();
                    bob1 bob1Var = (bob1) linkedHashMap3.get(trackEntityM12195p.getUri());
                    boolean z = (bob1Var == null || ((bob1Var.f29064a.isEmpty() ? 1 : 0) ^ i5) != i5) ? 0 : i5;
                    String string = UUID.randomUUID().toString();
                    String uri2 = trackEntityM12195p.getUri();
                    String str2 = ks81Var.f125871c.f256620a;
                    boolean isBanned = trackEntityM12195p.getIsBanned();
                    boolean z2 = ks81Var.f125874f;
                    ArrayList<ds81> arrayList2 = ks81Var.f125875g;
                    ArrayList arrayList3 = new ArrayList();
                    for (ds81 ds81Var : arrayList2) {
                        if (wl51.m88460J0(ds81Var.f52520b)) {
                            ds81Var = null;
                        }
                        iy5 iy5Var = ds81Var != null ? new iy5(ds81Var.f52519a, ds81Var.f52520b) : null;
                        if (iy5Var != null) {
                            arrayList3.add(iy5Var);
                        }
                        it3 = it3;
                    }
                    it = it3;
                    zry0Var = new zry0(string, uri2, str, str2, isBanned, z2, arrayList3, uri, trackEntityM12195p.m12204n().getIsBanned(), z);
                }
            } else if (i7 == i4) {
                ArtistEntity artistEntityM12193n = searchEntity2.m12193n();
                w46 w46Var = (w46) linkedHashMap2.get(artistEntityM12193n.getUri());
                String str3 = w46Var != null ? w46Var.f247714b : null;
                zry0Var = (str3 == null || wl51.m88460J0(str3)) ? null : new yry0(UUID.randomUUID().toString(), artistEntityM12193n.getUri(), str3, w46Var.f247715c.f256620a, artistEntityM12193n.getIsBanned());
                it = it3;
            } else {
                if (i7 != i3) {
                    throw new NoWhenBranchMatchedException();
                }
                na6.m63957e("Expected entity type for search entity: " + searchEntity2);
                it = it3;
                zry0Var = null;
            }
            if (zry0Var != null) {
                arrayList.add(zry0Var);
            }
            it3 = it;
            i3 = 3;
            i4 = 2;
            i5 = 1;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m94273b(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ibk ibkVar) {
        tox toxVar;
        if (ibkVar instanceof tox) {
            toxVar = (tox) ibkVar;
            int i = toxVar.f222338c;
            if ((i & Integer.MIN_VALUE) != 0) {
                toxVar.f222338c = i - Integer.MIN_VALUE;
            } else {
                toxVar = new tox(this, ibkVar);
            }
        } else {
            toxVar = new tox(this, ibkVar);
        }
        Object obj = toxVar.f222336a;
        int i2 = toxVar.f222338c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Observable observableTimeout = ((jpx) this.f274587a).m53978b(new C1668ai("gen_alpha_blocking_search", false, (gh00) new uox(0, linkedHashSet, linkedHashSet2))).filter(t0b1.f215829b1).timeout(10L, TimeUnit.SECONDS, Observable.error(new TimeoutException()));
        toxVar.f222338c = 1;
        Object objM96571q = zn91.m96571q(observableTimeout, 1, null, toxVar);
        yuk yukVar = yuk.f276404a;
        return objM96571q == yukVar ? yukVar : objM96571q;
    }
}
