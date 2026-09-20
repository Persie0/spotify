package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ggj0 extends View.BaseSavedState {
    public static final Parcelable.Creator<ggj0> CREATOR = new fgj0(0);

    /* JADX INFO: renamed from: a */
    public int f79686a;

    public ggj0(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return klh.m56832d(this.f79686a, "}", sb);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f79686a);
    }
}
