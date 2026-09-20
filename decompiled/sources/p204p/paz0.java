package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class paz0 implements k3r, Parcelable {
    public static final Parcelable.Creator<paz0> CREATOR = new lpy0(26);

    /* JADX INFO: renamed from: a */
    public final String f175652a;

    /* JADX INFO: renamed from: b */
    public final String f175653b;

    /* JADX INFO: renamed from: c */
    public final String f175654c;

    /* JADX INFO: renamed from: d */
    public final int f175655d;

    public paz0(String str, String str2, int i, String str3) {
        this.f175652a = str;
        this.f175653b = str2;
        this.f175654c = str3;
        this.f175655d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paz0)) {
            return false;
        }
        paz0 paz0Var = (paz0) obj;
        return wj50.m88271j(this.f175652a, paz0Var.f175652a) && wj50.m88271j(this.f175653b, paz0Var.f175653b) && wj50.m88271j(this.f175654c, paz0Var.f175654c) && this.f175655d == paz0Var.f175655d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f175655d) + s571.m77243b(s571.m77243b(this.f175652a.hashCode() * 31, 31, this.f175653b), 31, this.f175654c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f175652a);
        parcel.writeString(this.f175653b);
        parcel.writeString(this.f175654c);
        parcel.writeInt(this.f175655d);
    }
}
