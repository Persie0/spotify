package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class o6r implements Parcelable {
    public static final Parcelable.Creator<o6r> CREATOR = new o5r(3);

    /* JADX INFO: renamed from: a */
    public String f162403a;

    /* JADX INFO: renamed from: b */
    public String f162404b;

    /* JADX INFO: renamed from: c */
    public long f162405c = 0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.f162403a);
        parcel.writeString(this.f162404b);
        parcel.writeLong(this.f162405c);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
