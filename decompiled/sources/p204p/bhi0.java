package p204p;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
public final class bhi0 {
    public static final ahi0 Companion = new ahi0();

    /* JADX INFO: renamed from: a */
    public final String f27194a;

    public /* synthetic */ bhi0(String str) {
        this.f27194a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bhi0) {
            return wj50.m88271j(this.f27194a, ((bhi0) obj).f27194a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27194a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("MusicGenre(key=", this.f27194a, ")");
    }
}
