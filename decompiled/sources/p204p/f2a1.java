package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class f2a1 implements Parcelable {
    public static final Parcelable.Creator<f2a1> CREATOR = new f891(29);

    /* JADX INFO: renamed from: a */
    public final String f65142a;

    /* JADX INFO: renamed from: b */
    public final String f65143b;

    public f2a1(String str, String str2) {
        this.f65142a = str;
        this.f65143b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2a1)) {
            return false;
        }
        f2a1 f2a1Var = (f2a1) obj;
        return wj50.m88271j(this.f65142a, f2a1Var.f65142a) && wj50.m88271j(this.f65143b, f2a1Var.f65143b);
    }

    public final int hashCode() {
        return this.f65143b.hashCode() + (this.f65142a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f65142a);
        parcel.writeString(this.f65143b);
    }
}
