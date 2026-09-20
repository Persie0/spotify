package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dv3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f53348a;

    /* JADX INFO: renamed from: b */
    public final boolean f53349b;

    /* JADX INFO: renamed from: c */
    public final boolean f53350c;

    /* JADX INFO: renamed from: d */
    public final boolean f53351d;

    /* JADX INFO: renamed from: e */
    public final boolean f53352e;

    /* JADX INFO: renamed from: f */
    public final bji f53353f;

    /* JADX INFO: renamed from: g */
    public final wg61 f53354g = new wg61(new ju3(this, 14));

    public dv3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f53348a = z;
        this.f53349b = z2;
        this.f53350c = z3;
        this.f53351d = z4;
        this.f53352e = z5;
        this.f53353f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m37038a() {
        dv3 dv3Var = (dv3) this.f53354g.getValue();
        return dv3Var != null ? dv3Var.m37038a() : this.f53348a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37039b() {
        dv3 dv3Var = (dv3) this.f53354g.getValue();
        return dv3Var != null ? dv3Var.m37039b() : this.f53349b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m37040c() {
        dv3 dv3Var = (dv3) this.f53354g.getValue();
        return dv3Var != null ? dv3Var.m37040c() : this.f53350c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37041d() {
        dv3 dv3Var = (dv3) this.f53354g.getValue();
        return dv3Var != null ? dv3Var.m37041d() : this.f53351d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m37042e() {
        dv3 dv3Var = (dv3) this.f53354g.getValue();
        return dv3Var != null ? dv3Var.m37042e() : this.f53352e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("always_request_focus_after_gaining_focus", "android-audio-focus-services-impl", m37038a()), new k8a("preserve_transient_focus_loss_on_speaker_disconnect", "android-audio-focus-services-impl", m37039b()), new k8a("resume_playback_on_focus_gain_on_alarm_stream", "android-audio-focus-services-impl", m37040c()), new k8a("use_list_player_audio_focus_esperanto", "android-audio-focus-services-impl", m37041d()), new k8a("wait_for_player_command_completion", "android-audio-focus-services-impl", m37042e()));
    }
}
