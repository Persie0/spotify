package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class feu0 implements peu0 {

    /* JADX INFO: renamed from: a */
    public final String f68833a;

    public feu0(String str) {
        this.f68833a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof feu0) && wj50.m88271j(this.f68833a, ((feu0) obj).f68833a);
    }

    public final int hashCode() {
        return this.f68833a.hashCode();
    }
}
