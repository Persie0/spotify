package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tlx0 implements ulx0 {

    /* JADX INFO: renamed from: a */
    public final String f221536a;

    public tlx0(String str) {
        this.f221536a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlx0) && wj50.m88271j(this.f221536a, ((tlx0) obj).f221536a);
    }

    public final int hashCode() {
        return this.f221536a.hashCode();
    }
}
