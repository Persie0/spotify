package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zzj {

    /* JADX INFO: renamed from: a */
    public final String f288002a;

    /* JADX INFO: renamed from: b */
    public final String f288003b;

    /* JADX INFO: renamed from: c */
    public final String f288004c;

    /* JADX INFO: renamed from: d */
    public final String f288005d;

    /* JADX INFO: renamed from: e */
    public final boolean f288006e;

    public zzj(String str, String str2, String str3, String str4, boolean z) {
        this.f288002a = str;
        this.f288003b = str2;
        this.f288004c = str3;
        this.f288005d = str4;
        this.f288006e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return wj50.m88271j(this.f288002a, zzjVar.f288002a) && wj50.m88271j(this.f288003b, zzjVar.f288003b) && wj50.m88271j(this.f288004c, zzjVar.f288004c) && wj50.m88271j(this.f288005d, zzjVar.f288005d) && this.f288006e == zzjVar.f288006e;
    }

    public final int hashCode() {
        int iHashCode = this.f288002a.hashCode() * 31;
        String str = this.f288003b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f288004c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f288005d;
        return Boolean.hashCode(this.f288006e) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
