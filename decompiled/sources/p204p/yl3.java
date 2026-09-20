package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yl3 {

    /* JADX INFO: renamed from: a */
    public final String f273886a;

    /* JADX INFO: renamed from: b */
    public final String f273887b;

    /* JADX INFO: renamed from: c */
    public final pwb f273888c;

    /* JADX INFO: renamed from: d */
    public final String f273889d;

    /* JADX INFO: renamed from: e */
    public final String f273890e;

    /* JADX INFO: renamed from: f */
    public final String f273891f;

    public yl3(String str, String str2, pwb pwbVar, String str3, String str4, String str5) {
        this.f273886a = str;
        this.f273887b = str2;
        this.f273888c = pwbVar;
        this.f273889d = str3;
        this.f273890e = str4;
        this.f273891f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl3)) {
            return false;
        }
        yl3 yl3Var = (yl3) obj;
        return wj50.m88271j(this.f273886a, yl3Var.f273886a) && wj50.m88271j(this.f273887b, yl3Var.f273887b) && wj50.m88271j(this.f273888c, yl3Var.f273888c) && wj50.m88271j(this.f273889d, yl3Var.f273889d) && wj50.m88271j(this.f273890e, yl3Var.f273890e) && wj50.m88271j(this.f273891f, yl3Var.f273891f);
    }

    public final int hashCode() {
        return this.f273891f.hashCode() + s571.m77243b(s571.m77243b((this.f273888c.hashCode() + s571.m77243b(this.f273886a.hashCode() * 31, 31, this.f273887b)) * 31, 31, this.f273889d), 31, this.f273890e);
    }
}
