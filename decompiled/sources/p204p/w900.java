package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w900 implements osi0 {

    /* JADX INFO: renamed from: a */
    public static final String f249047a;

    static {
        StringBuilder sb = new StringBuilder("android.media:");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        f249047a = sb.toString();
        jf40 jf40Var = new jf40(4);
        jf40Var.m28986d("video/avc", "video/3gpp", "video/mp4v-es");
        jf40Var.m28985c("video/hevc");
        if (i >= 33) {
            jf40Var.m28985c("video/dolby-vision");
        }
        if (i >= 34) {
            jf40Var.m28985c("video/av01");
        }
        if (i >= 36) {
            jf40Var.m28985c("video/apv");
        }
        jf40Var.m53150g();
        Object[] objArr = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"};
        jhl0.m53416j(objArr);
        pf40.m69787l(3, objArr);
    }
}
