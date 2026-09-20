package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class x24 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f257351a;

    /* JADX INFO: renamed from: b */
    public final bji f257352b;

    /* JADX INFO: renamed from: c */
    public final wg61 f257353c;

    public x24(boolean z, bji bjiVar) {
        this.f257351a = z;
        this.f257352b = bjiVar;
        this.f257353c = new wg61(new u14(this, 10));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89705a() {
        x24 x24Var = (x24) this.f257353c.getValue();
        return x24Var != null ? x24Var.m89705a() : this.f257351a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("editor_profile_enabled", "android-editorprofile-remoteconfiguration", m89705a()));
    }

    public x24(bji bjiVar) {
        this(false, bjiVar);
    }
}
