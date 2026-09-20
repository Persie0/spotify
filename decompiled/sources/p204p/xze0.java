package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Signifier;

/* JADX INFO: loaded from: classes8.dex */
public final class xze0 {

    /* JADX INFO: renamed from: a */
    public final Signifier f267604a;

    /* JADX INFO: renamed from: b */
    public final HeaderContent f267605b;

    /* JADX INFO: renamed from: c */
    public final MessageText f267606c;

    /* JADX INFO: renamed from: d */
    public final BackgroundColor f267607d;

    /* JADX INFO: renamed from: e */
    public final MessageText f267608e;

    /* JADX INFO: renamed from: f */
    public final AccessoryContent f267609f;

    /* JADX INFO: renamed from: g */
    public final Button f267610g;

    /* JADX INFO: renamed from: h */
    public final Button f267611h;

    /* JADX INFO: renamed from: i */
    public final Button f267612i;

    /* JADX INFO: renamed from: j */
    public final Button f267613j;

    public xze0(Signifier signifier, HeaderContent headerContent, MessageText messageText, BackgroundColor backgroundColor, MessageText messageText2, AccessoryContent accessoryContent, Button button, Button button2, Button button3, Button button4, int i) {
        signifier = (i & 1) != 0 ? null : signifier;
        headerContent = (i & 2) != 0 ? null : headerContent;
        messageText2 = (i & 16) != 0 ? null : messageText2;
        button = (i & 64) != 0 ? null : button;
        button2 = (i & 128) != 0 ? null : button2;
        button3 = (i & 256) != 0 ? null : button3;
        button4 = (i & 512) != 0 ? null : button4;
        this.f267604a = signifier;
        this.f267605b = headerContent;
        this.f267606c = messageText;
        this.f267607d = backgroundColor;
        this.f267608e = messageText2;
        this.f267609f = accessoryContent;
        this.f267610g = button;
        this.f267611h = button2;
        this.f267612i = button3;
        this.f267613j = button4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xze0)) {
            return false;
        }
        xze0 xze0Var = (xze0) obj;
        return wj50.m88271j(this.f267604a, xze0Var.f267604a) && wj50.m88271j(this.f267605b, xze0Var.f267605b) && wj50.m88271j(this.f267606c, xze0Var.f267606c) && wj50.m88271j(this.f267607d, xze0Var.f267607d) && wj50.m88271j(this.f267608e, xze0Var.f267608e) && wj50.m88271j(this.f267609f, xze0Var.f267609f) && wj50.m88271j(this.f267610g, xze0Var.f267610g) && wj50.m88271j(this.f267611h, xze0Var.f267611h) && wj50.m88271j(this.f267612i, xze0Var.f267612i) && wj50.m88271j(this.f267613j, xze0Var.f267613j);
    }

    public final int hashCode() {
        Signifier signifier = this.f267604a;
        int iHashCode = (signifier == null ? 0 : signifier.hashCode()) * 31;
        HeaderContent headerContent = this.f267605b;
        int iHashCode2 = (this.f267607d.hashCode() + ei6.m39071h(this.f267606c, (iHashCode + (headerContent == null ? 0 : headerContent.hashCode())) * 31, 31)) * 31;
        MessageText messageText = this.f267608e;
        int iHashCode3 = (iHashCode2 + (messageText == null ? 0 : messageText.hashCode())) * 31;
        AccessoryContent accessoryContent = this.f267609f;
        int iHashCode4 = (iHashCode3 + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
        Button button = this.f267610g;
        int iHashCode5 = (iHashCode4 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.f267611h;
        int iHashCode6 = (iHashCode5 + (button2 == null ? 0 : button2.hashCode())) * 31;
        Button button3 = this.f267612i;
        int iHashCode7 = (iHashCode6 + (button3 == null ? 0 : button3.hashCode())) * 31;
        Button button4 = this.f267613j;
        return iHashCode7 + (button4 != null ? button4.hashCode() : 0);
    }
}
