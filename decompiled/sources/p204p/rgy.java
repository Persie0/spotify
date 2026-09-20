package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class rgy implements Parcelable {
    public static final Parcelable.Creator<rgy> CREATOR = new p7y(6);

    /* JADX INFO: renamed from: a */
    public final String f199043a;

    /* JADX INFO: renamed from: b */
    public final String f199044b;

    /* JADX INFO: renamed from: c */
    public final String f199045c;

    /* JADX INFO: renamed from: d */
    public final String f199046d;

    /* JADX INFO: renamed from: e */
    public final String f199047e;

    public rgy(String str, String str2, String str3, String str4, String str5) {
        this.f199043a = str;
        this.f199044b = str2;
        this.f199045c = str3;
        this.f199046d = str4;
        this.f199047e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgy)) {
            return false;
        }
        rgy rgyVar = (rgy) obj;
        return wj50.m88271j(this.f199043a, rgyVar.f199043a) && wj50.m88271j(this.f199044b, rgyVar.f199044b) && wj50.m88271j(this.f199045c, rgyVar.f199045c) && wj50.m88271j(this.f199046d, rgyVar.f199046d) && wj50.m88271j(this.f199047e, rgyVar.f199047e);
    }

    public final int hashCode() {
        return this.f199047e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f199043a.hashCode() * 31, 31, this.f199044b), 31, this.f199045c), 31, this.f199046d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f199043a);
        parcel.writeString(this.f199044b);
        parcel.writeString(this.f199045c);
        parcel.writeString(this.f199046d);
        parcel.writeString(this.f199047e);
    }
}
