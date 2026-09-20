package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gd90 {

    /* JADX INFO: renamed from: a */
    public final fd90 f78764a;

    /* JADX INFO: renamed from: b */
    public final String f78765b;

    public gd90(fd90 fd90Var, String str) {
        this.f78764a = fd90Var;
        this.f78765b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd90)) {
            return false;
        }
        gd90 gd90Var = (gd90) obj;
        return wj50.m88271j(this.f78764a, gd90Var.f78764a) && wj50.m88271j(this.f78765b, gd90Var.f78765b);
    }

    public final int hashCode() {
        return this.f78765b.hashCode() + (this.f78764a.hashCode() * 31);
    }
}
