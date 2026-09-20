package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/ResolvedJamJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/ResolvedJam;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ResolvedJamJsonAdapter extends hk60<ResolvedJam> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4838a = xl60.C2578b.m91389a("available_jam", "visibility", "resolved_token", "join_options", "correlation_id");

    /* JADX INFO: renamed from: b */
    public final hk60 f4839b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4840c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4841d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4842e;

    /* JADX INFO: renamed from: f */
    public final hk60 f4843f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor f4844g;

    public ResolvedJamJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4839b = p0i0Var.m68706f(AvailableJam.class, gbuVar, "availableJam");
        this.f4840c = p0i0Var.m68706f(Visibility.class, gbuVar, "visibility");
        this.f4841d = p0i0Var.m68706f(mp91.m62457j(List.class, ResolvedToken.class), gbuVar, "resolvedTokens");
        this.f4842e = p0i0Var.m68706f(mp91.m62457j(List.class, JoinOption.class), gbuVar, "joinOptions");
        this.f4843f = p0i0Var.m68706f(String.class, gbuVar, "correlationId");
    }

    @Override // p204p.hk60
    public final ResolvedJam fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        AvailableJam availableJam = null;
        Visibility visibility = null;
        List list = null;
        List list2 = null;
        String str = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4838a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                availableJam = (AvailableJam) this.f4839b.fromJson(xl60Var);
                if (availableJam == null) {
                    throw f0b1.m40470x("availableJam", "available_jam", xl60Var);
                }
            } else if (iMo51071K == 1) {
                visibility = (Visibility) this.f4840c.fromJson(xl60Var);
                if (visibility == null) {
                    throw f0b1.m40470x("visibility", "visibility", xl60Var);
                }
            } else if (iMo51071K == 2) {
                list = (List) this.f4841d.fromJson(xl60Var);
                if (list == null) {
                    throw f0b1.m40470x("resolvedTokens", "resolved_token", xl60Var);
                }
                i &= -5;
            } else if (iMo51071K == 3) {
                list2 = (List) this.f4842e.fromJson(xl60Var);
                if (list2 == null) {
                    throw f0b1.m40470x("joinOptions", "join_options", xl60Var);
                }
                i &= -9;
            } else if (iMo51071K == 4 && (str = (String) this.f4843f.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("correlationId", "correlation_id", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (i == -13) {
            String str2 = str;
            List list3 = list2;
            List list4 = list;
            Visibility visibility2 = visibility;
            AvailableJam availableJam2 = availableJam;
            if (availableJam2 == null) {
                throw f0b1.m40461o("availableJam", "available_jam", xl60Var);
            }
            if (visibility2 == null) {
                throw f0b1.m40461o("visibility", "visibility", xl60Var);
            }
            if (str2 != null) {
                return new ResolvedJam(availableJam2, visibility2, list4, list3, str2);
            }
            throw f0b1.m40461o("correlationId", "correlation_id", xl60Var);
        }
        String str3 = str;
        List list5 = list2;
        List list6 = list;
        Visibility visibility3 = visibility;
        AvailableJam availableJam3 = availableJam;
        Constructor declaredConstructor = this.f4844g;
        if (declaredConstructor == null) {
            declaredConstructor = ResolvedJam.class.getDeclaredConstructor(AvailableJam.class, Visibility.class, List.class, List.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f4844g = declaredConstructor;
        }
        if (availableJam3 == null) {
            throw f0b1.m40461o("availableJam", "available_jam", xl60Var);
        }
        if (visibility3 == null) {
            throw f0b1.m40461o("visibility", "visibility", xl60Var);
        }
        if (str3 != null) {
            return (ResolvedJam) declaredConstructor.newInstance(availableJam3, visibility3, list6, list5, str3, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("correlationId", "correlation_id", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ResolvedJam resolvedJam) {
        ResolvedJam resolvedJam2 = resolvedJam;
        if (resolvedJam2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("available_jam");
        this.f4839b.toJson(rm60Var, resolvedJam2.getAvailableJam());
        rm60Var.mo56894s("visibility");
        this.f4840c.toJson(rm60Var, resolvedJam2.getVisibility());
        rm60Var.mo56894s("resolved_token");
        this.f4841d.toJson(rm60Var, resolvedJam2.getResolvedTokens());
        rm60Var.mo56894s("join_options");
        this.f4842e.toJson(rm60Var, resolvedJam2.getJoinOptions());
        rm60Var.mo56894s("correlation_id");
        this.f4843f.toJson(rm60Var, resolvedJam2.getCorrelationId());
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(33, "GeneratedJsonAdapter(ResolvedJam)");
    }
}
