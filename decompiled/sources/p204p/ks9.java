package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ks9 {

    /* JADX INFO: renamed from: a */
    public final String f125888a;

    /* JADX INFO: renamed from: b */
    public final String f125889b;

    /* JADX INFO: renamed from: c */
    public final Integer f125890c;

    public ks9(Integer num, String str, String str2) {
        this.f125888a = str;
        this.f125889b = str2;
        this.f125890c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks9)) {
            return false;
        }
        ks9 ks9Var = (ks9) obj;
        return wj50.m88271j(this.f125888a, ks9Var.f125888a) && wj50.m88271j(this.f125889b, ks9Var.f125889b) && wj50.m88271j(this.f125890c, ks9Var.f125890c);
    }

    public final int hashCode() {
        String str = this.f125888a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f125889b);
        Integer num = this.f125890c;
        return iM77243b + (num != null ? num.hashCode() : 0);
    }
}
