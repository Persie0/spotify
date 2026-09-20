package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final String f134325a;

    /* JADX INFO: renamed from: b */
    public final String f134326b;

    public lkd(String str, String str2) {
        this.f134325a = str;
        this.f134326b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkd)) {
            return false;
        }
        lkd lkdVar = (lkd) obj;
        return wj50.m88271j(this.f134325a, lkdVar.f134325a) && wj50.m88271j(this.f134326b, lkdVar.f134326b);
    }

    public final int hashCode() {
        return this.f134326b.hashCode() + (this.f134325a.hashCode() * 31);
    }
}
