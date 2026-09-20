package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.pl */
/* JADX INFO: loaded from: classes8.dex */
public final class C2260pl extends AbstractC2419tl {
    public static final Parcelable.Creator<C2260pl> CREATOR = new C2047kc(22);

    /* JADX INFO: renamed from: a */
    public final String f178603a;

    public C2260pl(String str) {
        this.f178603a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2260pl) && wj50.m88271j(this.f178603a, ((C2260pl) obj).f178603a);
    }

    public final int hashCode() {
        return this.f178603a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f178603a);
    }
}
