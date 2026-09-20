package p204p;

/* JADX INFO: loaded from: classes11.dex */
@rtz0
public final class jr7 {
    public static final ir7 Companion = new ir7();

    /* JADX INFO: renamed from: a */
    public final String f115100a;

    /* JADX INFO: renamed from: b */
    public final String f115101b;

    /* JADX INFO: renamed from: c */
    public final String f115102c;

    /* JADX INFO: renamed from: d */
    public final String f115103d;

    public /* synthetic */ jr7(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, hr7.f94370a.getDescriptor());
            throw null;
        }
        this.f115100a = str;
        this.f115101b = str2;
        this.f115102c = str3;
        if ((i & 8) == 0) {
            this.f115103d = "wearables_secure_data_layer";
        } else {
            this.f115103d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr7)) {
            return false;
        }
        jr7 jr7Var = (jr7) obj;
        return wj50.m88271j(this.f115100a, jr7Var.f115100a) && wj50.m88271j(this.f115101b, jr7Var.f115101b) && wj50.m88271j(this.f115102c, jr7Var.f115102c) && wj50.m88271j(this.f115103d, jr7Var.f115103d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f115100a.hashCode() * 31, 31, this.f115101b);
        String str = this.f115102c;
        return this.f115103d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public jr7(String str, String str2, String str3) {
        this.f115100a = str;
        this.f115101b = str2;
        this.f115102c = str3;
        this.f115103d = "wearables_secure_data_layer";
    }
}
