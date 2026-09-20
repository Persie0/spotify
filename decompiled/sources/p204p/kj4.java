package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class kj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f123213a;

    /* JADX INFO: renamed from: b */
    public final boolean f123214b;

    /* JADX INFO: renamed from: c */
    public final boolean f123215c;

    /* JADX INFO: renamed from: d */
    public final boolean f123216d;

    /* JADX INFO: renamed from: e */
    public final int f123217e;

    /* JADX INFO: renamed from: f */
    public final bji f123218f;

    /* JADX INFO: renamed from: g */
    public final wg61 f123219g;

    public kj4(boolean z, boolean z2, boolean z3, boolean z4, int i, bji bjiVar) {
        this.f123213a = z;
        this.f123214b = z2;
        this.f123215c = z3;
        this.f123216d = z4;
        this.f123217e = i;
        this.f123218f = bjiVar;
        this.f123219g = new wg61(new si4(this, 16));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m56544a() {
        kj4 kj4Var = (kj4) this.f123219g.getValue();
        return kj4Var != null ? kj4Var.m56544a() : this.f123213a;
    }

    /* JADX INFO: renamed from: b */
    public final int m56545b() {
        kj4 kj4Var = (kj4) this.f123219g.getValue();
        return kj4Var != null ? kj4Var.m56545b() : this.f123217e;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m56546c() {
        kj4 kj4Var = (kj4) this.f123219g.getValue();
        return kj4Var != null ? kj4Var.m56546c() : this.f123214b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m56547d() {
        kj4 kj4Var = (kj4) this.f123219g.getValue();
        return kj4Var != null ? kj4Var.m56547d() : this.f123215c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m56548e() {
        kj4 kj4Var = (kj4) this.f123219g.getValue();
        return kj4Var != null ? kj4Var.m56548e() : this.f123216d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_video_layer_refetch", "android-nowplaying-scrollsection", m56544a()), new k8a("is_new_artist_verified_badge_enabled", "android-nowplaying-scrollsection", m56546c()), new k8a("is_reorder_engagement_gating_enabled", "android-nowplaying-scrollsection", m56547d()), new k8a("is_time_based_reorder_enabled", "android-nowplaying-scrollsection", m56548e()), new k8a("reorder_engagement_threshold_dp", "android-nowplaying-scrollsection", m56545b(), 0, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER));
    }

    public kj4(bji bjiVar) {
        this(false, false, false, false, 40, bjiVar);
    }
}
