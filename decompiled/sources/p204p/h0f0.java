package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText;

/* JADX INFO: loaded from: classes8.dex */
public final class h0f0 extends th1 {

    /* JADX INFO: renamed from: h */
    public final BackgroundColor f86270h;

    /* JADX INFO: renamed from: i */
    public final AccessoryContent f86271i;

    /* JADX INFO: renamed from: j */
    public final MessageText f86272j;

    /* JADX INFO: renamed from: k */
    public final MessageText f86273k;

    /* JADX INFO: renamed from: l */
    public final Button f86274l;

    /* JADX INFO: renamed from: m */
    public final Button f86275m;

    /* JADX INFO: renamed from: n */
    public final Disclaimer f86276n;

    /* JADX INFO: renamed from: o */
    public final AccessoryContentSize f86277o;

    /* JADX INFO: renamed from: p */
    public final ContentAlignment f86278p;

    static {
        Disclaimer.Companion companion = Disclaimer.INSTANCE;
        Button.Companion companion2 = Button.INSTANCE;
        MessageText.Companion companion3 = MessageText.INSTANCE;
        AccessoryContent.Companion companion4 = AccessoryContent.INSTANCE;
        BackgroundColor.Companion companion5 = BackgroundColor.INSTANCE;
    }

    public h0f0(BackgroundColor backgroundColor, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, Button button, Button button2, Disclaimer disclaimer, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment) {
        this.f86270h = backgroundColor;
        this.f86271i = accessoryContent;
        this.f86272j = messageText;
        this.f86273k = messageText2;
        this.f86274l = button;
        this.f86275m = button2;
        this.f86276n = disclaimer;
        this.f86277o = accessoryContentSize;
        this.f86278p = contentAlignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0f0)) {
            return false;
        }
        h0f0 h0f0Var = (h0f0) obj;
        return wj50.m88271j(this.f86270h, h0f0Var.f86270h) && wj50.m88271j(this.f86271i, h0f0Var.f86271i) && wj50.m88271j(this.f86272j, h0f0Var.f86272j) && wj50.m88271j(this.f86273k, h0f0Var.f86273k) && wj50.m88271j(this.f86274l, h0f0Var.f86274l) && wj50.m88271j(this.f86275m, h0f0Var.f86275m) && wj50.m88271j(this.f86276n, h0f0Var.f86276n) && this.f86277o == h0f0Var.f86277o && this.f86278p == h0f0Var.f86278p;
    }

    public final int hashCode() {
        BackgroundColor backgroundColor = this.f86270h;
        int iHashCode = (backgroundColor == null ? 0 : backgroundColor.hashCode()) * 31;
        AccessoryContent accessoryContent = this.f86271i;
        int iHashCode2 = (iHashCode + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
        MessageText messageText = this.f86272j;
        int iM39071h = ei6.m39071h(this.f86273k, (iHashCode2 + (messageText == null ? 0 : messageText.hashCode())) * 31, 31);
        Button button = this.f86274l;
        int iHashCode3 = (iM39071h + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.f86275m;
        int iHashCode4 = (iHashCode3 + (button2 == null ? 0 : button2.hashCode())) * 31;
        Disclaimer disclaimer = this.f86276n;
        return this.f86278p.hashCode() + ((this.f86277o.hashCode() + ((iHashCode4 + (disclaimer != null ? disclaimer.hashCode() : 0)) * 31)) * 31);
    }
}
