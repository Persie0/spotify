package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class knj extends onj {
    public static final Parcelable.Creator<knj> CREATOR = new dnj(6);

    /* JADX INFO: renamed from: a */
    public final String f124431a;

    /* JADX INFO: renamed from: b */
    public final SearchConfiguration f124432b;

    public knj(String str, SearchConfiguration searchConfiguration) {
        this.f124431a = str;
        this.f124432b = searchConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knj)) {
            return false;
        }
        knj knjVar = (knj) obj;
        return wj50.m88271j(this.f124431a, knjVar.f124431a) && wj50.m88271j(this.f124432b, knjVar.f124432b);
    }

    public final int hashCode() {
        return this.f124432b.hashCode() + (this.f124431a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f124431a);
        parcel.writeParcelable(this.f124432b, i);
    }
}
