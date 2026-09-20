package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class sxk0 implements Parcelable {
    public static final Parcelable.Creator<sxk0> CREATOR = new oxk0(2);

    /* JADX INFO: renamed from: a */
    public final ArrayList f214908a;

    public sxk0(ArrayList arrayList) {
        this.f214908a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxk0) && this.f214908a.equals(((sxk0) obj).f214908a);
    }

    public final int hashCode() {
        return this.f214908a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f214908a, parcel);
        while (itM42469m.hasNext()) {
            ((qxk0) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
