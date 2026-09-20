package p204p;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class v4r implements co01 {

    /* JADX INFO: renamed from: a */
    public String f237229a;

    /* JADX INFO: renamed from: b */
    public String f237230b;

    public v4r(n95 n95Var) {
        Context context = (Context) n95Var.f151717a;
        int iM83657A = upf.m83657A(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iM83657A != 0) {
            this.f237229a = "Unity";
            this.f237230b = context.getResources().getString(iM83657A);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f237229a = "Flutter";
                this.f237230b = null;
                Log.isLoggable("FirebaseCrashlytics", 2);
                return;
            } catch (IOException unused) {
            }
        }
        this.f237229a = null;
        this.f237230b = null;
    }

    @Override // p204p.co01
    public frv0 create() {
        return new frv0(new no01(this.f237229a, this.f237230b), 18);
    }
}
