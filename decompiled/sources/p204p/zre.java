package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;

/* JADX INFO: loaded from: classes8.dex */
public final class zre implements iji {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285645a;

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        switch (this.f285645a) {
            case 0:
                return "com.spotify.clockexample".equals(str);
            default:
                return "com.android.deskclock".equals(str);
        }
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: d */
    public final zab mo28039d() {
        switch (this.f285645a) {
            case 0:
                break;
        }
        return zab.f281022g;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: e */
    public final String mo28040e() {
        switch (this.f285645a) {
        }
        return "spotify_media_browser_root_wakeup";
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        switch (this.f285645a) {
            case 0:
                return new ExternalAccessoryDescription("Clock", null, null, "app_to_app", null, "app", "spotify", "MBS clock example", str2, "media_session", str, 22, null);
            default:
                return new ExternalAccessoryDescription("Clock", null, null, "app_to_app", null, "app", "vivo", "vivo clock", str2, "media_session", str, 22, null);
        }
    }
}
