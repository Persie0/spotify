package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class y4c extends AbstractC2206o9 {
    public static final Parcelable.Creator<y4c> CREATOR = new jja(28);

    /* JADX INFO: renamed from: a */
    public final String f269117a;

    /* JADX INFO: renamed from: b */
    public final int f269118b;

    public y4c(String str, int i) {
        this.f269117a = str;
        this.f269118b = i;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4c)) {
            return false;
        }
        y4c y4cVar = (y4c) obj;
        return wj50.m88271j(this.f269117a, y4cVar.f269117a) && this.f269118b == y4cVar.f269118b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f269118b) + (this.f269117a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f269117a);
        parcel.writeInt(this.f269118b);
    }
}
