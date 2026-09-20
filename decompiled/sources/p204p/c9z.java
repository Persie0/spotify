package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class c9z implements Parcelable {
    public static final Parcelable.Creator<c9z> CREATOR = new c2z(19);

    /* JADX INFO: renamed from: a */
    public final String f35677a;

    public c9z(String str) {
        this.f35677a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9z) && wj50.m88271j(this.f35677a, ((c9z) obj).f35677a);
    }

    public final String getUri() {
        return this.f35677a;
    }

    public final int hashCode() {
        return this.f35677a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35677a);
    }
}
