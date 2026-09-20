package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class rw30 extends fx30 {
    public static final Parcelable.Creator<rw30> CREATOR = new bw30(13);

    /* JADX INFO: renamed from: c */
    public final boolean f203243c;

    /* JADX INFO: renamed from: d */
    public final String f203244d;

    public rw30(boolean z, String str) {
        super(10, 1);
        this.f203243c = z;
        this.f203244d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw30)) {
            return false;
        }
        rw30 rw30Var = (rw30) obj;
        return this.f203243c == rw30Var.f203243c && wj50.m88271j(this.f203244d, rw30Var.f203244d);
    }

    public final int hashCode() {
        return this.f203244d.hashCode() + (Boolean.hashCode(this.f203243c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f203243c ? 1 : 0);
        parcel.writeString(this.f203244d);
    }
}
