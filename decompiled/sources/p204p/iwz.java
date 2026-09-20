package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class iwz implements Parcelable {
    public static final Parcelable.Creator<iwz> CREATOR = new ygz(16);

    /* JADX INFO: renamed from: a */
    public final String f106533a;

    public iwz(String str) {
        this.f106533a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwz) && wj50.m88271j(this.f106533a, ((iwz) obj).f106533a);
    }

    public final int hashCode() {
        return this.f106533a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106533a);
    }
}
