package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class hum0 implements Parcelable {
    public static final Parcelable.Creator<hum0> CREATOR = new cpl0(27);

    /* JADX INFO: renamed from: a */
    public final b281 f95426a;

    /* JADX INFO: renamed from: b */
    public final String f95427b;

    /* JADX INFO: renamed from: c */
    public final String f95428c;

    public hum0(b281 b281Var, String str, String str2) {
        this.f95426a = b281Var;
        this.f95427b = str;
        this.f95428c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hum0)) {
            return false;
        }
        hum0 hum0Var = (hum0) obj;
        return wj50.m88271j(this.f95426a, hum0Var.f95426a) && wj50.m88271j(this.f95427b, hum0Var.f95427b) && wj50.m88271j(this.f95428c, hum0Var.f95428c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f95426a.hashCode() * 31, 31, this.f95427b);
        String str = this.f95428c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f95426a.writeToParcel(parcel, i);
        parcel.writeString(this.f95427b);
        parcel.writeString(this.f95428c);
    }
}
