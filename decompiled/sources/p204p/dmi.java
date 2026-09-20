package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class dmi implements Parcelable {
    public static final Parcelable.Creator<dmi> CREATOR = new f2i(6);

    /* JADX INFO: renamed from: a */
    public final String f50534a;

    /* JADX INFO: renamed from: b */
    public final String f50535b;

    public dmi(String str, String str2) {
        this.f50534a = str;
        this.f50535b = str2;
    }

    /* JADX INFO: renamed from: c */
    public static dmi m36416c(dmi dmiVar, String str) {
        String str2 = dmiVar.f50534a;
        dmiVar.getClass();
        return new dmi(str2, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmi)) {
            return false;
        }
        dmi dmiVar = (dmi) obj;
        return wj50.m88271j(this.f50534a, dmiVar.f50534a) && wj50.m88271j(this.f50535b, dmiVar.f50535b);
    }

    /* JADX INFO: renamed from: g */
    public final String m36417g() {
        return this.f50535b;
    }

    public final int hashCode() {
        return this.f50535b.hashCode() + (this.f50534a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50534a);
        parcel.writeString(this.f50535b);
    }
}
