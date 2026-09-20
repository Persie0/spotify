package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iri0 {

    /* JADX INFO: renamed from: a */
    public final boolean f104999a;

    /* JADX INFO: renamed from: b */
    public final boolean f105000b;

    /* JADX INFO: renamed from: c */
    public final boolean f105001c;

    public iri0(boolean z, boolean z2, boolean z3) {
        this.f104999a = z;
        this.f105000b = z2;
        this.f105001c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iri0)) {
            return false;
        }
        iri0 iri0Var = (iri0) obj;
        return this.f104999a == iri0Var.f104999a && this.f105000b == iri0Var.f105000b && this.f105001c == iri0Var.f105001c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105001c) + s571.m77245d(Boolean.hashCode(this.f104999a) * 31, 31, this.f105000b);
    }
}
