package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zsd implements atd {

    /* JADX INFO: renamed from: a */
    public final String f285920a;

    public zsd(String str) {
        this.f285920a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsd) && wj50.m88271j(this.f285920a, ((zsd) obj).f285920a);
    }

    public final int hashCode() {
        return this.f285920a.hashCode();
    }
}
