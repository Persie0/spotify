package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ene implements Parcelable {
    public static final Parcelable.Creator<ene> CREATOR = new rae(6);

    /* JADX INFO: renamed from: a */
    public final String f61147a;

    /* JADX INFO: renamed from: b */
    public final List f61148b;

    public ene(String str, List list) {
        this.f61147a = str;
        this.f61148b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ene)) {
            return false;
        }
        ene eneVar = (ene) obj;
        return wj50.m88271j(this.f61147a, eneVar.f61147a) && wj50.m88271j(this.f61148b, eneVar.f61148b);
    }

    public final int hashCode() {
        return this.f61148b.hashCode() + (this.f61147a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f61147a);
        parcel.writeStringList(this.f61148b);
    }
}
