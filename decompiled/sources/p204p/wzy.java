package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class wzy implements Parcelable {
    public static final Parcelable.Creator<wzy> CREATOR = new eqy(24);

    /* JADX INFO: renamed from: a */
    public final ArrayList f256709a;

    public wzy(ArrayList arrayList) {
        this.f256709a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wzy) && this.f256709a.equals(((wzy) obj).f256709a);
    }

    public final int hashCode() {
        return this.f256709a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f256709a, parcel);
        while (itM42469m.hasNext()) {
            ((b3z) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
