package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class vi30 extends View.BaseSavedState {
    public static final Parcelable.Creator<vi30> CREATOR = new eum0(new sp5(13));

    /* JADX INFO: renamed from: a */
    public iqk f241608a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f241608a, i);
    }
}
