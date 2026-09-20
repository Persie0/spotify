package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class c3d implements Parcelable {
    public static final Parcelable.Creator<c3d> CREATOR = new qvc(17);

    /* JADX INFO: renamed from: a */
    public final String f33648a;

    public c3d(String str) {
        this.f33648a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3d) && wj50.m88271j(this.f33648a, ((c3d) obj).f33648a);
    }

    public final int hashCode() {
        return this.f33648a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f33648a);
    }
}
