package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.widgets.widgetattributionimpl.events.proto.PlaybackFromIntent;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class bud1 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final mv4 f31117a;

    /* JADX INFO: renamed from: b */
    public final fiz f31118b;

    /* JADX INFO: renamed from: c */
    public final fiz f31119c;

    /* JADX INFO: renamed from: d */
    public final t6v f31120d;

    /* JADX INFO: renamed from: e */
    public final c9k f31121e;

    /* JADX INFO: renamed from: f */
    public di41 f31122f;

    /* JADX INFO: renamed from: g */
    public di41 f31123g;

    /* JADX INFO: renamed from: h */
    public String f31124h;

    public bud1(mv4 mv4Var, fiz fizVar, fiz fizVar2, luk lukVar, t6v t6vVar) {
        this.f31117a = mv4Var;
        this.f31118b = fizVar;
        this.f31119c = fizVar2;
        this.f31120d = t6vVar;
        c9k c9kVarM56661c = kk40.m56661c(opo.m67570t(lukVar, qlg1.m73202g()));
        this.f31121e = c9kVarM56661c;
        if (mv4Var.m62901a()) {
            x0h1.m89578u(c9kVarM56661c, null, 0, new pwb1(this, null, 16), 3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m30509a(bud1 bud1Var, qtd1 qtd1Var, PlayerState playerState) {
        if (!playerState.playbackId().mo49279c() || ((CharSequence) playerState.playbackId().mo49278b()).length() == 0) {
            return;
        }
        String str = qtd1Var.f192364a;
        if (wj50.m88271j(str, bud1Var.f31124h)) {
            return;
        }
        t6v t6vVar = bud1Var.f31120d;
        String str2 = qtd1Var.f192365b;
        String strContextUri = playerState.contextUri();
        String strUri = playerState.track().mo49279c() ? ((ContextTrack) playerState.track().mo49278b()).uri() : "";
        wj50.m88279p(strUri);
        String str3 = (String) playerState.playbackId().mo49278b();
        String str4 = qtd1Var.f192366c;
        qre0 qre0Var = t6vVar.f217611a;
        rzo0 rzo0VarM23135t = PlaybackFromIntent.m23135t();
        rzo0VarM23135t.m76825m(str);
        rzo0VarM23135t.m76829t(str2);
        rzo0VarM23135t.m76827r(strContextUri);
        rzo0VarM23135t.m76828s(strUri);
        rzo0VarM23135t.m76826q(str3);
        rzo0VarM23135t.m76830u(str4.toLowerCase(Locale.ROOT));
        qre0Var.m73616a(rzo0VarM23135t.build());
        bud1Var.f31124h = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m30510b(qtd1 qtd1Var) {
        if (this.f31117a.m62901a()) {
            di41 di41Var = this.f31122f;
            fbk fbkVar = null;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            di41 di41Var2 = this.f31123g;
            if (di41Var2 != null) {
                di41Var2.mo26601e(null);
            }
            this.f31123g = x0h1.m89578u(this.f31121e, null, 0, new vtd1(this, qtd1Var, fbkVar, 0), 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m30511c(qtd1 qtd1Var) {
        if (this.f31117a.m62901a()) {
            di41 di41Var = this.f31122f;
            fbk fbkVar = null;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            di41 di41Var2 = this.f31123g;
            if (di41Var2 != null) {
                di41Var2.mo26601e(null);
            }
            this.f31122f = x0h1.m89578u(this.f31121e, null, 0, new vtd1(this, qtd1Var, fbkVar, 1), 3);
        }
    }

    @Override // p204p.hgm
    public final void shutdown() {
        kk40.m56680v(this.f31121e, null);
        this.f31122f = null;
        this.f31123g = null;
        this.f31124h = null;
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
