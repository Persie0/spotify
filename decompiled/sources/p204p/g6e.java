package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class g6e implements Parcelable {
    public static final Parcelable.Creator<g6e> CREATOR = new j0e(29);

    /* JADX INFO: renamed from: a */
    public final String f77023a;

    /* JADX INFO: renamed from: b */
    public final String f77024b;

    /* JADX INFO: renamed from: c */
    public final String f77025c;

    public g6e(String str, String str2, String str3) {
        this.f77023a = str;
        this.f77024b = str2;
        this.f77025c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6e)) {
            return false;
        }
        g6e g6eVar = (g6e) obj;
        return wj50.m88271j(this.f77023a, g6eVar.f77023a) && wj50.m88271j(this.f77024b, g6eVar.f77024b) && wj50.m88271j(this.f77025c, g6eVar.f77025c);
    }

    public final int hashCode() {
        return this.f77025c.hashCode() + s571.m77243b(this.f77023a.hashCode() * 31, 31, this.f77024b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f77023a);
        parcel.writeString(this.f77024b);
        parcel.writeString(this.f77025c);
    }
}
