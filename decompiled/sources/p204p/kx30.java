package p204p;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kx30 {

    /* JADX INFO: renamed from: a */
    public final fx30 f127323a;

    /* JADX INFO: renamed from: b */
    public final String f127324b;

    public kx30(fx30 fx30Var, String str) {
        this.f127323a = fx30Var;
        this.f127324b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return getClass().equals(obj != null ? obj.getClass() : null) && wj50.m88271j(this.f127323a, ((kx30) obj).f127323a);
    }

    public final int hashCode() {
        return this.f127323a.hashCode();
    }
}
