package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class leb0 implements qeb0 {

    /* JADX INFO: renamed from: a */
    public final String f132503a;

    /* JADX INFO: renamed from: b */
    public final String f132504b;

    /* JADX INFO: renamed from: c */
    public final String f132505c;

    /* JADX INFO: renamed from: d */
    public final String f132506d;

    public leb0(String str, String str2, String str3, String str4) {
        this.f132503a = str;
        this.f132504b = str2;
        this.f132505c = str3;
        this.f132506d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof leb0)) {
            return false;
        }
        leb0 leb0Var = (leb0) obj;
        return wj50.m88271j(this.f132503a, leb0Var.f132503a) && wj50.m88271j(this.f132504b, leb0Var.f132504b) && wj50.m88271j(this.f132505c, leb0Var.f132505c) && wj50.m88271j(this.f132506d, leb0Var.f132506d);
    }

    public final int hashCode() {
        return this.f132506d.hashCode() + s571.m77243b(s571.m77243b(this.f132503a.hashCode() * 31, 31, this.f132504b), 31, this.f132505c);
    }
}
