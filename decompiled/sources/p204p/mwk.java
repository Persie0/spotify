package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class mwk implements Parcelable {
    public static final Parcelable.Creator<mwk> CREATOR = new kck(23);

    /* JADX INFO: renamed from: a */
    public final String f147802a;

    /* JADX INFO: renamed from: b */
    public final String f147803b;

    /* JADX INFO: renamed from: c */
    public final String f147804c;

    public mwk(String str, String str2, String str3) {
        this.f147802a = str;
        this.f147803b = str2;
        this.f147804c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwk)) {
            return false;
        }
        mwk mwkVar = (mwk) obj;
        return wj50.m88271j(this.f147802a, mwkVar.f147802a) && wj50.m88271j(this.f147803b, mwkVar.f147803b) && wj50.m88271j(this.f147804c, mwkVar.f147804c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f147802a.hashCode() * 31, 31, this.f147803b);
        String str = this.f147804c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f147802a);
        parcel.writeString(this.f147803b);
        parcel.writeString(this.f147804c);
    }
}
