package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sp8 {

    /* JADX INFO: renamed from: a */
    public final String f212764a;

    /* JADX INFO: renamed from: b */
    public final String f212765b;

    /* JADX INFO: renamed from: c */
    public final String f212766c;

    /* JADX INFO: renamed from: d */
    public final yp8 f212767d;

    public sp8(String str, String str2, String str3, yp8 yp8Var) {
        this.f212764a = str;
        this.f212765b = str2;
        this.f212766c = str3;
        this.f212767d = yp8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp8)) {
            return false;
        }
        sp8 sp8Var = (sp8) obj;
        return wj50.m88271j(this.f212764a, sp8Var.f212764a) && wj50.m88271j(this.f212765b, sp8Var.f212765b) && wj50.m88271j(this.f212766c, sp8Var.f212766c) && wj50.m88271j(this.f212767d, sp8Var.f212767d);
    }

    public final int hashCode() {
        return this.f212767d.hashCode() + s571.m77243b(s571.m77243b(this.f212764a.hashCode() * 31, 31, this.f212765b), 31, this.f212766c);
    }
}
