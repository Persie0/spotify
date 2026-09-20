package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final class ux20 {

    /* JADX INFO: renamed from: a */
    public final long f234809a;

    /* JADX INFO: renamed from: b */
    public final long f234810b;

    /* JADX INFO: renamed from: c */
    public final float f234811c;

    /* JADX INFO: renamed from: d */
    public final long f234812d;

    /* JADX INFO: renamed from: e */
    public final long f234813e;

    public ux20(float f, long j, long j2, long j3, long j4) {
        this.f234809a = j;
        this.f234810b = j2;
        this.f234811c = f;
        this.f234812d = j3;
        this.f234813e = j4;
    }

    /* JADX INFO: renamed from: a */
    public final long m84124a() {
        return this.f234813e;
    }

    /* JADX INFO: renamed from: b */
    public final long m84125b() {
        return this.f234812d;
    }

    /* JADX INFO: renamed from: c */
    public final long m84126c() {
        return this.f234810b;
    }

    /* JADX INFO: renamed from: d */
    public final float m84127d() {
        return this.f234811c;
    }

    /* JADX INFO: renamed from: e */
    public final long m84128e() {
        return this.f234809a;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f234809a + ", position=" + ((Object) Offset.m259i(this.f234810b)) + ", scaleFactor=" + this.f234811c + ", panOffset=" + ((Object) Offset.m259i(this.f234812d)) + ')';
    }
}
