package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class mw20 extends qw20 {
    public static final Parcelable.Creator<mw20> CREATOR = new t320(20);

    /* JADX INFO: renamed from: a */
    public final String f147695a;

    public mw20(String str) {
        this.f147695a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mw20) && wj50.m88271j(this.f147695a, ((mw20) obj).f147695a);
    }

    public final int hashCode() {
        return this.f147695a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f147695a);
    }
}
