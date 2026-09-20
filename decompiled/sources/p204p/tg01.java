package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public enum tg01 implements Parcelable {
    INFO(3),
    WARNING(2),
    ERROR(1);

    public static final Parcelable.Creator<tg01> CREATOR = new vcz0(25);

    /* JADX INFO: renamed from: a */
    public final int f220100a;

    tg01(int i) {
        this.f220100a = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m80710c() {
        return this.f220100a;
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
