package p204p;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vu3 {

    /* JADX INFO: renamed from: a */
    public final String f244853a;

    /* JADX INFO: renamed from: b */
    public final String f244854b;

    /* JADX INFO: renamed from: c */
    public final String f244855c;

    /* JADX INFO: renamed from: d */
    public final rhr0 f244856d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f244857e;

    public vu3(String str, String str2, String str3, rhr0 rhr0Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        this.f244853a = str;
        this.f244854b = str2;
        this.f244855c = str3;
        this.f244856d = rhr0Var;
        this.f244857e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu3)) {
            return false;
        }
        vu3 vu3Var = (vu3) obj;
        if (!this.f244853a.equals(vu3Var.f244853a) || !wj50.m88271j(this.f244854b, vu3Var.f244854b) || !wj50.m88271j(this.f244855c, vu3Var.f244855c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return wj50.m88271j(str, str) && this.f244856d.equals(vu3Var.f244856d) && this.f244857e.equals(vu3Var.f244857e);
    }

    public final int hashCode() {
        return this.f244857e.hashCode() + ((this.f244856d.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f244853a.hashCode() * 31, 31, this.f244854b), 31, this.f244855c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f244853a + ", versionName=" + this.f244854b + ", appBuildVersion=" + this.f244855c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f244856d + ", appProcessDetails=" + this.f244857e + ')';
    }
}
