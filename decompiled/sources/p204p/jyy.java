package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class jyy implements Parcelable {
    public static final Parcelable.Creator<jyy> CREATOR = new eqy(19);

    /* JADX INFO: renamed from: a */
    public final String f117514a;

    /* JADX INFO: renamed from: b */
    public final String f117515b;

    /* JADX INFO: renamed from: c */
    public final Integer f117516c;

    public jyy(Integer num, String str, String str2) {
        this.f117514a = str;
        this.f117515b = str2;
        this.f117516c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyy)) {
            return false;
        }
        jyy jyyVar = (jyy) obj;
        return wj50.m88271j(this.f117514a, jyyVar.f117514a) && wj50.m88271j(this.f117515b, jyyVar.f117515b) && wj50.m88271j(this.f117516c, jyyVar.f117516c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f117514a.hashCode() * 31, 31, this.f117515b);
        Integer num = this.f117516c;
        return iM77243b + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f117514a);
        parcel.writeString(this.f117515b);
        Integer num = this.f117516c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
