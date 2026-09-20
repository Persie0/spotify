package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jj70 {

    /* JADX INFO: renamed from: a */
    public final String f112941a;

    /* JADX INFO: renamed from: b */
    public final String f112942b;

    /* JADX INFO: renamed from: c */
    public final String f112943c;

    public jj70(String str, String str2, String str3) {
        this.f112941a = str;
        this.f112942b = str2;
        this.f112943c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m53526a() {
        return this.f112943c;
    }

    /* JADX INFO: renamed from: b */
    public final String m53527b() {
        return this.f112941a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj70)) {
            return false;
        }
        jj70 jj70Var = (jj70) obj;
        return wj50.m88271j(this.f112941a, jj70Var.f112941a) && wj50.m88271j(this.f112942b, jj70Var.f112942b) && wj50.m88271j(this.f112943c, jj70Var.f112943c);
    }

    public final int hashCode() {
        int iHashCode = this.f112941a.hashCode() * 31;
        String str = this.f112942b;
        return this.f112943c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
