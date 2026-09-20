package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class vf20 extends View.BaseSavedState {
    public static final Parcelable.Creator<vf20> CREATOR = new eum0(new bc5(13));

    /* JADX INFO: renamed from: a */
    public float f240879a;

    /* JADX INFO: renamed from: b */
    public boolean f240880b;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f240879a);
        parcel.writeInt(this.f240880b ? 1 : 0);
    }
}
