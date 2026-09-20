package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class x0l implements h2l {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0l)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return wj50.m88271j(str, str);
    }

    public final int hashCode() {
        return Build.MANUFACTURER.hashCode();
    }
}
