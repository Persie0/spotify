package p204p;

import android.os.Build;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes3.dex */
public final class qf71 {

    /* JADX INFO: renamed from: a */
    public static final qf71 f188136a = new qf71();

    /* JADX INFO: renamed from: a */
    public final void m72690a(RemoteViews remoteViews, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setInt(i, "setGravity", i2);
            return;
        }
        throw new IllegalArgumentException(("setGravity is only available on SDK 31 and higher").toString());
    }
}
