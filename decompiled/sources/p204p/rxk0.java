package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class rxk0 implements Parcelable {
    public static final Parcelable.Creator<rxk0> CREATOR = new oxk0(1);

    /* JADX INFO: renamed from: a */
    public final ArrayList f203619a;

    public rxk0(ArrayList arrayList) {
        this.f203619a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxk0) && this.f203619a.equals(((rxk0) obj).f203619a);
    }

    public final int hashCode() {
        return this.f203619a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f203619a, parcel);
        while (itM42469m.hasNext()) {
            ((pxk0) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
