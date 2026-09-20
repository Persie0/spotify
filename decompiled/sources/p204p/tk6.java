package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class tk6 implements Parcelable {
    public static final Parcelable.Creator<tk6> CREATOR = new fi6(9);

    /* JADX INFO: renamed from: a */
    public final String f221090a;

    public tk6(String str) {
        this.f221090a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk6) && wj50.m88271j(this.f221090a, ((tk6) obj).f221090a);
    }

    public final int hashCode() {
        return this.f221090a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f221090a);
    }
}
