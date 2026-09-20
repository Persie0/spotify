package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ob30 {

    /* JADX INFO: renamed from: a */
    public final String f163526a;

    /* JADX INFO: renamed from: b */
    public final int f163527b;

    public ob30(String str, int i) {
        this.f163526a = str;
        this.f163527b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob30)) {
            return false;
        }
        ob30 ob30Var = (ob30) obj;
        return wj50.m88271j(this.f163526a, ob30Var.f163526a) && this.f163527b == ob30Var.f163527b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f163527b) + (this.f163526a.hashCode() * 31);
    }
}
