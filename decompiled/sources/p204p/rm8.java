package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.BackgroundColor;
import com.spotify.pendragon.p123v1.proto.Background;

/* JADX INFO: loaded from: classes2.dex */
public final class rm8 implements gh00 {
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Background background = (Background) obj;
        int iM16988n = background.m16988n();
        int i = iM16988n == 0 ? -1 : qm8.f190153a[edb.m38547C(iM16988n)];
        if (i == 1) {
            return new BackgroundColor.SolidBackgroundColor(wl51.m88491o1(background.m16990q()).toString());
        }
        if (i != 2) {
            return i != 3 ? BackgroundColor.NotSet.INSTANCE : new BackgroundColor.ImageUrl(wl51.m88491o1(background.getImageUrl()).toString());
        }
        return new BackgroundColor.GradientBackgroundColor(wl51.m88491o1(background.m16989p().m17198q()).toString(), wl51.m88491o1(background.m16989p().m17197p()).toString(), background.m16989p().m17196o());
    }
}
