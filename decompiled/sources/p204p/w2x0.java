package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w2x0 implements m3x0 {

    /* JADX INFO: renamed from: a */
    public final String f247436a;

    /* JADX INFO: renamed from: b */
    public final String f247437b;

    public w2x0(String str, String str2) {
        this.f247436a = str;
        this.f247437b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2x0)) {
            return false;
        }
        w2x0 w2x0Var = (w2x0) obj;
        return wj50.m88271j(this.f247436a, w2x0Var.f247436a) && wj50.m88271j(this.f247437b, w2x0Var.f247437b);
    }

    public final int hashCode() {
        return this.f247437b.hashCode() + (this.f247436a.hashCode() * 31);
    }
}
