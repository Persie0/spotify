package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ut80 {

    /* JADX INFO: renamed from: a */
    public final String f233841a;

    /* JADX INFO: renamed from: b */
    public final int f233842b;

    public ut80(String str, int i) {
        this.f233841a = str;
        this.f233842b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut80)) {
            return false;
        }
        ut80 ut80Var = (ut80) obj;
        return wj50.m88271j(this.f233841a, ut80Var.f233841a) && this.f233842b == ut80Var.f233842b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f233842b) + (this.f233841a.hashCode() * 31);
    }
}
