package com.spotify.connectivity.pubsubokhttp;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/connectivity/pubsubokhttp/MoshiDealerMessageParser_MoshiDealerMessageResponseJsonAdapter;", "Lp/hk60;", "Lcom/spotify/connectivity/pubsubokhttp/MoshiDealerMessageParser$MoshiDealerMessageResponse;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_connectivity_pubsubokhttp-pubsubokhttp"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MoshiDealerMessageParser_MoshiDealerMessageResponseJsonAdapter extends hk60<MoshiDealerMessageParser$MoshiDealerMessageResponse> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3448a = xl60.C2578b.m91389a("type", "key", "payload");

    /* JADX INFO: renamed from: b */
    public final hk60 f3449b;

    public MoshiDealerMessageParser_MoshiDealerMessageResponseJsonAdapter(p0i0 p0i0Var) {
        this.f3449b = p0i0Var.m68706f(String.class, gbu.f78413a, "type");
    }

    @Override // p204p.hk60
    public final MoshiDealerMessageParser$MoshiDealerMessageResponse fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f3448a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f3449b;
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
                } else if (iMo51071K == 2 && (str3 = (String) hk60Var.fromJson(xl60Var)) == null) {
                    throw f0b1.m40470x("payload", "payload", xl60Var);
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
        if (str3 != null) {
            return new MoshiDealerMessageParser$MoshiDealerMessageResponse(str, str2, str3);
        }
        throw f0b1.m40461o("payload", "payload", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, MoshiDealerMessageParser$MoshiDealerMessageResponse moshiDealerMessageParser$MoshiDealerMessageResponse) {
        MoshiDealerMessageParser$MoshiDealerMessageResponse moshiDealerMessageParser$MoshiDealerMessageResponse2 = moshiDealerMessageParser$MoshiDealerMessageResponse;
        if (moshiDealerMessageParser$MoshiDealerMessageResponse2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("type");
        String str = moshiDealerMessageParser$MoshiDealerMessageResponse2.type;
        hk60 hk60Var = this.f3449b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("key");
        hk60Var.toJson(rm60Var, moshiDealerMessageParser$MoshiDealerMessageResponse2.key);
        rm60Var.mo56894s("payload");
        hk60Var.toJson(rm60Var, moshiDealerMessageParser$MoshiDealerMessageResponse2.payload);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(73, "GeneratedJsonAdapter(MoshiDealerMessageParser.MoshiDealerMessageResponse)");
    }
}
