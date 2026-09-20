package com.spotify.betamax.contextplayercoordinatorimpl.model;

import android.util.Base64;
import com.spotify.performancesdk.timekeeper.proto.TimeMeasurementBuilderSnapshot;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;
import java.io.IOException;
import p204p.hk60;
import p204p.j0c1;
import p204p.l0c1;
import p204p.p0i0;
import p204p.pm71;
import p204p.rm60;
import p204p.s7k;
import p204p.wj50;
import p204p.ws81;
import p204p.xl60;
import p204p.xzg1;

/* JADX INFO: renamed from: com.spotify.betamax.contextplayercoordinatorimpl.model.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0300a extends hk60 {

    /* JADX INFO: renamed from: a */
    public final p0i0 f3031a;

    public C0300a(p0i0 p0i0Var) {
        this.f3031a = p0i0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p204p.hk60
    public final Object fromJson(xl60 xl60Var) {
        pm71 pm71VarM92471p;
        j0c1 j0c1Var;
        Long l;
        xl60Var.mo51076c();
        boolean zMo51080n = true;
        j0c1 j0c1Var2 = null;
        Long lValueOf = null;
        Long lValueOf2 = null;
        String strMo51087y = null;
        String strMo51087y2 = null;
        Long lValueOf3 = null;
        Long lValueOf4 = null;
        ws81 ws81Var = null;
        ws81[] ws81VarArr = null;
        ContextPlayerOptions contextPlayerOptions = null;
        boolean zMo51080n2 = false;
        boolean zMo51080n3 = false;
        boolean zMo51080n4 = false;
        LoggingParams loggingParams = null;
        ContextTrack[] contextTrackArr = null;
        s7k s7kVar = null;
        Long lValueOf5 = null;
        String strMo51087y3 = null;
        Long lValueOf6 = null;
        Long lValueOf7 = null;
        VideoPlayerCommand.Marker[] markerArr = null;
        boolean zMo51080n5 = false;
        while (true) {
            boolean zMo51079i = xl60Var.mo51079i();
            j0c1 j0c1Var3 = j0c1.f107416a;
            if (!zMo51079i) {
                j0c1 j0c1Var4 = j0c1Var2;
                Long l2 = lValueOf;
                xl60Var.mo51078f();
                if (j0c1Var4 != null) {
                    j0c1Var3 = j0c1Var4;
                }
                long jLongValue = l2 != null ? l2.longValue() : lValueOf2 != null ? lValueOf2.longValue() : 0L;
                if (strMo51087y == null) {
                    strMo51087y = "unknown";
                }
                if (strMo51087y2 == null) {
                    pm71VarM92471p = null;
                } else {
                    TimeMeasurementBuilderSnapshot timeMeasurementBuilderSnapshotM17344u = TimeMeasurementBuilderSnapshot.m17344u(Base64.decode(strMo51087y2, 0));
                    wj50.m88279p(timeMeasurementBuilderSnapshotM17344u);
                    pm71VarM92471p = xzg1.m92471p(timeMeasurementBuilderSnapshotM17344u);
                }
                return new VideoPlayerCommand(j0c1Var3, jLongValue, lValueOf3, lValueOf4, ws81Var, ws81VarArr, contextPlayerOptions, zMo51080n2, zMo51080n3, zMo51080n4, strMo51087y, loggingParams, contextTrackArr, s7kVar, lValueOf5, strMo51087y3, pm71VarM92471p, lValueOf6, lValueOf7, markerArr, zMo51080n5, zMo51080n);
            }
            String strMo51084s = xl60Var.mo51084s();
            if (strMo51084s != null) {
                int iHashCode = strMo51084s.hashCode();
                j0c1Var = j0c1Var2;
                l = lValueOf;
                p0i0 p0i0Var = this.f3031a;
                switch (iHashCode) {
                    case -2040777380:
                        if (strMo51084s.equals("initially_paused")) {
                            zMo51080n2 = xl60Var.mo51080n();
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case -1859609167:
                        if (strMo51084s.equals("system_initiated_time")) {
                            lValueOf5 = Long.valueOf(xl60Var.mo51083r());
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case -1576859635:
                        if (strMo51084s.equals("end_position")) {
                            lValueOf3 = Long.valueOf(xl60Var.mo51083r());
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case -1354792126:
                        if (strMo51084s.equals("config")) {
                            s7kVar = (s7k) p0i0Var.m68703c(s7k.class).fromJson(xl60Var);
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case -1263170109:
                        if (strMo51084s.equals("future")) {
                            ws81VarArr = (ws81[]) p0i0Var.m68703c(ws81[].class).fromJson(xl60Var);
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case -1177577971:
                        if (strMo51084s.equals("is_list_player")) {
                            zMo51080n5 = xl60Var.mo51080n();
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case -865716088:
                        if (strMo51084s.equals("tracks")) {
                            contextTrackArr = (ContextTrack[]) p0i0Var.m68703c(ContextTrack[].class).fromJson(xl60Var);
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case -837193114:
                        if (strMo51084s.equals("logging_params")) {
                            loggingParams = (LoggingParams) p0i0Var.m68703c(LoggingParams.class).fromJson(xl60Var);
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case -694231529:
                        if (strMo51084s.equals("automatically_sync_to_live_head")) {
                            zMo51080n = xl60Var.mo51080n();
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case -25593663:
                        if (strMo51084s.equals("start_reason")) {
                            strMo51087y = xl60Var.mo51087y();
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case 3575610:
                        if (strMo51084s.equals("type")) {
                            j0c1Var2 = (j0c1) l0c1.f128360a.m63911y(xl60Var.mo51087y()).mo49280e(j0c1Var3);
                        }
                        lValueOf = l;
                        break;
                    case 110621003:
                        if (strMo51084s.equals("track")) {
                            ws81Var = (ws81) p0i0Var.m68703c(ws81.class).fromJson(xl60Var);
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case 269909803:
                        if (strMo51084s.equals("marker_boundary_end")) {
                            lValueOf7 = Long.valueOf(xl60Var.mo51083r());
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case 747804969:
                        if (strMo51084s.equals("position")) {
                            lValueOf = Long.valueOf(xl60Var.mo51083r());
                            j0c1Var2 = j0c1Var;
                        }
                        break;
                    case 839250809:
                        if (strMo51084s.equals("markers")) {
                            markerArr = (VideoPlayerCommand.Marker[]) p0i0Var.m68703c(VideoPlayerCommand.Marker[].class).fromJson(xl60Var);
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case 888515951:
                        if (strMo51084s.equals("client_offline")) {
                            zMo51080n4 = xl60Var.mo51080n();
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case 1117627590:
                        if (strMo51084s.equals("stop_position")) {
                            lValueOf4 = Long.valueOf(xl60Var.mo51083r());
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case 1455609691:
                        if (strMo51084s.equals("timekeeper_builder")) {
                            strMo51087y2 = xl60Var.mo51087y();
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case 1578925787:
                        if (strMo51084s.equals("system_initiated")) {
                            zMo51080n3 = xl60Var.mo51080n();
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case 1661853540:
                        if (strMo51084s.equals("session_id")) {
                            strMo51087y3 = xl60Var.mo51087y();
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case 1681938240:
                        if (strMo51084s.equals("player_options")) {
                            contextPlayerOptions = (ContextPlayerOptions) p0i0Var.m68703c(ContextPlayerOptions.class).fromJson(xl60Var);
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case 1698391730:
                        if (strMo51084s.equals("marker_boundary_start")) {
                            lValueOf6 = Long.valueOf(xl60Var.mo51083r());
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    case 1971810722:
                        if (strMo51084s.equals("seek_to")) {
                            lValueOf2 = Long.valueOf(xl60Var.mo51083r());
                        }
                        j0c1Var2 = j0c1Var;
                        lValueOf = l;
                        break;
                    default:
                        break;
                }
            } else {
                j0c1Var = j0c1Var2;
                l = lValueOf;
            }
            xl60Var.mo51074Q();
            j0c1Var2 = j0c1Var;
            lValueOf = l;
        }
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Object obj) throws IOException {
        throw new IOException("Serializing VideoPlayerCommand is not supported");
    }
}
