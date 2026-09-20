package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SocialConnectErrorResponseJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/SocialConnectErrorResponse;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SocialConnectErrorResponseJsonAdapter extends hk60<SocialConnectErrorResponse> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4949a = xl60.C2578b.m91389a("code", "message");

    /* JADX INFO: renamed from: b */
    public final hk60 f4950b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4951c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f4952d;

    public SocialConnectErrorResponseJsonAdapter(p0i0 p0i0Var) {
        Class cls = Integer.TYPE;
        gbu gbuVar = gbu.f78413a;
        this.f4950b = p0i0Var.m68706f(cls, gbuVar, "code");
        this.f4951c = p0i0Var.m68706f(String.class, gbuVar, "message");
    }

    @Override // p204p.hk60
    public final SocialConnectErrorResponse fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        Integer num = null;
        String str = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4949a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                num = (Integer) this.f4950b.fromJson(xl60Var);
                if (num == null) {
                    throw f0b1.m40470x("code", "code", xl60Var);
                }
            } else if (iMo51071K == 1) {
                str = (String) this.f4951c.fromJson(xl60Var);
                i = -3;
            }
        }
        xl60Var.mo51078f();
        if (i == -3) {
            if (num != null) {
                return new SocialConnectErrorResponse(num.intValue(), str);
            }
            throw f0b1.m40461o("code", "code", xl60Var);
        }
        Constructor declaredConstructor = this.f4952d;
        if (declaredConstructor == null) {
            Class<?> cls = f0b1.f64588c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = SocialConnectErrorResponse.class.getDeclaredConstructor(cls2, String.class, cls2, cls);
            this.f4952d = declaredConstructor;
        }
        if (num != null) {
            return (SocialConnectErrorResponse) declaredConstructor.newInstance(num, str, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("code", "code", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, SocialConnectErrorResponse socialConnectErrorResponse) {
        SocialConnectErrorResponse socialConnectErrorResponse2 = socialConnectErrorResponse;
        if (socialConnectErrorResponse2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("code");
        this.f4950b.toJson(rm60Var, Integer.valueOf(socialConnectErrorResponse2.code));
        rm60Var.mo56894s("message");
        this.f4951c.toJson(rm60Var, socialConnectErrorResponse2.message);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(48, "GeneratedJsonAdapter(SocialConnectErrorResponse)");
    }
}
