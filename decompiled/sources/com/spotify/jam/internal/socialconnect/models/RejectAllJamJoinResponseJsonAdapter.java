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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/RejectAllJamJoinResponseJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/RejectAllJamJoinResponse;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class RejectAllJamJoinResponseJsonAdapter extends hk60<RejectAllJamJoinResponse> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4811a = xl60.C2578b.m91389a("join_attempt_ids");

    /* JADX INFO: renamed from: b */
    public final hk60 f4812b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor f4813c;

    public RejectAllJamJoinResponseJsonAdapter(p0i0 p0i0Var) {
        this.f4812b = p0i0Var.m68706f(mp91.m62457j(List.class, String.class), gbu.f78413a, "joinAttemptIds");
    }

    @Override // p204p.hk60
    public final RejectAllJamJoinResponse fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        List list = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4811a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                list = (List) this.f4812b.fromJson(xl60Var);
                i = -2;
            }
        }
        xl60Var.mo51078f();
        if (i == -2) {
            return new RejectAllJamJoinResponse(list);
        }
        Constructor declaredConstructor = this.f4813c;
        if (declaredConstructor == null) {
            declaredConstructor = RejectAllJamJoinResponse.class.getDeclaredConstructor(List.class, Integer.TYPE, f0b1.f64588c);
            this.f4813c = declaredConstructor;
        }
        return (RejectAllJamJoinResponse) declaredConstructor.newInstance(list, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, RejectAllJamJoinResponse rejectAllJamJoinResponse) {
        RejectAllJamJoinResponse rejectAllJamJoinResponse2 = rejectAllJamJoinResponse;
        if (rejectAllJamJoinResponse2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("join_attempt_ids");
        this.f4812b.toJson(rm60Var, rejectAllJamJoinResponse2.joinAttemptIds);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(46, "GeneratedJsonAdapter(RejectAllJamJoinResponse)");
    }
}
