package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class u251 implements Parcelable {
    public static final Parcelable.Creator<u251> CREATOR = new q051(13);

    /* JADX INFO: renamed from: a */
    public final String f225993a;

    /* JADX INFO: renamed from: b */
    public final String f225994b;

    /* JADX INFO: renamed from: c */
    public final String f225995c;

    public u251(String str, String str2, String str3) {
        this.f225993a = str;
        this.f225994b = str2;
        this.f225995c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u251)) {
            return false;
        }
        u251 u251Var = (u251) obj;
        return wj50.m88271j(this.f225993a, u251Var.f225993a) && wj50.m88271j(this.f225994b, u251Var.f225994b) && wj50.m88271j(this.f225995c, u251Var.f225995c);
    }

    public final int hashCode() {
        return this.f225995c.hashCode() + s571.m77243b(this.f225993a.hashCode() * 31, 31, this.f225994b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f225993a);
        parcel.writeString(this.f225994b);
        parcel.writeString(this.f225995c);
    }
}
