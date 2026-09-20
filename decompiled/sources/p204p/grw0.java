package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class grw0 extends hrw0 {
    public static final Parcelable.Creator<grw0> CREATOR = new b8w0(20);

    /* JADX INFO: renamed from: a */
    public final List f83843a;

    public grw0(ArrayList arrayList) {
        this.f83843a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grw0) && wj50.m88271j(this.f83843a, ((grw0) obj).f83843a);
    }

    public final int hashCode() {
        return this.f83843a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f83843a);
    }
}
