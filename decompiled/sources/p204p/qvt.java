package p204p;

import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: classes.dex */
public final class qvt implements svt {

    /* JADX INFO: renamed from: a */
    public final FlowableMap f193096a;

    public qvt(FlowableMap flowableMap) {
        this.f193096a = flowableMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvt) && this.f193096a.equals(((qvt) obj).f193096a);
    }

    public final int hashCode() {
        return this.f193096a.hashCode();
    }
}
