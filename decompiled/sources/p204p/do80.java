package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class do80 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f50967a;

    /* JADX INFO: renamed from: b */
    public final String f50968b;

    /* JADX INFO: renamed from: c */
    public final String f50969c;

    /* JADX INFO: renamed from: d */
    public final String f50970d;

    /* JADX INFO: renamed from: e */
    public final String f50971e;

    /* JADX INFO: renamed from: f */
    public final String f50972f;
    public static final co80 Companion = new co80();
    public static final Parcelable.Creator<do80> CREATOR = new i980(17);

    public /* synthetic */ do80(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        if ((i & 1) == 0) {
            this.f50967a = null;
        } else {
            this.f50967a = str;
        }
        if ((i & 2) == 0) {
            this.f50968b = null;
        } else {
            this.f50968b = str2;
        }
        if ((i & 4) == 0) {
            this.f50969c = null;
        } else {
            this.f50969c = str3;
        }
        if ((i & 8) == 0) {
            this.f50970d = null;
        } else {
            this.f50970d = str4;
        }
        if ((i & 16) == 0) {
            this.f50971e = null;
        } else {
            this.f50971e = str5;
        }
        if ((i & 32) == 0) {
            this.f50972f = null;
        } else {
            this.f50972f = str6;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do80)) {
            return false;
        }
        do80 do80Var = (do80) obj;
        return wj50.m88271j(this.f50967a, do80Var.f50967a) && wj50.m88271j(this.f50968b, do80Var.f50968b) && wj50.m88271j(this.f50969c, do80Var.f50969c) && wj50.m88271j(this.f50970d, do80Var.f50970d) && wj50.m88271j(this.f50971e, do80Var.f50971e) && wj50.m88271j(this.f50972f, do80Var.f50972f);
    }

    public final int hashCode() {
        String str = this.f50967a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f50968b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50969c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50970d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f50971e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f50972f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50967a);
        parcel.writeString(this.f50968b);
        parcel.writeString(this.f50969c);
        parcel.writeString(this.f50970d);
        parcel.writeString(this.f50971e);
        parcel.writeString(this.f50972f);
    }

    public do80(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f50967a = str;
        this.f50968b = str2;
        this.f50969c = str3;
        this.f50970d = str4;
        this.f50971e = str5;
        this.f50972f = str6;
    }
}
