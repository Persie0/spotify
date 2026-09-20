package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b0r0 {

    /* JADX INFO: renamed from: a */
    public final String f22087a;

    /* JADX INFO: renamed from: b */
    public final boolean f22088b;

    /* JADX INFO: renamed from: c */
    public final boolean f22089c;

    public /* synthetic */ b0r0(String str, int i) {
        this((i & 1) != 0 ? null : str, false, false);
    }

    /* JADX INFO: renamed from: a */
    public static b0r0 m27853a(b0r0 b0r0Var, boolean z, boolean z2, int i) {
        String str = b0r0Var.f22087a;
        if ((i & 2) != 0) {
            z = b0r0Var.f22088b;
        }
        b0r0Var.getClass();
        return new b0r0(str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0r0)) {
            return false;
        }
        b0r0 b0r0Var = (b0r0) obj;
        return wj50.m88271j(this.f22087a, b0r0Var.f22087a) && this.f22088b == b0r0Var.f22088b && this.f22089c == b0r0Var.f22089c;
    }

    public final int hashCode() {
        String str = this.f22087a;
        return Boolean.hashCode(this.f22089c) + s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f22088b);
    }

    public b0r0(String str, boolean z, boolean z2) {
        this.f22087a = str;
        this.f22088b = z;
        this.f22089c = z2;
    }
}
