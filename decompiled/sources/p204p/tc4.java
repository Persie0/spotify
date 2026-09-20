package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class tc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f219002a;

    /* JADX INFO: renamed from: b */
    public final boolean f219003b;

    /* JADX INFO: renamed from: c */
    public final boolean f219004c;

    /* JADX INFO: renamed from: d */
    public final bji f219005d;

    /* JADX INFO: renamed from: e */
    public final wg61 f219006e;

    public tc4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f219002a = z;
        this.f219003b = z2;
        this.f219004c = z3;
        this.f219005d = bjiVar;
        this.f219006e = new wg61(new sb4(this, 23));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80413a() {
        tc4 tc4Var = (tc4) this.f219006e.getValue();
        return tc4Var != null ? tc4Var.m80413a() : this.f219002a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m80414b() {
        tc4 tc4Var = (tc4) this.f219006e.getValue();
        return tc4Var != null ? tc4Var.m80414b() : this.f219003b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m80415c() {
        tc4 tc4Var = (tc4) this.f219006e.getValue();
        return tc4Var != null ? tc4Var.m80415c() : this.f219004c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("hide_chapter_download_button", "android-libs-podcast-entity-adapter-delegate", m80413a()), new k8a("is_audiobook_playback_enabled", "android-libs-podcast-entity-adapter-delegate", m80414b()), new k8a("is_video_label_enabled", "android-libs-podcast-entity-adapter-delegate", m80415c()));
    }

    public tc4(bji bjiVar) {
        this(true, true, false, bjiVar);
    }
}
