package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class tfe0 implements Parcelable {
    public static final Parcelable.Creator<tfe0> CREATOR = new ube0(3);

    /* JADX INFO: renamed from: a */
    public final String f219933a;

    /* JADX INFO: renamed from: b */
    public final String f219934b;

    public tfe0(String str, String str2) {
        this.f219933a = str;
        this.f219934b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfe0)) {
            return false;
        }
        tfe0 tfe0Var = (tfe0) obj;
        return wj50.m88271j(this.f219933a, tfe0Var.f219933a) && wj50.m88271j(this.f219934b, tfe0Var.f219934b);
    }

    public final int hashCode() {
        return this.f219934b.hashCode() + (this.f219933a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f219933a);
        parcel.writeString(this.f219934b);
    }
}
