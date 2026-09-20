package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ow20 extends qw20 {
    public static final Parcelable.Creator<ow20> CREATOR = new t320(22);

    /* JADX INFO: renamed from: a */
    public final int f170618a;

    /* JADX INFO: renamed from: b */
    public final long f170619b;

    /* JADX INFO: renamed from: c */
    public final o511 f170620c;

    public ow20(int i, long j, o511 o511Var) {
        this.f170618a = i;
        this.f170619b = j;
        this.f170620c = o511Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow20)) {
            return false;
        }
        ow20 ow20Var = (ow20) obj;
        return this.f170618a == ow20Var.f170618a && this.f170619b == ow20Var.f170619b && this.f170620c == ow20Var.f170620c;
    }

    public final int hashCode() {
        return this.f170620c.hashCode() + dq60.m36605e(Integer.hashCode(this.f170618a) * 31, this.f170619b, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f170618a);
        parcel.writeLong(this.f170619b);
        parcel.writeString(this.f170620c.name());
    }
}
