package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dje1 implements jje1 {

    /* JADX INFO: renamed from: a */
    public final String f49674a;

    /* JADX INFO: renamed from: b */
    public final String f49675b;

    /* JADX INFO: renamed from: c */
    public final Integer f49676c;

    /* JADX INFO: renamed from: d */
    public final String f49677d;

    /* JADX INFO: renamed from: e */
    public final boolean f49678e;

    public dje1(Integer num, String str, String str2, String str3, boolean z) {
        this.f49674a = str;
        this.f49675b = str2;
        this.f49676c = num;
        this.f49677d = str3;
        this.f49678e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dje1)) {
            return false;
        }
        dje1 dje1Var = (dje1) obj;
        return wj50.m88271j(this.f49674a, dje1Var.f49674a) && wj50.m88271j(this.f49675b, dje1Var.f49675b) && wj50.m88271j(this.f49676c, dje1Var.f49676c) && wj50.m88271j(this.f49677d, dje1Var.f49677d) && this.f49678e == dje1Var.f49678e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f49674a.hashCode() * 31, 31, this.f49675b);
        Integer num = this.f49676c;
        return Boolean.hashCode(this.f49678e) + s571.m77243b((iM77243b + (num == null ? 0 : num.hashCode())) * 31, 31, this.f49677d);
    }
}
