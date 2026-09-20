package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class pam implements Parcelable {
    public static final Parcelable.Creator<pam> CREATOR = new pkl(14);

    /* JADX INFO: renamed from: a */
    public final String f175575a;

    /* JADX INFO: renamed from: b */
    public final yth0 f175576b;

    public pam(String str, yth0 yth0Var) {
        this.f175575a = str;
        this.f175576b = yth0Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m69493c() {
        return this.f175575a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pam)) {
            return false;
        }
        pam pamVar = (pam) obj;
        return wj50.m88271j(this.f175575a, pamVar.f175575a) && wj50.m88271j(this.f175576b, pamVar.f175576b);
    }

    public final int hashCode() {
        return this.f175576b.hashCode() + (this.f175575a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f175575a);
        parcel.writeParcelable(this.f175576b, i);
    }
}
