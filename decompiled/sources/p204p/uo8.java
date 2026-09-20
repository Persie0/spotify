package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uo8 {

    /* JADX INFO: renamed from: a */
    public final String f232355a;

    /* JADX INFO: renamed from: b */
    public final ap8 f232356b;

    public uo8(String str, ap8 ap8Var) {
        this.f232355a = str;
        this.f232356b = ap8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo8)) {
            return false;
        }
        uo8 uo8Var = (uo8) obj;
        return wj50.m88271j(this.f232355a, uo8Var.f232355a) && this.f232356b == uo8Var.f232356b;
    }

    public final int hashCode() {
        String str = this.f232355a;
        return this.f232356b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
