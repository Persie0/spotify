package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class djp implements j4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49713a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f49714b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f49715c;

    public /* synthetic */ djp(Context context, String str) {
        this.f49714b = context;
        this.f49715c = str;
    }

    @Override // p204p.j4t0
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f49713a) {
            case 0:
                return new j7v(this.f49714b, (String) this.f49715c);
            default:
                faz fazVar = (faz) this.f49715c;
                String strM41199d = fazVar.m41199d();
                ddo ddoVar = new ddo();
                Context contextM60361g = lzj.m60361g(this.f49714b);
                SharedPreferences sharedPreferences = contextM60361g.getSharedPreferences("com.google.firebase.common.prefs:" + strM41199d, 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextM60361g.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextM60361g.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                ddoVar.f47845a = z;
                return ddoVar;
        }
    }

    public /* synthetic */ djp(faz fazVar, Context context) {
        this.f49715c = fazVar;
        this.f49714b = context;
    }
}
