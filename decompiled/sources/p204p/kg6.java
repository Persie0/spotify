package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class kg6 implements Parcelable {
    public static final Parcelable.Creator<kg6> CREATOR = new vp5(24);

    /* JADX INFO: renamed from: a */
    public final String f122302a;

    /* JADX INFO: renamed from: b */
    public final String f122303b;

    /* JADX INFO: renamed from: c */
    public final fg6 f122304c;

    public kg6(String str, String str2, fg6 fg6Var) {
        this.f122302a = str;
        this.f122303b = str2;
        this.f122304c = fg6Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg6)) {
            return false;
        }
        kg6 kg6Var = (kg6) obj;
        return wj50.m88271j(this.f122302a, kg6Var.f122302a) && wj50.m88271j(this.f122303b, kg6Var.f122303b) && this.f122304c == kg6Var.f122304c;
    }

    public final int hashCode() {
        return this.f122304c.hashCode() + s571.m77243b(this.f122302a.hashCode() * 31, 31, this.f122303b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f122302a);
        parcel.writeString(this.f122303b);
        this.f122304c.writeToParcel(parcel, i);
    }
}
