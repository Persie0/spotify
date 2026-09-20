package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xll {

    /* JADX INFO: renamed from: a */
    public final String f263162a;

    /* JADX INFO: renamed from: b */
    public final int f263163b;

    public xll(String str, int i) {
        this.f263162a = str;
        this.f263163b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xll)) {
            return false;
        }
        xll xllVar = (xll) obj;
        return wj50.m88271j(this.f263162a, xllVar.f263162a) && this.f263163b == xllVar.f263163b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f263163b) + (this.f263162a.hashCode() * 31);
    }
}
