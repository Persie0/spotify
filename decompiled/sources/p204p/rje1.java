package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class rje1 implements tje1 {

    /* JADX INFO: renamed from: a */
    public static final rje1 f199800a = new rje1();
    public static final Parcelable.Creator<rje1> CREATOR = new xed1(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rje1);
    }

    public final int hashCode() {
        return 1815371013;
    }

    public final String toString() {
        return "Hidden";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
