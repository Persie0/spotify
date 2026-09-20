package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class vw00 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f245369a;

    /* JADX INFO: renamed from: b */
    public final bji f245370b;

    /* JADX INFO: renamed from: c */
    public final wg61 f245371c;

    public vw00(boolean z, bji bjiVar) {
        this.f245369a = z;
        this.f245370b = bjiVar;
        this.f245371c = new wg61(new nry(this, 15));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86527a() {
        vw00 vw00Var = (vw00) this.f245371c.getValue();
        return vw00Var != null ? vw00Var.m86527a() : this.f245369a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("parent_initiated_link_enabled", "gen-alpha-account-creation", m86527a()));
    }

    public vw00(bji bjiVar) {
        this(false, bjiVar);
    }
}
