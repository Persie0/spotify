package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class igq0 extends jgq0 {
    public static final Parcelable.Creator<igq0> CREATOR = new vnp0(15);

    /* JADX INFO: renamed from: a */
    public final String f102038a;

    /* JADX INFO: renamed from: b */
    public final String f102039b;

    /* JADX INFO: renamed from: c */
    public final String f102040c;

    /* JADX INFO: renamed from: d */
    public final String f102041d;

    public igq0(String str, String str2, String str3, String str4) {
        this.f102038a = str;
        this.f102039b = str2;
        this.f102040c = str3;
        this.f102041d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igq0)) {
            return false;
        }
        igq0 igq0Var = (igq0) obj;
        return wj50.m88271j(this.f102038a, igq0Var.f102038a) && wj50.m88271j(this.f102039b, igq0Var.f102039b) && wj50.m88271j(this.f102040c, igq0Var.f102040c) && wj50.m88271j(this.f102041d, igq0Var.f102041d);
    }

    public final int hashCode() {
        return this.f102041d.hashCode() + s571.m77243b(s571.m77243b(this.f102038a.hashCode() * 31, 31, this.f102039b), 31, this.f102040c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f102038a);
        parcel.writeString(this.f102039b);
        parcel.writeString(this.f102040c);
        parcel.writeString(this.f102041d);
    }
}
