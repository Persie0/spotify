package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class dje extends fje {
    @Override // p204p.fje, p204p.x6q0
    /* JADX INFO: renamed from: a */
    public final String mo29381a() {
        return Build.MANUFACTURER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dje)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return wj50.m88271j(str, str);
    }

    public final int hashCode() {
        return Build.MANUFACTURER.hashCode();
    }
}
