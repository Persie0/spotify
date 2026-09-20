package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rt2 {

    /* JADX INFO: renamed from: a */
    public final String f202473a;

    /* JADX INFO: renamed from: b */
    public final String f202474b;

    /* JADX INFO: renamed from: c */
    public final String f202475c;

    public rt2(String str, String str2, String str3) {
        this.f202473a = str;
        this.f202474b = str2;
        this.f202475c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt2)) {
            return false;
        }
        rt2 rt2Var = (rt2) obj;
        return wj50.m88271j(this.f202473a, rt2Var.f202473a) && wj50.m88271j(this.f202474b, rt2Var.f202474b) && wj50.m88271j(this.f202475c, rt2Var.f202475c);
    }

    public final int hashCode() {
        return this.f202475c.hashCode() + s571.m77243b(this.f202473a.hashCode() * 31, 31, this.f202474b);
    }
}
