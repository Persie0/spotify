package p204p;

import com.spotify.music.SpotifyMainActivity;

/* JADX INFO: loaded from: classes8.dex */
public final class tmj0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221735a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vmj0 f221736b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tmj0(vmj0 vmj0Var, int i) {
        super(0);
        this.f221735a = i;
        this.f221736b = vmj0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f221735a) {
            case 0:
                this.f221736b.f242858i.mo53784c("LoggedInUi", "cst");
                return w2a1.f247311a;
            default:
                return ((SpotifyMainActivity) this.f221736b.f242851b).m15687w0().f60742b.f99396e;
        }
    }
}
