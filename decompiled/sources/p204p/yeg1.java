package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class yeg1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<yeg1> CREATOR = new g7g1(13);

    /* JADX INFO: renamed from: a */
    public final boolean f271994a;

    public yeg1(boolean z) {
        this.f271994a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26295A(parcel, 2, this.f271994a);
        alf1.m26331n(iM26329l, parcel);
    }
}
