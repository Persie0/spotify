package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ar7 implements er7 {

    /* JADX INFO: renamed from: a */
    public final String f18966a;

    /* JADX INFO: renamed from: b */
    public final String f18967b;

    /* JADX INFO: renamed from: c */
    public final String f18968c;

    public ar7(String str, String str2, String str3) {
        this.f18966a = str;
        this.f18967b = str2;
        this.f18968c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar7)) {
            return false;
        }
        ar7 ar7Var = (ar7) obj;
        return wj50.m88271j(this.f18966a, ar7Var.f18966a) && wj50.m88271j(this.f18967b, ar7Var.f18967b) && wj50.m88271j(this.f18968c, ar7Var.f18968c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f18966a.hashCode() * 31, 31, this.f18967b);
        String str = this.f18968c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
