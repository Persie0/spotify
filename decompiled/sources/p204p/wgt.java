package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wgt extends w1h1 {

    /* JADX INFO: renamed from: b */
    public final String f251142b;

    /* JADX INFO: renamed from: c */
    public final String f251143c;

    /* JADX INFO: renamed from: d */
    public final sab0 f251144d;

    /* JADX INFO: renamed from: e */
    public final int f251145e;

    public wgt(String str, String str2, sab0 sab0Var, int i) {
        this.f251142b = str;
        this.f251143c = str2;
        this.f251144d = sab0Var;
        this.f251145e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgt)) {
            return false;
        }
        wgt wgtVar = (wgt) obj;
        return wj50.m88271j(this.f251142b, wgtVar.f251142b) && this.f251143c.equals(wgtVar.f251143c) && wj50.m88271j(this.f251144d, wgtVar.f251144d) && this.f251145e == wgtVar.f251145e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f251145e) + ((this.f251144d.hashCode() + s571.m77243b(this.f251142b.hashCode() * 31, 31, this.f251143c)) * 31);
    }
}
