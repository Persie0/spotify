package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ql8 implements sl8 {

    /* JADX INFO: renamed from: a */
    public final String f189761a;

    /* JADX INFO: renamed from: b */
    public final String f189762b;

    public ql8(String str, String str2) {
        this.f189761a = str;
        this.f189762b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql8)) {
            return false;
        }
        ql8 ql8Var = (ql8) obj;
        return wj50.m88271j(this.f189761a, ql8Var.f189761a) && wj50.m88271j(this.f189762b, ql8Var.f189762b);
    }

    public final int hashCode() {
        return this.f189762b.hashCode() + (this.f189761a.hashCode() * 31);
    }
}
