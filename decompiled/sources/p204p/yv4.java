package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class yv4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f276563a;

    /* JADX INFO: renamed from: b */
    public final bji f276564b;

    /* JADX INFO: renamed from: c */
    public final wg61 f276565c = new wg61(new uu4(this, 14));

    public yv4(boolean z, bji bjiVar) {
        this.f276563a = z;
        this.f276564b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94675a() {
        yv4 yv4Var = (yv4) this.f276565c.getValue();
        return yv4Var != null ? yv4Var.m94675a() : this.f276563a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_add_to_playlist_for_albums", "android-yourlibrary-contextmenuusecases", m94675a()));
    }
}
