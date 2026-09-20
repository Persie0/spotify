package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ic4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f100726a;

    /* JADX INFO: renamed from: b */
    public final boolean f100727b;

    /* JADX INFO: renamed from: c */
    public final boolean f100728c;

    /* JADX INFO: renamed from: d */
    public final boolean f100729d;

    /* JADX INFO: renamed from: e */
    public final boolean f100730e;

    /* JADX INFO: renamed from: f */
    public final boolean f100731f;

    /* JADX INFO: renamed from: g */
    public final bji f100732g;

    /* JADX INFO: renamed from: h */
    public final wg61 f100733h;

    public ic4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bji bjiVar) {
        this.f100726a = z;
        this.f100727b = z2;
        this.f100728c = z3;
        this.f100729d = z4;
        this.f100730e = z5;
        this.f100731f = z6;
        this.f100732g = bjiVar;
        this.f100733h = new wg61(new sb4(this, 14));
    }

    /* JADX INFO: renamed from: a */
    public final ic4 m50226a() {
        return (ic4) this.f100733h.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m50227b() {
        ic4 ic4VarM50226a = m50226a();
        return ic4VarM50226a != null ? ic4VarM50226a.m50227b() : this.f100726a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m50228c() {
        ic4 ic4VarM50226a = m50226a();
        return ic4VarM50226a != null ? ic4VarM50226a.m50228c() : this.f100727b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m50229d() {
        ic4 ic4VarM50226a = m50226a();
        return ic4VarM50226a != null ? ic4VarM50226a.m50229d() : this.f100728c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m50230e() {
        ic4 ic4VarM50226a = m50226a();
        return ic4VarM50226a != null ? ic4VarM50226a.m50230e() : this.f100729d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m50231f() {
        ic4 ic4VarM50226a = m50226a();
        return ic4VarM50226a != null ? ic4VarM50226a.m50231f() : this.f100730e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m50232g() {
        ic4 ic4VarM50226a = m50226a();
        return ic4VarM50226a != null ? ic4VarM50226a.m50232g() : this.f100731f;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_media_type_carousel_acceptance", "android-libs-nowplaying-uiusecases", m50227b()), new k8a("enable_multitap_seek_horizontal_video", "android-libs-nowplaying-uiusecases", m50228c()), new k8a("enable_multitap_seek_square_cover_art", "android-libs-nowplaying-uiusecases", m50229d()), new k8a("enable_multitap_seek_transcript", "android-libs-nowplaying-uiusecases", m50230e()), new k8a("should_use_vit", "android-libs-nowplaying-uiusecases", m50231f()), new k8a("should_use_vit_to_show_thumbnail", "android-libs-nowplaying-uiusecases", m50232g()));
    }

    public ic4(bji bjiVar) {
        this(false, false, false, false, false, false, bjiVar);
    }
}
