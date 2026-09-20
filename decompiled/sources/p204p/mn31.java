package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class mn31 implements Parcelable {
    public static final Parcelable.Creator<mn31> CREATOR = new ln31(0);

    /* JADX INFO: renamed from: a */
    public final String f145302a;

    /* JADX INFO: renamed from: b */
    public final String f145303b;

    /* JADX INFO: renamed from: c */
    public final Long f145304c;

    public mn31(Long l, String str, String str2) {
        this.f145302a = str;
        this.f145303b = str2;
        this.f145304c = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn31)) {
            return false;
        }
        mn31 mn31Var = (mn31) obj;
        return wj50.m88271j(this.f145302a, mn31Var.f145302a) && wj50.m88271j(this.f145303b, mn31Var.f145303b) && wj50.m88271j(this.f145304c, mn31Var.f145304c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f145302a.hashCode() * 31, 31, this.f145303b);
        Long l = this.f145304c;
        return iM77243b + (l == null ? 0 : l.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f145302a);
        parcel.writeString(this.f145303b);
        Long l = this.f145304c;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
    }
}
