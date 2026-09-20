package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gha {

    /* JADX INFO: renamed from: a */
    public long f79860a;

    /* JADX INFO: renamed from: b */
    public long f79861b;

    public /* synthetic */ gha(long j, long j2) {
        this.f79860a = j;
        this.f79861b = j2;
    }

    /* JADX INFO: renamed from: a */
    public long m44725a() {
        return this.f79860a - (System.currentTimeMillis() - this.f79861b);
    }

    public gha() {
        this.f79860a = -9223372036854775807L;
        this.f79861b = -9223372036854775807L;
    }

    public gha(int i, long j, long j2) {
        this.f79860a = j;
        this.f79861b = j2;
    }
}
