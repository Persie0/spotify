package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class arc1 implements brc1 {
    public static final Parcelable.Creator<arc1> CREATOR = new vmc1(11);

    /* JADX INFO: renamed from: a */
    public final ArrayList f19017a;

    public arc1(ArrayList arrayList) {
        this.f19017a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof arc1) && this.f19017a.equals(((arc1) obj).f19017a);
    }

    public final int hashCode() {
        return this.f19017a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f19017a, parcel);
        while (itM42469m.hasNext()) {
            ((yqc1) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
