package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ix60 implements kx60 {

    /* JADX INFO: renamed from: a */
    public final String f106608a;

    /* JADX INFO: renamed from: b */
    public final String f106609b;

    public ix60(String str, String str2) {
        this.f106608a = str;
        this.f106609b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix60)) {
            return false;
        }
        ix60 ix60Var = (ix60) obj;
        return wj50.m88271j(this.f106608a, ix60Var.f106608a) && wj50.m88271j(this.f106609b, ix60Var.f106609b);
    }

    public final int hashCode() {
        return this.f106609b.hashCode() + (this.f106608a.hashCode() * 31);
    }
}
