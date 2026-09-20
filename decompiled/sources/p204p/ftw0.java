package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ftw0 implements Parcelable {
    public static final Parcelable.Creator<ftw0> CREATOR = new b8w0(22);

    /* JADX INFO: renamed from: a */
    public final String f73324a;

    /* JADX INFO: renamed from: b */
    public final int f73325b;

    /* JADX INFO: renamed from: c */
    public final long f73326c;

    public ftw0(long j, int i, String str) {
        this.f73324a = str;
        this.f73325b = i;
        this.f73326c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftw0)) {
            return false;
        }
        ftw0 ftw0Var = (ftw0) obj;
        return wj50.m88271j(this.f73324a, ftw0Var.f73324a) && this.f73325b == ftw0Var.f73325b && this.f73326c == ftw0Var.f73326c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f73326c) + f710.m40938f(this.f73325b, this.f73324a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f73324a);
        int i2 = this.f73325b;
        if (i2 == 1) {
            str = "UNSPECIFIED";
        } else if (i2 == 2) {
            str = "CORRECT";
        } else if (i2 == 3) {
            str = "WRONG";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "TIME_RAN_OUT";
        }
        parcel.writeString(str);
        parcel.writeLong(this.f73326c);
    }
}
