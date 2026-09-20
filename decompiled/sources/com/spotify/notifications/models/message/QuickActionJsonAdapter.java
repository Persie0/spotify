package com.spotify.notifications.models.message;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/notifications/models/message/QuickActionJsonAdapter;", "Lp/hk60;", "Lcom/spotify/notifications/models/message/QuickAction;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class QuickActionJsonAdapter extends hk60<QuickAction> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6149a = xl60.C2578b.m91389a("actionIdentifier", "actionTitle", "actionData");

    /* JADX INFO: renamed from: b */
    public final hk60 f6150b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6151c;

    public QuickActionJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6150b = p0i0Var.m68706f(String.class, gbuVar, "actionIdentifier");
        this.f6151c = p0i0Var.m68706f(String.class, gbuVar, "actionData");
    }

    @Override // p204p.hk60
    public final QuickAction fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6149a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f6150b;
                if (iMo51071K == 0) {
                    str = (String) hk60Var.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("actionIdentifier", "actionIdentifier", xl60Var);
                    }
                } else if (iMo51071K == 1) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("actionTitle", "actionTitle", xl60Var);
                    }
                } else if (iMo51071K == 2) {
                    str3 = (String) this.f6151c.fromJson(xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        if (str == null) {
            throw f0b1.m40461o("actionIdentifier", "actionIdentifier", xl60Var);
        }
        if (str2 != null) {
            return new QuickAction(str, str2, str3);
        }
        throw f0b1.m40461o("actionTitle", "actionTitle", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, QuickAction quickAction) {
        QuickAction quickAction2 = quickAction;
        if (quickAction2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("actionIdentifier");
        String str = quickAction2.actionIdentifier;
        hk60 hk60Var = this.f6150b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("actionTitle");
        hk60Var.toJson(rm60Var, quickAction2.actionTitle);
        rm60Var.mo56894s("actionData");
        this.f6151c.toJson(rm60Var, quickAction2.actionData);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(33, "GeneratedJsonAdapter(QuickAction)");
    }
}
