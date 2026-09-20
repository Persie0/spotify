package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class mg00 implements Parcelable {
    public static final Parcelable.Creator<mg00> CREATOR;

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f143248a;

    static {
        int i = MessageResponseToken.$stable;
        CREATOR = new k700(7);
    }

    public mg00(MessageResponseToken messageResponseToken) {
        this.f143248a = messageResponseToken;
    }

    /* JADX INFO: renamed from: c */
    public final MessageResponseToken m61661c() {
        return this.f143248a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mg00) && wj50.m88271j(this.f143248a, ((mg00) obj).f143248a);
    }

    public final int hashCode() {
        return this.f143248a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f143248a, i);
    }
}
