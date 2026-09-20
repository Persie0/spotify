package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f281450a;

    /* JADX INFO: renamed from: b */
    public final bji f281451b;

    /* JADX INFO: renamed from: c */
    public final wg61 f281452c;

    public zc4(boolean z, bji bjiVar) {
        this.f281450a = z;
        this.f281451b = bjiVar;
        this.f281452c = new wg61(new sb4(this, 28));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95897a() {
        zc4 zc4Var = (zc4) this.f281452c.getValue();
        return zc4Var != null ? zc4Var.m95897a() : this.f281450a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_vocal_removal", "android-libs-singalong", m95897a()));
    }

    public zc4(bji bjiVar) {
        this(false, bjiVar);
    }
}
