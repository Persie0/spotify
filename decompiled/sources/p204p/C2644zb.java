package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.zb */
/* JADX INFO: loaded from: classes8.dex */
public final class C2644zb extends AbstractC1662ac implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C2644zb f281194a = new C2644zb();
    public static final Parcelable.Creator<C2644zb> CREATOR = new ora(22);

    @Override // p204p.AbstractC1662ac
    /* JADX INFO: renamed from: c */
    public final boolean mo25408c() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
