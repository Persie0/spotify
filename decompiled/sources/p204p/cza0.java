package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cza0 implements Parcelable {
    public static final Parcelable.Creator<cza0> CREATOR = new ama0(23);

    /* JADX INFO: renamed from: a */
    public final String f43504a;

    /* JADX INFO: renamed from: b */
    public final String f43505b;

    /* JADX INFO: renamed from: c */
    public final String f43506c;

    /* JADX INFO: renamed from: d */
    public final Integer f43507d;

    /* JADX INFO: renamed from: e */
    public final boolean f43508e;

    public cza0(Integer num, String str, String str2, String str3, boolean z) {
        this.f43504a = str;
        this.f43505b = str2;
        this.f43506c = str3;
        this.f43507d = num;
        this.f43508e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cza0)) {
            return false;
        }
        cza0 cza0Var = (cza0) obj;
        return wj50.m88271j(this.f43504a, cza0Var.f43504a) && wj50.m88271j(this.f43505b, cza0Var.f43505b) && wj50.m88271j(this.f43506c, cza0Var.f43506c) && wj50.m88271j(this.f43507d, cza0Var.f43507d) && this.f43508e == cza0Var.f43508e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f43504a.hashCode() * 31, 31, this.f43505b), 31, this.f43506c);
        Integer num = this.f43507d;
        return Boolean.hashCode(this.f43508e) + ((iM77243b + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43504a);
        parcel.writeString(this.f43505b);
        parcel.writeString(this.f43506c);
        Integer num = this.f43507d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeInt(this.f43508e ? 1 : 0);
    }
}
