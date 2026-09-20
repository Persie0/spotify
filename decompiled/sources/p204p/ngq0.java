package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ngq0 {

    /* JADX INFO: renamed from: a */
    public final String f153781a;

    /* JADX INFO: renamed from: b */
    public final Long f153782b;

    public ngq0(Long l, String str) {
        this.f153781a = str;
        this.f153782b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngq0)) {
            return false;
        }
        ngq0 ngq0Var = (ngq0) obj;
        return wj50.m88271j(this.f153781a, ngq0Var.f153781a) && wj50.m88271j(this.f153782b, ngq0Var.f153782b);
    }

    public final int hashCode() {
        int iHashCode = this.f153781a.hashCode() * 31;
        Long l = this.f153782b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f153781a + ", value=" + this.f153782b + ')';
    }
}
