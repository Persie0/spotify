package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class soz {

    /* JADX INFO: renamed from: a */
    public final String f212699a;

    /* JADX INFO: renamed from: b */
    public final int f212700b;

    public soz(String str, int i) {
        this.f212699a = str;
        this.f212700b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soz)) {
            return false;
        }
        soz sozVar = (soz) obj;
        return wj50.m88271j(this.f212699a, sozVar.f212699a) && this.f212700b == sozVar.f212700b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f212700b) + (this.f212699a.hashCode() * 31);
    }
}
