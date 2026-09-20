package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vm50 extends wm50 {

    /* JADX INFO: renamed from: a */
    public final String f242707a;

    public vm50(String str) {
        this.f242707a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vm50) && wj50.m88271j(this.f242707a, ((vm50) obj).f242707a);
    }

    public final int hashCode() {
        return this.f242707a.hashCode();
    }
}
