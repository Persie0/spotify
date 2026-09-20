package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class cat0 implements Parcelable {
    public static final Parcelable.Creator<cat0> CREATOR = new wds0(25);

    /* JADX INFO: renamed from: a */
    public final Boolean f35929a;

    public cat0(Boolean bool) {
        this.f35929a = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cat0) && wj50.m88271j(this.f35929a, ((cat0) obj).f35929a);
    }

    public final int hashCode() {
        Boolean bool = this.f35929a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.f35929a;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool);
        }
    }
}
