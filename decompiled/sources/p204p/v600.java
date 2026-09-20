package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class v600 implements Parcelable {
    public static final Parcelable.Creator<v600> CREATOR = new ygz(29);

    /* JADX INFO: renamed from: a */
    public String f237697a;

    /* JADX INFO: renamed from: b */
    public int f237698b;

    public v600(String str, int i) {
        this.f237697a = str;
        this.f237698b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f237697a);
        parcel.writeInt(this.f237698b);
    }
}
