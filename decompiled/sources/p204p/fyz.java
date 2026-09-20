package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class fyz implements m6k {
    public static final Parcelable.Creator<fyz> CREATOR = new ygz(18);

    /* JADX INFO: renamed from: a */
    public final String f74871a;

    /* JADX INFO: renamed from: b */
    public final String f74872b;

    /* JADX INFO: renamed from: c */
    public final String f74873c;

    /* JADX INFO: renamed from: d */
    public final z6k f74874d;

    public fyz(String str, String str2, String str3) {
        this.f74871a = str;
        this.f74872b = str2;
        this.f74873c = str3;
        this.f74874d = new z6k(str, (String) null, 6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyz)) {
            return false;
        }
        fyz fyzVar = (fyz) obj;
        return wj50.m88271j(this.f74871a, fyzVar.f74871a) && wj50.m88271j(this.f74872b, fyzVar.f74872b) && wj50.m88271j(this.f74873c, fyzVar.f74873c);
    }

    @Override // p204p.m6k
    public final z6k getTarget() {
        return this.f74874d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f74871a.hashCode() * 31, 31, this.f74872b);
        String str = this.f74873c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f74871a);
        parcel.writeString(this.f74872b);
        parcel.writeString(this.f74873c);
    }
}
