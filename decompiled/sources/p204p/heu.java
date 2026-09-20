package p204p;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class heu implements wfq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f90508b;

    public /* synthetic */ heu(String str, int i) {
        this.f90507a = i;
        this.f90508b = str;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    @Override // p204p.wfq0
    public final boolean apply(Object obj) {
        int i = this.f90507a;
        boolean zM60337O = false;
        String str = this.f90508b;
        switch (i) {
            case 0:
                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
                lj5 lj5Var = jeu.f111661a;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    return lzj.m60336N(mediaCodecInfo);
                }
                if (i2 >= 29) {
                    zM60337O = lzj.m60337O(mediaCodecInfo);
                } else if (def0.m35794k(str)) {
                    zM60337O = true;
                } else {
                    String strM85612A = vie1.m85612A(mediaCodecInfo.getName());
                    if (!strM85612A.startsWith("arc.") && (strM85612A.startsWith("omx.google.") || strM85612A.startsWith("omx.ffmpeg.") || ((strM85612A.startsWith("omx.sec.") && strM85612A.contains(".sw.")) || strM85612A.equals("omx.qcom.video.decoder.hevcswvdec") || strM85612A.startsWith("c2.android.") || strM85612A.startsWith("c2.google.") || (!strM85612A.startsWith("omx.") && !strM85612A.startsWith("c2."))))) {
                        zM60337O = true;
                    }
                }
                return !zM60337O;
            default:
                String str2 = (String) ((Map.Entry) obj).getKey();
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(".");
                return str.startsWith(sb.toString()) || str.equals(str2);
        }
    }
}
