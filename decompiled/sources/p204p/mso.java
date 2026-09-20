package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class mso implements qso {
    public static final Parcelable.Creator<mso> CREATOR = new lso(0);

    /* JADX INFO: renamed from: a */
    public final String f146837a;

    public mso(String str) {
        this.f146837a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m62776c() {
        return this.f146837a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mso) && wj50.m88271j(this.f146837a, ((mso) obj).f146837a);
    }

    public final int hashCode() {
        return this.f146837a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f146837a);
    }
}
