package com.spotify.notifications.models.preferences;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/notifications/models/preferences/OptOutRecordJsonAdapter;", "Lp/hk60;", "Lcom/spotify/notifications/models/preferences/OptOutRecord;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OptOutRecordJsonAdapter extends hk60<OptOutRecord> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6196a = xl60.C2578b.m91389a("optOutType", "channel", "value");

    /* JADX INFO: renamed from: b */
    public final hk60 f6197b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6198c;

    public OptOutRecordJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6197b = p0i0Var.m68706f(String.class, gbuVar, "optOutType");
        this.f6198c = p0i0Var.m68706f(Boolean.TYPE, gbuVar, "value");
    }

    @Override // p204p.hk60
    public final OptOutRecord fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6196a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f6197b;
                if (iMo51071K == 0) {
                    str = (String) hk60Var.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("optOutType", "optOutType", xl60Var);
                    }
                } else if (iMo51071K == 1) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("channel", "channel", xl60Var);
                    }
                } else if (iMo51071K == 2 && (bool = (Boolean) this.f6198c.fromJson(xl60Var)) == null) {
                    throw f0b1.m40470x("value__", "value", xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        if (str == null) {
            throw f0b1.m40461o("optOutType", "optOutType", xl60Var);
        }
        if (str2 == null) {
            throw f0b1.m40461o("channel", "channel", xl60Var);
        }
        if (bool != null) {
            return new OptOutRecord(str, str2, bool.booleanValue());
        }
        throw f0b1.m40461o("value__", "value", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, OptOutRecord optOutRecord) {
        OptOutRecord optOutRecord2 = optOutRecord;
        if (optOutRecord2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("optOutType");
        String str = optOutRecord2.optOutType;
        hk60 hk60Var = this.f6197b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("channel");
        hk60Var.toJson(rm60Var, optOutRecord2.channel);
        rm60Var.mo56894s("value");
        this.f6198c.toJson(rm60Var, Boolean.valueOf(optOutRecord2.value));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(34, "GeneratedJsonAdapter(OptOutRecord)");
    }
}
