package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sec0 {

    /* JADX INFO: renamed from: a */
    public final String f208271a;

    /* JADX INFO: renamed from: b */
    public final String f208272b;

    /* JADX INFO: renamed from: c */
    public final String f208273c;

    public sec0(String str, String str2, String str3) {
        this.f208271a = str;
        this.f208272b = str2;
        this.f208273c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sec0)) {
            return false;
        }
        sec0 sec0Var = (sec0) obj;
        return wj50.m88271j(this.f208271a, sec0Var.f208271a) && wj50.m88271j(this.f208272b, sec0Var.f208272b) && wj50.m88271j(this.f208273c, sec0Var.f208273c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f208271a.hashCode() * 31, 31, this.f208272b);
        String str = this.f208273c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
