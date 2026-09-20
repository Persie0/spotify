package p204p;

import android.app.Activity;
import android.content.Context;
import com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback;
import com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService;

/* JADX INFO: loaded from: classes8.dex */
public final class hen implements v94 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90466a;

    /* JADX INFO: renamed from: b */
    public final son f90467b;

    public /* synthetic */ hen(son sonVar, int i) {
        this.f90466a = i;
        this.f90467b = sonVar;
    }

    @Override // p204p.v94
    /* JADX INFO: renamed from: K0 */
    public void mo24956K0(Object obj) {
        switch (this.f90466a) {
            case 5:
                ShareSheetCallback shareSheetCallback = (ShareSheetCallback) obj;
                son sonVar = this.f90467b;
                shareSheetCallback.f2703c = (xre) sonVar.f211251B1.get();
                shareSheetCallback.f2702b = (qre0) sonVar.f212305o2.get();
                break;
            default:
                SpotifyFirebaseMessagingService spotifyFirebaseMessagingService = (SpotifyFirebaseMessagingService) obj;
                son sonVar2 = this.f90467b;
                spotifyFirebaseMessagingService.f6221i = new xqb(23, (Context) sonVar2.f212437t1.f246642a, (xo4) sonVar2.f211874Ya.get());
                spotifyFirebaseMessagingService.f6222t = (fk60) sonVar2.f211756U2.get();
                spotifyFirebaseMessagingService.f6220h = (s54) sonVar2.f211828Wk.get();
                spotifyFirebaseMessagingService.f6219g = (uft0) sonVar2.f211801Vk.get();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public hr70 m47311a(Activity activity) {
        activity.getClass();
        return new wym(this.f90467b, activity, 23);
    }

    public /* synthetic */ hen(son sonVar, otn otnVar, int i) {
        this.f90466a = i;
        this.f90467b = sonVar;
    }
}
