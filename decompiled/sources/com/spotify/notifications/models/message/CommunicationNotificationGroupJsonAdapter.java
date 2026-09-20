package com.spotify.notifications.models.message;

import java.util.List;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/notifications/models/message/CommunicationNotificationGroupJsonAdapter;", "Lp/hk60;", "Lcom/spotify/notifications/models/message/CommunicationNotificationGroup;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CommunicationNotificationGroupJsonAdapter extends hk60<CommunicationNotificationGroup> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6111a = xl60.C2578b.m91389a("name", "avatar", "recipients");

    /* JADX INFO: renamed from: b */
    public final hk60 f6112b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6113c;

    /* JADX INFO: renamed from: d */
    public final hk60 f6114d;

    public CommunicationNotificationGroupJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6112b = p0i0Var.m68706f(String.class, gbuVar, "name");
        this.f6113c = p0i0Var.m68706f(Avatar.class, gbuVar, "avatar");
        this.f6114d = p0i0Var.m68706f(mp91.m62457j(List.class, String.class), gbuVar, "recipients");
    }

    @Override // p204p.hk60
    public final CommunicationNotificationGroup fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        Avatar avatar = null;
        List list = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6111a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f6112b.fromJson(xl60Var);
            } else if (iMo51071K == 1) {
                avatar = (Avatar) this.f6113c.fromJson(xl60Var);
            } else if (iMo51071K == 2) {
                list = (List) this.f6114d.fromJson(xl60Var);
            }
        }
        xl60Var.mo51078f();
        return new CommunicationNotificationGroup(str, avatar, list);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, CommunicationNotificationGroup communicationNotificationGroup) {
        CommunicationNotificationGroup communicationNotificationGroup2 = communicationNotificationGroup;
        if (communicationNotificationGroup2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("name");
        this.f6112b.toJson(rm60Var, communicationNotificationGroup2.name);
        rm60Var.mo56894s("avatar");
        this.f6113c.toJson(rm60Var, communicationNotificationGroup2.avatar);
        rm60Var.mo56894s("recipients");
        this.f6114d.toJson(rm60Var, communicationNotificationGroup2.recipients);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(52, "GeneratedJsonAdapter(CommunicationNotificationGroup)");
    }
}
