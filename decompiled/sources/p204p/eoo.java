package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class eoo implements Parcelable {
    public static final Parcelable.Creator<eoo> CREATOR = new pkl(29);

    /* JADX INFO: renamed from: a */
    public final String f61453a;

    /* JADX INFO: renamed from: b */
    public final int f61454b;

    public eoo(String str, int i) {
        this.f61453a = str;
        this.f61454b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoo)) {
            return false;
        }
        eoo eooVar = (eoo) obj;
        return wj50.m88271j(this.f61453a, eooVar.f61453a) && this.f61454b == eooVar.f61454b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61454b) + (this.f61453a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f61453a);
        parcel.writeInt(this.f61454b);
    }
}
