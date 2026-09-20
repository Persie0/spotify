package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_ChildrenPageRequestJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$ChildrenPageRequest;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_ChildrenPageRequestJsonAdapter extends hk60<AppProtocol$ChildrenPageRequest> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4472a = xl60.C2578b.m91389a("parent_id", "limit", "offset");

    /* JADX INFO: renamed from: b */
    public final hk60 f4473b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4474c;

    public AppProtocol_ChildrenPageRequestJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4473b = p0i0Var.m68706f(String.class, gbuVar, "parentId");
        this.f4474c = p0i0Var.m68706f(Integer.class, gbuVar, "limit");
    }

    @Override // p204p.hk60
    public final AppProtocol$ChildrenPageRequest fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4472a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K != 0) {
                hk60 hk60Var = this.f4474c;
                if (iMo51071K == 1) {
                    num = (Integer) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    num2 = (Integer) hk60Var.fromJson(xl60Var);
                }
            } else {
                str = (String) this.f4473b.fromJson(xl60Var);
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$ChildrenPageRequest(str, num, num2);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$ChildrenPageRequest appProtocol$ChildrenPageRequest) {
        AppProtocol$ChildrenPageRequest appProtocol$ChildrenPageRequest2 = appProtocol$ChildrenPageRequest;
        if (appProtocol$ChildrenPageRequest2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("parent_id");
        this.f4473b.toJson(rm60Var, appProtocol$ChildrenPageRequest2.parentId);
        rm60Var.mo56894s("limit");
        Integer num = appProtocol$ChildrenPageRequest2.limit;
        hk60 hk60Var = this.f4474c;
        hk60Var.toJson(rm60Var, num);
        rm60Var.mo56894s("offset");
        hk60Var.toJson(rm60Var, appProtocol$ChildrenPageRequest2.offset);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(53, "GeneratedJsonAdapter(AppProtocol.ChildrenPageRequest)");
    }
}
