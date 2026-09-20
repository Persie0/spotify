package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class zq9 implements Parcelable {
    public static final Parcelable.Creator<zq9> CREATOR = new dc9(11);

    /* JADX INFO: renamed from: a */
    public final ArrayList f285333a;

    public zq9(ArrayList arrayList) {
        this.f285333a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zq9) && this.f285333a.equals(((zq9) obj).f285333a);
    }

    public final int hashCode() {
        return this.f285333a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f285333a, parcel);
        while (itM42469m.hasNext()) {
            ((kq51) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
