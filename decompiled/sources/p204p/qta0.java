package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class qta0 implements Parcelable {
    public static final Parcelable.Creator<qta0> CREATOR = new ama0(1);

    /* JADX INFO: renamed from: a */
    public final String f192348a;

    /* JADX INFO: renamed from: b */
    public final eg7 f192349b;

    public qta0(String str, eg7 eg7Var) {
        this.f192348a = str;
        this.f192349b = eg7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qta0)) {
            return false;
        }
        qta0 qta0Var = (qta0) obj;
        return wj50.m88271j(this.f192348a, qta0Var.f192348a) && wj50.m88271j(this.f192349b, qta0Var.f192349b);
    }

    public final int hashCode() {
        return this.f192349b.hashCode() + (this.f192348a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f192348a);
        parcel.writeParcelable(this.f192349b, i);
    }
}
