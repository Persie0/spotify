package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class l62 implements Parcelable {
    public static final Parcelable.Creator<l62> CREATOR = new zt1(17);

    /* JADX INFO: renamed from: a */
    public final k92 f130143a;

    /* JADX INFO: renamed from: b */
    public final Intent f130144b;

    public l62(k92 k92Var, Intent intent) {
        this.f130143a = k92Var;
        this.f130144b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l62)) {
            return false;
        }
        l62 l62Var = (l62) obj;
        return wj50.m88271j(this.f130143a, l62Var.f130143a) && wj50.m88271j(this.f130144b, l62Var.f130144b);
    }

    public final int hashCode() {
        int iHashCode = this.f130143a.hashCode() * 31;
        Intent intent = this.f130144b;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f130143a, i);
        parcel.writeParcelable(this.f130144b, i);
    }
}
