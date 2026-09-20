package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xiu0 implements gju0 {

    /* JADX INFO: renamed from: a */
    public final String f261946a;

    public xiu0(String str) {
        this.f261946a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xiu0) && wj50.m88271j(this.f261946a, ((xiu0) obj).f261946a);
    }

    public final int hashCode() {
        return this.f261946a.hashCode();
    }
}
