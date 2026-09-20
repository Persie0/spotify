package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class pkl0 implements Parcelable {
    public static final Parcelable.Creator<pkl0> CREATOR = new hbl0(24);

    /* JADX INFO: renamed from: a */
    public final String f178486a;

    /* JADX INFO: renamed from: b */
    public final Bundle f178487b;

    /* JADX INFO: renamed from: c */
    public final String f178488c;

    public pkl0(String str, String str2, Bundle bundle) {
        this.f178486a = str;
        this.f178487b = bundle;
        this.f178488c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkl0)) {
            return false;
        }
        pkl0 pkl0Var = (pkl0) obj;
        return wj50.m88271j(this.f178486a, pkl0Var.f178486a) && wj50.m88271j(this.f178487b, pkl0Var.f178487b) && wj50.m88271j(this.f178488c, pkl0Var.f178488c);
    }

    public final int hashCode() {
        int iHashCode = this.f178486a.hashCode() * 31;
        Bundle bundle = this.f178487b;
        int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        String str = this.f178488c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f178486a);
        parcel.writeBundle(this.f178487b);
        parcel.writeString(this.f178488c);
    }
}
