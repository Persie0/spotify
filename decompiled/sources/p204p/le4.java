package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class le4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f132445a;

    /* JADX INFO: renamed from: b */
    public final bji f132446b;

    /* JADX INFO: renamed from: c */
    public final wg61 f132447c = new wg61(new dd4(this, 28));

    public le4(boolean z, bji bjiVar) {
        this.f132445a = z;
        this.f132446b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58765a() {
        le4 le4Var = (le4) this.f132447c.getValue();
        return le4Var != null ? le4Var.m58765a() : this.f132445a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("hide_share_header_action_for_music_video_playlists", "android-list-ux-platform-consumers-share-headeractions-share", m58765a()));
    }
}
