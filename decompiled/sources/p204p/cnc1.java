package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class cnc1 implements Parcelable {
    public static final Parcelable.Creator<cnc1> CREATOR = new vmc1(4);

    /* JADX INFO: renamed from: a */
    public final String f39950a;

    /* JADX INFO: renamed from: b */
    public final String f39951b;

    public cnc1(String str, String str2) {
        this.f39950a = str;
        this.f39951b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnc1)) {
            return false;
        }
        cnc1 cnc1Var = (cnc1) obj;
        return wj50.m88271j(this.f39950a, cnc1Var.f39950a) && wj50.m88271j(this.f39951b, cnc1Var.f39951b);
    }

    public final int hashCode() {
        int iHashCode = this.f39950a.hashCode() * 31;
        String str = this.f39951b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39950a);
        parcel.writeString(this.f39951b);
    }
}
