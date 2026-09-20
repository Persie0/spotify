package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class e931 implements Parcelable {
    public static final Parcelable.Creator<e931> CREATOR = new q321(26);

    /* JADX INFO: renamed from: a */
    public final String f57352a;

    /* JADX INFO: renamed from: b */
    public final String f57353b;

    /* JADX INFO: renamed from: c */
    public final String f57354c;

    public e931(String str, String str2, String str3) {
        this.f57352a = str;
        this.f57353b = str2;
        this.f57354c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e931)) {
            return false;
        }
        e931 e931Var = (e931) obj;
        return wj50.m88271j(this.f57352a, e931Var.f57352a) && wj50.m88271j(this.f57353b, e931Var.f57353b) && wj50.m88271j(this.f57354c, e931Var.f57354c);
    }

    public final int hashCode() {
        return this.f57354c.hashCode() + s571.m77243b(this.f57352a.hashCode() * 31, 31, this.f57353b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57352a);
        parcel.writeString(this.f57353b);
        parcel.writeString(this.f57354c);
    }
}
