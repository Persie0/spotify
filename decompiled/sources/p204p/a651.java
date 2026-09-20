package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class a651 implements Parcelable {
    public static final Parcelable.Creator<a651> CREATOR = new q051(20);

    /* JADX INFO: renamed from: a */
    public Parcelable f12699a;

    /* JADX INFO: renamed from: b */
    public int f12700b;

    /* JADX INFO: renamed from: c */
    public int f12701c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f12699a, i);
        parcel.writeInt(this.f12700b);
        parcel.writeInt(this.f12701c);
    }
}
