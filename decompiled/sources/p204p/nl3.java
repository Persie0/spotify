package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class nl3 implements Parcelable {
    public static final Parcelable.Creator<nl3> CREATOR = new bc3(9);

    /* JADX INFO: renamed from: a */
    public final String f154994a;

    public nl3(String str) {
        this.f154994a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nl3) && wj50.m88271j(this.f154994a, ((nl3) obj).f154994a);
    }

    public final int hashCode() {
        return this.f154994a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f154994a);
    }
}
