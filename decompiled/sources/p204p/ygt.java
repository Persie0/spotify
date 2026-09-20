package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ygt {

    /* JADX INFO: renamed from: a */
    public final boolean f272636a;

    public ygt(boolean z) {
        this.f272636a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygt) && this.f272636a == ((ygt) obj).f272636a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272636a);
    }
}
