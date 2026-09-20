package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes4.dex */
public final class hba extends AbstractC2202o5 {
    public static final Parcelable.Creator<hba> CREATOR = new fb31(2);

    /* JADX INFO: renamed from: c */
    public final int f89461c;

    /* JADX INFO: renamed from: d */
    public final int f89462d;

    /* JADX INFO: renamed from: e */
    public final boolean f89463e;

    /* JADX INFO: renamed from: f */
    public final boolean f89464f;

    /* JADX INFO: renamed from: g */
    public final boolean f89465g;

    public hba(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f89461c = parcel.readInt();
        this.f89462d = parcel.readInt();
        this.f89463e = parcel.readInt() == 1;
        this.f89464f = parcel.readInt() == 1;
        this.f89465g = parcel.readInt() == 1;
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f89461c);
        parcel.writeInt(this.f89462d);
        parcel.writeInt(this.f89463e ? 1 : 0);
        parcel.writeInt(this.f89464f ? 1 : 0);
        parcel.writeInt(this.f89465g ? 1 : 0);
    }

    public hba(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f89461c = bottomSheetBehavior.f2010G;
        this.f89462d = bottomSheetBehavior.f2031d;
        this.f89463e = bottomSheetBehavior.f2029b;
        this.f89464f = bottomSheetBehavior.f2007D;
        this.f89465g = bottomSheetBehavior.f2008E;
    }
}
