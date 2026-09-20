package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes11.dex */
public final class hhv extends mhv {
    public static final Parcelable.Creator<hhv> CREATOR = new m8v(13);

    /* JADX INFO: renamed from: a */
    public final String f91593a;

    /* JADX INFO: renamed from: b */
    public final MessageResponseToken f91594b;

    public hhv(String str, MessageResponseToken messageResponseToken) {
        this.f91593a = str;
        this.f91594b = messageResponseToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhv)) {
            return false;
        }
        hhv hhvVar = (hhv) obj;
        return wj50.m88271j(this.f91593a, hhvVar.f91593a) && wj50.m88271j(this.f91594b, hhvVar.f91594b);
    }

    public final int hashCode() {
        return this.f91594b.hashCode() + (this.f91593a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f91593a);
        parcel.writeParcelable(this.f91594b, i);
    }
}
