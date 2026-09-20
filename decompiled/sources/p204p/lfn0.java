package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class lfn0 implements Parcelable {
    public static final Parcelable.Creator<lfn0> CREATOR = new n9n0(15);

    /* JADX INFO: renamed from: a */
    public final String f132979a;

    public /* synthetic */ lfn0(String str) {
        this.f132979a = str;
    }

    /* JADX INFO: renamed from: c */
    public static String m58904c(String str) {
        return s571.m77251j("PaymentSessionId(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lfn0) {
            return wj50.m88271j(this.f132979a, ((lfn0) obj).f132979a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f132979a.hashCode();
    }

    public final String toString() {
        return m58904c(this.f132979a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f132979a);
    }
}
