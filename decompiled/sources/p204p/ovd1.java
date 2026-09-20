package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ovd1 implements dmb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f170489a;

    public ovd1(boolean z) {
        this.f170489a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovd1) && this.f170489a == ((ovd1) obj).f170489a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f170489a);
    }
}
