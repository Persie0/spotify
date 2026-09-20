package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dq91 extends kq91 {

    /* JADX INFO: renamed from: b */
    public final int f51910b;

    public dq91(int i) {
        super("visibility");
        this.f51910b = i;
    }

    @Override // p204p.kq91
    /* JADX INFO: renamed from: a */
    public final String mo30203a() {
        return String.valueOf(this.f51910b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq91) && this.f51910b == ((dq91) obj).f51910b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51910b);
    }
}
