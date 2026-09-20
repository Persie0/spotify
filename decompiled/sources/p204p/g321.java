package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g321 extends i321 {

    /* JADX INFO: renamed from: a */
    public final int f76079a;

    public g321(int i) {
        this.f76079a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g321) && this.f76079a == ((g321) obj).f76079a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76079a);
    }
}
