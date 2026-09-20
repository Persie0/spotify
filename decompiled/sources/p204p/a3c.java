package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface a3c {
    /* JADX INFO: renamed from: c */
    default Observable mo24620c(AbstractC1961i abstractC1961i, ArrayList arrayList) {
        return Observable.empty();
    }

    /* JADX INFO: renamed from: f */
    default Observable mo24621f(AbstractC1961i abstractC1961i, ArrayList arrayList, d3c d3cVar) {
        return Observable.just(d3cVar.mo34827h(abstractC1961i));
    }

    /* JADX INFO: renamed from: i */
    default Observable mo24622i(List list, String str, d3c d3cVar) {
        return Observable.empty();
    }

    /* JADX INFO: renamed from: p */
    zzb mo24453p(d3c d3cVar);

    /* JADX INFO: renamed from: r */
    Observable mo24454r(String str, List list);
}
