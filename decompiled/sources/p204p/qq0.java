package p204p;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class qq0 {
    public static final pq0 Companion = new pq0();

    /* JADX INFO: renamed from: a */
    public final Integer f191405a;

    /* JADX INFO: renamed from: b */
    public final Integer f191406b;

    /* JADX INFO: renamed from: c */
    public final String f191407c;

    /* JADX INFO: renamed from: d */
    public final String f191408d;

    public /* synthetic */ qq0(int i, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f191405a = null;
        } else {
            this.f191405a = num;
        }
        if ((i & 2) == 0) {
            this.f191406b = null;
        } else {
            this.f191406b = num2;
        }
        if ((i & 4) == 0) {
            this.f191407c = null;
        } else {
            this.f191407c = str;
        }
        if ((i & 8) == 0) {
            this.f191408d = null;
        } else {
            this.f191408d = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m73463a() {
        return this.f191408d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq0)) {
            return false;
        }
        qq0 qq0Var = (qq0) obj;
        return wj50.m88271j(this.f191405a, qq0Var.f191405a) && wj50.m88271j(this.f191406b, qq0Var.f191406b) && wj50.m88271j(this.f191407c, qq0Var.f191407c) && wj50.m88271j(this.f191408d, qq0Var.f191408d);
    }

    public final int hashCode() {
        Integer num = this.f191405a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f191406b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f191407c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f191408d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
