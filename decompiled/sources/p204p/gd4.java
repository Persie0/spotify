package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f78723a;

    /* JADX INFO: renamed from: b */
    public final bji f78724b;

    /* JADX INFO: renamed from: c */
    public final wg61 f78725c;

    public gd4(boolean z, bji bjiVar) {
        this.f78723a = z;
        this.f78724b = bjiVar;
        this.f78725c = new wg61(new f30(this, 18));
    }

    /* JADX INFO: renamed from: c */
    public static gd4 m44343c(uys0 uys0Var) {
        return new gd4(uys0Var.mo47707c("android-libs-waze:waze_sdk_enabled", true), null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m44344b() {
        gd4 gd4Var = (gd4) this.f78725c.getValue();
        return gd4Var != null ? gd4Var.m44344b() : this.f78723a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m44345d() {
        return m44344b();
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("waze_sdk_enabled", "android-libs-waze", m44344b()));
    }

    public gd4(bji bjiVar) {
        this(true, bjiVar);
    }
}
