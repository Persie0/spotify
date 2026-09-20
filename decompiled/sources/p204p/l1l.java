package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class l1l implements h2l {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1l)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return wj50.m88271j(str, str);
    }

    public final int hashCode() {
        return Build.VERSION.RELEASE.hashCode();
    }
}
