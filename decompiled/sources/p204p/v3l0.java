package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class v3l0 implements Parcelable {
    public static final Parcelable.Creator<v3l0> CREATOR = new oxk0(26);

    /* JADX INFO: renamed from: a */
    public final ArrayList f236902a;

    public v3l0(ArrayList arrayList) {
        this.f236902a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3l0) && this.f236902a.equals(((v3l0) obj).f236902a);
    }

    public final int hashCode() {
        return this.f236902a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f236902a, parcel);
        while (itM42469m.hasNext()) {
            ((m3l0) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
