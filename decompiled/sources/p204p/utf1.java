package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class utf1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<utf1> CREATOR = new nlf1(23);

    /* JADX INFO: renamed from: a */
    public final int f233911a;

    /* JADX INFO: renamed from: b */
    public final int f233912b;

    public utf1(int i, int i2) {
        this.f233911a = i;
        this.f233912b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f233911a);
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(this.f233912b);
        alf1.m26316V(iM26314T, parcel);
    }
}
