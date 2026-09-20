package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class v3j implements w3j {
    public static final Parcelable.Creator<v3j> CREATOR = new f2i(20);

    /* JADX INFO: renamed from: a */
    public final List f236893a;

    /* JADX INFO: renamed from: b */
    public final List f236894b;

    public v3j(ArrayList arrayList, List list) {
        this.f236893a = arrayList;
        this.f236894b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3j)) {
            return false;
        }
        v3j v3jVar = (v3j) obj;
        return wj50.m88271j(this.f236893a, v3jVar.f236893a) && wj50.m88271j(this.f236894b, v3jVar.f236894b);
    }

    public final int hashCode() {
        return this.f236894b.hashCode() + (this.f236893a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f236893a);
        parcel.writeStringList(this.f236894b);
    }
}
