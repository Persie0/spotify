package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z5f {

    /* JADX INFO: renamed from: a */
    public final x5f f279552a;

    public z5f(x5f x5fVar) {
        this.f279552a = x5fVar;
    }

    /* JADX INFO: renamed from: b */
    public static Single m95456b(z5f z5fVar, String str, String[] strArr) {
        z5fVar.getClass();
        return z5fVar.m95458a(str, bk5.m29620k1(strArr), false);
    }

    /* JADX INFO: renamed from: d */
    public static Observable m95457d(z5f z5fVar, String str, String[] strArr) {
        z5fVar.getClass();
        return z5fVar.m95459c(str, bk5.m29620k1(strArr), false);
    }

    /* JADX INFO: renamed from: a */
    public final Single m95458a(String str, List list, boolean z) {
        x5f x5fVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            x5fVar = this.f279552a;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            Set set = dd41.f47702f;
            gn80[] gn80VarArr = (gn80[]) x5fVar.f258405f.toArray(new gn80[0]);
            if (r46.m74709B((String) next, (gn80[]) Arrays.copyOf(gn80VarArr, gn80VarArr.length))) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        v5f v5fVar = new v5f(str, arrayList, z);
        v5f v5fVar2 = new v5f(str, arrayList2, z);
        if (arrayList.isEmpty()) {
            return x5fVar.m89991c(v5fVar2);
        }
        if (arrayList2.isEmpty()) {
            return x5fVar.m89992d(v5fVar);
        }
        Single singleZip = Single.zip(x5fVar.m89992d(v5fVar), x5fVar.m89991c(v5fVar2), gk40.f80711X);
        wj50.m88279p(singleZip);
        return singleZip;
    }

    /* JADX INFO: renamed from: c */
    public final Observable m95459c(String str, List list, boolean z) {
        x5f x5fVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            x5fVar = this.f279552a;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            Set set = dd41.f47702f;
            gn80[] gn80VarArr = (gn80[]) x5fVar.f258405f.toArray(new gn80[0]);
            if (r46.m74709B((String) next, (gn80[]) Arrays.copyOf(gn80VarArr, gn80VarArr.length))) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        v5f v5fVar = new v5f(str, arrayList, z);
        v5f v5fVar2 = new v5f(str, arrayList2, z);
        if (arrayList.isEmpty()) {
            return x5fVar.m89995j(v5fVar2);
        }
        if (arrayList2.isEmpty()) {
            return x5fVar.m89993e(v5fVar);
        }
        Observable observableCombineLatest = Observable.combineLatest(x5fVar.m89993e(v5fVar), x5fVar.m89995j(v5fVar2), u4g1.f226687O0);
        wj50.m88279p(observableCombineLatest);
        return observableCombineLatest;
    }
}
