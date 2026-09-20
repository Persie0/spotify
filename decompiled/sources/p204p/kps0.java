package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kps0 implements lps0 {

    /* JADX INFO: renamed from: a */
    public final c4m f125119a;

    public kps0(c4m c4mVar) {
        this.f125119a = c4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kps0) && wj50.m88271j(this.f125119a, ((kps0) obj).f125119a);
    }

    public final int hashCode() {
        c4m c4mVar = this.f125119a;
        if (c4mVar == null) {
            return 0;
        }
        return c4mVar.hashCode();
    }
}
