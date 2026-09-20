package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class mkl implements rkl {
    public static final Parcelable.Creator<mkl> CREATOR = new z4l(27);

    /* JADX INFO: renamed from: a */
    public final ArrayList f144602a;

    public mkl(ArrayList arrayList) {
        this.f144602a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mkl) && this.f144602a.equals(((mkl) obj).f144602a);
    }

    public final int hashCode() {
        return this.f144602a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f144602a, parcel);
        while (itM42469m.hasNext()) {
            ((ekl) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
