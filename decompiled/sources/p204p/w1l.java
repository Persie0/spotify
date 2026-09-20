package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class w1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f247116a;

    /* JADX INFO: renamed from: b */
    public final int f247117b;

    public w1l(boolean z, int i) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        this.f247116a = z;
        this.f247117b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1l)) {
            return false;
        }
        w1l w1lVar = (w1l) obj;
        if (this.f247116a != w1lVar.f247116a) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        if (!wj50.m88271j(str, str) || this.f247117b != w1lVar.f247117b) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!wj50.m88271j(str2, str2)) {
            return false;
        }
        String str3 = Build.MODEL;
        return wj50.m88271j(str3, str3);
    }

    public final int hashCode() {
        return Build.MODEL.hashCode() + s571.m77243b(mt60.m62800g(this.f247117b, s571.m77243b(Boolean.hashCode(this.f247116a) * 31, 31, Build.VERSION.RELEASE), 31), 31, Build.MANUFACTURER);
    }
}
