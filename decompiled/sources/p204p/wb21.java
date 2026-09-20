package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class wb21 implements Parcelable {
    public static final Parcelable.Creator<wb21> CREATOR = new q321(12);

    /* JADX INFO: renamed from: a */
    public final Intent f249680a;

    /* JADX INFO: renamed from: b */
    public final String f249681b;

    public wb21(String str, Intent intent) {
        this.f249680a = intent;
        this.f249681b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb21)) {
            return false;
        }
        wb21 wb21Var = (wb21) obj;
        return wj50.m88271j(this.f249680a, wb21Var.f249680a) && wj50.m88271j(this.f249681b, wb21Var.f249681b);
    }

    public final int hashCode() {
        Intent intent = this.f249680a;
        return this.f249681b.hashCode() + ((intent == null ? 0 : intent.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f249680a, i);
        parcel.writeString(this.f249681b);
    }
}
