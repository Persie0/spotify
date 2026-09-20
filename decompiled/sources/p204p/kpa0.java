package p204p;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class kpa0 {

    /* JADX INFO: renamed from: a */
    public final String f125016a;

    /* JADX INFO: renamed from: b */
    public final LocusId f125017b;

    public kpa0(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f125016a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f125017b = lzj.m60357e(str);
        } else {
            this.f125017b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m57023a() {
        return this.f125016a;
    }

    /* JADX INFO: renamed from: b */
    public final LocusId m57024b() {
        return this.f125017b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kpa0.class != obj.getClass()) {
            return false;
        }
        String str = ((kpa0) obj).f125016a;
        String str2 = this.f125016a;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f125016a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.f125016a.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
