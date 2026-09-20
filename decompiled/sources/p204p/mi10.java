package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mi10 extends pi10 {

    /* JADX INFO: renamed from: a */
    public final String f143906a;

    /* JADX INFO: renamed from: b */
    public final String f143907b;

    /* JADX INFO: renamed from: c */
    public final int f143908c;

    public mi10(String str, String str2, int i) {
        this.f143906a = str;
        this.f143907b = str2;
        this.f143908c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi10)) {
            return false;
        }
        mi10 mi10Var = (mi10) obj;
        return wj50.m88271j(this.f143906a, mi10Var.f143906a) && wj50.m88271j(this.f143907b, mi10Var.f143907b) && this.f143908c == mi10Var.f143908c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f143908c) + s571.m77243b(this.f143906a.hashCode() * 31, 31, this.f143907b);
    }
}
