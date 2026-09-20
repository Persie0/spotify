package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class j511 extends l511 {
    public static final Parcelable.Creator<j511> CREATOR = new u111(12);

    /* JADX INFO: renamed from: b */
    public final String f108838b;

    public j511(String str) {
        super(str);
        this.f108838b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j511) && wj50.m88271j(this.f108838b, ((j511) obj).f108838b);
    }

    public final int hashCode() {
        return this.f108838b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f108838b);
    }

    public /* synthetic */ j511() {
        this("inline_action");
    }
}
