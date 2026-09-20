package p204p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class itd extends ktd {

    /* JADX INFO: renamed from: a */
    public final String f105515a;

    /* JADX INFO: renamed from: b */
    public final List f105516b;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public itd(String str, List list) {
        this.f105515a = str;
        this.f105516b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itd)) {
            return false;
        }
        itd itdVar = (itd) obj;
        return wj50.m88271j(this.f105515a, itdVar.f105515a) && wj50.m88271j(this.f105516b, itdVar.f105516b);
    }

    public final int hashCode() {
        String str = this.f105515a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f105516b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
