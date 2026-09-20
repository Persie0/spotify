package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j7t extends k7t {

    /* JADX INFO: renamed from: a */
    public final int f109662a;

    /* JADX INFO: renamed from: b */
    public final boolean f109663b;

    public j7t(int i, boolean z) {
        this.f109662a = i;
        this.f109663b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7t)) {
            return false;
        }
        j7t j7tVar = (j7t) obj;
        return this.f109662a == j7tVar.f109662a && this.f109663b == j7tVar.f109663b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109663b) + (Integer.hashCode(this.f109662a) * 31);
    }
}
