package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class t530 implements z530 {

    /* JADX INFO: renamed from: a */
    public final boolean f217202a;

    public t530(boolean z) {
        this.f217202a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t530) && this.f217202a == ((t530) obj).f217202a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217202a);
    }
}
