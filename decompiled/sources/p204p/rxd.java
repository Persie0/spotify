package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rxd implements sxd {
    public static final Parcelable.Creator<rxd> CREATOR = new fjd(21);

    /* JADX INFO: renamed from: a */
    public final String f203575a;

    /* JADX INFO: renamed from: b */
    public final List f203576b;

    public rxd(String str, List list) {
        this.f203575a = str;
        this.f203576b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxd)) {
            return false;
        }
        rxd rxdVar = (rxd) obj;
        return wj50.m88271j(this.f203575a, rxdVar.f203575a) && wj50.m88271j(this.f203576b, rxdVar.f203576b);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m76612h0() {
        return this.f203575a;
    }

    public final int hashCode() {
        String str = this.f203575a;
        return this.f203576b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f203575a);
        Iterator itM42468l = fr0.m42468l(parcel, this.f203576b);
        while (itM42468l.hasNext()) {
            ((wn50) itM42468l.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ rxd(String str) {
        this(str, lau.f131415a);
    }
}
