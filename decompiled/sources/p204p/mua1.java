package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class mua1 implements oua1 {
    public static final Parcelable.Creator<mua1> CREATOR = new u2a1(20);

    /* JADX INFO: renamed from: a */
    public final String f147286a;

    /* JADX INFO: renamed from: b */
    public final String f147287b;

    /* JADX INFO: renamed from: c */
    public final String f147288c;

    public mua1(String str, String str2, String str3) {
        this.f147286a = str;
        this.f147287b = str2;
        this.f147288c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mua1)) {
            return false;
        }
        mua1 mua1Var = (mua1) obj;
        return wj50.m88271j(this.f147286a, mua1Var.f147286a) && wj50.m88271j(this.f147287b, mua1Var.f147287b) && wj50.m88271j(this.f147288c, mua1Var.f147288c);
    }

    public final int hashCode() {
        return this.f147288c.hashCode() + s571.m77243b(this.f147286a.hashCode() * 31, 31, this.f147287b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f147286a);
        parcel.writeString(this.f147287b);
        parcel.writeString(this.f147288c);
    }
}
