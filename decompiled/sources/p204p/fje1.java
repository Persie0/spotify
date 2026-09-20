package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fje1 implements jje1 {

    /* JADX INFO: renamed from: a */
    public final String f70208a;

    /* JADX INFO: renamed from: b */
    public final String f70209b;

    /* JADX INFO: renamed from: c */
    public final Integer f70210c;

    public fje1(Integer num, String str, String str2) {
        this.f70208a = str;
        this.f70209b = str2;
        this.f70210c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fje1)) {
            return false;
        }
        fje1 fje1Var = (fje1) obj;
        return wj50.m88271j(this.f70208a, fje1Var.f70208a) && wj50.m88271j(this.f70209b, fje1Var.f70209b) && wj50.m88271j(this.f70210c, fje1Var.f70210c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f70208a.hashCode() * 31, 31, this.f70209b);
        Integer num = this.f70210c;
        return iM77243b + (num == null ? 0 : num.hashCode());
    }
}
