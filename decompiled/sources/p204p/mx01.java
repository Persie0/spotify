package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class mx01 extends ox01 {
    public static final Parcelable.Creator<mx01> CREATOR = new bv01(14);

    /* JADX INFO: renamed from: a */
    public final String f147919a;

    public mx01(String str) {
        this.f147919a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mx01) && wj50.m88271j(this.f147919a, ((mx01) obj).f147919a);
    }

    public final int hashCode() {
        String str = this.f147919a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f147919a);
    }
}
