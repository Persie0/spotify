package p204p;

import android.os.Trace;
import androidx.media3.exoplayer.video.C0068b;

/* JADX INFO: loaded from: classes3.dex */
public final class bbd0 implements h9c1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qad0 f25536a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f25537b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0068b f25538c;

    public bbd0(C0068b c0068b, qad0 qad0Var, int i, long j) {
        this.f25538c = c0068b;
        this.f25536a = qad0Var;
        this.f25537b = i;
    }

    @Override // p204p.h9c1
    /* JADX INFO: renamed from: a */
    public final void mo28631a(long j) {
        this.f25538c.m829d1(this.f25536a, this.f25537b, j);
    }

    @Override // p204p.h9c1
    /* JADX INFO: renamed from: b */
    public final void mo28632b() {
        Trace.beginSection("dropVideoBuffer");
        this.f25536a.mo28890k(this.f25537b);
        Trace.endSection();
        this.f25538c.m840j1(0, 1);
    }
}
