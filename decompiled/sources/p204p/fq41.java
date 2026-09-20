package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class fq41 implements Parcelable {
    public static final Parcelable.Creator<fq41> CREATOR = new tj41(8);

    /* JADX INFO: renamed from: a */
    public final dq41 f72055a;

    public fq41(dq41 dq41Var) {
        this.f72055a = dq41Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fq41) && wj50.m88271j(this.f72055a, ((fq41) obj).f72055a);
    }

    public final int hashCode() {
        return this.f72055a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f72055a.writeToParcel(parcel, i);
    }
}
