package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* JADX INFO: renamed from: p.fd */
/* JADX INFO: loaded from: classes.dex */
public final class C1856fd implements Parcelable {
    public static final Parcelable.Creator<C1856fd> CREATOR = new C2047kc(4);

    /* JADX INFO: renamed from: a */
    public final String f68281a;

    /* JADX INFO: renamed from: b */
    public final String f68282b;

    /* JADX INFO: renamed from: c */
    public final Date f68283c;

    public C1856fd(String str, String str2, Date date) {
        this.f68281a = str;
        this.f68282b = str2;
        this.f68283c = date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1856fd)) {
            return false;
        }
        C1856fd c1856fd = (C1856fd) obj;
        return wj50.m88271j(this.f68281a, c1856fd.f68281a) && wj50.m88271j(this.f68282b, c1856fd.f68282b) && wj50.m88271j(this.f68283c, c1856fd.f68283c);
    }

    public final int hashCode() {
        return this.f68283c.hashCode() + s571.m77243b(this.f68281a.hashCode() * 31, 31, this.f68282b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68281a);
        parcel.writeString(this.f68282b);
        parcel.writeSerializable(this.f68283c);
    }
}
