package com.spotify.notifications.models.message;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/notifications/models/message/RichPushFieldsJsonAdapter;", "Lp/hk60;", "Lcom/spotify/notifications/models/message/RichPushFields;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class RichPushFieldsJsonAdapter extends hk60<RichPushFields> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6168a = xl60.C2578b.m91389a("image_url", ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "description", "duration_ms");

    /* JADX INFO: renamed from: b */
    public final hk60 f6169b;

    public RichPushFieldsJsonAdapter(p0i0 p0i0Var) {
        this.f6169b = p0i0Var.m68706f(String.class, gbu.f78413a, "imageUrl");
    }

    @Override // p204p.hk60
    public final RichPushFields fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6168a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f6169b;
                if (iMo51071K == 0) {
                    str = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 1) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    str3 = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 3) {
                    str4 = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 4) {
                    str5 = (String) hk60Var.fromJson(xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return new RichPushFields(str, str2, str3, str4, str5);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, RichPushFields richPushFields) {
        RichPushFields richPushFields2 = richPushFields;
        if (richPushFields2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("image_url");
        String str = richPushFields2.imageUrl;
        hk60 hk60Var = this.f6169b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_TITLE);
        hk60Var.toJson(rm60Var, richPushFields2.com.spotify.player.model.ContextTrack.Metadata.KEY_TITLE java.lang.String);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_SUBTITLE);
        hk60Var.toJson(rm60Var, richPushFields2.com.spotify.player.model.ContextTrack.Metadata.KEY_SUBTITLE java.lang.String);
        rm60Var.mo56894s("description");
        hk60Var.toJson(rm60Var, richPushFields2.description);
        rm60Var.mo56894s("duration_ms");
        hk60Var.toJson(rm60Var, richPushFields2.durationMs);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(36, "GeneratedJsonAdapter(RichPushFields)");
    }
}
