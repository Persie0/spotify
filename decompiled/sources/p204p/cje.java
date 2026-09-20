package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class cje extends fje {
    @Override // p204p.fje, p204p.x6q0
    /* JADX INFO: renamed from: a */
    public final String mo29381a() {
        return Build.BRAND;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cje)) {
            return false;
        }
        String str = Build.BRAND;
        return wj50.m88271j(str, str);
    }

    public final int hashCode() {
        return Build.BRAND.hashCode();
    }
}
