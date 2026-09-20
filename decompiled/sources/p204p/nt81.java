package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class nt81 implements Parcelable {
    public static final Parcelable.Creator<nt81> CREATOR = new f881(22);

    /* JADX INFO: renamed from: a */
    public final String f158016a;

    /* JADX INFO: renamed from: b */
    public final String f158017b;

    /* JADX INFO: renamed from: c */
    public final String f158018c;

    public nt81(String str, String str2, String str3) {
        this.f158016a = str;
        this.f158017b = str2;
        this.f158018c = str3;
    }

    /* JADX INFO: renamed from: c */
    public static nt81 m65611c(nt81 nt81Var, String str, String str2, int i) {
        String str3 = nt81Var.f158016a;
        if ((i & 2) != 0) {
            str = nt81Var.f158017b;
        }
        if ((i & 4) != 0) {
            str2 = nt81Var.f158018c;
        }
        nt81Var.getClass();
        return new nt81(str3, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    public final boolean equals(Object obj) {
        boolean zM88271j;
        boolean zM88271j2;
        boolean zM88271j3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt81)) {
            return false;
        }
        nt81 nt81Var = (nt81) obj;
        String str = nt81Var.f158016a;
        String str2 = this.f158016a;
        if (str2 == null) {
            if (str == null) {
                zM88271j = true;
            } else {
                zM88271j = false;
            }
        } else if (str == null) {
            zM88271j = false;
        } else {
            wp6 wp6Var = i1e.f97494b;
            zM88271j = wj50.m88271j(str2, str);
        }
        if (!zM88271j) {
            return false;
        }
        String str3 = nt81Var.f158017b;
        String str4 = this.f158017b;
        if (str4 == null) {
            if (str3 == null) {
                zM88271j2 = true;
            } else {
                zM88271j2 = false;
            }
        } else if (str3 == null) {
            zM88271j2 = false;
        } else {
            wp6 wp6Var2 = hjz.f92292b;
            zM88271j2 = wj50.m88271j(str4, str3);
        }
        if (!zM88271j2) {
            return false;
        }
        String str5 = nt81Var.f158018c;
        String str6 = this.f158018c;
        if (str6 == null) {
            if (str5 == null) {
                zM88271j3 = true;
            } else {
                zM88271j3 = false;
            }
        } else if (str5 == null) {
            zM88271j3 = false;
        } else {
            wp6 wp6Var3 = xp6.f264511b;
            zM88271j3 = wj50.m88271j(str6, str5);
        }
        return zM88271j3;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = 0;
        String str = this.f158016a;
        if (str == null) {
            iHashCode = 0;
        } else {
            wp6 wp6Var = i1e.f97494b;
            iHashCode = str.hashCode();
        }
        int i = iHashCode * 31;
        String str2 = this.f158017b;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            wp6 wp6Var2 = hjz.f92292b;
            iHashCode2 = str2.hashCode();
        }
        int i2 = (i + iHashCode2) * 31;
        String str3 = this.f158018c;
        if (str3 != null) {
            wp6 wp6Var3 = xp6.f264511b;
            iHashCode3 = str3.hashCode();
        }
        return i2 + iHashCode3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f158016a;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wp6 wp6Var = i1e.f97494b;
            parcel.writeString(str);
        }
        String str2 = this.f158017b;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wp6 wp6Var2 = hjz.f92292b;
            parcel.writeString(str2);
        }
        String str3 = this.f158018c;
        if (str3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        wp6 wp6Var3 = xp6.f264511b;
        parcel.writeString(str3);
    }
}
