package p204p;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes4.dex */
public final class r4g1 {

    /* JADX INFO: renamed from: c */
    public static final vah1 f195765c = new vah1("AgeSignalsService");

    /* JADX INFO: renamed from: a */
    public final Context f195766a;

    /* JADX INFO: renamed from: b */
    public final rrg1 f195767b;

    public r4g1(Context context) {
        this.f195766a = context;
        vah1 vah1Var = yxg1.f277250a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (yxg1.m94843a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.f195767b = new rrg1(context, f195765c, f6f1.f66399a);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    vah1Var.m85083c("Play Store package is not found.", new Object[0]);
                }
            } else {
                vah1Var.m85083c("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            vah1Var.m85083c("Play Store package is not found.", new Object[0]);
        }
        this.f195767b = null;
    }
}
