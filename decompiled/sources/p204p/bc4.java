package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class bc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f25771a;

    /* JADX INFO: renamed from: b */
    public final bji f25772b;

    /* JADX INFO: renamed from: c */
    public final wg61 f25773c = new wg61(new sb4(this, 8));

    public bc4(boolean z, bji bjiVar) {
        this.f25771a = z;
        this.f25772b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28671a() {
        bc4 bc4Var = (bc4) this.f25773c.getValue();
        return bc4Var != null ? bc4Var.m28671a() : this.f25771a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("skip_to_next_chapter_enabled", "android-libs-nowplaying-elements-skiptonextchapter", m28671a()));
    }
}
