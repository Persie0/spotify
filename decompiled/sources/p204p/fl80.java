package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class fl80 implements Parcelable {
    public static final Parcelable.Creator<fl80> CREATOR = new n6f1(26);

    /* JADX INFO: renamed from: a */
    public int f70722a;

    /* JADX INFO: renamed from: b */
    public int f70723b;

    /* JADX INFO: renamed from: c */
    public boolean f70724c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f70722a);
        parcel.writeInt(this.f70723b);
        parcel.writeInt(this.f70724c ? 1 : 0);
    }
}
