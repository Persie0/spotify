package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sb1 implements zb1 {

    /* JADX INFO: renamed from: a */
    public final String f207316a;

    /* JADX INFO: renamed from: b */
    public final String f207317b;

    /* JADX INFO: renamed from: c */
    public final String f207318c;

    public sb1(String str, String str2, String str3) {
        this.f207316a = str;
        this.f207317b = str2;
        this.f207318c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb1)) {
            return false;
        }
        sb1 sb1Var = (sb1) obj;
        return wj50.m88271j(this.f207316a, sb1Var.f207316a) && wj50.m88271j(this.f207317b, sb1Var.f207317b) && wj50.m88271j(this.f207318c, sb1Var.f207318c);
    }

    public final int hashCode() {
        return this.f207318c.hashCode() + s571.m77243b(this.f207316a.hashCode() * 31, 31, this.f207317b);
    }
}
