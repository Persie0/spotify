package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class w330 extends ud6 {

    /* JADX INFO: renamed from: c */
    public final String f247467c;

    /* JADX INFO: renamed from: d */
    public final String f247468d;

    /* JADX INFO: renamed from: e */
    public final String f247469e;

    public w330(String str, String str2, String str3) {
        this.f247467c = str;
        this.f247468d = str2;
        this.f247469e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w330)) {
            return false;
        }
        w330 w330Var = (w330) obj;
        return wj50.m88271j(this.f247467c, w330Var.f247467c) && wj50.m88271j(this.f247468d, w330Var.f247468d) && wj50.m88271j(this.f247469e, w330Var.f247469e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f247467c.hashCode() * 31, 31, this.f247468d);
        String str = this.f247469e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
