package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class bhz implements Parcelable {
    public static final Parcelable.Creator<bhz> CREATOR = new ygz(1);

    /* JADX INFO: renamed from: a */
    public int f27270a;

    /* JADX INFO: renamed from: b */
    public int f27271b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
        sb.append(this.f27270a);
        sb.append(", mAnchorOffset=");
        return edb.m38567p(sb, this.f27271b, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27270a);
        parcel.writeInt(this.f27271b);
    }
}
