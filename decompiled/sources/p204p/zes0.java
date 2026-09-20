package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zes0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f282123a;

    public zes0(String str) {
        this.f282123a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zes0) && wj50.m88271j(this.f282123a, ((zes0) obj).f282123a);
    }

    public final int hashCode() {
        return this.f282123a.hashCode();
    }
}
