package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class s200 extends x200 {
    public static final Parcelable.Creator<s200> CREATOR = new ygz(19);

    /* JADX INFO: renamed from: a */
    public final Intent f204869a;

    public s200(Intent intent) {
        this.f204869a = intent;
    }

    /* JADX INFO: renamed from: c */
    public final Intent m76999c() {
        return this.f204869a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f204869a, i);
    }
}
