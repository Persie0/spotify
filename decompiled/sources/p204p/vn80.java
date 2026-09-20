package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class vn80 implements Parcelable {
    public static final Parcelable.Creator<vn80> CREATOR = new i980(16);

    /* JADX INFO: renamed from: a */
    public final String f243020a;

    public vn80(String str) {
        this.f243020a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn80) && wj50.m88271j(this.f243020a, ((vn80) obj).f243020a);
    }

    public final int hashCode() {
        return this.f243020a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f243020a);
    }
}
