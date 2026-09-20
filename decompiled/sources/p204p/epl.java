package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class epl {

    /* JADX INFO: renamed from: a */
    public final String f61669a;

    /* JADX INFO: renamed from: b */
    public final boolean f61670b;

    /* JADX INFO: renamed from: c */
    public final int f61671c;

    public epl(String str, boolean z, int i) {
        this.f61669a = str;
        this.f61670b = z;
        this.f61671c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epl)) {
            return false;
        }
        epl eplVar = (epl) obj;
        return wj50.m88271j(this.f61669a, eplVar.f61669a) && this.f61670b == eplVar.f61670b && this.f61671c == eplVar.f61671c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f61671c) + s571.m77245d(this.f61669a.hashCode() * 31, 31, this.f61670b);
    }
}
