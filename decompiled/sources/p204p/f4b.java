package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f4b implements f0b {

    /* JADX INFO: renamed from: a */
    public final String f65722a;

    public f4b(String str) {
        this.f65722a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m40724a() {
        return this.f65722a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4b) && wj50.m88271j(this.f65722a, ((f4b) obj).f65722a);
    }

    public final int hashCode() {
        return this.f65722a.hashCode();
    }
}
