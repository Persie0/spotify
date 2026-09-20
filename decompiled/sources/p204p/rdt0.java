package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class rdt0 implements Parcelable {
    public static final Parcelable.Creator<rdt0> CREATOR = new wds0(28);

    /* JADX INFO: renamed from: a */
    public final String f198203a;

    /* JADX INFO: renamed from: b */
    public final int f198204b;

    /* JADX INFO: renamed from: c */
    public final List f198205c;

    /* JADX INFO: renamed from: d */
    public final String f198206d;

    public rdt0(int i, String str, String str2, ArrayList arrayList) {
        this.f198203a = str;
        this.f198204b = i;
        this.f198205c = arrayList;
        this.f198206d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdt0)) {
            return false;
        }
        rdt0 rdt0Var = (rdt0) obj;
        return wj50.m88271j(this.f198203a, rdt0Var.f198203a) && this.f198204b == rdt0Var.f198204b && wj50.m88271j(this.f198205c, rdt0Var.f198205c) && wj50.m88271j(this.f198206d, rdt0Var.f198206d);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(f710.m40938f(this.f198204b, this.f198203a.hashCode() * 31, 31), 31, this.f198205c);
        String str = this.f198206d;
        return iM77244c + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f198203a);
        int i2 = this.f198204b;
        if (i2 == 1) {
            str = "PENDING";
        } else if (i2 == 2) {
            str = "PURCHASED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "UNSPECIFIED_STATE";
        }
        parcel.writeString(str);
        parcel.writeStringList(this.f198205c);
        parcel.writeString(this.f198206d);
    }
}
