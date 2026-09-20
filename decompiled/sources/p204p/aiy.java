package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class aiy implements biy {
    public static final Parcelable.Creator<aiy> CREATOR = new p7y(18);

    /* JADX INFO: renamed from: a */
    public final String f16103a;

    /* JADX INFO: renamed from: b */
    public final String f16104b;

    /* JADX INFO: renamed from: c */
    public final xhy f16105c;

    public aiy(String str, String str2, xhy xhyVar) {
        this.f16103a = str;
        this.f16104b = str2;
        this.f16105c = xhyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiy)) {
            return false;
        }
        aiy aiyVar = (aiy) obj;
        return wj50.m88271j(this.f16103a, aiyVar.f16103a) && wj50.m88271j(this.f16104b, aiyVar.f16104b) && wj50.m88271j(this.f16105c, aiyVar.f16105c);
    }

    public final int hashCode() {
        return this.f16105c.hashCode() + s571.m77243b(this.f16103a.hashCode() * 31, 31, this.f16104b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16103a);
        parcel.writeString(this.f16104b);
        parcel.writeParcelable(this.f16105c, i);
    }
}
