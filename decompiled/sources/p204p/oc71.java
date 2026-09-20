package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oc71 {

    /* JADX INFO: renamed from: a */
    public final String f163851a;

    /* JADX INFO: renamed from: b */
    public final String f163852b;

    /* JADX INFO: renamed from: c */
    public final boolean f163853c;

    /* JADX INFO: renamed from: d */
    public final nc71 f163854d;

    public oc71(String str, String str2, boolean z, nc71 nc71Var) {
        this.f163851a = str;
        this.f163852b = str2;
        this.f163853c = z;
        this.f163854d = nc71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc71)) {
            return false;
        }
        oc71 oc71Var = (oc71) obj;
        return wj50.m88271j(this.f163851a, oc71Var.f163851a) && wj50.m88271j(this.f163852b, oc71Var.f163852b) && this.f163853c == oc71Var.f163853c && wj50.m88271j(this.f163854d, oc71Var.f163854d);
    }

    public final int hashCode() {
        return this.f163854d.hashCode() + s571.m77245d(s571.m77243b(this.f163851a.hashCode() * 31, 31, this.f163852b), 31, this.f163853c);
    }
}
