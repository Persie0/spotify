package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qxk implements txk {

    /* JADX INFO: renamed from: a */
    public final String f193695a;

    /* JADX INFO: renamed from: b */
    public final int f193696b;

    public qxk(String str, int i) {
        this.f193695a = str;
        this.f193696b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxk)) {
            return false;
        }
        qxk qxkVar = (qxk) obj;
        return wj50.m88271j(this.f193695a, qxkVar.f193695a) && this.f193696b == qxkVar.f193696b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f193696b) + (this.f193695a.hashCode() * 31);
    }
}
