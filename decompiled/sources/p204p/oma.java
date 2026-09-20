package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class oma implements Parcelable {
    public static final Parcelable.Creator<oma> CREATOR = new jja(2);

    /* JADX INFO: renamed from: a */
    public final String f167005a;

    /* JADX INFO: renamed from: b */
    public final String f167006b;

    /* JADX INFO: renamed from: c */
    public final String f167007c;

    public oma(String str, String str2, String str3) {
        this.f167005a = str;
        this.f167006b = str2;
        this.f167007c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oma)) {
            return false;
        }
        oma omaVar = (oma) obj;
        return wj50.m88271j(this.f167005a, omaVar.f167005a) && wj50.m88271j(this.f167006b, omaVar.f167006b) && wj50.m88271j(this.f167007c, omaVar.f167007c);
    }

    public final int hashCode() {
        return this.f167007c.hashCode() + s571.m77243b(this.f167005a.hashCode() * 31, 31, this.f167006b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f167005a);
        parcel.writeString(this.f167006b);
        parcel.writeString(this.f167007c);
    }
}
