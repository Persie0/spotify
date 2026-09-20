package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yo11 {

    /* JADX INFO: renamed from: a */
    public final boolean f274536a;

    /* JADX INFO: renamed from: b */
    public final boolean f274537b;

    public yo11(boolean z, boolean z2) {
        this.f274536a = z;
        this.f274537b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo11)) {
            return false;
        }
        yo11 yo11Var = (yo11) obj;
        return this.f274536a == yo11Var.f274536a && this.f274537b == yo11Var.f274537b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274537b) + (Boolean.hashCode(this.f274536a) * 31);
    }
}
