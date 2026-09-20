package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class npa0 implements pqa0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156905a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ opa0 f156906b;

    public /* synthetic */ npa0(opa0 opa0Var, int i) {
        this.f156905a = i;
        this.f156906b = opa0Var;
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: e */
    public final void mo37400e(String str, String str2) {
        switch (this.f156905a) {
            case 0:
                this.f156906b.f167825a.m76103a('D', "Spotify", opa0.m67520g(str, str2), null);
                break;
            case 1:
                this.f156906b.f167825a.m76103a('W', "Spotify", opa0.m67520g(str, str2), null);
                break;
            case 2:
                this.f156906b.f167825a.m76103a('E', "Spotify", opa0.m67520g(str, str2), null);
                break;
            case 3:
                this.f156906b.f167825a.m76103a('I', "Breadcrumb", opa0.m67520g(str, str2), null);
                break;
            default:
                this.f156906b.f167825a.m76103a('E', "YELL", opa0.m67520g(str, str2), null);
                break;
        }
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: k */
    public final void mo37402k(String str, String str2, Throwable th) {
        switch (this.f156905a) {
            case 0:
                this.f156906b.f167825a.m76103a('D', "Spotify", opa0.m67520g(str, str2), th);
                break;
            case 1:
                this.f156906b.f167825a.m76103a('W', "Spotify", opa0.m67520g(str, str2), th);
                break;
            case 2:
                this.f156906b.f167825a.m76103a('E', "Spotify", opa0.m67520g(str, str2), th);
                break;
            case 3:
                this.f156906b.f167825a.m76103a('I', "Breadcrumb", opa0.m67520g(str, str2), th);
                break;
            default:
                this.f156906b.f167825a.m76103a('E', "YELL", opa0.m67520g(str, str2), th);
                break;
        }
    }
}
