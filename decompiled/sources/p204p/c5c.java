package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c5c extends AbstractC2206o9 {
    public static final Parcelable.Creator<c5c> CREATOR = new a5c(1);

    /* JADX INFO: renamed from: a */
    public final String f34135a;

    /* JADX INFO: renamed from: b */
    public final int f34136b;

    /* JADX INFO: renamed from: c */
    public final String f34137c;

    public c5c(String str, int i, String str2) {
        this.f34135a = str;
        this.f34136b = i;
        this.f34137c = str2;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5c)) {
            return false;
        }
        c5c c5cVar = (c5c) obj;
        return wj50.m88271j(this.f34135a, c5cVar.f34135a) && this.f34136b == c5cVar.f34136b && wj50.m88271j(this.f34137c, c5cVar.f34137c);
    }

    public final int hashCode() {
        return this.f34137c.hashCode() + mt60.m62800g(this.f34136b, this.f34135a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34135a);
        parcel.writeInt(this.f34136b);
        parcel.writeString(this.f34137c);
    }
}
