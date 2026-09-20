package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wyw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f256366a;

    public wyw(String str) {
        this.f256366a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wyw) && wj50.m88271j(this.f256366a, ((wyw) obj).f256366a);
    }

    public final int hashCode() {
        return this.f256366a.hashCode();
    }
}
