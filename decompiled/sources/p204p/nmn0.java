package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class nmn0 implements Parcelable {
    public static final Parcelable.Creator<nmn0> CREATOR = new ejn0(11);

    /* JADX INFO: renamed from: a */
    public final int f156234a;

    /* JADX INFO: renamed from: b */
    public final int f156235b;

    /* JADX INFO: renamed from: c */
    public final String f156236c;

    /* JADX INFO: renamed from: d */
    public final int f156237d;

    public nmn0(int i, int i2, int i3, String str) {
        this.f156234a = i;
        this.f156235b = i2;
        this.f156236c = str;
        this.f156237d = i3;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m65144c() {
        if (this.f156235b != 3) {
            return false;
        }
        int i = this.f156237d;
        return i == 3 || i == 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmn0)) {
            return false;
        }
        nmn0 nmn0Var = (nmn0) obj;
        return this.f156234a == nmn0Var.f156234a && this.f156235b == nmn0Var.f156235b && wj50.m88271j(this.f156236c, nmn0Var.f156236c) && this.f156237d == nmn0Var.f156237d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m65145g() {
        return this.f156235b == 7;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m65146h() {
        return this.f156235b == 2 && this.f156237d == 4;
    }

    public final int hashCode() {
        return edb.m38547C(this.f156237d) + s571.m77243b(f710.m40938f(this.f156235b, edb.m38547C(this.f156234a) * 31, 31), 31, this.f156236c);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m65147j() {
        return this.f156235b == 2 && this.f156237d == 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        String str3;
        int i2 = this.f156234a;
        if (i2 == 1) {
            str = "Unspecified";
        } else if (i2 == 2) {
            str = "OnPlatform";
        } else if (i2 == 3) {
            str = "OffPlatform";
        } else if (i2 == 4) {
            str = "InviteLink";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "FriendRequest";
        }
        parcel.writeString(str);
        switch (this.f156235b) {
            case 1:
                str2 = "Unspecified";
                break;
            case 2:
                str2 = "Draft";
                break;
            case 3:
                str2 = "Active";
                break;
            case 4:
                str2 = "Canceled";
                break;
            case 5:
                str2 = "Deleted";
                break;
            case 6:
                str2 = "Rejected";
                break;
            case 7:
                str2 = "Inactive";
                break;
            default:
                throw null;
        }
        parcel.writeString(str2);
        parcel.writeString(this.f156236c);
        switch (this.f156237d) {
            case 1:
                str3 = "Unspecified";
                break;
            case 2:
                str3 = "Initiator";
                break;
            case 3:
                str3 = "Accepted";
                break;
            case 4:
                str3 = "Pending";
                break;
            case 5:
                str3 = "Rejected";
                break;
            case 6:
                str3 = "Deleted";
                break;
            case 7:
                str3 = "Left";
                break;
            default:
                throw null;
        }
        parcel.writeString(str3);
    }
}
