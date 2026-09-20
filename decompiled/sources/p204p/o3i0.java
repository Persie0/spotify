package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class o3i0 implements s3i0 {

    /* JADX INFO: renamed from: a */
    public final String f161376a;

    /* JADX INFO: renamed from: b */
    public final String f161377b;

    /* JADX INFO: renamed from: c */
    public final int f161378c;

    public o3i0(String str, String str2, int i) {
        this.f161376a = str;
        this.f161377b = str2;
        this.f161378c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3i0)) {
            return false;
        }
        o3i0 o3i0Var = (o3i0) obj;
        return wj50.m88271j(this.f161376a, o3i0Var.f161376a) && wj50.m88271j(this.f161377b, o3i0Var.f161377b) && this.f161378c == o3i0Var.f161378c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f161378c) + s571.m77243b(this.f161376a.hashCode() * 31, 31, this.f161377b);
    }
}
