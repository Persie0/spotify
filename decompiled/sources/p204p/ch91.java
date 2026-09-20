package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ch91 extends jh91 {

    /* JADX INFO: renamed from: d */
    public static final ch91 f37968d = new ch91(gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_DOWNLOAD);
    public static final Parcelable.Creator<ch91> CREATOR = new f891(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ch91);
    }

    public final int hashCode() {
        return -628877010;
    }

    public final String toString() {
        return "Download";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
