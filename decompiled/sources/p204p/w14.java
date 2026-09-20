package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w14 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f246938a;

    /* JADX INFO: renamed from: b */
    public final boolean f246939b;

    /* JADX INFO: renamed from: c */
    public final bji f246940c;

    /* JADX INFO: renamed from: d */
    public final wg61 f246941d = new wg61(new u14(this, 1));

    public w14(boolean z, boolean z2, bji bjiVar) {
        this.f246938a = z;
        this.f246939b = z2;
        this.f246940c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86974a() {
        w14 w14Var = (w14) this.f246941d.getValue();
        return w14Var != null ? w14Var.m86974a() : this.f246938a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m86975b() {
        w14 w14Var = (w14) this.f246941d.getValue();
        return w14Var != null ? w14Var.m86975b() : this.f246939b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_suggestion_framework", "android-device-predictability-lifecycle", m86974a()), new k8a("enable_suggestion_lifecycle_logging", "android-device-predictability-lifecycle", m86975b()));
    }
}
