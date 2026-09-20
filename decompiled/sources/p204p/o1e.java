package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class o1e implements p1e {
    public static final Parcelable.Creator<o1e> CREATOR = new j0e(25);

    /* JADX INFO: renamed from: a */
    public final String f160707a;

    public o1e(String str) {
        this.f160707a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1e) && wj50.m88271j(this.f160707a, ((o1e) obj).f160707a);
    }

    public final int hashCode() {
        String str = this.f160707a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f160707a);
    }
}
