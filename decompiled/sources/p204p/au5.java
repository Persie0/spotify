package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class au5 {

    /* JADX INFO: renamed from: a */
    public final String f19843a;

    /* JADX INFO: renamed from: b */
    public final String f19844b;

    /* JADX INFO: renamed from: c */
    public final String f19845c;

    public au5(String str, String str2, String str3) {
        this.f19843a = str;
        this.f19844b = str2;
        this.f19845c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au5)) {
            return false;
        }
        au5 au5Var = (au5) obj;
        return wj50.m88271j(this.f19843a, au5Var.f19843a) && wj50.m88271j(this.f19844b, au5Var.f19844b) && wj50.m88271j(this.f19845c, au5Var.f19845c);
    }

    public final int hashCode() {
        return this.f19845c.hashCode() + s571.m77243b(this.f19843a.hashCode() * 31, 31, this.f19844b);
    }
}
