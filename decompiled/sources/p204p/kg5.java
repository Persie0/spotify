package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class kg5 {

    /* JADX INFO: renamed from: a */
    public final String f122299a;

    /* JADX INFO: renamed from: b */
    public final vu3 f122300b;

    public kg5(String str, vu3 vu3Var) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        this.f122299a = str;
        this.f122300b = vu3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg5)) {
            return false;
        }
        kg5 kg5Var = (kg5) obj;
        if (!wj50.m88271j(this.f122299a, kg5Var.f122299a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!wj50.m88271j(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return wj50.m88271j(str2, str2) && this.f122300b.equals(kg5Var.f122300b);
    }

    public final int hashCode() {
        return this.f122300b.hashCode() + ((spa0.LOG_ENVIRONMENT_PROD.hashCode() + s571.m77243b((((Build.MODEL.hashCode() + (this.f122299a.hashCode() * 31)) * 31) + 47594039) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f122299a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.0.1, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + spa0.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f122300b + ')';
    }
}
