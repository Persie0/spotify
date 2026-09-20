package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t781 implements z781 {

    /* JADX INFO: renamed from: a */
    public final boolean f217724a;

    public t781(boolean z) {
        this.f217724a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t781) && this.f217724a == ((t781) obj).f217724a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217724a);
    }
}
