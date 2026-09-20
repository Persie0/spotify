package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hf2 implements nf2 {

    /* JADX INFO: renamed from: a */
    public final String f90583a;

    public hf2(String str) {
        this.f90583a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf2) && wj50.m88271j(this.f90583a, ((hf2) obj).f90583a);
    }

    public final int hashCode() {
        return this.f90583a.hashCode();
    }
}
