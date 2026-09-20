package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class asj extends dsj {

    /* JADX INFO: renamed from: a */
    public final int f19464a;

    public asj(int i) {
        this.f19464a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof asj) && this.f19464a == ((asj) obj).f19464a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19464a);
    }
}
