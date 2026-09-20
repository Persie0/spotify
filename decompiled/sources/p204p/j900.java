package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j900 extends i900 {

    /* JADX INFO: renamed from: e */
    public long f110069e;

    public j900(ArrayList arrayList) {
        super(arrayList);
        this.f110069e = 0L;
    }

    @Override // p204p.i900
    public boolean equals(Object obj) {
        return (obj instanceof j900) && super.equals(obj) && this.f110069e == ((j900) obj).f110069e;
    }

    @Override // p204p.i900
    public int hashCode() {
        return Long.hashCode(this.f110069e) + (super.hashCode() * 31);
    }

    @Override // p204p.i900
    public String toString() {
        return "FrameData(frameStartNanos=" + this.f99883b + ", frameDurationUiNanos=" + this.f99884c + ", frameDurationCpuNanos=" + this.f110069e + ", isJank=" + this.f99885d + ", states=" + this.f99882a + ')';
    }
}
