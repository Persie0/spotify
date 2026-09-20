package p204p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class avr {

    /* JADX INFO: renamed from: a */
    public final List f20250a;

    /* JADX INFO: renamed from: b */
    public final String f20251b;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public avr(List list, String str) {
        this.f20250a = list;
        this.f20251b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avr)) {
            return false;
        }
        avr avrVar = (avr) obj;
        return wj50.m88271j(this.f20250a, avrVar.f20250a) && wj50.m88271j(this.f20251b, avrVar.f20251b);
    }

    public final int hashCode() {
        int iHashCode = this.f20250a.hashCode() * 31;
        String str = this.f20251b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
