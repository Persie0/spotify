package p204p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class axo {

    /* JADX INFO: renamed from: a */
    public final Context f20937a;

    /* JADX INFO: renamed from: b */
    public final PackageManager f20938b;

    public axo(Context context) {
        this.f20937a = context;
        this.f20938b = context.getPackageManager();
    }

    /* JADX INFO: renamed from: a */
    public final void m27424a() {
        Context context = this.f20937a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            intent.addFlags(268435456);
            if (this.f20938b.resolveActivity(intent, 0) != null) {
                context.startActivity(intent);
            } else {
                na6.m63971s("Failed to resolve app details settings intent");
            }
        } catch (ActivityNotFoundException e) {
            na6.m63972t("Failed to open app details settings", e);
        } catch (SecurityException e2) {
            na6.m63972t("Failed to open app details settings", e2);
        }
    }
}
