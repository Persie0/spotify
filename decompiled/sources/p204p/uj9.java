package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uj9 {

    /* JADX INFO: renamed from: a */
    public final String f230942a;

    /* JADX INFO: renamed from: b */
    public final String f230943b;

    /* JADX INFO: renamed from: c */
    public final String f230944c;

    public uj9(String str, String str2, String str3) {
        this.f230942a = str;
        this.f230943b = str2;
        this.f230944c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj9)) {
            return false;
        }
        uj9 uj9Var = (uj9) obj;
        return wj50.m88271j(this.f230942a, uj9Var.f230942a) && wj50.m88271j(this.f230943b, uj9Var.f230943b) && wj50.m88271j(this.f230944c, uj9Var.f230944c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f230942a.hashCode() * 31, 31, this.f230943b);
        String str = this.f230944c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
