package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class twa0 extends wwa0 {

    /* JADX INFO: renamed from: a */
    public final String f224390a;

    /* JADX INFO: renamed from: b */
    public final String f224391b;

    /* JADX INFO: renamed from: c */
    public final String f224392c;

    public twa0(String str, String str2, String str3) {
        this.f224390a = str;
        this.f224391b = str2;
        this.f224392c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twa0)) {
            return false;
        }
        twa0 twa0Var = (twa0) obj;
        return wj50.m88271j(this.f224390a, twa0Var.f224390a) && wj50.m88271j(this.f224391b, twa0Var.f224391b) && wj50.m88271j(this.f224392c, twa0Var.f224392c);
    }

    public final int hashCode() {
        return this.f224392c.hashCode() + s571.m77243b(this.f224390a.hashCode() * 31, 31, this.f224391b);
    }
}
