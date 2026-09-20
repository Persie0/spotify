package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bje1 implements jje1 {

    /* JADX INFO: renamed from: a */
    public final String f27679a;

    /* JADX INFO: renamed from: b */
    public final String f27680b;

    /* JADX INFO: renamed from: c */
    public final Integer f27681c;

    public bje1(Integer num, String str, String str2) {
        this.f27679a = str;
        this.f27680b = str2;
        this.f27681c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bje1)) {
            return false;
        }
        bje1 bje1Var = (bje1) obj;
        return wj50.m88271j(this.f27679a, bje1Var.f27679a) && wj50.m88271j(this.f27680b, bje1Var.f27680b) && wj50.m88271j(this.f27681c, bje1Var.f27681c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f27679a.hashCode() * 31, 31, this.f27680b);
        Integer num = this.f27681c;
        return iM77243b + (num == null ? 0 : num.hashCode());
    }
}
