package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.address.endpoint.model.p012v1.proto.SubmitFormResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class s061 implements Parcelable {
    public static final Parcelable.Creator<s061> CREATOR = new r061();

    /* JADX INFO: renamed from: a */
    public final SubmitFormResponse.Suggestion f204312a;

    public s061(SubmitFormResponse.Suggestion suggestion) {
        this.f204312a = suggestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s061) && wj50.m88271j(this.f204312a, ((s061) obj).f204312a);
    }

    public final int hashCode() {
        return this.f204312a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f204312a.toByteArray());
    }
}
