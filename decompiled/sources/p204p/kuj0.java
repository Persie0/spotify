package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kuj0 extends iqg1 {

    /* JADX INFO: renamed from: c */
    public final String f126622c;

    /* JADX INFO: renamed from: d */
    public final boolean f126623d;

    public kuj0(String str, boolean z) {
        this.f126622c = str;
        this.f126623d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuj0)) {
            return false;
        }
        kuj0 kuj0Var = (kuj0) obj;
        return wj50.m88271j(this.f126622c, kuj0Var.f126622c) && this.f126623d == kuj0Var.f126623d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126623d) + (this.f126622c.hashCode() * 31);
    }
}
