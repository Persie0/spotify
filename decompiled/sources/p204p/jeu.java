package p204p;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jeu {

    /* JADX INFO: renamed from: a */
    public static final lj5 f111661a;

    static {
        lj5 lj5Var = new lj5(nqf.m65415b(12));
        ddg1.m35736g(3, "expectedValuesPerKey");
        lj5Var.f133987g = 3;
        f111661a = lj5Var;
    }

    /* JADX INFO: renamed from: a */
    public static int m53109a(int i, int i2) {
        if (i % 10 != 1) {
            return Math.round(i / i2) * i2;
        }
        return (int) (Math.floor(i / i2) * ((double) i2));
    }

    /* JADX INFO: renamed from: b */
    public static int m53110b(MediaCodecInfo mediaCodecInfo, String str, int i) {
        int iMax = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                iMax = Math.max(iMax, codecProfileLevel.level);
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: c */
    public static int m53111c(MediaCodecInfo mediaCodecInfo, String str, int i) {
        MediaCodecInfo.AudioCapabilities audioCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getAudioCapabilities();
        audioCapabilities.getClass();
        int[] supportedSampleRates = audioCapabilities.getSupportedSampleRates();
        int i2 = 0;
        int i3 = Alert.DURATION_SHOW_INDEFINITELY;
        if (supportedSampleRates != null) {
            int length = supportedSampleRates.length;
            while (i2 < length) {
                int i4 = supportedSampleRates[i2];
                if (Math.abs(i4 - i) < Math.abs(i3 - i)) {
                    i3 = i4;
                }
                i2++;
            }
            return i3;
        }
        Range<Integer>[] supportedSampleRateRanges = audioCapabilities.getSupportedSampleRateRanges();
        int length2 = supportedSampleRateRanges.length;
        while (i2 < length2) {
            int iIntValue = ((Integer) supportedSampleRateRanges[i2].clamp(Integer.valueOf(i))).intValue();
            if (Math.abs(iIntValue - i) < Math.abs(i3 - i)) {
                i3 = iIntValue;
            }
            i2++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public static wsv0 m53112d(int i, String str) {
        byte b = 2;
        str.getClass();
        switch (str.hashCode()) {
            case -1851077871:
                b = !str.equals("video/dolby-vision") ? (byte) -1 : (byte) 0;
                break;
            case -1662735862:
                b = !str.equals("video/av01") ? (byte) -1 : (byte) 1;
                break;
            case -1662541442:
                if (!str.equals("video/hevc")) {
                    b = -1;
                }
                break;
            case 1331836730:
                b = !str.equals("video/avc") ? (byte) -1 : (byte) 3;
                break;
            case 1599127257:
                b = !str.equals("video/x-vnd.on2.vp9") ? (byte) -1 : (byte) 4;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                if (i == 7) {
                    return pf40.m69794t(256);
                }
                break;
            case 1:
                if (i == 7) {
                    return pf40.m69794t(2);
                }
                if (i == 6) {
                    return pf40.m69794t(4096);
                }
                break;
            case 2:
                if (i == 7) {
                    return pf40.m69794t(2);
                }
                if (i == 6) {
                    return pf40.m69794t(4096);
                }
                break;
            case 3:
                if (i == 7) {
                    return pf40.m69794t(16);
                }
                break;
            case 4:
                if (i == 7 || i == 6) {
                    return pf40.m69795u(4096, 8192);
                }
                break;
        }
        kf40 kf40Var = pf40.f176960b;
        return wsv0.f254763e;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized pf40 m53113e(String str) {
        m53118j();
        return pf40.m69791p(f111661a.m72264m(vie1.m85612A(str)));
    }

    /* JADX INFO: renamed from: f */
    public static wsv0 m53114f(String str, p7f p7fVar) {
        if (Build.VERSION.SDK_INT < 33 || p7fVar == null) {
            kf40 kf40Var = pf40.f176960b;
            return wsv0.f254763e;
        }
        pf40 pf40VarM53113e = m53113e(str);
        ddg1.m35736g(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        for (int i2 = 0; i2 < pf40VarM53113e.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) pf40VarM53113e.get(i2);
            if (!mediaCodecInfo.isAlias() && m53116h(mediaCodecInfo, str, p7fVar)) {
                int i3 = i + 1;
                int iM32617b = cf40.m32617b(objArrCopyOf.length, i3);
                if (iM32617b > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM32617b);
                }
                objArrCopyOf[i] = mediaCodecInfo;
                i = i3;
            }
        }
        return pf40.m69787l(i, objArrCopyOf);
    }

    /* JADX INFO: renamed from: g */
    public static Size m53115g(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        videoCapabilities.getClass();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int iM53109a = m53109a(i, widthAlignment);
        int iM53109a2 = m53109a(i2, heightAlignment);
        if (m53117i(mediaCodecInfo, str, iM53109a, iM53109a2)) {
            return new Size(iM53109a, iM53109a2);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i3 = 0; i3 < 13; i3++) {
            float f = fArr[i3];
            int iM53109a3 = m53109a(Math.round(i * f), widthAlignment);
            int iM53109a4 = m53109a(Math.round(i2 * f), heightAlignment);
            if (m53117i(mediaCodecInfo, str, iM53109a3, iM53109a4)) {
                return new Size(iM53109a3, iM53109a4);
            }
        }
        int iIntValue = ((Integer) videoCapabilities.getSupportedHeightsFor(((Integer) videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i))).intValue()).clamp(Integer.valueOf(i2))).intValue();
        if (iIntValue != i2) {
            i = m53109a((int) Math.round((((double) i) * ((double) iIntValue)) / ((double) i2)), widthAlignment);
            i2 = m53109a(iIntValue, heightAlignment);
        }
        if (m53117i(mediaCodecInfo, str, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m53116h(MediaCodecInfo mediaCodecInfo, String str, p7f p7fVar) {
        if (str.equals("video/dolby-vision") || mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("hdr-editing") || (p7fVar.f174677c == 7 && Build.VERSION.SDK_INT >= 35 && mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("hlg-editing"))) {
            wsv0 wsv0VarM53112d = m53112d(p7fVar.f174677c, str);
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                if (wsv0VarM53112d.contains(Integer.valueOf(codecProfileLevel.profile))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m53117i(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        videoCapabilities.getClass();
        if (videoCapabilities.isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920 && i2 == 1080) {
            return CamcorderProfile.hasProfile(6);
        }
        if (i == 3840 && i2 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static synchronized void m53118j() {
        if (f111661a.size() == 0) {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        f111661a.m43936j(vie1.m85612A(str), mediaCodecInfo);
                    }
                }
            }
        }
    }
}
