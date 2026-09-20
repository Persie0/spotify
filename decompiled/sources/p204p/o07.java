package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class o07 {

    /* JADX INFO: renamed from: a */
    public final yw6 f160249a;

    /* JADX INFO: renamed from: b */
    public final String f160250b;

    /* JADX INFO: renamed from: c */
    public final String f160251c;

    /* JADX INFO: renamed from: d */
    public final boolean f160252d;

    /* JADX INFO: renamed from: e */
    public final Integer f160253e;

    /* JADX INFO: renamed from: f */
    public final String f160254f;

    public o07(yw6 yw6Var, String str, String str2, boolean z, Integer num, String str3, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 32) != 0 ? null : str3;
        this.f160249a = yw6Var;
        this.f160250b = str;
        this.f160251c = str2;
        this.f160252d = z;
        this.f160253e = num;
        this.f160254f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o07)) {
            return false;
        }
        o07 o07Var = (o07) obj;
        return this.f160249a.equals(o07Var.f160249a) && wj50.m88271j(this.f160250b, o07Var.f160250b) && wj50.m88271j(this.f160251c, o07Var.f160251c) && this.f160252d == o07Var.f160252d && wj50.m88271j(this.f160253e, o07Var.f160253e) && wj50.m88271j(this.f160254f, o07Var.f160254f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f160249a.hashCode() * 31, 31, this.f160250b);
        String str = this.f160251c;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f160252d);
        Integer num = this.f160253e;
        int iHashCode = (iM77245d + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f160254f;
        return Boolean.hashCode(true) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
