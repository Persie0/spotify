package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class vw30 extends fx30 {
    public static final Parcelable.Creator<vw30> CREATOR = new bw30(17);

    /* JADX INFO: renamed from: c */
    public final String f245387c;

    public vw30(String str) {
        super(32, 1);
        this.f245387c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw30) && wj50.m88271j(this.f245387c, ((vw30) obj).f245387c);
    }

    public final int hashCode() {
        String str = this.f245387c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f245387c);
    }
}
