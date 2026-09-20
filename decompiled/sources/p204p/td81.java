package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class td81 {

    /* JADX INFO: renamed from: a */
    public final String f219264a;

    /* JADX INFO: renamed from: b */
    public final String f219265b;

    public td81(String str, String str2) {
        this.f219264a = str;
        this.f219265b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td81)) {
            return false;
        }
        td81 td81Var = (td81) obj;
        return wj50.m88271j(this.f219264a, td81Var.f219264a) && wj50.m88271j(this.f219265b, td81Var.f219265b);
    }

    public final int hashCode() {
        return this.f219265b.hashCode() + (this.f219264a.hashCode() * 31);
    }
}
