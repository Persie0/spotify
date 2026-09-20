package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w9o0 {

    /* JADX INFO: renamed from: a */
    public final int f249212a;

    /* JADX INFO: renamed from: b */
    public final String f249213b;

    public w9o0(int i, String str) {
        this.f249212a = i;
        this.f249213b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9o0)) {
            return false;
        }
        w9o0 w9o0Var = (w9o0) obj;
        return this.f249212a == w9o0Var.f249212a && wj50.m88271j(this.f249213b, w9o0Var.f249213b);
    }

    public final int hashCode() {
        return this.f249213b.hashCode() + (Integer.hashCode(this.f249212a) * 31);
    }
}
