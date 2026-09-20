package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xfc {

    /* JADX INFO: renamed from: a */
    public final String f260893a;

    /* JADX INFO: renamed from: b */
    public final String f260894b;

    /* JADX INFO: renamed from: c */
    public final int f260895c;

    public xfc(String str, String str2, int i) {
        this.f260893a = str;
        this.f260894b = str2;
        this.f260895c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfc)) {
            return false;
        }
        xfc xfcVar = (xfc) obj;
        return wj50.m88271j(this.f260893a, xfcVar.f260893a) && wj50.m88271j(this.f260894b, xfcVar.f260894b) && this.f260895c == xfcVar.f260895c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f260895c) + s571.m77243b(this.f260893a.hashCode() * 31, 31, this.f260894b);
    }
}
