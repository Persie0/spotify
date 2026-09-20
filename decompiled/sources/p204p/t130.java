package p204p;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t130 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final String f216138a;

    /* JADX INFO: renamed from: b */
    public final String f216139b;

    /* JADX INFO: renamed from: c */
    public final List f216140c;

    public t130(String str, List list, String str2) {
        this.f216138a = str;
        this.f216139b = str2;
        this.f216140c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t130.class == obj.getClass()) {
            t130 t130Var = (t130) obj;
            if (TextUtils.equals(this.f216138a, t130Var.f216138a) && TextUtils.equals(this.f216139b, t130Var.f216139b) && this.f216140c.equals(t130Var.f216140c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f216138a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f216139b;
        return this.f216140c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strM36616p;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f216138a;
        if (str != null) {
            strM36616p = dq60.m36616p(this.f216139b, "]", edb.m38572u(" [", str, ", "));
        } else {
            strM36616p = "";
        }
        sb.append(strM36616p);
        return sb.toString();
    }
}
