package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zcu {

    /* JADX INFO: renamed from: a */
    public final String f281571a;

    /* JADX INFO: renamed from: b */
    public final String f281572b;

    /* JADX INFO: renamed from: c */
    public final String f281573c;

    /* JADX INFO: renamed from: d */
    public final boolean f281574d;

    public zcu(String str, String str2, String str3, boolean z) {
        this.f281571a = str;
        this.f281572b = str2;
        this.f281573c = str3;
        this.f281574d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcu)) {
            return false;
        }
        zcu zcuVar = (zcu) obj;
        return this.f281571a.equals(zcuVar.f281571a) && this.f281572b.equals(zcuVar.f281572b) && this.f281573c.equals(zcuVar.f281573c) && this.f281574d == zcuVar.f281574d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281574d) + s571.m77243b(s571.m77243b(this.f281571a.hashCode() * 31, 31, this.f281572b), 31, this.f281573c);
    }
}
