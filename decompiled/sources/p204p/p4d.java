package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f173894a;

    /* JADX INFO: renamed from: b */
    public final String f173895b;

    /* JADX INFO: renamed from: c */
    public final pck f173896c;

    /* JADX INFO: renamed from: d */
    public final pck f173897d;

    /* JADX INFO: renamed from: e */
    public final boolean f173898e;

    /* JADX INFO: renamed from: f */
    public final boolean f173899f;

    public p4d(String str, String str2, pck pckVar, pck pckVar2, boolean z, boolean z2) {
        this.f173894a = str;
        this.f173895b = str2;
        this.f173896c = pckVar;
        this.f173897d = pckVar2;
        this.f173898e = z;
        this.f173899f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4d)) {
            return false;
        }
        p4d p4dVar = (p4d) obj;
        return wj50.m88271j(this.f173894a, p4dVar.f173894a) && wj50.m88271j(this.f173895b, p4dVar.f173895b) && wj50.m88271j(this.f173896c, p4dVar.f173896c) && wj50.m88271j(this.f173897d, p4dVar.f173897d) && this.f173898e == p4dVar.f173898e && this.f173899f == p4dVar.f173899f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f173899f) + s571.m77245d((this.f173897d.hashCode() + ((this.f173896c.hashCode() + s571.m77243b(this.f173894a.hashCode() * 31, 31, this.f173895b)) * 31)) * 31, 31, this.f173898e);
    }
}
