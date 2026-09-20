package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ano0 extends cno0 {

    /* JADX INFO: renamed from: a */
    public final boolean f17478a;

    public ano0(boolean z) {
        this.f17478a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ano0) && this.f17478a == ((ano0) obj).f17478a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17478a);
    }
}
