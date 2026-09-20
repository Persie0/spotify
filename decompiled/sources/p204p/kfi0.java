package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;

/* JADX INFO: loaded from: classes8.dex */
public final class kfi0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122171a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nwz0 f122172b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f122173c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wet0 f122174d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kfi0(nwz0 nwz0Var, Context context, wet0 wet0Var, int i) {
        super(1);
        this.f122171a = i;
        this.f122172b = nwz0Var;
        this.f122173c = context;
        this.f122174d = wet0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f122171a) {
            case 0:
                this.f122172b.getClass();
                Intent intentM65808a = nwz0.m65808a(this.f122173c, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentM65808a.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                return cyx.m34393b(intentM65808a, AppLifecycleServicePendingIntent.ADD_TO_PLAYLIST, this.f122174d);
            case 1:
                this.f122172b.getClass();
                Intent intentM65808a2 = nwz0.m65808a(this.f122173c, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentM65808a2.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                return cyx.m34393b(intentM65808a2, AppLifecycleServicePendingIntent.ADD_TO_QUEUE, this.f122174d);
            case 2:
                this.f122172b.getClass();
                Intent intentM65808a3 = nwz0.m65808a(this.f122173c, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentM65808a3.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                return cyx.m34393b(intentM65808a3, AppLifecycleServicePendingIntent.ADD_TO_YOUR_EPISODE, this.f122174d);
            case 3:
                this.f122172b.getClass();
                Intent intentM65808a4 = nwz0.m65808a(this.f122173c, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentM65808a4.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                return cyx.m34393b(intentM65808a4, AppLifecycleServicePendingIntent.DOWNLOAD, this.f122174d);
            case 4:
                this.f122172b.getClass();
                Intent intentM65808a5 = nwz0.m65808a(this.f122173c, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentM65808a5.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                return cyx.m34393b(intentM65808a5, AppLifecycleServicePendingIntent.EMAIL_VERIFY, this.f122174d);
            case 5:
                Bundle bundle = (Bundle) obj;
                this.f122172b.getClass();
                Intent intentM65808a6 = nwz0.m65808a(this.f122173c, "com.spotify.app.music.scopes.utils.action.URL_OPEN");
                Uri uri = (Uri) bundle.getParcelable("com.spotify.music.extra_url");
                if (uri != null) {
                    intentM65808a6.setData(uri);
                }
                intentM65808a6.putExtra("push_data", bundle.getParcelable("push_data"));
                return cyx.m34393b(intentM65808a6, AppLifecycleServicePendingIntent.OPEN_PUSH_SETTINGS, this.f122174d);
            case 6:
                Bundle bundle2 = (Bundle) obj;
                this.f122172b.getClass();
                Intent intentM65808a7 = nwz0.m65808a(this.f122173c, "com.spotify.app.music.scopes.utils.action.URL_OPEN");
                Uri uri2 = (Uri) bundle2.getParcelable("com.spotify.music.extra_url");
                if (uri2 != null) {
                    intentM65808a7.setData(uri2);
                }
                intentM65808a7.putExtra("push_data", bundle2.getParcelable("push_data"));
                return cyx.m34393b(intentM65808a7, AppLifecycleServicePendingIntent.OPEN_URL, this.f122174d);
            case 7:
                Bundle bundle3 = (Bundle) obj;
                this.f122172b.getClass();
                Intent intentM65808a8 = nwz0.m65808a(this.f122173c, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                Uri uri3 = (Uri) bundle3.getParcelable("com.spotify.music.extra_url");
                if (uri3 != null) {
                    intentM65808a8.setData(uri3);
                }
                intentM65808a8.putExtra("push_data", bundle3.getParcelable("push_data"));
                return cyx.m34393b(intentM65808a8, AppLifecycleServicePendingIntent.PLAY_AND_NAVIGATE, this.f122174d);
            case 8:
                Bundle bundle4 = (Bundle) obj;
                this.f122172b.getClass();
                Intent intentM65808a9 = nwz0.m65808a(this.f122173c, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                Uri uri4 = (Uri) bundle4.getParcelable("com.spotify.music.extra_url");
                if (uri4 != null) {
                    intentM65808a9.setData(uri4);
                }
                intentM65808a9.putExtra("push_data", bundle4.getParcelable("push_data"));
                return cyx.m34393b(intentM65808a9, AppLifecycleServicePendingIntent.SAVE_ENTITY, this.f122174d);
            default:
                this.f122172b.getClass();
                Intent intentM65808a10 = nwz0.m65808a(this.f122173c, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentM65808a10.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                return cyx.m34393b(intentM65808a10, AppLifecycleServicePendingIntent.START_PLAYBACK, this.f122174d);
        }
    }
}
