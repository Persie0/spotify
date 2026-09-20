package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class llt0 implements nlt0 {
    public static final Parcelable.Creator<llt0> CREATOR = new vit0(6);

    /* JADX INFO: renamed from: a */
    public final String f134698a;

    /* JADX INFO: renamed from: b */
    public final String f134699b;

    /* JADX INFO: renamed from: c */
    public final String f134700c;

    /* JADX INFO: renamed from: d */
    public final boolean f134701d;

    public llt0(String str, String str2, String str3, boolean z) {
        this.f134698a = str;
        this.f134699b = str2;
        this.f134700c = str3;
        this.f134701d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llt0)) {
            return false;
        }
        llt0 llt0Var = (llt0) obj;
        return wj50.m88271j(this.f134698a, llt0Var.f134698a) && wj50.m88271j(this.f134699b, llt0Var.f134699b) && wj50.m88271j(this.f134700c, llt0Var.f134700c) && this.f134701d == llt0Var.f134701d;
    }

    @Override // p204p.nlt0
    /* JADX INFO: renamed from: f */
    public final boolean mo59313f() {
        return this.f134701d;
    }

    @Override // p204p.nlt0
    public final String getDescription() {
        return this.f134700c;
    }

    @Override // p204p.nlt0
    public final String getText() {
        return this.f134699b;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f134698a.hashCode() * 31, 31, this.f134699b);
        String str = this.f134700c;
        return Boolean.hashCode(this.f134701d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134698a);
        parcel.writeString(this.f134699b);
        parcel.writeString(this.f134700c);
        parcel.writeInt(this.f134701d ? 1 : 0);
    }
}
