package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s5d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final String f205780a;

    /* JADX INFO: renamed from: b */
    public final String f205781b;

    /* JADX INFO: renamed from: c */
    public final Integer f205782c;

    public s5d1(Integer num, String str, String str2) {
        this.f205780a = str;
        this.f205781b = str2;
        this.f205782c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5d1)) {
            return false;
        }
        s5d1 s5d1Var = (s5d1) obj;
        return wj50.m88271j(this.f205780a, s5d1Var.f205780a) && wj50.m88271j(this.f205781b, s5d1Var.f205781b) && wj50.m88271j(this.f205782c, s5d1Var.f205782c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f205780a.hashCode() * 31, 31, this.f205781b);
        Integer num = this.f205782c;
        return iM77243b + (num == null ? 0 : num.hashCode());
    }

    public /* synthetic */ s5d1(String str) {
        this(null, str, "network");
    }
}
