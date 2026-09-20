package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wod1 implements zam0 {

    /* JADX INFO: renamed from: b */
    public static final wod1 f253443b = new wod1(0);

    /* JADX INFO: renamed from: c */
    public static final wod1 f253444c = new wod1(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f253445a;

    public /* synthetic */ wod1(int i) {
        this.f253445a = i;
    }

    @Override // p204p.zam0
    /* JADX INFO: renamed from: a */
    public final String mo32181a() {
        switch (this.f253445a) {
            case 0:
                return "webviewprod";
            case 1:
                return "world";
            case 2:
                return "audiobookseries";
            case 3:
                return "trending-near-you";
            default:
                return "chat";
        }
    }

    @Override // p204p.zam0
    public final String path() {
        switch (this.f253445a) {
            case 0:
                return "webview-prod-page";
            case 1:
                return "world-web-page";
            case 2:
                return "seriespage";
            case 3:
                return "trending-near-you/location-search";
            default:
                return "chat/trusted-circle";
        }
    }
}
