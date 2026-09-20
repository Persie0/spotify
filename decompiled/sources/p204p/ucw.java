package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ucw implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f229120a;

    /* JADX INFO: renamed from: b */
    public final boolean f229121b;

    /* JADX INFO: renamed from: c */
    public final bji f229122c;

    /* JADX INFO: renamed from: d */
    public final wg61 f229123d = new wg61(new zyv(this, 7));

    public ucw(boolean z, boolean z2, bji bjiVar) {
        this.f229120a = z;
        this.f229121b = z2;
        this.f229122c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82791a() {
        ucw ucwVar = (ucw) this.f229123d.getValue();
        return ucwVar != null ? ucwVar.m82791a() : this.f229120a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m82792b() {
        ucw ucwVar = (ucw) this.f229123d.getValue();
        return ucwVar != null ? ucwVar.m82792b() : this.f229121b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("always_use_equalizer", "equalizer", m82791a()), new k8a("enable_equalizer", "equalizer", m82792b()));
    }
}
