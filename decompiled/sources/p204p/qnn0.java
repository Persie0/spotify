package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qnn0 {

    /* JADX INFO: renamed from: a */
    public final String f190652a;

    /* JADX INFO: renamed from: b */
    public final boolean f190653b;

    /* JADX INFO: renamed from: c */
    public final String f190654c;

    public qnn0(String str, String str2, boolean z) {
        this.f190652a = str;
        this.f190653b = z;
        this.f190654c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnn0)) {
            return false;
        }
        qnn0 qnn0Var = (qnn0) obj;
        return wj50.m88271j(this.f190652a, qnn0Var.f190652a) && this.f190653b == qnn0Var.f190653b && wj50.m88271j(this.f190654c, qnn0Var.f190654c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f190652a.hashCode() * 31, 31, this.f190653b);
        String str = this.f190654c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
