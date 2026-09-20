package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fgc {

    /* JADX INFO: renamed from: a */
    public final String f69274a;

    /* JADX INFO: renamed from: b */
    public final String f69275b;

    public fgc(String str, String str2) {
        this.f69274a = str;
        this.f69275b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgc)) {
            return false;
        }
        fgc fgcVar = (fgc) obj;
        return wj50.m88271j(this.f69274a, fgcVar.f69274a) && wj50.m88271j(this.f69275b, fgcVar.f69275b);
    }

    public final int hashCode() {
        return this.f69275b.hashCode() + (this.f69274a.hashCode() * 31);
    }
}
