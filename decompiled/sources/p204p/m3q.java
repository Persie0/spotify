package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m3q implements ytx0 {

    /* JADX INFO: renamed from: a */
    public static final m3q f139697a = new m3q();
    public static final Parcelable.Creator<m3q> CREATOR = new lso(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.ytx0
    public final List getRules() {
        return h6f.m46715L(Rule.DISALLOW_IF_AD_PLAYING, Rule.DISALLOW_IF_CAR_CONNECTED, Rule.DISALLOW_IF_APPLICATION_BACKGROUNDED, Rule.DISALLOW_IF_CONTEXT_SWITCHED, Rule.DISALLOW_IF_CONFLICTING_MESSAGE_PRESENTING, Rule.DISALLOW_IF_CONNECTIVITY_OFFLINE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
