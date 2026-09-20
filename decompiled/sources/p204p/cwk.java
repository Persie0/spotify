package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cwk implements dwk {

    /* JADX INFO: renamed from: a */
    public final long f42778a;

    /* JADX INFO: renamed from: b */
    public final String f42779b;

    /* JADX INFO: renamed from: c */
    public final boolean f42780c;

    public cwk(long j, String str, boolean z) {
        this.f42778a = j;
        this.f42779b = str;
        this.f42780c = z;
    }

    @Override // p204p.dwk
    /* JADX INFO: renamed from: a */
    public final long mo30691a() {
        return this.f42778a;
    }

    @Override // p204p.dwk
    /* JADX INFO: renamed from: b */
    public final boolean mo30692b() {
        return this.f42780c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwk)) {
            return false;
        }
        cwk cwkVar = (cwk) obj;
        return this.f42778a == cwkVar.f42778a && this.f42779b.equals(cwkVar.f42779b) && this.f42780c == cwkVar.f42780c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42780c) + s571.m77243b(Long.hashCode(this.f42778a) * 31, 961, this.f42779b);
    }
}
