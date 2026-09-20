package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class k75 extends View.BaseSavedState {
    public static final Parcelable.Creator<k75> CREATOR = new bc3(25);

    /* JADX INFO: renamed from: a */
    public boolean f119979a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f119979a ? (byte) 1 : (byte) 0);
    }
}
