package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i7b1 extends m7b1 {

    /* JADX INFO: renamed from: a */
    public final String f99486a;

    public i7b1(String str) {
        this.f99486a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7b1) && this.f99486a.equals(((i7b1) obj).f99486a);
    }

    public final int hashCode() {
        return this.f99486a.hashCode() * 31;
    }
}
