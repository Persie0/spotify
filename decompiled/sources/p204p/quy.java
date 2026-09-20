package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class quy implements uuy {
    public static final Parcelable.Creator<quy> CREATOR = new eqy(8);

    /* JADX INFO: renamed from: a */
    public final String f192836a;

    public quy(String str) {
        this.f192836a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof quy) && wj50.m88271j(this.f192836a, ((quy) obj).f192836a);
    }

    public final int hashCode() {
        return this.f192836a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f192836a);
    }
}
