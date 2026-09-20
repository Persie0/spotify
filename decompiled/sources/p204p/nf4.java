package p204p;

import com.comscore.util.log.LogLevel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f153236a;

    /* JADX INFO: renamed from: b */
    public final boolean f153237b;

    /* JADX INFO: renamed from: c */
    public final boolean f153238c;

    /* JADX INFO: renamed from: d */
    public final bji f153239d;

    /* JADX INFO: renamed from: e */
    public final wg61 f153240e = new wg61(new ne4(this, 21));

    public nf4(int i, bji bjiVar, boolean z, boolean z2) {
        this.f153236a = i;
        this.f153237b = z;
        this.f153238c = z2;
        this.f153239d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m64316a() {
        nf4 nf4Var = (nf4) this.f153240e.getValue();
        return nf4Var != null ? nf4Var.m64316a() : this.f153236a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m64317b() {
        nf4 nf4Var = (nf4) this.f153240e.getValue();
        return nf4Var != null ? nf4Var.m64317b() : this.f153237b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m64318c() {
        nf4 nf4Var = (nf4) this.f153240e.getValue();
        return nf4Var != null ? nf4Var.m64318c() : this.f153238c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("download_delay_ms", "android-lyrics-offline-impl", m64316a(), 0, LogLevel.NONE), new k8a("lyrics_offline_enabled", "android-lyrics-offline-impl", m64317b()), new k8a("suppress_download_error_retry", "android-lyrics-offline-impl", m64318c()));
    }
}
