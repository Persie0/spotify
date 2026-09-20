package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class us41 implements ou41 {
    public static final Parcelable.Creator<us41> CREATOR = new tj41(12);

    /* JADX INFO: renamed from: a */
    public final String f233526a;

    public us41(String str) {
        this.f233526a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us41) && wj50.m88271j(this.f233526a, ((us41) obj).f233526a);
    }

    public final int hashCode() {
        return this.f233526a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f233526a);
    }
}
