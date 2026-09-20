package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f216974a;

    /* JADX INFO: renamed from: b */
    public final String f216975b;

    /* JADX INFO: renamed from: c */
    public final String f216976c;

    /* JADX INFO: renamed from: d */
    public final lzu0 f216977d;

    public t4d(String str, String str2, String str3, lzu0 lzu0Var) {
        this.f216974a = str;
        this.f216975b = str2;
        this.f216976c = str3;
        this.f216977d = lzu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4d)) {
            return false;
        }
        t4d t4dVar = (t4d) obj;
        return wj50.m88271j(this.f216974a, t4dVar.f216974a) && wj50.m88271j(this.f216975b, t4dVar.f216975b) && wj50.m88271j(this.f216976c, t4dVar.f216976c) && this.f216977d == t4dVar.f216977d;
    }

    public final int hashCode() {
        return this.f216977d.hashCode() + s571.m77243b(s571.m77243b(this.f216974a.hashCode() * 31, 31, this.f216975b), 31, this.f216976c);
    }
}
