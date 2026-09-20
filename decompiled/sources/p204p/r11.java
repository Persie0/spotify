package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class r11 implements u11 {
    public static final Parcelable.Creator<r11> CREATOR = new g11(8);

    /* JADX INFO: renamed from: a */
    public final String f194680a;

    public r11(String str) {
        this.f194680a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r11) && wj50.m88271j(this.f194680a, ((r11) obj).f194680a);
    }

    public final int hashCode() {
        String str = this.f194680a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f194680a);
    }
}
