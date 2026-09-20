package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ckk implements Parcelable {
    public static final Parcelable.Creator<ckk> CREATOR = new kck(16);

    /* JADX INFO: renamed from: a */
    public final String f39025a;

    /* JADX INFO: renamed from: b */
    public final String f39026b;

    /* JADX INFO: renamed from: c */
    public final gkk f39027c;

    /* JADX INFO: renamed from: d */
    public final Integer f39028d;

    /* JADX INFO: renamed from: e */
    public final String f39029e;

    /* JADX INFO: renamed from: f */
    public final String f39030f;

    /* JADX INFO: renamed from: g */
    public final String f39031g;

    public ckk(String str, String str2, gkk gkkVar, Integer num, String str3, String str4, String str5) {
        this.f39025a = str;
        this.f39026b = str2;
        this.f39027c = gkkVar;
        this.f39028d = num;
        this.f39029e = str3;
        this.f39030f = str4;
        this.f39031g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final String m33178e() {
        return this.f39029e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckk)) {
            return false;
        }
        ckk ckkVar = (ckk) obj;
        return wj50.m88271j(this.f39025a, ckkVar.f39025a) && wj50.m88271j(this.f39026b, ckkVar.f39026b) && this.f39027c == ckkVar.f39027c && wj50.m88271j(this.f39028d, ckkVar.f39028d) && wj50.m88271j(this.f39029e, ckkVar.f39029e) && wj50.m88271j(this.f39030f, ckkVar.f39030f) && wj50.m88271j(this.f39031g, ckkVar.f39031g);
    }

    public final int hashCode() {
        int iHashCode = this.f39025a.hashCode() * 31;
        String str = this.f39026b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        gkk gkkVar = this.f39027c;
        int iHashCode3 = (iHashCode2 + (gkkVar == null ? 0 : gkkVar.hashCode())) * 31;
        Integer num = this.f39028d;
        int iM77243b = s571.m77243b(s571.m77243b((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f39029e), 31, this.f39030f);
        String str2 = this.f39031g;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39025a);
        parcel.writeString(this.f39026b);
        gkk gkkVar = this.f39027c;
        if (gkkVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(gkkVar.name());
        }
        Integer num = this.f39028d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeString(this.f39029e);
        parcel.writeString(this.f39030f);
        parcel.writeString(this.f39031g);
    }
}
