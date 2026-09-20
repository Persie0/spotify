package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class o8b0 extends View.BaseSavedState {
    public static final Parcelable.Creator<o8b0> CREATOR = new l0b0(14);

    /* JADX INFO: renamed from: a */
    public String f162761a;

    /* JADX INFO: renamed from: b */
    public int f162762b;

    /* JADX INFO: renamed from: c */
    public float f162763c;

    /* JADX INFO: renamed from: d */
    public boolean f162764d;

    /* JADX INFO: renamed from: e */
    public String f162765e;

    /* JADX INFO: renamed from: f */
    public int f162766f;

    /* JADX INFO: renamed from: g */
    public int f162767g;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f162761a);
        parcel.writeFloat(this.f162763c);
        parcel.writeInt(this.f162764d ? 1 : 0);
        parcel.writeString(this.f162765e);
        parcel.writeInt(this.f162766f);
        parcel.writeInt(this.f162767g);
    }
}
