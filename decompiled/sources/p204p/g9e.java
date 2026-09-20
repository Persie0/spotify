package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class g9e implements i9e {
    public static final Parcelable.Creator<g9e> CREATOR = new n6e(4);

    /* JADX INFO: renamed from: a */
    public final f9e f77752a;

    /* JADX INFO: renamed from: b */
    public final tae f77753b;

    public g9e(f9e f9eVar, tae taeVar) {
        this.f77752a = f9eVar;
        this.f77753b = taeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9e)) {
            return false;
        }
        g9e g9eVar = (g9e) obj;
        return wj50.m88271j(this.f77752a, g9eVar.f77752a) && wj50.m88271j(this.f77753b, g9eVar.f77753b);
    }

    public final int hashCode() {
        return this.f77753b.hashCode() + (this.f77752a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f77752a.writeToParcel(parcel, i);
        this.f77753b.writeToParcel(parcel, i);
    }
}
