package p204p;

import android.os.Bundle;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.PlayOrigin;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class xa8 implements iji {

    /* JADX INFO: renamed from: a */
    public final za8 f259619a;

    public xa8(za8 za8Var) {
        this.f259619a = za8Var;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: a */
    public final Set mo45644a() {
        this.f259619a.getClass();
        return fod0.f71516b;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        this.f259619a.getClass();
        return za8.f281001d.contains(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: c */
    public final PlayOrigin mo28038c(String str) {
        List list = za8.f281001d;
        return za8.f281002e;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: d */
    public final zab mo28039d() {
        return zab.f281019d;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: e */
    public final String mo28040e() {
        return "spotify_media_browser_root_avrcp";
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        return this.f259619a.mo42270a(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: k */
    public final yjx0 mo40127k(String str, yjx0 yjx0Var) {
        return new yjx0("empty", (String) null, (String) null, false, false, (hg40) null, (Bundle) null, 254);
    }
}
