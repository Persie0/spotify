package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class nd61 extends View.BaseSavedState {
    public static final Parcelable.Creator<nd61> CREATOR = new e361(28);

    /* JADX INFO: renamed from: a */
    public final boolean f152693a;

    public nd61(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.f152693a = z;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f152693a ? (byte) 1 : (byte) 0);
    }

    public nd61(Parcel parcel) {
        super(parcel);
        this.f152693a = parcel.readByte() != 0;
    }
}
