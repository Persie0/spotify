package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class r84 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f196704a;

    /* JADX INFO: renamed from: b */
    public final bji f196705b;

    /* JADX INFO: renamed from: c */
    public final wg61 f196706c;

    public r84(boolean z, bji bjiVar) {
        this.f196704a = z;
        this.f196705b = bjiVar;
        this.f196706c = new wg61(new f74(this, 18));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74975a() {
        r84 r84Var = (r84) this.f196706c.getValue();
        return r84Var != null ? r84Var.m74975a() : this.f196704a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_play_full_song_context_menu_item", "android-gated-content-flags", m74975a()));
    }

    public r84(bji bjiVar) {
        this(false, bjiVar);
    }
}
