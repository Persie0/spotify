package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mm91 {

    /* JADX INFO: renamed from: a */
    public final String f145082a;

    /* JADX INFO: renamed from: b */
    public final String f145083b;

    /* JADX INFO: renamed from: c */
    public final String f145084c;

    /* JADX INFO: renamed from: d */
    public final String f145085d;

    public mm91(String str, String str2, String str3, String str4) {
        this.f145082a = str;
        this.f145083b = str2;
        this.f145084c = str3;
        this.f145085d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm91)) {
            return false;
        }
        mm91 mm91Var = (mm91) obj;
        return wj50.m88271j(this.f145082a, mm91Var.f145082a) && wj50.m88271j(this.f145083b, mm91Var.f145083b) && wj50.m88271j(this.f145084c, mm91Var.f145084c) && wj50.m88271j(this.f145085d, mm91Var.f145085d);
    }

    public final int hashCode() {
        return this.f145085d.hashCode() + s571.m77243b(s571.m77243b(this.f145082a.hashCode() * 31, 31, this.f145083b), 31, this.f145084c);
    }
}
