package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b5c extends AbstractC2206o9 {
    public static final Parcelable.Creator<b5c> CREATOR = new a5c(0);

    /* JADX INFO: renamed from: a */
    public final String f23556a;

    /* JADX INFO: renamed from: b */
    public final int f23557b;

    /* JADX INFO: renamed from: c */
    public final String f23558c;

    public b5c(String str, int i, String str2) {
        this.f23556a = str;
        this.f23557b = i;
        this.f23558c = str2;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5c)) {
            return false;
        }
        b5c b5cVar = (b5c) obj;
        return wj50.m88271j(this.f23556a, b5cVar.f23556a) && this.f23557b == b5cVar.f23557b && wj50.m88271j(this.f23558c, b5cVar.f23558c);
    }

    public final int hashCode() {
        return this.f23558c.hashCode() + mt60.m62800g(this.f23557b, this.f23556a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23556a);
        parcel.writeInt(this.f23557b);
        parcel.writeString(this.f23558c);
    }
}
