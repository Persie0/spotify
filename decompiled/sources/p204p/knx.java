package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class knx {

    /* JADX INFO: renamed from: a */
    public final String f124481a;

    /* JADX INFO: renamed from: b */
    public final int f124482b;

    public knx(String str, int i) {
        this.f124481a = str;
        this.f124482b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knx)) {
            return false;
        }
        knx knxVar = (knx) obj;
        return this.f124481a.equals(knxVar.f124481a) && this.f124482b == knxVar.f124482b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f124482b) + (this.f124481a.hashCode() * 31);
    }
}
