package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f4g0 implements q4g0 {

    /* JADX INFO: renamed from: a */
    public final mq51 f65776a;

    public f4g0(mq51 mq51Var) {
        this.f65776a = mq51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4g0) && this.f65776a == ((f4g0) obj).f65776a;
    }

    public final int hashCode() {
        return this.f65776a.hashCode();
    }
}
