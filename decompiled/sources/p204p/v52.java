package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class v52 implements Parcelable {
    public static final Parcelable.Creator<v52> CREATOR = new zt1(16);

    /* JADX INFO: renamed from: a */
    public final k92 f237292a;

    /* JADX INFO: renamed from: b */
    public final Intent f237293b;

    public v52(k92 k92Var, Intent intent) {
        this.f237292a = k92Var;
        this.f237293b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v52)) {
            return false;
        }
        v52 v52Var = (v52) obj;
        return wj50.m88271j(this.f237292a, v52Var.f237292a) && wj50.m88271j(this.f237293b, v52Var.f237293b);
    }

    public final int hashCode() {
        int iHashCode = this.f237292a.hashCode() * 31;
        Intent intent = this.f237293b;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f237292a, i);
        parcel.writeParcelable(this.f237293b, i);
    }
}
