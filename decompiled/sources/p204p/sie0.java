package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class sie0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f209470a;

    /* JADX INFO: renamed from: b */
    public final String f209471b;

    /* JADX INFO: renamed from: c */
    public final String f209472c;

    /* JADX INFO: renamed from: d */
    public final String f209473d;

    /* JADX INFO: renamed from: e */
    public final String f209474e;
    public static final pie0 Companion = new pie0();
    public static final Parcelable.Creator<sie0> CREATOR = new n6f1(29);

    public /* synthetic */ sie0(int i, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f209470a = null;
        } else {
            this.f209470a = str;
        }
        if ((i & 2) == 0) {
            this.f209471b = null;
        } else {
            this.f209471b = str2;
        }
        if ((i & 4) == 0) {
            this.f209472c = null;
        } else {
            this.f209472c = str3;
        }
        if ((i & 8) == 0) {
            this.f209473d = null;
        } else {
            this.f209473d = str4;
        }
        if ((i & 16) == 0) {
            this.f209474e = null;
        } else {
            this.f209474e = str5;
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
        if (!(obj instanceof sie0)) {
            return false;
        }
        sie0 sie0Var = (sie0) obj;
        return wj50.m88271j(this.f209470a, sie0Var.f209470a) && wj50.m88271j(this.f209471b, sie0Var.f209471b) && wj50.m88271j(this.f209472c, sie0Var.f209472c) && wj50.m88271j(this.f209473d, sie0Var.f209473d) && wj50.m88271j(this.f209474e, sie0Var.f209474e);
    }

    public final int hashCode() {
        String str = this.f209470a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f209471b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f209472c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f209473d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f209474e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f209470a);
        parcel.writeString(this.f209471b);
        parcel.writeString(this.f209472c);
        parcel.writeString(this.f209473d);
        parcel.writeString(this.f209474e);
    }

    public sie0(String str, String str2, String str3, String str4, String str5) {
        this.f209470a = str;
        this.f209471b = str2;
        this.f209472c = str3;
        this.f209473d = str4;
        this.f209474e = str5;
    }
}
