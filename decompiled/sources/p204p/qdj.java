package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class qdj implements vdj {
    public static final Parcelable.Creator<qdj> CREATOR = new wcj(15);

    /* JADX INFO: renamed from: a */
    public final String f187698a;

    /* JADX INFO: renamed from: b */
    public final String f187699b;

    public qdj(String str, String str2) {
        this.f187698a = str;
        this.f187699b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdj)) {
            return false;
        }
        qdj qdjVar = (qdj) obj;
        return wj50.m88271j(this.f187698a, qdjVar.f187698a) && wj50.m88271j(this.f187699b, qdjVar.f187699b);
    }

    public final int hashCode() {
        return this.f187699b.hashCode() + (this.f187698a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f187698a);
        parcel.writeString(this.f187699b);
    }
}
