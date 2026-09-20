package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vwt0 implements Parcelable {
    public static final Parcelable.Creator<vwt0> CREATOR = new vit0(13);

    /* JADX INFO: renamed from: a */
    public final String f245553a;

    public vwt0(String str) {
        this.f245553a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwt0) && wj50.m88271j(this.f245553a, ((vwt0) obj).f245553a);
    }

    public final int hashCode() {
        return this.f245553a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f245553a);
    }
}
