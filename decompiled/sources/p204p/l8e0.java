package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l8e0 {

    /* JADX INFO: renamed from: a */
    public final String f130849a;

    /* JADX INFO: renamed from: b */
    public final String f130850b;

    public l8e0(String str, String str2) {
        this.f130849a = str;
        this.f130850b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8e0)) {
            return false;
        }
        l8e0 l8e0Var = (l8e0) obj;
        return wj50.m88271j(this.f130849a, l8e0Var.f130849a) && wj50.m88271j(this.f130850b, l8e0Var.f130850b);
    }

    public final int hashCode() {
        return this.f130850b.hashCode() + (this.f130849a.hashCode() * 31);
    }
}
