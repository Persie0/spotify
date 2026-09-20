package p204p;

import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: classes8.dex */
public final class r551 implements t551 {

    /* JADX INFO: renamed from: a */
    public final FlowableMap f195968a;

    /* JADX INFO: renamed from: b */
    public final ri00 f195969b;

    /* JADX WARN: Multi-variable type inference failed */
    public r551(FlowableMap flowableMap, eh00 eh00Var) {
        this.f195968a = flowableMap;
        this.f195969b = (ri00) eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r551)) {
            return false;
        }
        r551 r551Var = (r551) obj;
        return this.f195968a.equals(r551Var.f195968a) && this.f195969b.equals(r551Var.f195969b);
    }

    public final int hashCode() {
        return this.f195969b.hashCode() + (this.f195968a.hashCode() * 31);
    }
}
