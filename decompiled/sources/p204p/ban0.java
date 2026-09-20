package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ban0 {

    /* JADX INFO: renamed from: a */
    public final String f25261a;

    /* JADX INFO: renamed from: b */
    public final String f25262b;

    /* JADX INFO: renamed from: c */
    public final String f25263c;

    /* JADX INFO: renamed from: d */
    public final eh00 f25264d;

    public ban0(String str, String str2, String str3, eh00 eh00Var) {
        this.f25261a = str;
        this.f25262b = str2;
        this.f25263c = str3;
        this.f25264d = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ban0)) {
            return false;
        }
        ban0 ban0Var = (ban0) obj;
        return wj50.m88271j(this.f25261a, ban0Var.f25261a) && wj50.m88271j(this.f25262b, ban0Var.f25262b) && wj50.m88271j(this.f25263c, ban0Var.f25263c) && wj50.m88271j(this.f25264d, ban0Var.f25264d);
    }

    public final int hashCode() {
        return this.f25264d.hashCode() + s571.m77243b(s571.m77243b(this.f25261a.hashCode() * 31, 31, this.f25262b), 31, this.f25263c);
    }
}
