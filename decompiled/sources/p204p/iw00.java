package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class iw00 implements kw00 {
    public static final Parcelable.Creator<iw00> CREATOR = new k700(21);

    /* JADX INFO: renamed from: a */
    public final ArrayList f106314a;

    public iw00(ArrayList arrayList) {
        this.f106314a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iw00) && this.f106314a.equals(((iw00) obj).f106314a);
    }

    public final int hashCode() {
        return this.f106314a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f106314a, parcel);
        while (itM42469m.hasNext()) {
            ((fw00) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
