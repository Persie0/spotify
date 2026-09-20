package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class o0l0 implements Parcelable {
    public static final Parcelable.Creator<o0l0> CREATOR = new oxk0(7);

    /* JADX INFO: renamed from: a */
    public final ArrayList f160421a;

    public o0l0(ArrayList arrayList) {
        this.f160421a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0l0) && this.f160421a.equals(((o0l0) obj).f160421a);
    }

    public final int hashCode() {
        return this.f160421a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f160421a, parcel);
        while (itM42469m.hasNext()) {
            ((m0l0) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
