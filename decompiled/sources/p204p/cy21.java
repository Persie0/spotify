package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;

/* JADX INFO: loaded from: classes10.dex */
public final class cy21 {

    /* JADX INFO: renamed from: a */
    public final ay21 f43144a;

    /* JADX INFO: renamed from: b */
    public final ObservableRefCount f43145b;

    public cy21(ay21 ay21Var, ObservableRefCount observableRefCount) {
        this.f43144a = ay21Var;
        this.f43145b = observableRefCount;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m34337a() {
        return this.f43145b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy21)) {
            return false;
        }
        cy21 cy21Var = (cy21) obj;
        return this.f43144a.equals(cy21Var.f43144a) && this.f43145b.equals(cy21Var.f43145b);
    }

    public final int hashCode() {
        return this.f43145b.hashCode() + (this.f43144a.hashCode() * 31);
    }
}
