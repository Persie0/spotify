package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class m0m0 extends View.BaseSavedState {
    public static final Parcelable.Creator<m0m0> CREATOR = new cpl0(6);

    /* JADX INFO: renamed from: a */
    public g0m0 f138701a;

    /* JADX INFO: renamed from: b */
    public boolean f138702b;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        g0m0 g0m0Var = this.f138701a;
        parcel.writeInt(g0m0Var == null ? -1 : g0m0Var.ordinal());
        parcel.writeInt(this.f138702b ? 1 : 0);
    }
}
