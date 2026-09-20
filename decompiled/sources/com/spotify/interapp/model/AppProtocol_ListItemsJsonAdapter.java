package com.spotify.interapp.model;

import java.util.List;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_ListItemsJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$ListItems;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_ListItemsJsonAdapter extends hk60<AppProtocol$ListItems> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4508a = xl60.C2578b.m91389a("limit", "offset", "total", "items");

    /* JADX INFO: renamed from: b */
    public final hk60 f4509b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4510c;

    public AppProtocol_ListItemsJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4509b = p0i0Var.m68706f(Integer.class, gbuVar, "limit");
        this.f4510c = p0i0Var.m68706f(mp91.m62457j(List.class, AppProtocol$ListItem.class), gbuVar, "items");
    }

    @Override // p204p.hk60
    public final AppProtocol$ListItems fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        List list = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4508a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f4509b;
                if (iMo51071K == 0) {
                    num = (Integer) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 1) {
                    num2 = (Integer) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    num3 = (Integer) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 3) {
                    list = (List) this.f4510c.fromJson(xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$ListItems(num, num2, num3, list);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$ListItems appProtocol$ListItems) {
        AppProtocol$ListItems appProtocol$ListItems2 = appProtocol$ListItems;
        if (appProtocol$ListItems2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("limit");
        Integer num = appProtocol$ListItems2.limit;
        hk60 hk60Var = this.f4509b;
        hk60Var.toJson(rm60Var, num);
        rm60Var.mo56894s("offset");
        hk60Var.toJson(rm60Var, appProtocol$ListItems2.offset);
        rm60Var.mo56894s("total");
        hk60Var.toJson(rm60Var, appProtocol$ListItems2.total);
        rm60Var.mo56894s("items");
        this.f4510c.toJson(rm60Var, appProtocol$ListItems2.items);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(43, "GeneratedJsonAdapter(AppProtocol.ListItems)");
    }
}
