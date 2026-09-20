package p204p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ryq0 {

    /* JADX INFO: renamed from: a */
    public final t4f f203949a;

    /* JADX INFO: renamed from: b */
    public final ud80 f203950b;

    /* JADX INFO: renamed from: c */
    public final z5f f203951c;

    public ryq0(t4f t4fVar, ud80 ud80Var, z5f z5fVar) {
        this.f203949a = t4fVar;
        this.f203950b = ud80Var;
        this.f203951c = z5fVar;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m76737a(ArrayList arrayList) {
        r4f r4fVarM6889s = CollectionPlatformItemsRequest.m6889s();
        r4fVarM6889s.m74746m(arrayList);
        r4fVarM6889s.m74750t(r5f.PRERELEASE);
        return this.f203949a.m80062c((CollectionPlatformItemsRequest) r4fVarM6889s.build()).map(new mbq(arrayList));
    }

    /* JADX INFO: renamed from: b */
    public final Observable m76738b(String str) {
        if (!l0y0.m57835q(str)) {
            if (!l0y0.m57836r(str)) {
                return Observable.just(Boolean.FALSE);
            }
            return this.f203951c.m95459c("", geg1.m44518y(str), false).map(new aqs(str, 14));
        }
        r4f r4fVarM6889s = CollectionPlatformItemsRequest.m6889s();
        r4fVarM6889s.m74748r(str);
        r4fVarM6889s.m74750t(r5f.PRERELEASE);
        return this.f203949a.m80062c((CollectionPlatformItemsRequest) r4fVarM6889s.build()).map(oyq0.f171861b);
    }

    /* JADX INFO: renamed from: c */
    public final Observable m76739c(Set set) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (l0y0.m57835q((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (l0y0.m57836r((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : set2) {
            if (!l0y0.m57834p((String) obj3)) {
                arrayList3.add(obj3);
            }
        }
        int iM31820L = c95.m31820L(i6f.m49804T(arrayList3, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj4 : arrayList3) {
            linkedHashMap.put(obj4, Boolean.FALSE);
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return Observable.just(linkedHashMap);
        }
        if (arrayList2.isEmpty()) {
            return m76737a(arrayList).map(new pyq0(linkedHashMap));
        }
        boolean zIsEmpty = arrayList.isEmpty();
        z5f z5fVar = this.f203951c;
        return zIsEmpty ? z5fVar.m95459c("", arrayList2, false).map(new fcf(arrayList2)).map(new pab0(linkedHashMap)) : Observable.combineLatest(m76737a(arrayList), z5fVar.m95459c("", arrayList2, false).map(new fcf(arrayList2)), new tpn0(linkedHashMap, 11));
    }

    /* JADX INFO: renamed from: d */
    public final Completable m76740d(String str, boolean z) {
        Single singleM80061b;
        if (!l0y0.m57835q(str)) {
            if (l0y0.m57836r(str)) {
                return g0b1.m43282x(dau.f47107a, new hj1(z, this, str, (fbk) null, 26));
            }
            m6b.m60995j("Pre-save requested for a non-pre-savable uri type: ", g6f.m43753y0(g6f.m43714b1(wl51.m88476Z0(str, new char[]{':'}, 6), 2), ":", null, null, null, 62));
            CompletableEmpty completableEmpty = CompletableEmpty.f7437a;
            wj50.m88279p(completableEmpty);
            return completableEmpty;
        }
        r4f r4fVarM6889s = CollectionPlatformItemsRequest.m6889s();
        r4fVarM6889s.m74748r(str);
        r4fVarM6889s.m74750t(r5f.PRERELEASE);
        CollectionPlatformItemsRequest collectionPlatformItemsRequest = (CollectionPlatformItemsRequest) r4fVarM6889s.build();
        t4f t4fVar = this.f203949a;
        if (z) {
            wj50.m88279p(collectionPlatformItemsRequest);
            singleM80061b = t4fVar.m80060a(collectionPlatformItemsRequest);
        } else {
            wj50.m88279p(collectionPlatformItemsRequest);
            singleM80061b = t4fVar.m80061b(collectionPlatformItemsRequest);
        }
        return singleM80061b.flatMapCompletable(qyq0.f194006b);
    }
}
