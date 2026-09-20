package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class rct implements Parcelable {
    public static final Parcelable.Creator<rct> CREATOR = new qct(0);

    /* JADX INFO: renamed from: a */
    public final String f197924a;

    /* JADX INFO: renamed from: b */
    public final List f197925b;

    public rct(String str, List list) {
        this.f197924a = str;
        this.f197925b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final String m75317e() {
        return this.f197924a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rct)) {
            return false;
        }
        rct rctVar = (rct) obj;
        return wj50.m88271j(this.f197924a, rctVar.f197924a) && wj50.m88271j(this.f197925b, rctVar.f197925b);
    }

    public final int hashCode() {
        return this.f197925b.hashCode() + (this.f197924a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f197924a);
        parcel.writeStringList(this.f197925b);
    }
}
