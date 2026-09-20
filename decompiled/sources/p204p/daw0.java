package p204p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes10.dex */
public final class daw0 implements ccf {
    /* JADX INFO: renamed from: d */
    public static kcf m35510d(String str) {
        if (str != null) {
            new Bundle().putString("com.spotify.music.extra.ERROR_MESSAGE", str);
        }
        return new kcf(2, null);
    }

    @Override // p204p.ccf
    /* JADX INFO: renamed from: a */
    public final boolean mo28604a(String str) {
        return "com.spotify.music.command.COMMAND_REMOTE_CONFIG".equals(str);
    }

    @Override // p204p.ccf
    /* JADX INFO: renamed from: b */
    public final Single mo28605b(Bundle bundle) {
        if (bundle == null) {
            return Single.just(m35510d("Extras are null"));
        }
        if (!bundle.containsKey("com.spotify.music.extra.REMOTE_PROPERTY")) {
            return Single.just(m35510d("Missing extra com.spotify.music.extra.REMOTE_PROPERTY"));
        }
        String string = bundle.getString("com.spotify.music.extra.REMOTE_PROPERTY", null);
        return string.equals("bypass_auth_hadouken") ? Single.just(new kcf(1, dq60.m36606f("bypass_auth_hadouken", "false"))) : Single.just(m35510d("Unknown property ".concat(string)));
    }

    @Override // p204p.ccf
    /* JADX INFO: renamed from: c */
    public final String mo28606c() {
        return "com.spotify.music.command.COMMAND_REMOTE_CONFIG";
    }
}
