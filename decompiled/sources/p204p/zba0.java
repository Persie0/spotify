package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zba0 {

    /* JADX INFO: renamed from: a */
    public final String f281291a;

    /* JADX INFO: renamed from: b */
    public final int f281292b;

    public zba0(String str, int i) {
        this.f281291a = str;
        this.f281292b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zba0)) {
            return false;
        }
        zba0 zba0Var = (zba0) obj;
        return this.f281291a.equals(zba0Var.f281291a) && this.f281292b == zba0Var.f281292b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f281292b) + (this.f281291a.hashCode() * 31);
    }
}
