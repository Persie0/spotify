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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/AvailableMemberJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/AvailableMember;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AvailableMemberJsonAdapter extends hk60<AvailableMember> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4705a = xl60.C2578b.m91389a("username", "display_name", "image_url", "is_host", "is_anonymous");

    /* JADX INFO: renamed from: b */
    public final hk60 f4706b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4707c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4708d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor f4709e;

    public AvailableMemberJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4706b = p0i0Var.m68706f(String.class, gbuVar, "username");
        this.f4707c = p0i0Var.m68706f(String.class, gbuVar, "displayName");
        this.f4708d = p0i0Var.m68706f(Boolean.TYPE, gbuVar, "isHost");
    }

    @Override // p204p.hk60
    public final AvailableMember fromJson(xl60 xl60Var) throws NoSuchMethodException {
        Boolean bool = Boolean.FALSE;
        xl60Var.mo51076c();
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool3 = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4705a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f4706b.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("username", "username", xl60Var);
                }
            } else if (iMo51071K == 1) {
                str2 = (String) this.f4707c.fromJson(xl60Var);
                i &= -3;
            } else if (iMo51071K == 2) {
                str3 = (String) this.f4707c.fromJson(xl60Var);
                i &= -5;
            } else if (iMo51071K == 3) {
                bool3 = (Boolean) this.f4708d.fromJson(xl60Var);
                if (bool3 == null) {
                    throw f0b1.m40470x("isHost", "is_host", xl60Var);
                }
            } else if (iMo51071K == 4) {
                bool2 = (Boolean) this.f4708d.fromJson(xl60Var);
                if (bool2 == null) {
                    throw f0b1.m40470x("isAnonymous", "is_anonymous", xl60Var);
                }
                i &= -17;
            } else {
                continue;
            }
        }
        xl60Var.mo51078f();
        if (i == -23) {
            if (str == null) {
                throw f0b1.m40461o("username", "username", xl60Var);
            }
            if (bool3 == null) {
                throw f0b1.m40461o("isHost", "is_host", xl60Var);
            }
            return new AvailableMember(str, str2, str3, bool3.booleanValue(), bool2.booleanValue());
        }
        Constructor declaredConstructor = this.f4709e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = f0b1.f64588c;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = AvailableMember.class.getDeclaredConstructor(String.class, String.class, String.class, cls3, cls3, cls, cls2);
            this.f4709e = declaredConstructor;
        }
        if (str == null) {
            throw f0b1.m40461o("username", "username", xl60Var);
        }
        if (bool3 != null) {
            return (AvailableMember) declaredConstructor.newInstance(str, str2, str3, bool3, bool2, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("isHost", "is_host", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AvailableMember availableMember) {
        AvailableMember availableMember2 = availableMember;
        if (availableMember2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("username");
        this.f4706b.toJson(rm60Var, availableMember2.getUsername());
        rm60Var.mo56894s("display_name");
        String displayName = availableMember2.getDisplayName();
        hk60 hk60Var = this.f4707c;
        hk60Var.toJson(rm60Var, displayName);
        rm60Var.mo56894s("image_url");
        hk60Var.toJson(rm60Var, availableMember2.getImageUrl());
        rm60Var.mo56894s("is_host");
        Boolean boolValueOf = Boolean.valueOf(availableMember2.getIsHost());
        hk60 hk60Var2 = this.f4708d;
        hk60Var2.toJson(rm60Var, boolValueOf);
        rm60Var.mo56894s("is_anonymous");
        hk60Var2.toJson(rm60Var, Boolean.valueOf(availableMember2.getIsAnonymous()));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(37, "GeneratedJsonAdapter(AvailableMember)");
    }
}
