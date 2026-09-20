package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public enum trc0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    SAVE("save"),
    ICON_RELEASED("IconReleased");

    public static final Parcelable.Creator<trc0> CREATOR = new f4c0(12);

    /* JADX INFO: renamed from: a */
    public final String f223042a;

    trc0(String str) {
        this.f223042a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
