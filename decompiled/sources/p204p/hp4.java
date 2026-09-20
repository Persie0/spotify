package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class hp4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f93693a;

    /* JADX INFO: renamed from: b */
    public final fnk0 f93694b;

    /* JADX INFO: renamed from: c */
    public final bji f93695c;

    /* JADX INFO: renamed from: d */
    public final wg61 f93696d;

    /* JADX INFO: renamed from: e */
    public final wg61 f93697e;

    public hp4(boolean z, fnk0 fnk0Var, bji bjiVar) {
        this.f93693a = z;
        this.f93694b = fnk0Var;
        this.f93695c = bjiVar;
        this.f93696d = new wg61(new gp4(this, 1));
        this.f93697e = new wg61(new gp4(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m48123a() {
        hp4 hp4Var = (hp4) this.f93697e.getValue();
        return hp4Var != null ? hp4Var.m48123a() : this.f93693a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("settings_item_visible", "android-shuffle-settings-algorithm", m48123a()));
    }

    public hp4(fnk0 fnk0Var, bji bjiVar) {
        this(false, fnk0Var, bjiVar);
    }
}
