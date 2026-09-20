package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uiu0 implements gju0 {

    /* JADX INFO: renamed from: a */
    public final String f230818a;

    /* JADX INFO: renamed from: b */
    public final String f230819b;

    /* JADX INFO: renamed from: c */
    public final String f230820c;

    /* JADX INFO: renamed from: d */
    public final Throwable f230821d;

    public uiu0(String str, String str2, String str3, Throwable th) {
        this.f230818a = str;
        this.f230819b = str2;
        this.f230820c = str3;
        this.f230821d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uiu0)) {
            return false;
        }
        uiu0 uiu0Var = (uiu0) obj;
        return wj50.m88271j(this.f230818a, uiu0Var.f230818a) && wj50.m88271j(this.f230819b, uiu0Var.f230819b) && wj50.m88271j(this.f230820c, uiu0Var.f230820c) && wj50.m88271j(this.f230821d, uiu0Var.f230821d);
    }

    public final int hashCode() {
        return this.f230821d.hashCode() + s571.m77243b(s571.m77243b(this.f230818a.hashCode() * 31, 31, this.f230819b), 31, this.f230820c);
    }
}
