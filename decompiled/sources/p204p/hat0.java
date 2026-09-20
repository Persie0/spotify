package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hat0 extends ekg1 {

    /* JADX INFO: renamed from: c */
    public final boolean f89277c;

    public hat0(boolean z) {
        this.f89277c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hat0) && this.f89277c == ((hat0) obj).f89277c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89277c);
    }
}
