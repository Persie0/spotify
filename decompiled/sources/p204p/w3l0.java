package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class w3l0 implements Parcelable {
    public static final Parcelable.Creator<w3l0> CREATOR = new oxk0(27);

    /* JADX INFO: renamed from: a */
    public final ArrayList f247606a;

    public w3l0(ArrayList arrayList) {
        this.f247606a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3l0) && this.f247606a.equals(((w3l0) obj).f247606a);
    }

    public final int hashCode() {
        return this.f247606a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f247606a, parcel);
        while (itM42469m.hasNext()) {
            ((n3l0) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
