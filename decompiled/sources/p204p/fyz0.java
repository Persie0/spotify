package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fyz0 implements gyz0 {

    /* JADX INFO: renamed from: a */
    public final String f74875a;

    public fyz0(String str) {
        this.f74875a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyz0) && wj50.m88271j(this.f74875a, ((fyz0) obj).f74875a);
    }

    public final int hashCode() {
        return this.f74875a.hashCode();
    }
}
