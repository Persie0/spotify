package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ti4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f220547a;

    /* JADX INFO: renamed from: b */
    public final bji f220548b;

    /* JADX INFO: renamed from: c */
    public final wg61 f220549c = new wg61(new si4(this, 0));

    public ti4(boolean z, bji bjiVar) {
        this.f220547a = z;
        this.f220548b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80899a() {
        ti4 ti4Var = (ti4) this.f220549c.getValue();
        return ti4Var != null ? ti4Var.m80899a() : this.f220547a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("initially_hide_overlay_in_auto_hide_mode", "android-nowplaying-connectables", m80899a()));
    }
}
