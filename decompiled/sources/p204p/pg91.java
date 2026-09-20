package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pg91 {

    /* JADX INFO: renamed from: a */
    public final boolean f177266a;

    /* JADX INFO: renamed from: b */
    public final Long f177267b;

    /* JADX INFO: renamed from: c */
    public final Integer f177268c;

    /* JADX INFO: renamed from: d */
    public final boolean f177269d;

    public /* synthetic */ pg91() {
        this(null, null, false, false);
    }

    /* JADX INFO: renamed from: a */
    public final Integer m69869a() {
        return this.f177268c;
    }

    /* JADX INFO: renamed from: b */
    public final Long m69870b() {
        return this.f177267b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m69871c() {
        return this.f177266a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m69872d() {
        return this.f177269d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg91)) {
            return false;
        }
        pg91 pg91Var = (pg91) obj;
        return this.f177266a == pg91Var.f177266a && wj50.m88271j(this.f177267b, pg91Var.f177267b) && wj50.m88271j(this.f177268c, pg91Var.f177268c) && this.f177269d == pg91Var.f177269d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f177266a) * 31;
        Long l = this.f177267b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f177268c;
        return Boolean.hashCode(this.f177269d) + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public pg91(Integer num, Long l, boolean z, boolean z2) {
        this.f177266a = z;
        this.f177267b = l;
        this.f177268c = num;
        this.f177269d = z2;
    }
}
