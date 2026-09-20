package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fms0 extends a9a {

    /* JADX INFO: renamed from: a */
    public final String f71118a;

    public fms0(String str) {
        super(str, null);
        this.f71118a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fms0) && wj50.m88271j(this.f71118a, ((fms0) obj).f71118a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f71118a;
    }

    public final int hashCode() {
        return this.f71118a.hashCode();
    }
}
