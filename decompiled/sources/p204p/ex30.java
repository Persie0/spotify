package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ex30 extends fx30 {
    public static final Parcelable.Creator<ex30> CREATOR = new bw30(26);

    /* JADX INFO: renamed from: c */
    public final String f63662c;

    /* JADX INFO: renamed from: d */
    public final String f63663d;

    public ex30(String str, String str2) {
        super(3, 1);
        this.f63662c = str;
        this.f63663d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex30)) {
            return false;
        }
        ex30 ex30Var = (ex30) obj;
        return wj50.m88271j(this.f63662c, ex30Var.f63662c) && wj50.m88271j(this.f63663d, ex30Var.f63663d);
    }

    public final int hashCode() {
        return this.f63663d.hashCode() + (this.f63662c.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f63662c);
        parcel.writeString(this.f63663d);
    }
}
