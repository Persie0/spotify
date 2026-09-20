package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hip0 implements iip0 {

    /* JADX INFO: renamed from: a */
    public final String f91855a;

    /* JADX INFO: renamed from: b */
    public final String f91856b;

    /* JADX INFO: renamed from: c */
    public final String f91857c;

    public hip0(String str, String str2, String str3) {
        this.f91855a = str;
        this.f91856b = str2;
        this.f91857c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hip0)) {
            return false;
        }
        hip0 hip0Var = (hip0) obj;
        return wj50.m88271j(this.f91855a, hip0Var.f91855a) && wj50.m88271j(this.f91856b, hip0Var.f91856b) && wj50.m88271j(this.f91857c, hip0Var.f91857c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f91855a.hashCode() * 31, 31, this.f91856b);
        String str = this.f91857c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
