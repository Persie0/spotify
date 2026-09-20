package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class fvy implements Parcelable {
    public static final Parcelable.Creator<fvy> CREATOR = new eqy(13);

    /* JADX INFO: renamed from: a */
    public final String f73895a;

    /* JADX INFO: renamed from: b */
    public final String f73896b;

    /* JADX INFO: renamed from: c */
    public final String f73897c;

    /* JADX INFO: renamed from: d */
    public final String f73898d;

    public fvy(String str, String str2, String str3, String str4) {
        this.f73895a = str;
        this.f73896b = str2;
        this.f73897c = str3;
        this.f73898d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvy)) {
            return false;
        }
        fvy fvyVar = (fvy) obj;
        return wj50.m88271j(this.f73895a, fvyVar.f73895a) && wj50.m88271j(this.f73896b, fvyVar.f73896b) && wj50.m88271j(this.f73897c, fvyVar.f73897c) && wj50.m88271j(this.f73898d, fvyVar.f73898d);
    }

    public final int hashCode() {
        String str = this.f73895a;
        return this.f73898d.hashCode() + s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f73896b), 31, this.f73897c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f73895a);
        parcel.writeString(this.f73896b);
        parcel.writeString(this.f73897c);
        parcel.writeString(this.f73898d);
    }
}
