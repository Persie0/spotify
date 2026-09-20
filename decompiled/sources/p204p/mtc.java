package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class mtc implements Parcelable {
    public static final Parcelable.Creator<mtc> CREATOR = new a5c(28);

    /* JADX INFO: renamed from: a */
    public final String f147022a;

    public mtc(String str) {
        this.f147022a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m62814c() {
        return this.f147022a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mtc) && wj50.m88271j(this.f147022a, ((mtc) obj).f147022a);
    }

    public final int hashCode() {
        return this.f147022a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f147022a);
    }
}
