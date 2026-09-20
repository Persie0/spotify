package p204p;

import androidx.car.app.model.Alert;
import com.spotify.betamax.contextplayercoordinatorimpl.model.VideoPlayerCommand;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x7k {

    /* JADX INFO: renamed from: a */
    public final abk f258934a;

    /* JADX INFO: renamed from: b */
    public va9 f258935b;

    /* JADX INFO: renamed from: c */
    public final oe50 f258936c;

    /* JADX INFO: renamed from: d */
    public final hnc0 f258937d;

    /* JADX INFO: renamed from: e */
    public final boolean f258938e;

    /* JADX INFO: renamed from: f */
    public final itb1 f258939f;

    /* JADX INFO: renamed from: h */
    public boolean f258941h;

    /* JADX INFO: renamed from: i */
    public boolean f258942i;

    /* JADX INFO: renamed from: k */
    public VideoPlayerCommand f258944k;

    /* JADX INFO: renamed from: g */
    public int f258940g = 640000;

    /* JADX INFO: renamed from: j */
    public final lwr f258943j = new lwr();

    public x7k(abk abkVar, va9 va9Var, oe50 oe50Var, Observable observable, Observable observable2, Observable observable3, Scheduler scheduler, Observable observable4, hnc0 hnc0Var, boolean z, itb1 itb1Var) {
        this.f258934a = abkVar;
        this.f258935b = va9Var;
        this.f258936c = oe50Var;
        this.f258937d = hnc0Var;
        this.f258938e = z;
        this.f258939f = itb1Var;
    }

    /* JADX INFO: renamed from: a */
    public static noo0 m90155a(VideoPlayerCommand videoPlayerCommand, boolean z) {
        boolean z2 = !videoPlayerCommand.getInitiallyPaused();
        long j = 0;
        long jMax = Math.max(videoPlayerCommand.getSeekToInMs(), 0L);
        Long endPositionInMs = videoPlayerCommand.getEndPositionInMs();
        long jLongValue = endPositionInMs != null ? endPositionInMs.longValue() : 0L;
        if (z && videoPlayerCommand.getAutomaticallySyncToLiveHead()) {
            jLongValue = 0;
        } else {
            j = jMax;
        }
        pm71 timeMeasurementBuilderSnapshot = videoPlayerCommand.getTimeMeasurementBuilderSnapshot();
        return new noo0(j, jLongValue, z2, false, null, timeMeasurementBuilderSnapshot != null ? new rm71(timeMeasurementBuilderSnapshot) : null, videoPlayerCommand.getAutomaticallySyncToLiveHead(), 56);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX INFO: renamed from: b */
    public final l1p0 m90156b(VideoPlayerCommand videoPlayerCommand) {
        String strM93802o;
        int iAbs;
        ws81 trackWithPlayOrigin = videoPlayerCommand.getTrackWithPlayOrigin();
        ContextTrack contextTrack = trackWithPlayOrigin != null ? trackWithPlayOrigin.f254556a : null;
        if (contextTrack != null) {
            xf40 xf40VarMetadata = contextTrack.metadata();
            String str = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_MEDIA_MANIFEST_ID);
            String str2 = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_MEDIA_MANIFEST);
            if (str2 != null) {
                int i = Alert.DURATION_SHOW_INDEFINITELY;
                kzb1 kzb1Var = null;
                for (kzb1 kzb1Var2 : zmg1.m96445l(str2)) {
                    if (g6f.m43725i0(y7k.f270098a, kzb1Var2.m57750b()) && kzb1Var2.m57749a() > 0 && (iAbs = Math.abs(this.f258940g - kzb1Var2.m57749a())) <= i) {
                        kzb1Var = kzb1Var2;
                        i = iAbs;
                    }
                }
                if (kzb1Var != null) {
                    strM93802o = kzb1Var.m57751c();
                } else {
                    strM93802o = null;
                }
            } else {
                strM93802o = null;
            }
            String str3 = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_MEDIA_EXTERNAL_URL);
            if (str != null && str.length() != 0) {
                this.f258936c.getClass();
                strM93802o = yif1.m93802o(str);
            } else if (strM93802o == null || strM93802o.length() == 0) {
                strM93802o = (str3 == null || str3.length() == 0) ? null : str3;
            }
            if (strM93802o != null) {
                boolean zM44261w = gbm.m44261w(contextTrack);
                boolean zM37976J = e72.m37976J(contextTrack);
                boolean z = false;
                boolean z2 = videoPlayerCommand.getIsListPlayer() && this.f258942i;
                LinkedHashMap linkedHashMapM56709v0 = kkc0.m56709v0(qlg1.m73218w(videoPlayerCommand));
                linkedHashMapM56709v0.put("metadata_keys.internal.is_royalty_media", String.valueOf(!zM37976J));
                if (!zM37976J && !z2) {
                    z = true;
                }
                return new l1p0(strM93802o, zM44261w, z, linkedHashMapM56709v0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m90157c(VideoPlayerCommand videoPlayerCommand) {
        Float f;
        s7k configuration = videoPlayerCommand.getConfiguration();
        float fFloatValue = (configuration == null || (f = ((u7k) configuration).f227716a) == null) ? 1.0f : f.floatValue();
        va9 va9Var = this.f258935b;
        if (va9Var != null) {
            m47 m47Var = va9Var.f239155a;
            if (m47Var != null) {
                m47Var.m60767C(fFloatValue);
            }
            m47 m47Var2 = va9Var.f239156b;
            if (m47Var2 != null) {
                m47Var2.m60767C(fFloatValue);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [p.enc0] */
    /* JADX INFO: renamed from: d */
    public final void m90158d(VideoPlayerCommand videoPlayerCommand) {
        String str;
        ?? arrayList;
        long jM54450E;
        zmc0 zmc0Var;
        long j;
        cks cksVar;
        ws81 trackWithPlayOrigin = videoPlayerCommand.getTrackWithPlayOrigin();
        if (trackWithPlayOrigin == null || (str = trackWithPlayOrigin.f254558c) == null) {
            str = "";
        }
        VideoPlayerCommand.Marker[] markers = videoPlayerCommand.getMarkers();
        if (markers != null) {
            arrayList = new ArrayList();
            for (VideoPlayerCommand.Marker marker : markers) {
                if (marker != null) {
                    Integer f3025b = marker.getF3025b();
                    int iIntValue = f3025b != null ? f3025b.intValue() : 0;
                    if (iIntValue < 0 || iIntValue > 100) {
                        zmc0Var = null;
                    } else {
                        Integer f3026c = marker.getF3026c();
                        int iIntValue2 = f3026c != null ? f3026c.intValue() : 0;
                        if (marker.getF3027d() == null || marker.getF3027d().intValue() >= 1000) {
                            String f3024a = marker.getF3024a();
                            hvi0 hvi0Var = cks.f39079b;
                            ils ilsVar = ils.MILLISECONDS;
                            long jM54449D = jwg1.m54449D(iIntValue2, ilsVar);
                            Integer f3027d = marker.getF3027d();
                            if (f3027d != null) {
                                cksVar = new cks(jwg1.m54449D(f3027d.intValue(), ilsVar));
                                j = jM54449D;
                            } else {
                                j = jM54449D;
                                cksVar = null;
                            }
                            zmc0Var = new zmc0(f3024a, iIntValue, j, cksVar);
                        } else {
                            zmc0Var = null;
                        }
                    }
                } else {
                    zmc0Var = null;
                }
                if (zmc0Var != null) {
                    arrayList.add(zmc0Var);
                }
            }
        } else {
            arrayList = lau.f131415a;
        }
        Long markerBoundaryStartInMs = videoPlayerCommand.getMarkerBoundaryStartInMs();
        if (markerBoundaryStartInMs != null) {
            hvi0 hvi0Var2 = cks.f39079b;
            jM54450E = jwg1.m54450E(markerBoundaryStartInMs.longValue(), ils.MILLISECONDS);
        } else {
            hvi0 hvi0Var3 = cks.f39079b;
            jM54450E = 0;
        }
        Long markerBoundaryEndInMs = videoPlayerCommand.getMarkerBoundaryEndInMs();
        cks cksVar2 = markerBoundaryEndInMs != null ? new cks(jwg1.m54450E(markerBoundaryEndInMs.longValue(), ils.MILLISECONDS)) : null;
        hnc0 hnc0Var = this.f258937d;
        hnc0Var.f93296c.put(str, new fnc0(arrayList, jM54450E, cksVar2));
        LinkedHashMap linkedHashMap = hnc0Var.f93295b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (wj50.m88271j(((yzo0) entry.getKey()).metadata().get("playback_id"), str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            ((enc0) ((Map.Entry) it.next()).getValue()).m39491w(arrayList, jM54450E, cksVar2);
        }
    }
}
