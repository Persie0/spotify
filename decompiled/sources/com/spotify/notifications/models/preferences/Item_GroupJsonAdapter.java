package com.spotify.notifications.models.preferences;

import java.util.List;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.wq50;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/notifications/models/preferences/Item_GroupJsonAdapter;", "Lp/hk60;", "Lcom/spotify/notifications/models/preferences/Item$Group;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class Item_GroupJsonAdapter extends hk60<Item$Group> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6186a = xl60.C2578b.m91389a("type", "key", "name", "description", "showExpanded", "items");

    /* JADX INFO: renamed from: b */
    public final hk60 f6187b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6188c;

    /* JADX INFO: renamed from: d */
    public final hk60 f6189d;

    public Item_GroupJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6187b = p0i0Var.m68706f(String.class, gbuVar, "type");
        this.f6188c = p0i0Var.m68706f(Boolean.TYPE, gbuVar, "showExpanded");
        this.f6189d = p0i0Var.m68706f(mp91.m62457j(List.class, wq50.class), gbuVar, "items");
    }

    @Override // p204p.hk60
    public final Item$Group fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6186a);
            hk60 hk60Var = this.f6187b;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    str = (String) hk60Var.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("type", "type", xl60Var);
                    }
                    break;
                    break;
                case 1:
                    str2 = (String) hk60Var.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("key", "key", xl60Var);
                    }
                    break;
                    break;
                case 2:
                    str3 = (String) hk60Var.fromJson(xl60Var);
                    if (str3 == null) {
                        throw f0b1.m40470x("name", "name", xl60Var);
                    }
                    break;
                    break;
                case 3:
                    str4 = (String) hk60Var.fromJson(xl60Var);
                    if (str4 == null) {
                        throw f0b1.m40470x("description", "description", xl60Var);
                    }
                    break;
                    break;
                case 4:
                    bool = (Boolean) this.f6188c.fromJson(xl60Var);
                    if (bool == null) {
                        throw f0b1.m40470x("showExpanded", "showExpanded", xl60Var);
                    }
                    break;
                    break;
                case 5:
                    list = (List) this.f6189d.fromJson(xl60Var);
                    if (list == null) {
                        throw f0b1.m40470x("items", "items", xl60Var);
                    }
                    break;
                    break;
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
        if (bool == null) {
            throw f0b1.m40461o("showExpanded", "showExpanded", xl60Var);
        }
        boolean zBooleanValue = bool.booleanValue();
        if (list != null) {
            return new Item$Group(str, str2, str3, str4, zBooleanValue, list);
        }
        throw f0b1.m40461o("items", "items", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Item$Group item$Group) {
        Item$Group item$Group2 = item$Group;
        if (item$Group2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("type");
        String str = item$Group2.type;
        hk60 hk60Var = this.f6187b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("key");
        hk60Var.toJson(rm60Var, item$Group2.key);
        rm60Var.mo56894s("name");
        hk60Var.toJson(rm60Var, item$Group2.name);
        rm60Var.mo56894s("description");
        hk60Var.toJson(rm60Var, item$Group2.description);
        rm60Var.mo56894s("showExpanded");
        ydj.m93455n(item$Group2.showExpanded, this.f6188c, rm60Var, "items");
        this.f6189d.toJson(rm60Var, item$Group2.items);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(32, "GeneratedJsonAdapter(Item.Group)");
    }
}
