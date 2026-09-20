package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class pw20 extends qw20 {
    public static final Parcelable.Creator<pw20> CREATOR = new t320(23);

    /* JADX INFO: renamed from: a */
    public final int f181883a;

    /* JADX INFO: renamed from: b */
    public final long f181884b;

    public pw20(int i, long j) {
        this.f181883a = i;
        this.f181884b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw20)) {
            return false;
        }
        pw20 pw20Var = (pw20) obj;
        return this.f181883a == pw20Var.f181883a && this.f181884b == pw20Var.f181884b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f181884b) + (Integer.hashCode(this.f181883a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f181883a);
        parcel.writeLong(this.f181884b);
    }
}
