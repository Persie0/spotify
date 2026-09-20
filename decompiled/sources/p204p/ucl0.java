package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ucl0 implements wcl0 {
    public static final Parcelable.Creator<ucl0> CREATOR = new hbl0(18);

    /* JADX INFO: renamed from: a */
    public final String f229081a;

    public ucl0(String str) {
        this.f229081a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ucl0) && wj50.m88271j(this.f229081a, ((ucl0) obj).f229081a);
    }

    public final int hashCode() {
        return this.f229081a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f229081a);
    }
}
