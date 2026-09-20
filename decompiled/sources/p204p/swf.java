package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class swf {

    /* JADX INFO: renamed from: a */
    public final u150 f214658a;

    /* JADX INFO: renamed from: b */
    public final String f214659b;

    /* JADX INFO: renamed from: c */
    public final String f214660c;

    /* JADX INFO: renamed from: d */
    public final String f214661d;

    public swf(u150 u150Var, String str, String str2, String str3) {
        this.f214658a = u150Var;
        this.f214659b = str;
        this.f214660c = str2;
        this.f214661d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swf)) {
            return false;
        }
        swf swfVar = (swf) obj;
        return wj50.m88271j(this.f214658a, swfVar.f214658a) && wj50.m88271j(this.f214659b, swfVar.f214659b) && wj50.m88271j(this.f214660c, swfVar.f214660c) && wj50.m88271j(this.f214661d, swfVar.f214661d);
    }

    public final int hashCode() {
        u150 u150Var = this.f214658a;
        int iM77243b = s571.m77243b((u150Var == null ? 0 : u150Var.hashCode()) * 31, 31, this.f214659b);
        String str = this.f214660c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f214661d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ swf(u150 u150Var, String str, String str2, String str3, int i) {
        this(u150Var, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
