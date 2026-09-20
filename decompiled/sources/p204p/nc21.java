package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes2.dex */
public final class nc21 implements ymv {

    /* JADX INFO: renamed from: a */
    public final qe70 f152407a;

    /* JADX INFO: renamed from: b */
    public final qe70 f152408b;

    /* JADX INFO: renamed from: c */
    public final gh00 f152409c;

    /* JADX WARN: Multi-variable type inference failed */
    public nc21(gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3) {
        this.f152407a = (qe70) gh00Var;
        this.f152408b = (qe70) gh00Var2;
        this.f152409c = gh00Var3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p.gh00, p.qe70] */
    @Override // p204p.ymv
    /* JADX INFO: renamed from: a */
    public final o1x0 mo44204a(PlayerState playerState) {
        return new o1x0((h1x0) this.f152407a.invoke(playerState), (h1x0) this.f152408b.invoke(playerState), (String) this.f152409c.invoke(playerState), null, 120);
    }

    public /* synthetic */ nc21(gh00 gh00Var, gh00 gh00Var2) {
        this(gh00Var, gh00Var2, xr11.f265222c1);
    }
}
