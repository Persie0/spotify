package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s16 implements u16 {

    /* JADX INFO: renamed from: a */
    public final String f204606a;

    /* JADX INFO: renamed from: b */
    public final int f204607b;

    public s16(String str, int i) {
        this.f204606a = str;
        this.f204607b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s16)) {
            return false;
        }
        s16 s16Var = (s16) obj;
        return wj50.m88271j(this.f204606a, s16Var.f204606a) && this.f204607b == s16Var.f204607b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f204607b) + (this.f204606a.hashCode() * 31);
    }
}
