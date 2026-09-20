package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fmc1 implements Parcelable {
    public static final Parcelable.Creator<fmc1> CREATOR = new nlc1(15);

    /* JADX INFO: renamed from: a */
    public final String f71021a;

    /* JADX INFO: renamed from: b */
    public final String f71022b;

    /* JADX INFO: renamed from: c */
    public final String f71023c;

    /* JADX INFO: renamed from: d */
    public final String f71024d;

    public fmc1(String str, String str2, String str3, String str4) {
        this.f71021a = str;
        this.f71022b = str2;
        this.f71023c = str3;
        this.f71024d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmc1)) {
            return false;
        }
        fmc1 fmc1Var = (fmc1) obj;
        return wj50.m88271j(this.f71021a, fmc1Var.f71021a) && wj50.m88271j(this.f71022b, fmc1Var.f71022b) && wj50.m88271j(this.f71023c, fmc1Var.f71023c) && wj50.m88271j(this.f71024d, fmc1Var.f71024d);
    }

    public final int hashCode() {
        return this.f71024d.hashCode() + s571.m77243b(s571.m77243b(this.f71021a.hashCode() * 31, 31, this.f71022b), 31, this.f71023c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f71021a);
        parcel.writeString(this.f71022b);
        parcel.writeString(this.f71023c);
        parcel.writeString(this.f71024d);
    }
}
