package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class id4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f100933a;

    /* JADX INFO: renamed from: b */
    public final boolean f100934b;

    /* JADX INFO: renamed from: c */
    public final bji f100935c;

    /* JADX INFO: renamed from: d */
    public final wg61 f100936d = new wg61(new dd4(this, 3));

    public id4(int i, bji bjiVar, boolean z) {
        this.f100933a = i;
        this.f100934b = z;
        this.f100935c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m50272a() {
        id4 id4Var = (id4) this.f100936d.getValue();
        return id4Var != null ? id4Var.m50272a() : this.f100933a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m50273b() {
        id4 id4Var = (id4) this.f100936d.getValue();
        return id4Var != null ? id4Var.m50273b() : this.f100934b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("initial_timeout_milliseconds", "android-list-entity-music-page", m50272a(), 1000, 120000), new k8a("use_show_condition_for_rows", "android-list-entity-music-page", m50273b()));
    }
}
