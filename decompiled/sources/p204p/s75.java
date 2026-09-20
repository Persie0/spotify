package p204p;

import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class s75 {
    /* JADX INFO: renamed from: a */
    public static int m77358a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static void m77359b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static void m77360c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m77361d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
