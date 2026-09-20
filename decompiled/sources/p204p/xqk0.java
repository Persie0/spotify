package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xqk0 extends zqk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f265061a;

    public xqk0(boolean z) {
        this.f265061a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqk0) && this.f265061a == ((xqk0) obj).f265061a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265061a);
    }
}
