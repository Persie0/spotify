package p204p;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class x9a {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ PackageManager.ComponentEnabledSetting m90239a(int i, ComponentName componentName) {
        return new PackageManager.ComponentEnabledSetting(componentName, i, 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BoringLayout m90240b(int i, int i2, BoringLayout.Metrics metrics, Layout.Alignment alignment, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, boolean z) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m90241c() {
    }
}
