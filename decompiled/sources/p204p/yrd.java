package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yrd {

    /* JADX INFO: renamed from: a */
    public final String f275458a;

    /* JADX INFO: renamed from: b */
    public final String f275459b;

    /* JADX INFO: renamed from: c */
    public final String f275460c;

    /* JADX INFO: renamed from: d */
    public final qe70 f275461d;

    /* JADX INFO: renamed from: e */
    public final String f275462e;

    /* JADX WARN: Multi-variable type inference failed */
    public yrd(String str, String str2, String str3, String str4, gh00 gh00Var) {
        this.f275458a = str;
        this.f275459b = str2;
        this.f275460c = str3;
        this.f275461d = (qe70) gh00Var;
        this.f275462e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrd)) {
            return false;
        }
        yrd yrdVar = (yrd) obj;
        return this.f275458a.equals(yrdVar.f275458a) && this.f275459b.equals(yrdVar.f275459b) && this.f275460c.equals(yrdVar.f275460c) && this.f275461d.equals(yrdVar.f275461d) && this.f275462e.equals(yrdVar.f275462e);
    }

    public final int hashCode() {
        return this.f275462e.hashCode() + ((this.f275461d.hashCode() + s571.m77243b(s571.m77243b(this.f275458a.hashCode() * 31, 31, this.f275459b), 31, this.f275460c)) * 31);
    }
}
