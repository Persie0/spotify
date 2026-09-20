package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes2.dex */
public interface cxx {
    /* JADX INFO: renamed from: a */
    default Observable mo28057a(roa roaVar) {
        return mo24638b(roaVar).toObservable();
    }

    /* JADX INFO: renamed from: b */
    default Single mo24638b(roa roaVar) {
        return Single.just(new fxx(lau.f131415a));
    }
}
