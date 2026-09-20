package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class u3j implements w3j {
    public static final Parcelable.Creator<u3j> CREATOR = new f2i(19);

    /* JADX INFO: renamed from: a */
    public final List f226395a;

    public u3j(List list) {
        this.f226395a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3j) && wj50.m88271j(this.f226395a, ((u3j) obj).f226395a);
    }

    public final int hashCode() {
        return this.f226395a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f226395a);
    }
}
