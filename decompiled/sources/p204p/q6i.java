package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class q6i {

    /* JADX INFO: renamed from: a */
    public final String f185825a;

    /* JADX INFO: renamed from: b */
    public final String f185826b;

    /* JADX INFO: renamed from: c */
    public final String f185827c;

    public q6i(String str, String str2, String str3) {
        this.f185825a = str;
        this.f185826b = str2;
        this.f185827c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6i)) {
            return false;
        }
        q6i q6iVar = (q6i) obj;
        return wj50.m88271j(this.f185825a, q6iVar.f185825a) && wj50.m88271j(this.f185826b, q6iVar.f185826b) && wj50.m88271j(this.f185827c, q6iVar.f185827c);
    }

    public final int hashCode() {
        return this.f185827c.hashCode() + s571.m77243b(this.f185825a.hashCode() * 31, 31, this.f185826b);
    }
}
