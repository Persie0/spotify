package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ybu {

    /* JADX INFO: renamed from: a */
    public final String f271245a;

    /* JADX INFO: renamed from: b */
    public final String f271246b;

    /* JADX INFO: renamed from: c */
    public final int f271247c;

    public ybu(String str, String str2, int i) {
        this.f271245a = str;
        this.f271246b = str2;
        this.f271247c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybu)) {
            return false;
        }
        ybu ybuVar = (ybu) obj;
        return wj50.m88271j(this.f271245a, ybuVar.f271245a) && wj50.m88271j(this.f271246b, ybuVar.f271246b) && this.f271247c == ybuVar.f271247c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f271247c) + s571.m77243b(this.f271245a.hashCode() * 31, 31, this.f271246b);
    }
}
