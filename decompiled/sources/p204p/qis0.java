package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class qis0 implements Parcelable {
    public static final Parcelable.Creator<qis0> CREATOR = new wds0(1);

    /* JADX INFO: renamed from: a */
    public final String f189061a;

    /* JADX INFO: renamed from: b */
    public final String f189062b;

    /* JADX INFO: renamed from: c */
    public final boolean f189063c;

    /* JADX INFO: renamed from: d */
    public final String f189064d;

    /* JADX INFO: renamed from: e */
    public final String f189065e;

    /* JADX INFO: renamed from: f */
    public final boolean f189066f;

    public qis0(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f189061a = str;
        this.f189062b = str2;
        this.f189063c = z;
        this.f189064d = str3;
        this.f189065e = str4;
        this.f189066f = z2;
    }

    /* JADX INFO: renamed from: c */
    public final String m72874c() {
        return this.f189061a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qis0)) {
            return false;
        }
        qis0 qis0Var = (qis0) obj;
        return wj50.m88271j(this.f189061a, qis0Var.f189061a) && wj50.m88271j(this.f189062b, qis0Var.f189062b) && this.f189063c == qis0Var.f189063c && wj50.m88271j(this.f189064d, qis0Var.f189064d) && wj50.m88271j(this.f189065e, qis0Var.f189065e) && this.f189066f == qis0Var.f189066f;
    }

    public final int hashCode() {
        String str = this.f189061a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f189062b;
        int iM77245d = s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f189063c);
        String str3 = this.f189064d;
        int iHashCode2 = (iM77245d + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f189065e;
        return Boolean.hashCode(this.f189066f) + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f189061a);
        parcel.writeString(this.f189062b);
        parcel.writeInt(this.f189063c ? 1 : 0);
        parcel.writeString(this.f189064d);
        parcel.writeString(this.f189065e);
        parcel.writeInt(this.f189066f ? 1 : 0);
    }

    public /* synthetic */ qis0(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this(str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 4) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }
}
