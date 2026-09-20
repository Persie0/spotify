package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lba1 {

    /* JADX INFO: renamed from: a */
    public final String f131613a;

    /* JADX INFO: renamed from: b */
    public final wba1 f131614b;

    public lba1(String str, wba1 wba1Var) {
        this.f131613a = str;
        this.f131614b = wba1Var;
    }

    /* JADX INFO: renamed from: a */
    public static lba1 m58657a(lba1 lba1Var, wba1 wba1Var) {
        String str = lba1Var.f131613a;
        lba1Var.getClass();
        return new lba1(str, wba1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lba1)) {
            return false;
        }
        lba1 lba1Var = (lba1) obj;
        return wj50.m88271j(this.f131613a, lba1Var.f131613a) && wj50.m88271j(this.f131614b, lba1Var.f131614b);
    }

    public final int hashCode() {
        return this.f131614b.hashCode() + (this.f131613a.hashCode() * 31);
    }
}
