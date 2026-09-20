package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class nhy implements ohy {
    public static final Parcelable.Creator<nhy> CREATOR = new p7y(14);

    /* JADX INFO: renamed from: a */
    public final String f154129a;

    /* JADX INFO: renamed from: b */
    public final String f154130b;

    /* JADX INFO: renamed from: c */
    public final String f154131c;

    /* JADX INFO: renamed from: d */
    public final jhy f154132d;

    /* JADX INFO: renamed from: e */
    public final ghy f154133e;

    public nhy(String str, String str2, String str3, jhy jhyVar, ghy ghyVar) {
        this.f154129a = str;
        this.f154130b = str2;
        this.f154131c = str3;
        this.f154132d = jhyVar;
        this.f154133e = ghyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhy)) {
            return false;
        }
        nhy nhyVar = (nhy) obj;
        return wj50.m88271j(this.f154129a, nhyVar.f154129a) && wj50.m88271j(this.f154130b, nhyVar.f154130b) && wj50.m88271j(this.f154131c, nhyVar.f154131c) && wj50.m88271j(this.f154132d, nhyVar.f154132d) && wj50.m88271j(this.f154133e, nhyVar.f154133e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f154129a.hashCode() * 31, 31, this.f154130b);
        String str = this.f154131c;
        return this.f154133e.hashCode() + ((this.f154132d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f154129a);
        parcel.writeString(this.f154130b);
        parcel.writeString(this.f154131c);
        parcel.writeParcelable(this.f154132d, i);
        parcel.writeParcelable(this.f154133e, i);
    }
}
