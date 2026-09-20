package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class eje extends fje {
    @Override // p204p.fje, p204p.x6q0
    /* JADX INFO: renamed from: a */
    public final String mo29381a() {
        return Build.MODEL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eje)) {
            return false;
        }
        String str = Build.MODEL;
        return wj50.m88271j(str, str);
    }

    public final int hashCode() {
        return Build.MODEL.hashCode();
    }
}
