package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class nkc1 extends View.BaseSavedState {
    public static final Parcelable.Creator<nkc1> CREATOR = new fb31(20);

    /* JADX INFO: renamed from: a */
    public int f154852a;

    /* JADX INFO: renamed from: b */
    public int f154853b;

    /* JADX INFO: renamed from: c */
    public Parcelable f154854c;

    public nkc1(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f154852a);
        parcel.writeInt(this.f154853b);
        parcel.writeParcelable(this.f154854c, i);
    }
}
