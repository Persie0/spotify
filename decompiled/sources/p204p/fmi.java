package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fmi implements Parcelable {
    public static final Parcelable.Creator<fmi> CREATOR = new f2i(8);

    /* JADX INFO: renamed from: a */
    public final int f71054a;

    /* JADX INFO: renamed from: b */
    public final int f71055b;

    public fmi(int i, int i2) {
        this.f71054a = i;
        this.f71055b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmi)) {
            return false;
        }
        fmi fmiVar = (fmi) obj;
        return this.f71054a == fmiVar.f71054a && this.f71055b == fmiVar.f71055b;
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f71054a) * 31;
        int i = this.f71055b;
        return iM38547C + (i == 0 ? 0 : edb.m38547C(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int i2 = this.f71054a;
        if (i2 == 1) {
            str = "NEVER";
        } else if (i2 == 2) {
            str = "DAILY";
        } else if (i2 == 3) {
            str = "WEEKLY";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "MONTHLY";
        }
        parcel.writeString(str);
        int i3 = this.f71055b;
        if (i3 == 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        switch (i3) {
            case 1:
                str2 = "SUNDAY";
                break;
            case 2:
                str2 = "MONDAY";
                break;
            case 3:
                str2 = "TUESDAY";
                break;
            case 4:
                str2 = "WEDNESDAY";
                break;
            case 5:
                str2 = "THURSDAY";
                break;
            case 6:
                str2 = "FRIDAY";
                break;
            case 7:
                str2 = "SATURDAY";
                break;
            default:
                throw null;
        }
        parcel.writeString(str2);
    }
}
