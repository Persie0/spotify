package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wdz0 implements xdz0 {

    /* JADX INFO: renamed from: a */
    public final Integer f250388a;

    /* JADX INFO: renamed from: b */
    public final String f250389b;

    /* JADX INFO: renamed from: c */
    public final int f250390c;

    public wdz0(int i, Integer num, String str) {
        this.f250388a = num;
        this.f250389b = str;
        this.f250390c = i;
    }

    @Override // p204p.xdz0
    /* JADX INFO: renamed from: a */
    public final String mo85272a() {
        return this.f250389b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdz0)) {
            return false;
        }
        wdz0 wdz0Var = (wdz0) obj;
        return wj50.m88271j(this.f250388a, wdz0Var.f250388a) && wj50.m88271j(this.f250389b, wdz0Var.f250389b) && this.f250390c == wdz0Var.f250390c;
    }

    public final int hashCode() {
        Integer num = this.f250388a;
        return edb.m38547C(this.f250390c) + s571.m77243b((num == null ? 0 : num.hashCode()) * 31, 31, this.f250389b);
    }
}
