package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v891 implements z891 {

    /* JADX INFO: renamed from: a */
    public final String f238444a;

    /* JADX INFO: renamed from: b */
    public final String f238445b;

    /* JADX INFO: renamed from: c */
    public final String f238446c;

    public v891(String str, String str2, String str3) {
        this.f238444a = str;
        this.f238445b = str2;
        this.f238446c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v891)) {
            return false;
        }
        v891 v891Var = (v891) obj;
        return wj50.m88271j(this.f238444a, v891Var.f238444a) && wj50.m88271j(this.f238445b, v891Var.f238445b) && wj50.m88271j(this.f238446c, v891Var.f238446c);
    }

    public final int hashCode() {
        return this.f238446c.hashCode() + s571.m77243b(this.f238444a.hashCode() * 31, 31, this.f238445b);
    }
}
