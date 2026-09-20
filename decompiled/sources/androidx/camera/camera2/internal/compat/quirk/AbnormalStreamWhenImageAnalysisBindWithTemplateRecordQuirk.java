package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Locale;
import p204p.d6n0;

/* JADX INFO: loaded from: classes3.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    /* JADX INFO: renamed from: a */
    public final boolean mo178a() {
        return d6n0.f45731d.equalsIgnoreCase(Build.BRAND) && Build.MODEL.toLowerCase(Locale.US).startsWith("sm-m556");
    }
}
