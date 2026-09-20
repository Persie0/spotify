package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c4e {

    /* JADX INFO: renamed from: a */
    public final int f33928a;

    /* JADX INFO: renamed from: b */
    public final String f33929b;

    /* JADX INFO: renamed from: c */
    public final long f33930c;

    public c4e(long j, int i, String str) {
        this.f33928a = i;
        this.f33929b = str;
        this.f33930c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4e)) {
            return false;
        }
        c4e c4eVar = (c4e) obj;
        return this.f33928a == c4eVar.f33928a && this.f33929b.equals(c4eVar.f33929b) && this.f33930c == c4eVar.f33930c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33930c) + s571.m77243b(edb.m38547C(this.f33928a) * 31, 31, this.f33929b);
    }
}
