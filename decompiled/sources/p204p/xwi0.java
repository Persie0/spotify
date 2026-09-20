package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xwi0 extends zwi0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f266691b;

    public /* synthetic */ xwi0(int i) {
        this.f266691b = i;
    }

    @Override // p204p.zwi0
    /* JADX INFO: renamed from: b */
    public final String mo92288b() {
        switch (this.f266691b) {
            case 0:
                return null;
            case 1:
                return "com.instagram.platform.AppAuthorizeActivity";
            case 2:
                return null;
            default:
                return "com.facebook.katana.ProxyAuth";
        }
    }

    @Override // p204p.zwi0
    /* JADX INFO: renamed from: c */
    public final String mo92289c() {
        switch (this.f266691b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.instagram.android";
            case 2:
                return "com.facebook.orca";
            default:
                return "com.facebook.wakizashi";
        }
    }

    @Override // p204p.zwi0
    /* JADX INFO: renamed from: d */
    public String mo92290d() {
        switch (this.f266691b) {
            case 1:
                return "token,signed_request,graph_domain,granted_scopes";
            default:
                return super.mo92290d();
        }
    }
}
