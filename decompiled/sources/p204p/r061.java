package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.address.endpoint.model.p012v1.proto.SubmitFormResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class r061 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new s061(SubmitFormResponse.Suggestion.m2488G(parcel.createByteArray()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new s061[i];
    }
}
