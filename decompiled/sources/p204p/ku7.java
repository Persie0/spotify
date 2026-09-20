package p204p;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ku7 {

    /* JADX INFO: renamed from: a */
    public boolean f126475a;

    /* JADX INFO: renamed from: b */
    public boolean f126476b;

    public ku7(boolean z, boolean z2) {
        this.f126475a = z;
        this.f126476b = z2;
    }

    public ku7(rwt0 rwt0Var, int i) {
        boolean z;
        switch (i) {
            case 3:
                rwt0Var.getClass();
                ArrayList arrayList = new ArrayList();
                for (nwt0 nwt0Var : (ArrayList) rwt0Var.f203414b) {
                    if (CaptureIntentPreviewQuirk.class.isAssignableFrom(nwt0Var.getClass())) {
                        arrayList.add(nwt0Var);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((CaptureIntentPreviewQuirk) it.next()).mo178a()) {
                        z = true;
                        this.f126475a = z;
                        this.f126476b = rwt0Var.m76580a(ImageCaptureFailedForVideoSnapshotQuirk.class);
                        break;
                    }
                }
                z = false;
                this.f126475a = z;
                this.f126476b = rwt0Var.m76580a(ImageCaptureFailedForVideoSnapshotQuirk.class);
                break;
            default:
                this.f126475a = rwt0Var.m76580a(ImageCaptureFailWithAutoFlashQuirk.class);
                this.f126476b = rbr.f197650a.m76583e(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                break;
        }
    }
}
