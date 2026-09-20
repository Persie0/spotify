package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public final class gcb implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f78530a;

    /* JADX INFO: renamed from: b */
    public final String f78531b;

    /* JADX INFO: renamed from: c */
    public final String f78532c;
    public static final fcb Companion = new fcb();
    public static final Parcelable.Creator<gcb> CREATOR = new jja(10);

    public gcb(String str, String str2, int i, String str3) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, dcb.f47485a.getDescriptor());
            throw null;
        }
        this.f78530a = str;
        this.f78531b = str2;
        if ((i & 4) != 0) {
            this.f78532c = str3;
        } else {
            Companion.getClass();
            this.f78532c = new Locale("", str).getDisplayCountry();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcb)) {
            return false;
        }
        gcb gcbVar = (gcb) obj;
        return wj50.m88271j(this.f78530a, gcbVar.f78530a) && wj50.m88271j(this.f78531b, gcbVar.f78531b) && wj50.m88271j(this.f78532c, gcbVar.f78532c);
    }

    public final int hashCode() {
        return this.f78532c.hashCode() + s571.m77243b(this.f78530a.hashCode() * 31, 31, this.f78531b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f78530a);
        parcel.writeString(this.f78531b);
        parcel.writeString(this.f78532c);
    }

    public gcb(String str, String str2, String str3) {
        this.f78530a = str;
        this.f78531b = str2;
        this.f78532c = str3;
    }
}
