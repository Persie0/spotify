package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class p0l0 implements Parcelable {
    public static final Parcelable.Creator<p0l0> CREATOR = new oxk0(8);

    /* JADX INFO: renamed from: a */
    public final ArrayList f172711a;

    public p0l0(ArrayList arrayList) {
        this.f172711a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0l0) && this.f172711a.equals(((p0l0) obj).f172711a);
    }

    public final int hashCode() {
        return this.f172711a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f172711a, parcel);
        while (itM42469m.hasNext()) {
            ((n0l0) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
