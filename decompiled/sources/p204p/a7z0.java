package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class a7z0 implements Parcelable {
    public static final Parcelable.Creator<a7z0> CREATOR = new lpy0(25);

    /* JADX INFO: renamed from: a */
    public final ArrayList f13152a;

    public a7z0(ArrayList arrayList) {
        this.f13152a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7z0) && this.f13152a.equals(((a7z0) obj).f13152a);
    }

    public final int hashCode() {
        return this.f13152a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f13152a, parcel);
        while (itM42469m.hasNext()) {
            ((jyy) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
