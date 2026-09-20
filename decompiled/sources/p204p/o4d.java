package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f161656a;

    public o4d(String str) {
        this.f161656a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4d) && wj50.m88271j(this.f161656a, ((o4d) obj).f161656a);
    }

    public final int hashCode() {
        return this.f161656a.hashCode();
    }
}
