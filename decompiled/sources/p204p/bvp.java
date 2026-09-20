package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class bvp {

    /* JADX INFO: renamed from: a */
    public final s780 f31411a;

    public bvp(s780 s780Var) {
        this.f31411a = s780Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m30649a(Context context) {
        if (this.f31411a.m77364e()) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            lzj.m60360f0(context, intent);
            return;
        }
        Intent intent2 = new Intent();
        intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        if (Build.VERSION.SDK_INT >= 26) {
            intent2.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent2.putExtra("app_package", context.getPackageName());
            intent2.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        lzj.m60360f0(context, intent2);
    }
}
