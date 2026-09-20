package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class pr1 implements Parcelable {
    public static final Parcelable.Creator<pr1> CREATOR = new g11(24);

    /* JADX INFO: renamed from: a */
    public final String f180462a;

    /* JADX INFO: renamed from: b */
    public final String f180463b;

    public pr1(String str, String str2) {
        this.f180462a = str;
        this.f180463b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr1)) {
            return false;
        }
        pr1 pr1Var = (pr1) obj;
        return wj50.m88271j(this.f180462a, pr1Var.f180462a) && wj50.m88271j(this.f180463b, pr1Var.f180463b);
    }

    public final String getUri() {
        return this.f180462a;
    }

    public final int hashCode() {
        return this.f180463b.hashCode() + (this.f180462a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f180462a);
        parcel.writeString(this.f180463b);
    }
}
