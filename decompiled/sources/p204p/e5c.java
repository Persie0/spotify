package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e5c extends AbstractC2206o9 {
    public static final Parcelable.Creator<e5c> CREATOR = new a5c(3);

    /* JADX INFO: renamed from: a */
    public final String f56342a;

    /* JADX INFO: renamed from: b */
    public final ln21 f56343b;

    public e5c(String str, ln21 ln21Var) {
        this.f56342a = str;
        this.f56343b = ln21Var;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5c)) {
            return false;
        }
        e5c e5cVar = (e5c) obj;
        return wj50.m88271j(this.f56342a, e5cVar.f56342a) && this.f56343b == e5cVar.f56343b;
    }

    public final int hashCode() {
        return this.f56343b.hashCode() + (this.f56342a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56342a);
        parcel.writeString(this.f56343b.name());
    }
}
