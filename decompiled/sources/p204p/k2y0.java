package p204p;

import androidx.media3.session.legacy.MediaConstants;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;

/* JADX INFO: loaded from: classes9.dex */
public final class k2y0 implements iji {

    /* JADX INFO: renamed from: a */
    public static final hg40 f118702a = hg40.m47412x("com.spotify.music.extra.CONTEXT_URI", MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_BROWSABLE, MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_GROUP_TITLE, MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_PLAYABLE, "android.media.IS_EXPLICIT", MediaConstants.DESCRIPTION_EXTRAS_KEY_COMPLETION_STATUS, new String[0]);

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        return "com.sec.android.app.clockpackage".equals(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: d */
    public final zab mo28039d() {
        return zab.f281023h;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: e */
    public final String mo28040e() {
        return "spotify_media_browser_root_samsung";
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        return new ExternalAccessoryDescription("Clock", null, null, "app_to_app", null, "app", d6n0.f45731d, "samsung clock", str2, "media_session", "com.sec.android.app.clockpackage", 22, null);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: i */
    public final c101 mo28042i() {
        return c101.f32936i;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: k */
    public final yjx0 mo40127k(String str, yjx0 yjx0Var) {
        return yjx0.m93942a(yjx0Var, null, f118702a, 191);
    }
}
