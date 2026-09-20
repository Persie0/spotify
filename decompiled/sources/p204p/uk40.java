package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class uk40 implements vk40 {

    /* JADX INFO: renamed from: a */
    public final String f231216a;

    /* JADX INFO: renamed from: b */
    public final String f231217b;

    /* JADX INFO: renamed from: c */
    public final String f231218c;

    public /* synthetic */ uk40(String str, String str2) {
        this(str, str2, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk40)) {
            return false;
        }
        uk40 uk40Var = (uk40) obj;
        return wj50.m88271j(this.f231216a, uk40Var.f231216a) && wj50.m88271j(this.f231217b, uk40Var.f231217b) && wj50.m88271j(this.f231218c, uk40Var.f231218c);
    }

    public final int hashCode() {
        int iHashCode = this.f231216a.hashCode() * 31;
        String str = this.f231217b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f231218c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public uk40(String str, String str2, String str3) {
        this.f231216a = str;
        this.f231217b = str2;
        this.f231218c = str3;
    }
}
