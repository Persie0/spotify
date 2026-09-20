package p204p;

import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class f2p0 implements ozo0 {

    /* JADX INFO: renamed from: a */
    public udy0 f65243a;

    /* JADX INFO: renamed from: b */
    public pa81 f65244b;

    /* JADX INFO: renamed from: c */
    public boolean f65245c;

    /* JADX INFO: renamed from: d */
    public boolean f65246d;

    /* JADX INFO: renamed from: e */
    public boolean f65247e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f65248f;

    /* JADX INFO: renamed from: g */
    public final String f65249g;

    public f2p0(String str, noo0 noo0Var, yzo0 yzo0Var) {
        tnk0 tnk0Var = tnk0.f221995a;
        this.f65246d = noo0Var.f156768c;
        this.f65248f = new LinkedHashSet();
        String strM27405t = axf1.m27405t(yzo0Var);
        this.f65249g = strM27405t != null ? strM27405t : str;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: B */
    public final void mo40615B(int i, long j) {
        m40617a("encryption_key_loading");
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: D */
    public final void mo40616D(long j) {
        m40620w("encryption_key_loading");
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: G */
    public final void mo29149G(long j, long j2) {
        this.f65246d = true;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: H */
    public final void mo25534H(long j, long j2) {
        m40620w(this.f65247e ? "rebuffering" : "initial_buffering");
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: I */
    public final void mo25535I(BetamaxException betamaxException, long j, long j2) {
        this.f65245c = true;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: O */
    public final void mo25536O(BetamaxPlaybackException betamaxPlaybackException, long j, long j2) {
        this.f65245c = true;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: Q */
    public final void mo25537Q(clq clqVar, int i, long j, long j2) {
        String str;
        udy0 udy0Var = this.f65243a;
        if (udy0Var != null) {
            switch (i) {
                case 1:
                    str = "PLAYED_TO_END";
                    break;
                case 2:
                    str = "END_REQUESTED";
                    break;
                case 3:
                    str = "FATAL_ERROR";
                    break;
                case 4:
                    str = "RECOVERABLE_ERROR_NETWORK";
                    break;
                case 5:
                    str = "RECOVERABLE_ERROR_OTHER";
                    break;
                case 6:
                    str = "PLAYER_RELEASED";
                    break;
                default:
                    throw null;
            }
            udy0Var.mo33387c(kkc0.m56695h0(new pqm0("reason_end", str), new pqm0("did_error", String.valueOf(this.f65245c)), new pqm0("did_attempt_to_play", String.valueOf(this.f65246d))));
        }
        LinkedHashSet<String> linkedHashSet = this.f65248f;
        for (String str2 : linkedHashSet) {
            pa81 pa81Var = this.f65244b;
            if (pa81Var != null) {
                pa81Var.mo51103d(str2);
            }
        }
        linkedHashSet.clear();
        pa81 pa81Var2 = this.f65244b;
        if (pa81Var2 != null) {
            pa81Var2.stop();
        }
        this.f65244b = null;
        udy0 udy0Var2 = this.f65243a;
        if (udy0Var2 != null) {
            udy0Var2.stop();
        }
        this.f65243a = null;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: R */
    public final void mo29151R(long j, long j2) {
        m40620w("playback_active");
    }

    /* JADX INFO: renamed from: a */
    public final void m40617a(String str) {
        pa81 pa81Var;
        if (!this.f65248f.remove(str) || (pa81Var = this.f65244b) == null) {
            return;
        }
        pa81Var.mo51103d(str);
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: b */
    public final void mo40618b(long j) {
        m40620w("manifest_loading");
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: f */
    public final void mo40619f() {
        m40617a("video_joining");
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: i */
    public final void mo36173i(int i, vk51 vk51Var, long j) {
        String str;
        udy0 udy0Var = this.f65243a;
        if (udy0Var != null) {
            if (i == 1) {
                str = "UNKNOWN";
            } else if (i == 2) {
                str = "AUDIO";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "VIDEO";
            }
            udy0Var.mo33387c(kkc0.m56695h0(new pqm0("media_type", str), new pqm0("streaming_type", vk51Var.name())));
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: k */
    public final void mo27128k(boolean z, boolean z2, float f, long j) {
        if (z) {
            return;
        }
        Set set = h2p0.f87049a;
        String str = this.f65249g;
        if (set.contains(str)) {
            tnk0 tnk0Var = tnk0.f221995a;
            udy0 udy0VarMo75876t = tnk0Var.mo75876t("ux.playback.session");
            this.f65243a = udy0VarMo75876t;
            if (udy0VarMo75876t != null) {
                udy0VarMo75876t.setAttribute("feature_identifier", str);
            }
            this.f65244b = unk0.m83565m(tnk0Var, "ux.playback.session", Integer.valueOf(hashCode()), 4);
            m40620w("ux.playback.session");
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: l */
    public final void mo36174l(long j, long j2, long j3, boolean z) {
        if (z) {
            m40617a("seeking");
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: m */
    public final void mo25538m(long j, long j2) {
        if (this.f65247e) {
            m40617a("rebuffering");
        } else {
            m40617a("initial_buffering");
            this.f65247e = true;
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: p */
    public final void mo36175p(long j, long j2, long j3, boolean z) {
        if (z) {
            m40620w("seeking");
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: r */
    public final void mo37789r(nbc0 nbc0Var, long j) {
        m40617a("manifest_loading");
    }

    /* JADX INFO: renamed from: w */
    public final void m40620w(String str) {
        pa81 pa81Var;
        if (!this.f65248f.add(str) || (pa81Var = this.f65244b) == null) {
            return;
        }
        pa81Var.mo51102c(null, str);
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: x */
    public final void mo40621x() {
        m40620w("video_joining");
    }
}
