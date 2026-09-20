package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class aw30 extends fx30 {
    public static final Parcelable.Creator<aw30> CREATOR = new mz20(29);

    /* JADX INFO: renamed from: c */
    public final int f20367c;

    public aw30(int i) {
        super(20, 1);
        this.f20367c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw30) && this.f20367c == ((aw30) obj).f20367c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f20367c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f20367c;
        if (i2 == 1) {
            str = "DEVICE_PICKER_UPSELL_HEADER";
        } else if (i2 == 2) {
            str = "JAM_QUEUE_UPSELL_HEADER";
        } else if (i2 == 3) {
            str = "DEVICE_PICKER_LEAVE_BUTTON";
        } else if (i2 == 4) {
            str = "JAM_QUEUE_LEAVE_BUTTON";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "MANAGED_PARTICIPANTS_SHEET_LEAVE_BUTTON";
        }
        parcel.writeString(str);
    }
}
