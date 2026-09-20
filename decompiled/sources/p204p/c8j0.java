package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c8j0 implements e8j0 {

    /* JADX INFO: renamed from: a */
    public final String f35247a;

    public c8j0(voc1 voc1Var) {
        this(voc1Var.f243453a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8j0) && wj50.m88271j(this.f35247a, ((c8j0) obj).f35247a);
    }

    public final int hashCode() {
        return this.f35247a.hashCode() * 31;
    }

    public c8j0(String str) {
        this.f35247a = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("A non-empty URI must be provided.");
        }
    }
}
