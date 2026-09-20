package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eje1 implements jje1 {

    /* JADX INFO: renamed from: a */
    public final String f60213a;

    /* JADX INFO: renamed from: b */
    public final String f60214b;

    /* JADX INFO: renamed from: c */
    public final Integer f60215c;

    public eje1(Integer num, String str, String str2) {
        this.f60213a = str;
        this.f60214b = str2;
        this.f60215c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eje1)) {
            return false;
        }
        eje1 eje1Var = (eje1) obj;
        return wj50.m88271j(this.f60213a, eje1Var.f60213a) && wj50.m88271j(this.f60214b, eje1Var.f60214b) && wj50.m88271j(this.f60215c, eje1Var.f60215c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f60213a.hashCode() * 31, 31, this.f60214b);
        Integer num = this.f60215c;
        return iM77243b + (num == null ? 0 : num.hashCode());
    }
}
