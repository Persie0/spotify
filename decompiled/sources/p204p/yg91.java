package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yg91 implements zg91 {

    /* JADX INFO: renamed from: a */
    public final int f272522a;

    public yg91(int i) {
        this.f272522a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg91) && this.f272522a == ((yg91) obj).f272522a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f272522a);
    }
}
