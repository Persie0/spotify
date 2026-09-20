package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class he31 implements ie31 {

    /* JADX INFO: renamed from: a */
    public final String f90312a;

    public he31(String str) {
        this.f90312a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he31) && wj50.m88271j(this.f90312a, ((he31) obj).f90312a);
    }

    public final int hashCode() {
        return this.f90312a.hashCode();
    }
}
