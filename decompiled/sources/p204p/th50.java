package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class th50 implements Parcelable {
    public static final Parcelable.Creator<th50> CREATOR = new gd50(2);

    /* JADX INFO: renamed from: a */
    public final agy f220333a;

    public th50(agy agyVar) {
        this.f220333a = agyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof th50) && wj50.m88271j(this.f220333a, ((th50) obj).f220333a);
    }

    public final int hashCode() {
        return this.f220333a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f220333a, i);
    }
}
