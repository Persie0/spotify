package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t911 {

    /* JADX INFO: renamed from: a */
    public final String f218172a;

    /* JADX INFO: renamed from: b */
    public final String f218173b;

    /* JADX INFO: renamed from: c */
    public final String f218174c;

    /* JADX INFO: renamed from: d */
    public final Integer f218175d;

    public t911(String str, String str2, Integer num, String str3) {
        this.f218172a = str;
        this.f218173b = str2;
        this.f218174c = str3;
        this.f218175d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t911)) {
            return false;
        }
        t911 t911Var = (t911) obj;
        return wj50.m88271j(this.f218172a, t911Var.f218172a) && wj50.m88271j(this.f218173b, t911Var.f218173b) && wj50.m88271j(this.f218174c, t911Var.f218174c) && wj50.m88271j(this.f218175d, t911Var.f218175d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f218172a.hashCode() * 31, 31, this.f218173b);
        String str = this.f218174c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f218175d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
