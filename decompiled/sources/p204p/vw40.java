package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class vw40 implements ax40 {
    public static final Parcelable.Creator<vw40> CREATOR = new y240(17);

    /* JADX INFO: renamed from: a */
    public final String f245392a;

    public vw40(String str) {
        this.f245392a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw40) && wj50.m88271j(this.f245392a, ((vw40) obj).f245392a);
    }

    public final int hashCode() {
        return this.f245392a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f245392a);
    }
}
