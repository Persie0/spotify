package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes5.dex */
public final class hjd1 implements iji {
    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        return "com.waze".equals(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: c */
    public final PlayOrigin mo28038c(String str) {
        return ijd1.f102796a;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: e */
    public final String mo28040e() {
        return "spotify_media_browser_root_waze";
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        return new ExternalAccessoryDescription("waze", "", "", "app_to_app", "", "app", "", "", "", "media_session", str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: i */
    public final c101 mo28042i() {
        return c101.f32931d;
    }
}
