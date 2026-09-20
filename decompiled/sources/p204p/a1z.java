package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a1z implements c1z {

    /* JADX INFO: renamed from: a */
    public final String f11494a;

    /* JADX INFO: renamed from: b */
    public final boolean f11495b;

    public a1z(String str, boolean z) {
        this.f11494a = str;
        this.f11495b = z;
    }

    @Override // p204p.c1z
    /* JADX INFO: renamed from: a */
    public final boolean mo24468a() {
        return this.f11495b;
    }

    @Override // p204p.c1z
    /* JADX INFO: renamed from: b */
    public final int mo24469b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1z)) {
            return false;
        }
        a1z a1zVar = (a1z) obj;
        return wj50.m88271j(this.f11494a, a1zVar.f11494a) && this.f11495b == a1zVar.f11495b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11495b) + (this.f11494a.hashCode() * 961);
    }
}
