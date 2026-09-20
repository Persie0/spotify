package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class qtg1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<qtg1> CREATOR = new g7g1(23);

    /* JADX INFO: renamed from: a */
    public final String f192383a;

    public qtg1(String str) {
        this.f192383a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26308N(parcel, 2, this.f192383a);
        alf1.m26316V(iM26314T, parcel);
    }
}
