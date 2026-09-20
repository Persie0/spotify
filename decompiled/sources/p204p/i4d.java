package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f98511a;

    public i4d(String str) {
        this.f98511a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4d) && wj50.m88271j(this.f98511a, ((i4d) obj).f98511a);
    }

    public final int hashCode() {
        return this.f98511a.hashCode();
    }
}
