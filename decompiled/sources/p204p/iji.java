package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.PlayOrigin;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public interface iji {
    /* JADX INFO: renamed from: a */
    default Set mo45644a() {
        return fod0.f71516b;
    }

    /* JADX INFO: renamed from: b */
    boolean mo28037b(String str);

    /* JADX INFO: renamed from: c */
    default PlayOrigin mo28038c(String str) {
        return fod0.f71515a;
    }

    /* JADX INFO: renamed from: d */
    default zab mo28039d() {
        return zab.f281016a;
    }

    /* JADX INFO: renamed from: e */
    default String mo28040e() {
        return "spotify_media_browser_root_default";
    }

    /* JADX INFO: renamed from: f */
    default ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        return new ExternalAccessoryDescription("", null, null, "app_to_app", null, "app", null, null, str2, "media_session", str, 214, null);
    }

    /* JADX INFO: renamed from: g */
    default hji mo50805g(String str, String str2, yjx0 yjx0Var, r46 r46Var) {
        return new hji(str, yjx0Var, mo47877j(str, r46Var), mo28041f(str, str2, yjx0Var), mo45644a());
    }

    default t180 getExtras() {
        return new t180();
    }

    /* JADX INFO: renamed from: h */
    default String mo45126h(String str, yjx0 yjx0Var) {
        return null;
    }

    /* JADX INFO: renamed from: i */
    default c101 mo28042i() {
        return c101.f32928a;
    }

    /* JADX INFO: renamed from: j */
    default zvm0 mo47877j(String str, r46 r46Var) {
        return r46Var.m74741u(str, mo28040e());
    }

    /* JADX INFO: renamed from: k */
    default yjx0 mo40127k(String str, yjx0 yjx0Var) {
        return yjx0Var;
    }
}
