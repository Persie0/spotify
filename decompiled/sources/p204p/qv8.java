package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qv8 implements ytx0 {

    /* JADX INFO: renamed from: a */
    public static final qv8 f192934a = new qv8();
    public static final Parcelable.Creator<qv8> CREATOR = new yi8(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.ytx0
    public final List getRules() {
        return h6f.m46715L(Rule.DISALLOW_IF_AD_PLAYING, Rule.DISALLOW_IF_NOW_PLAYING_VIEW_DISPLAYING, Rule.DISALLOW_IF_CAR_CONNECTED, Rule.DISALLOW_IF_APPLICATION_BACKGROUNDED, Rule.DISALLOW_IF_CONTEXT_SWITCHED, Rule.DISALLOW_IF_CONFLICTING_MESSAGE_PRESENTING, Rule.DISALLOW_IF_CONNECTIVITY_OFFLINE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
