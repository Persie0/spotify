package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class hnl0 implements iji {

    /* JADX INFO: renamed from: a */
    public static final Set f93361a = bk5.m29624m1(new String[]{"com.coloros.alarmclock", "com.oneplus.deskclock"});

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        return f93361a.contains(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: d */
    public final zab mo28039d() {
        return zab.f281022g;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: e */
    public final String mo28040e() {
        return "spotify_media_browser_root_wakeup";
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        return new ExternalAccessoryDescription("Clock", null, null, "app_to_app", null, "app", "oneplus", "oneplus clock", str2, "media_session", str, 22, null);
    }
}
