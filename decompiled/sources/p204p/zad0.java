package p204p;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class zad0 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f281041a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m95771a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((tad0) arrayList.get(0)).f218544a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(tad0.m80342i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new euf(new xba0(17), 1));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((tad0) arrayList.get(0)).f218544a)) {
            return;
        }
        arrayList.add((tad0) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: b */
    public static MediaCodecInfo.CodecProfileLevel m95772b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    /* JADX INFO: renamed from: c */
    public static String m95773c(r300 r300Var) {
        lwe lweVarM63007e;
        String str = r300Var.f195387p;
        if ("audio/eac3-joc".equals(str)) {
            if (Objects.equals(Build.MANUFACTURER, "Google")) {
                return null;
            }
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (lweVarM63007e = mwe.m63007e(r300Var)) != null && lweVarM63007e.m60123d()) {
            int iM60122c = lweVarM63007e.m60122c();
            if (iM60122c == 16 || iM60122c == 256) {
                return "video/hevc";
            }
            if (iM60122c == 512) {
                return "video/avc";
            }
            if (iM60122c == 1024) {
                p7f p7fVar = r300Var.f195358H;
                if (p7fVar != null && p7fVar.f174677c == 6 && p7fVar.f174676b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m95774d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static tad0 m95775e(String str) {
        List listM95776f = m95776f(str, false, false);
        if (listM95776f.isEmpty()) {
            return null;
        }
        return (tad0) listM95776f.get(0);
    }

    /* JADX INFO: renamed from: f */
    public static synchronized List m95776f(String str, boolean z, boolean z2) {
        try {
            xad0 xad0Var = new xad0(str, z, z2);
            HashMap map = f281041a;
            List list = (List) map.get(xad0Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListM95777g = m95777g(xad0Var, new cl8(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListM95777g.isEmpty();
            }
            m95771a(str, arrayListM95777g);
            pf40 pf40VarM69791p = pf40.m69791p(arrayListM95777g);
            map.put(xad0Var, pf40VarM69791p);
            return pf40VarM69791p;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX INFO: renamed from: g */
    public static ArrayList m95777g(xad0 xad0Var, cl8 cl8Var) throws MediaCodecUtil$DecoderQueryException {
        int i;
        String strM95774d;
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = xad0Var.f259663a;
            boolean z = xad0Var.f259664b;
            int iM33253w = cl8Var.m33253w();
            int i2 = 0;
            while (i2 < iM33253w) {
                MediaCodecInfo mediaCodecInfoM33254x = cl8Var.m33254x(i2);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 29 || !mediaCodecInfoM33254x.isAlias()) {
                    int i4 = i2;
                    String name = mediaCodecInfoM33254x.getName();
                    if (mediaCodecInfoM33254x.isEncoder() || (strM95774d = m95774d(mediaCodecInfoM33254x, name, str2)) == null) {
                        i = i4;
                    } else {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoM33254x.getCapabilitiesForType(strM95774d);
                            boolean zM33231B = cl8Var.m33231B("tunneled-playback", strM95774d, capabilitiesForType);
                            boolean zM33230A = cl8Var.m33230A("tunneled-playback", capabilitiesForType);
                            boolean z2 = xad0Var.f259665c;
                            if ((z2 || !zM33230A) && (!z2 || zM33231B)) {
                                boolean zM33231B2 = cl8Var.m33231B("secure-playback", strM95774d, capabilitiesForType);
                                boolean zM33230A2 = cl8Var.m33230A("secure-playback", capabilitiesForType);
                                if ((z || !zM33230A2) && (!z || zM33231B2)) {
                                    boolean zIsVendor = true;
                                    boolean zIsHardwareAccelerated = i3 >= 29 ? mediaCodecInfoM33254x.isHardwareAccelerated() : !m95779i(mediaCodecInfoM33254x, str2);
                                    i = i4;
                                    boolean zM95779i = m95779i(mediaCodecInfoM33254x, str2);
                                    if (i3 >= 29) {
                                        zIsVendor = mediaCodecInfoM33254x.isVendor();
                                    } else {
                                        String strM85612A = vie1.m85612A(mediaCodecInfoM33254x.getName());
                                        if (strM85612A.startsWith("omx.google.") || strM85612A.startsWith("c2.android.") || strM85612A.startsWith("c2.google.")) {
                                            zIsVendor = false;
                                        }
                                    }
                                    if (z != zM33231B2) {
                                        continue;
                                    } else {
                                        str = strM95774d;
                                        try {
                                            arrayList.add(tad0.m80342i(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM95779i, zIsVendor, false));
                                        } catch (Exception e) {
                                            e = e;
                                            yif1.m93808r("Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i = i4;
                                }
                            } else {
                                i = i4;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = strM95774d;
                        }
                    }
                } else {
                    i = i2;
                }
                i2 = i + 1;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new MediaCodecUtil$DecoderQueryException("Failed to query underlying media codecs", e3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static wsv0 m95778h(wra wraVar, r300 r300Var, boolean z, boolean z2) {
        List listM88828c = wraVar.m88828c(r300Var.f195387p, z, z2);
        String strM95773c = m95773c(r300Var);
        List listM88828c2 = strM95773c == null ? wsv0.f254763e : wraVar.m88828c(strM95773c, z, z2);
        jf40 jf40VarM69788m = pf40.m69788m();
        jf40VarM69788m.m28987e(listM88828c);
        jf40VarM69788m.m28987e(listM88828c2);
        return jf40VarM69788m.m53150g();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m95779i(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (def0.m35794k(str)) {
            return true;
        }
        String strM85612A = vie1.m85612A(mediaCodecInfo.getName());
        if (strM85612A.startsWith("arc.")) {
            return false;
        }
        if (strM85612A.startsWith("omx.google.") || strM85612A.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strM85612A.startsWith("omx.sec.") && strM85612A.contains(".sw.")) || strM85612A.equals("omx.qcom.video.decoder.hevcswvdec") || strM85612A.startsWith("c2.android.") || strM85612A.startsWith("c2.google.")) {
            return true;
        }
        return (strM85612A.startsWith("omx.") || strM85612A.startsWith("c2.")) ? false : true;
    }
}
