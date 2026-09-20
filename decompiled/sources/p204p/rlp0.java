package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rlp0 {

    /* JADX INFO: renamed from: a */
    public final String f200351a;

    /* JADX INFO: renamed from: b */
    public final String f200352b;

    public rlp0(String str, String str2) {
        this.f200351a = str;
        this.f200352b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlp0)) {
            return false;
        }
        rlp0 rlp0Var = (rlp0) obj;
        return wj50.m88271j(this.f200351a, rlp0Var.f200351a) && wj50.m88271j(this.f200352b, rlp0Var.f200352b);
    }

    public final int hashCode() {
        return this.f200352b.hashCode() + (this.f200351a.hashCode() * 31);
    }
}
