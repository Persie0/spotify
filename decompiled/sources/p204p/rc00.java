package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class rc00 implements Parcelable {
    public static final Parcelable.Creator<rc00> CREATOR = new k700(3);

    /* JADX INFO: renamed from: a */
    public final pc00 f197681a;

    public rc00(pc00 pc00Var) {
        this.f197681a = pc00Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc00) && wj50.m88271j(this.f197681a, ((rc00) obj).f197681a);
    }

    public final int hashCode() {
        return this.f197681a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f197681a.writeToParcel(parcel, i);
    }
}
