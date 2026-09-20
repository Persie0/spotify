package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class blg1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<blg1> CREATOR = new g7g1(16);

    /* JADX INFO: renamed from: a */
    public final int f28182a;

    public blg1(int i) {
        this.f28182a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26302H(parcel, 2, this.f28182a);
        alf1.m26331n(iM26329l, parcel);
    }
}
