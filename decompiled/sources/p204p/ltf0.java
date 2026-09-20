package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ltf0 implements mtf0 {

    /* JADX INFO: renamed from: a */
    public static final ltf0 f136771a = new ltf0();

    /* JADX INFO: renamed from: b */
    public static final otf0 f136772b = new otf0("shuffle_on_nudge");
    public static final Parcelable.Creator<ltf0> CREATOR = new r4f0(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ltf0);
    }

    public final int hashCode() {
        return -690210803;
    }

    public final String toString() {
        return "ShuffleOnNudge";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // p204p.mtf0
    /* JADX INFO: renamed from: y */
    public final /* bridge */ /* synthetic */ ptf0 mo54285y() {
        return f136772b;
    }
}
