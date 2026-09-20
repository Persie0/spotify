package p204p;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.util.DisplayMetrics;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class iqa {
    /* JADX INFO: renamed from: a */
    public static String m51350a(Context context) {
        return context.getAttributionTag();
    }

    /* JADX INFO: renamed from: b */
    public static void m51351b(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    /* JADX INFO: renamed from: c */
    public static final void m51352c(Dialog dialog, float f) {
        int iWidth;
        Window window = dialog.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                iWidth = window.getWindowManager().getCurrentWindowMetrics().getBounds().width();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                iWidth = displayMetrics.widthPixels;
            }
            window.setLayout((int) (iWidth * f), -2);
        }
    }
}
