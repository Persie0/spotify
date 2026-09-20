package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f181319a;

    /* JADX INFO: renamed from: b */
    public final bji f181320b;

    /* JADX INFO: renamed from: c */
    public final wg61 f181321c = new wg61(new ju3(this, 5));

    public pu3(boolean z, bji bjiVar) {
        this.f181319a = z;
        this.f181320b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m71057a() {
        pu3 pu3Var = (pu3) this.f181321c.getValue();
        return pu3Var != null ? pu3Var.m71057a() : this.f181319a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("header_progress_bar_enabled", "android-album-albumpage", m71057a()));
    }
}
