package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class lzn0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f138395a;

    /* JADX INFO: renamed from: b */
    public final bji f138396b;

    /* JADX INFO: renamed from: c */
    public final wg61 f138397c;

    public lzn0(boolean z, bji bjiVar) {
        this.f138395a = z;
        this.f138396b = bjiVar;
        this.f138397c = new wg61(new pgm0(this, 13));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m60391a() {
        lzn0 lzn0Var = (lzn0) this.f138397c.getValue();
        return lzn0Var != null ? lzn0Var.m60391a() : this.f138395a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("should_show_pigeon_upsell", "pigeon-upsell", m60391a()));
    }

    public lzn0(bji bjiVar) {
        this(false, bjiVar);
    }
}
