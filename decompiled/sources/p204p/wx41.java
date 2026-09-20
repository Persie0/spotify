package p204p;

import com.spotify.player.model.command.options.SkipToPrevTrackOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class wx41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xx41 f255935b;

    public /* synthetic */ wx41(xx41 xx41Var, int i) {
        this.f255934a = i;
        this.f255935b = xx41Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m89218a(Object obj) {
        xul0 xul0VarAllowSeeking;
        Boolean bool;
        switch (this.f255934a) {
            case 0:
                this.f255935b.f266858b.m37319c();
                break;
            case 1:
                this.f255935b.f266858b.m37317a();
                break;
            case 2:
                this.f255935b.f266858b.m37317a();
                break;
            case 3:
                this.f255935b.f266858b.m37318b();
                break;
            default:
                dy41 dy41Var = this.f255935b.f266858b;
                SkipToPrevTrackOptions skipToPrevTrackOptions = (SkipToPrevTrackOptions) ((f8p0) obj).m41041n().options().mo49283h();
                dy41Var.m37322f((skipToPrevTrackOptions == null || (xul0VarAllowSeeking = skipToPrevTrackOptions.allowSeeking()) == null || (bool = (Boolean) xul0VarAllowSeeking.mo49280e(Boolean.FALSE)) == null) ? false : bool.booleanValue());
                break;
        }
    }
}
