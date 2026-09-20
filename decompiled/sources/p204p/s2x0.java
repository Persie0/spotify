package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s2x0 implements m3x0 {

    /* JADX INFO: renamed from: a */
    public final String f205090a;

    public s2x0(String str) {
        this.f205090a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2x0) && wj50.m88271j(this.f205090a, ((s2x0) obj).f205090a);
    }

    public final int hashCode() {
        return this.f205090a.hashCode();
    }
}
