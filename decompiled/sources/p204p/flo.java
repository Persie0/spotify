package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class flo {

    /* JADX INFO: renamed from: a */
    public final String f70830a;

    /* JADX INFO: renamed from: b */
    public final String f70831b;

    public flo(String str, String str2) {
        this.f70830a = str;
        this.f70831b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flo)) {
            return false;
        }
        flo floVar = (flo) obj;
        return wj50.m88271j(this.f70830a, floVar.f70830a) && wj50.m88271j(this.f70831b, floVar.f70831b);
    }

    public final int hashCode() {
        return this.f70831b.hashCode() + (this.f70830a.hashCode() * 31);
    }
}
