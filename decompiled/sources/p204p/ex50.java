package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ex50 {

    /* JADX INFO: renamed from: a */
    public final int f63671a;

    /* JADX INFO: renamed from: b */
    public final String f63672b;

    /* JADX INFO: renamed from: c */
    public final String f63673c;

    public ex50(int i, String str, String str2) {
        this.f63671a = i;
        this.f63672b = str;
        this.f63673c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex50)) {
            return false;
        }
        ex50 ex50Var = (ex50) obj;
        return this.f63671a == ex50Var.f63671a && this.f63672b.equals(ex50Var.f63672b) && wj50.m88271j(this.f63673c, ex50Var.f63673c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(edb.m38547C(this.f63671a) * 31, 31, this.f63672b);
        String str = this.f63673c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
