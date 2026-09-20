package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class j12 extends View.BaseSavedState {
    public static final Parcelable.Creator<j12> CREATOR = new zt1(11);

    /* JADX INFO: renamed from: a */
    public g0m0 f107596a;

    /* JADX INFO: renamed from: b */
    public boolean f107597b;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        g0m0 g0m0Var = this.f107596a;
        parcel.writeInt(g0m0Var == null ? -1 : g0m0Var.ordinal());
        parcel.writeInt(this.f107597b ? 1 : 0);
    }
}
