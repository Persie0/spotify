package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qhp0 implements shp0 {

    /* JADX INFO: renamed from: a */
    public final String f188818a;

    /* JADX INFO: renamed from: b */
    public final String f188819b;

    /* JADX INFO: renamed from: c */
    public final int f188820c;

    public qhp0(String str, String str2, int i) {
        this.f188818a = str;
        this.f188819b = str2;
        this.f188820c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhp0)) {
            return false;
        }
        qhp0 qhp0Var = (qhp0) obj;
        return wj50.m88271j(this.f188818a, qhp0Var.f188818a) && wj50.m88271j(this.f188819b, qhp0Var.f188819b) && this.f188820c == qhp0Var.f188820c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f188820c) + s571.m77243b(this.f188818a.hashCode() * 31, 31, this.f188819b);
    }
}
