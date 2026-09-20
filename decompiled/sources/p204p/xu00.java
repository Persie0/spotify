package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class xu00 implements Parcelable {
    public static final Parcelable.Creator<xu00> CREATOR = new n6f1(24);

    /* JADX INFO: renamed from: a */
    public final String f265965a;

    /* JADX INFO: renamed from: b */
    public final String f265966b;

    /* JADX INFO: renamed from: c */
    public final int f265967c;

    public xu00(String str, String str2, int i) {
        this.f265965a = str;
        this.f265966b = str2;
        this.f265967c = i;
    }

    /* JADX INFO: renamed from: c */
    public final String m92109c() {
        return this.f265966b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu00)) {
            return false;
        }
        xu00 xu00Var = (xu00) obj;
        return wj50.m88271j(this.f265965a, xu00Var.f265965a) && wj50.m88271j(this.f265966b, xu00Var.f265966b) && this.f265967c == xu00Var.f265967c;
    }

    /* JADX INFO: renamed from: g */
    public final String m92110g() {
        return this.f265965a;
    }

    /* JADX INFO: renamed from: h */
    public final int m92111h() {
        return this.f265967c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f265967c) + s571.m77243b(this.f265965a.hashCode() * 31, 31, this.f265966b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f265965a);
        parcel.writeString(this.f265966b);
        int i2 = this.f265967c;
        if (i2 == 1) {
            str = "CAPPED";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "ENTITLEMENT_MISSING";
        }
        parcel.writeString(str);
    }
}
