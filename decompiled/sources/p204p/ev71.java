package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ev71 extends gv71 {

    /* JADX INFO: renamed from: a */
    public final long f63175a;

    /* JADX INFO: renamed from: b */
    public final int f63176b;

    public ev71(int i, long j) {
        this.f63175a = j;
        this.f63176b = i;
    }

    @Override // p204p.gv71
    /* JADX INFO: renamed from: a */
    public final long mo40100a() {
        return this.f63175a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev71)) {
            return false;
        }
        ev71 ev71Var = (ev71) obj;
        return this.f63175a == ev71Var.f63175a && this.f63176b == ev71Var.f63176b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f63176b) + (Long.hashCode(this.f63175a) * 31);
    }
}
