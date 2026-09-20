package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oxq0 {

    /* JADX INFO: renamed from: a */
    public final String f171490a;

    /* JADX INFO: renamed from: b */
    public final String f171491b;

    /* JADX INFO: renamed from: c */
    public final String f171492c;

    /* JADX INFO: renamed from: d */
    public final usb1 f171493d;

    /* JADX INFO: renamed from: e */
    public final boolean f171494e;

    /* JADX INFO: renamed from: f */
    public final qsj f171495f;

    public oxq0(String str, String str2, String str3, usb1 usb1Var, boolean z, qsj qsjVar) {
        this.f171490a = str;
        this.f171491b = str2;
        this.f171492c = str3;
        this.f171493d = usb1Var;
        this.f171494e = z;
        this.f171495f = qsjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxq0)) {
            return false;
        }
        oxq0 oxq0Var = (oxq0) obj;
        return wj50.m88271j(this.f171490a, oxq0Var.f171490a) && this.f171491b.equals(oxq0Var.f171491b) && wj50.m88271j(this.f171492c, oxq0Var.f171492c) && this.f171493d.equals(oxq0Var.f171493d) && this.f171494e == oxq0Var.f171494e && this.f171495f == oxq0Var.f171495f;
    }

    public final int hashCode() {
        return this.f171495f.hashCode() + s571.m77245d((this.f171493d.hashCode() + s571.m77243b(s571.m77243b(this.f171490a.hashCode() * 29791, 31, this.f171491b), 31, this.f171492c)) * 31, 31, this.f171494e);
    }
}
