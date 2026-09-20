package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class i8a0 implements Parcelable {
    public static final Parcelable.Creator<i8a0> CREATOR = new ra90(27);

    /* JADX INFO: renamed from: a */
    public final String f99750a;

    public i8a0(String str) {
        this.f99750a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8a0) && wj50.m88271j(this.f99750a, ((i8a0) obj).f99750a);
    }

    public final int hashCode() {
        String str = this.f99750a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f99750a);
    }
}
