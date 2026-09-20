package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class vf5 implements Parcelable {
    public static final Parcelable.Creator<vf5> CREATOR = new bc3(28);

    /* JADX INFO: renamed from: a */
    public final String f240896a;

    public vf5(String str) {
        this.f240896a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf5) && wj50.m88271j(this.f240896a, ((vf5) obj).f240896a);
    }

    public final int hashCode() {
        return this.f240896a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f240896a);
    }
}
