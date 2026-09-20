package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class mnj extends onj {
    public static final Parcelable.Creator<mnj> CREATOR = new dnj(8);

    /* JADX INFO: renamed from: a */
    public final String f145435a;

    /* JADX INFO: renamed from: b */
    public final ln21 f145436b;

    public mnj(String str, ln21 ln21Var) {
        this.f145435a = str;
        this.f145436b = ln21Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnj)) {
            return false;
        }
        mnj mnjVar = (mnj) obj;
        return wj50.m88271j(this.f145435a, mnjVar.f145435a) && this.f145436b == mnjVar.f145436b;
    }

    public final int hashCode() {
        return this.f145436b.hashCode() + (this.f145435a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f145435a);
        parcel.writeString(this.f145436b.name());
    }
}
