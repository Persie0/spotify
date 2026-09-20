package p204p;

import com.spotify.pendragon.p123v1.proto.BackgroundColor;

/* JADX INFO: loaded from: classes2.dex */
public final class bl8 implements gh00 {
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        BackgroundColor backgroundColor = (BackgroundColor) obj;
        int iM16993o = backgroundColor.m16993o();
        int i = iM16993o == 0 ? -1 : al8.f16795a[edb.m38547C(iM16993o)];
        if (i != 1) {
            return i != 2 ? com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor.NotSet.INSTANCE : new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor.GradientBackgroundColor(wl51.m88491o1(backgroundColor.m16994q().m17203r()).toString(), wl51.m88491o1(backgroundColor.m16994q().m17202q()).toString(), backgroundColor.m16994q().m17201p());
        }
        return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor.SolidBackgroundColor(wl51.m88491o1(backgroundColor.m16995r()).toString());
    }
}
