package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ts80 implements nt80 {
    public static final Parcelable.Creator<ts80> CREATOR = new i980(21);

    /* JADX INFO: renamed from: a */
    public final String f223241a;

    public ts80(String str) {
        this.f223241a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ts80) && wj50.m88271j(this.f223241a, ((ts80) obj).f223241a);
    }

    public final int hashCode() {
        return this.f223241a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f223241a);
    }
}
