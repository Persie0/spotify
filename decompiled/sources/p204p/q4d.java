package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f185147a;

    /* JADX INFO: renamed from: b */
    public final String f185148b;

    /* JADX INFO: renamed from: c */
    public final pck f185149c;

    /* JADX INFO: renamed from: d */
    public final pck f185150d;

    /* JADX INFO: renamed from: e */
    public final boolean f185151e;

    /* JADX INFO: renamed from: f */
    public final boolean f185152f;

    public q4d(String str, String str2, pck pckVar, pck pckVar2, boolean z, boolean z2) {
        this.f185147a = str;
        this.f185148b = str2;
        this.f185149c = pckVar;
        this.f185150d = pckVar2;
        this.f185151e = z;
        this.f185152f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4d)) {
            return false;
        }
        q4d q4dVar = (q4d) obj;
        return wj50.m88271j(this.f185147a, q4dVar.f185147a) && wj50.m88271j(this.f185148b, q4dVar.f185148b) && wj50.m88271j(this.f185149c, q4dVar.f185149c) && wj50.m88271j(this.f185150d, q4dVar.f185150d) && this.f185151e == q4dVar.f185151e && this.f185152f == q4dVar.f185152f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185152f) + s571.m77245d((this.f185150d.hashCode() + ((this.f185149c.hashCode() + s571.m77243b(this.f185147a.hashCode() * 31, 31, this.f185148b)) * 31)) * 31, 31, this.f185151e);
    }
}
