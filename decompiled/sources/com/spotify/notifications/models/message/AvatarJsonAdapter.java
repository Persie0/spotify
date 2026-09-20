package com.spotify.notifications.models.message;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/notifications/models/message/AvatarJsonAdapter;", "Lp/hk60;", "Lcom/spotify/notifications/models/message/Avatar;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AvatarJsonAdapter extends hk60<Avatar> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6100a = xl60.C2578b.m91389a("avatar_url", "fallback_background_color", "fallback_font_color");

    /* JADX INFO: renamed from: b */
    public final hk60 f6101b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor f6102c;

    public AvatarJsonAdapter(p0i0 p0i0Var) {
        this.f6101b = p0i0Var.m68706f(String.class, gbu.f78413a, "url");
    }

    @Override // p204p.hk60
    public final Avatar fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6100a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f6101b.fromJson(xl60Var);
                i &= -2;
            } else if (iMo51071K == 1) {
                str2 = (String) this.f6101b.fromJson(xl60Var);
                i &= -3;
            } else if (iMo51071K == 2) {
                str3 = (String) this.f6101b.fromJson(xl60Var);
                i &= -5;
            }
        }
        xl60Var.mo51078f();
        if (i == -8) {
            return new Avatar(str, str2, str3);
        }
        Constructor declaredConstructor = this.f6102c;
        if (declaredConstructor == null) {
            declaredConstructor = Avatar.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f6102c = declaredConstructor;
        }
        return (Avatar) declaredConstructor.newInstance(str, str2, str3, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Avatar avatar) {
        Avatar avatar2 = avatar;
        if (avatar2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("avatar_url");
        String str = avatar2.url;
        hk60 hk60Var = this.f6101b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("fallback_background_color");
        hk60Var.toJson(rm60Var, avatar2.fallbackBackgroundColor);
        rm60Var.mo56894s("fallback_font_color");
        hk60Var.toJson(rm60Var, avatar2.fallbackFontColor);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(28, "GeneratedJsonAdapter(Avatar)");
    }
}
