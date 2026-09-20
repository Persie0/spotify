package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class j2d implements Parcelable {
    public static final Parcelable.Creator<j2d> CREATOR = new qvc(13);

    /* JADX INFO: renamed from: a */
    public final i2d f108009a;

    public j2d(i2d i2dVar) {
        this.f108009a = i2dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2d) && wj50.m88271j(this.f108009a, ((j2d) obj).f108009a);
    }

    public final int hashCode() {
        return this.f108009a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f108009a, i);
    }
}
