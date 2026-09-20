package p204p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.protobuf.AbstractC0269h;
import com.spotify.contexts.ApplicationAndroid;

/* JADX INFO: loaded from: classes.dex */
public final class jg5 implements s4x {

    /* JADX INFO: renamed from: a */
    public final long f112042a;

    /* JADX INFO: renamed from: b */
    public final String f112043b;

    public jg5(Context context, wra0 wra0Var) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            wra0Var.mo46854e("Error in retrieving package information.", e);
            packageInfo = null;
        }
        if (packageInfo == null) {
            this.f112042a = 0L;
            this.f112043b = "";
        } else {
            this.f112042a = packageInfo.versionCode;
            String str = packageInfo.versionName;
            this.f112043b = str != null ? str : "";
        }
    }

    @Override // p204p.s4x
    /* JADX INFO: renamed from: a */
    public final String mo29679a() {
        return "context_application_android";
    }

    @Override // p204p.s4x
    public final AbstractC0269h getData() {
        ig5 ig5VarM8001p = ApplicationAndroid.m8001p();
        ig5VarM8001p.m50509m(this.f112042a);
        ig5VarM8001p.m50510q(this.f112043b);
        return ig5VarM8001p.build();
    }
}
