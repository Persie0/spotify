package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dto0 {

    /* JADX INFO: renamed from: a */
    public final String f52879a;

    /* JADX INFO: renamed from: b */
    public final boolean f52880b;

    public dto0(String str, boolean z) {
        this.f52879a = str;
        this.f52880b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dto0)) {
            return false;
        }
        dto0 dto0Var = (dto0) obj;
        return wj50.m88271j(this.f52879a, dto0Var.f52879a) && this.f52880b == dto0Var.f52880b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52880b) + (this.f52879a.hashCode() * 31);
    }
}
