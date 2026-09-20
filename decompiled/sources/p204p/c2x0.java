package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c2x0 extends j2x0 {

    /* JADX INFO: renamed from: a */
    public final String f33483a;

    public c2x0(String str) {
        this.f33483a = str;
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: a */
    public final String mo27976a() {
        return "forbidden";
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: b */
    public final String mo27977b() {
        return this.f33483a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2x0) && wj50.m88271j(this.f33483a, ((c2x0) obj).f33483a);
    }

    public final int hashCode() {
        return this.f33483a.hashCode();
    }
}
