package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class iqo0 {

    /* JADX INFO: renamed from: a */
    public final String f104814a;

    /* JADX INFO: renamed from: b */
    public final String f104815b;

    /* JADX INFO: renamed from: c */
    public final String f104816c;

    /* JADX INFO: renamed from: d */
    public final eh00 f104817d;

    public iqo0(String str, String str2, String str3, eh00 eh00Var) {
        this.f104814a = str;
        this.f104815b = str2;
        this.f104816c = str3;
        this.f104817d = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqo0)) {
            return false;
        }
        iqo0 iqo0Var = (iqo0) obj;
        return wj50.m88271j(this.f104814a, iqo0Var.f104814a) && wj50.m88271j(this.f104815b, iqo0Var.f104815b) && wj50.m88271j(this.f104816c, iqo0Var.f104816c) && wj50.m88271j(this.f104817d, iqo0Var.f104817d);
    }

    public final int hashCode() {
        return this.f104817d.hashCode() + s571.m77243b(s571.m77243b(this.f104814a.hashCode() * 31, 31, this.f104815b), 31, this.f104816c);
    }
}
