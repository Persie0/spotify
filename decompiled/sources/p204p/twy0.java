package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class twy0 {

    /* JADX INFO: renamed from: a */
    public final boolean f224517a;

    public twy0(boolean z) {
        this.f224517a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twy0) && this.f224517a == ((twy0) obj).f224517a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224517a);
    }
}
