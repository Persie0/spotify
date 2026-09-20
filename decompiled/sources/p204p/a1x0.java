package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class a1x0 implements Parcelable {
    public static final Parcelable.Creator<a1x0> CREATOR = new luh0(13);

    /* JADX INFO: renamed from: a */
    public final int f11487a;

    /* JADX INFO: renamed from: b */
    public final int f11488b;

    public a1x0(int i, int i2) {
        this.f11487a = i;
        this.f11488b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1x0)) {
            return false;
        }
        a1x0 a1x0Var = (a1x0) obj;
        return this.f11487a == a1x0Var.f11487a && this.f11488b == a1x0Var.f11488b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f11488b) + (Integer.hashCode(this.f11487a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.f11487a);
        switch (this.f11488b) {
            case 1:
                str = "UNSPECIFIED";
                break;
            case 2:
                str = "REQUESTED";
                break;
            case 3:
                str = "PENDING";
                break;
            case 4:
                str = "DOWNLOADING";
                break;
            case 5:
                str = "DOWNLOADED";
                break;
            case 6:
                str = "FAILURE";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
    }
}
