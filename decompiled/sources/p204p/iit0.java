package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class iit0 {

    /* JADX INFO: renamed from: a */
    public final String f102629a;

    /* JADX INFO: renamed from: b */
    public final long f102630b;

    public iit0(String str, long j) {
        this.f102629a = str;
        this.f102630b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iit0)) {
            return false;
        }
        iit0 iit0Var = (iit0) obj;
        return wj50.m88271j(this.f102629a, iit0Var.f102629a) && this.f102630b == iit0Var.f102630b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f102630b) + (this.f102629a.hashCode() * 31);
    }
}
