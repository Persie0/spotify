package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class jdj implements ndj {
    public static final Parcelable.Creator<jdj> CREATOR = new wcj(12);

    /* JADX INFO: renamed from: a */
    public final String f111359a;

    /* JADX INFO: renamed from: b */
    public final String f111360b;

    public /* synthetic */ jdj(String str) {
        this(str, null);
    }

    /* JADX INFO: renamed from: c */
    public final String m53039c() {
        return this.f111360b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdj)) {
            return false;
        }
        jdj jdjVar = (jdj) obj;
        return wj50.m88271j(this.f111359a, jdjVar.f111359a) && wj50.m88271j(this.f111360b, jdjVar.f111360b);
    }

    public final String getText() {
        return this.f111359a;
    }

    public final int hashCode() {
        int iHashCode = this.f111359a.hashCode() * 31;
        String str = this.f111360b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111359a);
        parcel.writeString(this.f111360b);
    }

    public jdj(String str, String str2) {
        this.f111359a = str;
        this.f111360b = str2;
    }
}
