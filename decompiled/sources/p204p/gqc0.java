package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public enum gqc0 implements Parcelable {
    LIGHT("TEXT_LIGHT"),
    DARK("TEXT_DARK"),
    EMPTY("TEXT_EMPTY");

    public static final Parcelable.Creator<gqc0> CREATOR = new f4c0(11);

    /* JADX INFO: renamed from: a */
    public final String f83438a;

    gqc0(String str) {
        this.f83438a = str;
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
