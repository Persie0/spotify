package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class paj implements Parcelable {
    public static final Parcelable.Creator<paj> CREATOR = new f2i(23);

    /* JADX INFO: renamed from: a */
    public final String f175541a;

    /* JADX INFO: renamed from: b */
    public final String f175542b;

    /* JADX INFO: renamed from: c */
    public final boolean f175543c;

    public paj(String str, String str2, boolean z) {
        this.f175541a = str;
        this.f175542b = str2;
        this.f175543c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paj)) {
            return false;
        }
        paj pajVar = (paj) obj;
        return wj50.m88271j(this.f175541a, pajVar.f175541a) && wj50.m88271j(this.f175542b, pajVar.f175542b) && this.f175543c == pajVar.f175543c;
    }

    public final String getUri() {
        return this.f175541a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175543c) + s571.m77243b(this.f175541a.hashCode() * 31, 31, this.f175542b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f175541a);
        parcel.writeString(this.f175542b);
        parcel.writeInt(this.f175543c ? 1 : 0);
    }
}
