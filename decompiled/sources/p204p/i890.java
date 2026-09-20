package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class i890 {

    /* JADX INFO: renamed from: a */
    public final Object f99745a;

    /* JADX INFO: renamed from: b */
    public final String f99746b;

    public i890(Object obj, String str) {
        this.f99745a = obj;
        this.f99746b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i890)) {
            return false;
        }
        i890 i890Var = (i890) obj;
        return this.f99745a == i890Var.f99745a && this.f99746b.equals(i890Var.f99746b);
    }

    public final int hashCode() {
        return this.f99746b.hashCode() + (System.identityHashCode(this.f99745a) * 31);
    }
}
