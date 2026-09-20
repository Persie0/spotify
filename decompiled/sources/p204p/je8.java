package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class je8 extends te8 {

    /* JADX INFO: renamed from: a */
    public final String f111498a;

    /* JADX INFO: renamed from: b */
    public final hg8 f111499b;

    public je8(String str, hg8 hg8Var) {
        this.f111498a = str;
        this.f111499b = hg8Var;
    }

    @Override // p204p.te8
    /* JADX INFO: renamed from: a */
    public final String mo32497a() {
        return this.f111498a;
    }

    /* JADX INFO: renamed from: b */
    public final hg8 m53084b() {
        return this.f111499b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je8)) {
            return false;
        }
        je8 je8Var = (je8) obj;
        return wj50.m88271j(this.f111498a, je8Var.f111498a) && this.f111499b == je8Var.f111499b;
    }

    public final int hashCode() {
        return this.f111499b.hashCode() + (this.f111498a.hashCode() * 31);
    }
}
