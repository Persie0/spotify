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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/notifications/models/preferences/Item_PreferenceJsonAdapter;", "Lp/hk60;", "Lcom/spotify/notifications/models/preferences/Item$Preference;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class Item_PreferenceJsonAdapter extends hk60<Item$Preference> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6190a = xl60.C2578b.m91389a("type", "key", "name", "description", "channels");

    /* JADX INFO: renamed from: b */
    public final hk60 f6191b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6192c;

    public Item_PreferenceJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6191b = p0i0Var.m68706f(String.class, gbuVar, "type");
        this.f6192c = p0i0Var.m68706f(Channels.class, gbuVar, "channels");
    }

    @Override // p204p.hk60
    public final Item$Preference fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Channels channels = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6190a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f6191b;
                if (iMo51071K == 0) {
                    str = (String) hk60Var.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("type", "type", xl60Var);
                    }
                } else if (iMo51071K == 1) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("key", "key", xl60Var);
                    }
                } else if (iMo51071K == 2) {
                    str3 = (String) hk60Var.fromJson(xl60Var);
                    if (str3 == null) {
                        throw f0b1.m40470x("name", "name", xl60Var);
                    }
                } else if (iMo51071K == 3) {
                    str4 = (String) hk60Var.fromJson(xl60Var);
                    if (str4 == null) {
                        throw f0b1.m40470x("description", "description", xl60Var);
                    }
                } else if (iMo51071K == 4 && (channels = (Channels) this.f6192c.fromJson(xl60Var)) == null) {
                    throw f0b1.m40470x("channels", "channels", xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        if (str == null) {
            throw f0b1.m40461o("type", "type", xl60Var);
        }
        if (str2 == null) {
            throw f0b1.m40461o("key", "key", xl60Var);
        }
        if (str3 == null) {
            throw f0b1.m40461o("name", "name", xl60Var);
        }
        if (str4 == null) {
            throw f0b1.m40461o("description", "description", xl60Var);
        }
        if (channels != null) {
            return new Item$Preference(str, str2, str3, str4, channels);
        }
        throw f0b1.m40461o("channels", "channels", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Item$Preference item$Preference) {
        Item$Preference item$Preference2 = item$Preference;
        if (item$Preference2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("type");
        String str = item$Preference2.type;
        hk60 hk60Var = this.f6191b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("key");
        hk60Var.toJson(rm60Var, item$Preference2.key);
        rm60Var.mo56894s("name");
        hk60Var.toJson(rm60Var, item$Preference2.name);
        rm60Var.mo56894s("description");
        hk60Var.toJson(rm60Var, item$Preference2.description);
        rm60Var.mo56894s("channels");
        this.f6192c.toJson(rm60Var, item$Preference2.channels);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(37, "GeneratedJsonAdapter(Item.Preference)");
    }
}
