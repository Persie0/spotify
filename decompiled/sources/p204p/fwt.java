package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fwt implements iwt {

    /* JADX INFO: renamed from: a */
    public final String f74161a;

    public fwt(String str) {
        this.f74161a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwt) && wj50.m88271j(this.f74161a, ((fwt) obj).f74161a);
    }

    public final int hashCode() {
        return this.f74161a.hashCode();
    }
}
