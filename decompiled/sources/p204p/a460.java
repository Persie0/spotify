package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class a460 implements Parcelable {
    public static final Parcelable.Creator<a460> CREATOR = new pq50(16);

    /* JADX INFO: renamed from: a */
    public final String f12145a;

    public a460(String str) {
        this.f12145a = str;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m24668c() {
        Bundle bundle = new Bundle();
        bundle.putString("jam_manage_participants_sheet_session_id_key", this.f12145a);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a460) && wj50.m88271j(this.f12145a, ((a460) obj).f12145a);
    }

    public final int hashCode() {
        return this.f12145a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12145a);
    }
}
