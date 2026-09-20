package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class wh10 extends View.BaseSavedState {
    public static final Parcelable.Creator<wh10> CREATOR = new eum0(new hp3());

    /* JADX INFO: renamed from: a */
    public iqk f251225a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f251225a, i);
    }
}
