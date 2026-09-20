package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t5w {

    /* JADX INFO: renamed from: a */
    public final String f217376a;

    /* JADX INFO: renamed from: b */
    public final String f217377b;

    public t5w(String str, String str2) {
        this.f217376a = str;
        this.f217377b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5w)) {
            return false;
        }
        t5w t5wVar = (t5w) obj;
        return wj50.m88271j(this.f217376a, t5wVar.f217376a) && wj50.m88271j(this.f217377b, t5wVar.f217377b);
    }

    public final int hashCode() {
        return this.f217377b.hashCode() + (this.f217376a.hashCode() * 31);
    }
}
