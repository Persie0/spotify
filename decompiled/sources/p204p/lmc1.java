package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class lmc1 implements mmc1 {
    public static final Parcelable.Creator<lmc1> CREATOR = new nlc1(22);

    /* JADX INFO: renamed from: a */
    public final String f134858a;

    public lmc1(String str) {
        this.f134858a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmc1) && wj50.m88271j(this.f134858a, ((lmc1) obj).f134858a);
    }

    @Override // p204p.mmc1
    public final String getLabel() {
        return this.f134858a;
    }

    public final int hashCode() {
        return this.f134858a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134858a);
    }
}
