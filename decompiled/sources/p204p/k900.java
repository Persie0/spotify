package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class k900 extends j900 {

    /* JADX INFO: renamed from: f */
    public long f120500f;

    @Override // p204p.j900, p204p.i900
    public final boolean equals(Object obj) {
        return (obj instanceof k900) && super.equals(obj) && this.f120500f == ((k900) obj).f120500f;
    }

    @Override // p204p.j900, p204p.i900
    public final int hashCode() {
        return Long.hashCode(this.f120500f) + (super.hashCode() * 31);
    }

    @Override // p204p.j900, p204p.i900
    public final String toString() {
        return "FrameData(frameStartNanos=" + this.f99883b + ", frameDurationUiNanos=" + this.f99884c + ", frameDurationCpuNanos=" + this.f110069e + ", frameOverrunNanos=" + this.f120500f + ", isJank=" + this.f99885d + ", states=" + this.f99882a + ')';
    }
}
