package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class yfz implements Parcelable {
    public static final Parcelable.Creator<yfz> CREATOR = new c2z(25);

    /* JADX INFO: renamed from: a */
    public final ArrayList f272389a;

    public yfz(ArrayList arrayList) {
        this.f272389a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yfz) && this.f272389a.equals(((yfz) obj).f272389a);
    }

    public final int hashCode() {
        return this.f272389a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f272389a, parcel);
        while (itM42469m.hasNext()) {
            ((wfz) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
