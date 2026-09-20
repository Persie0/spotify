package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o340 {

    /* JADX INFO: renamed from: a */
    public final String f161279a;

    /* JADX INFO: renamed from: b */
    public final int f161280b;

    /* JADX INFO: renamed from: c */
    public final int f161281c;

    public o340(String str, int i, int i2) {
        this.f161279a = str;
        this.f161280b = i;
        this.f161281c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m66181a() {
        return this.f161281c;
    }

    /* JADX INFO: renamed from: b */
    public final int m66182b() {
        return this.f161280b;
    }

    /* JADX INFO: renamed from: c */
    public final String m66183c() {
        return this.f161279a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o340)) {
            return false;
        }
        o340 o340Var = (o340) obj;
        return wj50.m88271j(this.f161279a, o340Var.f161279a) && this.f161280b == o340Var.f161280b && this.f161281c == o340Var.f161281c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f161281c) + mt60.m62800g(this.f161280b, this.f161279a.hashCode() * 31, 31);
    }
}
