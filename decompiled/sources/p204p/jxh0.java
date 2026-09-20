package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jxh0 extends AbstractC2206o9 {
    public static final Parcelable.Creator<jxh0> CREATOR = new tne1(15);

    /* JADX INFO: renamed from: a */
    public final boolean f117140a;

    /* JADX INFO: renamed from: b */
    public final int f117141b;

    public jxh0(boolean z, int i) {
        this.f117140a = z;
        this.f117141b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 1, 4);
        parcel.writeInt(this.f117140a ? 1 : 0);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f117141b);
        alf1.m26316V(iM26314T, parcel);
    }
}
