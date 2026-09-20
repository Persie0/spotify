package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zb31 {

    /* JADX INFO: renamed from: a */
    public final String f281227a;

    /* JADX INFO: renamed from: b */
    public final String f281228b;

    /* JADX INFO: renamed from: c */
    public final boolean f281229c;

    public zb31(String str, String str2, boolean z) {
        this.f281227a = str;
        this.f281228b = str2;
        this.f281229c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb31)) {
            return false;
        }
        zb31 zb31Var = (zb31) obj;
        return wj50.m88271j(this.f281227a, zb31Var.f281227a) && wj50.m88271j(this.f281228b, zb31Var.f281228b) && this.f281229c == zb31Var.f281229c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281229c) + s571.m77243b(this.f281227a.hashCode() * 31, 31, this.f281228b);
    }
}
