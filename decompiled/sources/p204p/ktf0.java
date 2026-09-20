package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ktf0 implements mtf0 {

    /* JADX INFO: renamed from: a */
    public static final ktf0 f126286a = new ktf0();

    /* JADX INFO: renamed from: b */
    public static final otf0 f126287b = new otf0("reorder_confirmation");
    public static final Parcelable.Creator<ktf0> CREATOR = new r4f0(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ktf0);
    }

    public final int hashCode() {
        return -104075194;
    }

    public final String toString() {
        return "ReorderConfirmation";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // p204p.mtf0
    /* JADX INFO: renamed from: y */
    public final /* bridge */ /* synthetic */ ptf0 mo54285y() {
        return f126287b;
    }
}
