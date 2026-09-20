package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class pla1 implements Parcelable {
    public static final Parcelable.Creator<pla1> CREATOR = new u2a1(12);

    /* JADX INFO: renamed from: f */
    public static final pla1 f178680f;

    /* JADX INFO: renamed from: a */
    public final String f178681a;

    /* JADX INFO: renamed from: b */
    public final String f178682b;

    /* JADX INFO: renamed from: c */
    public final String f178683c;

    /* JADX INFO: renamed from: d */
    public final Integer f178684d;

    /* JADX INFO: renamed from: e */
    public final String f178685e;

    static {
        String str = "";
        f178680f = new pla1(str, str, 12, (String) null);
    }

    public pla1(String str, String str2, Integer num, String str3) {
        this.f178681a = str;
        this.f178682b = str2;
        this.f178683c = str3;
        this.f178684d = num;
        this.f178685e = mjd.m61974j(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pla1)) {
            return false;
        }
        pla1 pla1Var = (pla1) obj;
        return wj50.m88271j(this.f178681a, pla1Var.f178681a) && wj50.m88271j(this.f178682b, pla1Var.f178682b) && wj50.m88271j(this.f178683c, pla1Var.f178683c) && wj50.m88271j(this.f178684d, pla1Var.f178684d);
    }

    public final String getUsername() {
        return this.f178681a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f178681a.hashCode() * 31, 31, this.f178682b);
        String str = this.f178683c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f178684d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f178681a);
        parcel.writeString(this.f178682b);
        parcel.writeString(this.f178683c);
        Integer num = this.f178684d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }

    public /* synthetic */ pla1(String str, String str2, int i, String str3) {
        this(str, str2, (Integer) null, (i & 4) != 0 ? null : str3);
    }
}
