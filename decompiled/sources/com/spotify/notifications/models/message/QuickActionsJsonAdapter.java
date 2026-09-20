package com.spotify.notifications.models.message;

import java.util.List;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.kyx;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/notifications/models/message/QuickActionsJsonAdapter;", "Lp/hk60;", "Lcom/spotify/notifications/models/message/QuickActions;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class QuickActionsJsonAdapter extends hk60<QuickActions> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6154a = xl60.C2578b.m91389a(kyx.f127932c, "actions");

    /* JADX INFO: renamed from: b */
    public final hk60 f6155b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6156c;

    public QuickActionsJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6155b = p0i0Var.m68706f(String.class, gbuVar, kyx.f127932c);
        this.f6156c = p0i0Var.m68706f(mp91.m62457j(List.class, QuickAction.class), gbuVar, "actions");
    }

    @Override // p204p.hk60
    public final QuickActions fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        List list = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6154a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f6155b.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x(kyx.f127932c, kyx.f127932c, xl60Var);
                }
            } else if (iMo51071K == 1 && (list = (List) this.f6156c.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("actions", "actions", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (str == null) {
            throw f0b1.m40461o(kyx.f127932c, kyx.f127932c, xl60Var);
        }
        if (list != null) {
            return new QuickActions(str, list);
        }
        throw f0b1.m40461o("actions", "actions", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, QuickActions quickActions) {
        QuickActions quickActions2 = quickActions;
        if (quickActions2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s(kyx.f127932c);
        this.f6155b.toJson(rm60Var, quickActions2.p.kyx.c java.lang.String);
        rm60Var.mo56894s("actions");
        this.f6156c.toJson(rm60Var, quickActions2.actions);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(34, "GeneratedJsonAdapter(QuickActions)");
    }
}
