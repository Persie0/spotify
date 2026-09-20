package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText;

/* JADX INFO: loaded from: classes8.dex */
public final class qze0 extends tg1 {

    /* JADX INFO: renamed from: c */
    public final BackgroundColor f194189c;

    /* JADX INFO: renamed from: d */
    public final AccessoryContent f194190d;

    /* JADX INFO: renamed from: e */
    public final MessageText f194191e;

    /* JADX INFO: renamed from: f */
    public final MessageText f194192f;

    /* JADX INFO: renamed from: g */
    public final Button f194193g;

    /* JADX INFO: renamed from: h */
    public final Button f194194h;

    /* JADX INFO: renamed from: i */
    public final Disclaimer f194195i;

    /* JADX INFO: renamed from: j */
    public final AccessoryContentSize f194196j;

    /* JADX INFO: renamed from: k */
    public final ContentAlignment f194197k;

    static {
        Disclaimer.Companion companion = Disclaimer.INSTANCE;
        Button.Companion companion2 = Button.INSTANCE;
        MessageText.Companion companion3 = MessageText.INSTANCE;
        AccessoryContent.Companion companion4 = AccessoryContent.INSTANCE;
        BackgroundColor.Companion companion5 = BackgroundColor.INSTANCE;
    }

    public qze0(BackgroundColor backgroundColor, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, Button button, Button button2, Disclaimer disclaimer, AccessoryContentSize accessoryContentSize, ContentAlignment contentAlignment) {
        this.f194189c = backgroundColor;
        this.f194190d = accessoryContent;
        this.f194191e = messageText;
        this.f194192f = messageText2;
        this.f194193g = button;
        this.f194194h = button2;
        this.f194195i = disclaimer;
        this.f194196j = accessoryContentSize;
        this.f194197k = contentAlignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qze0)) {
            return false;
        }
        qze0 qze0Var = (qze0) obj;
        return wj50.m88271j(this.f194189c, qze0Var.f194189c) && wj50.m88271j(this.f194190d, qze0Var.f194190d) && wj50.m88271j(this.f194191e, qze0Var.f194191e) && wj50.m88271j(this.f194192f, qze0Var.f194192f) && wj50.m88271j(this.f194193g, qze0Var.f194193g) && wj50.m88271j(this.f194194h, qze0Var.f194194h) && wj50.m88271j(this.f194195i, qze0Var.f194195i) && this.f194196j == qze0Var.f194196j && this.f194197k == qze0Var.f194197k;
    }

    public final int hashCode() {
        int iHashCode = this.f194189c.hashCode() * 31;
        AccessoryContent accessoryContent = this.f194190d;
        int iHashCode2 = (this.f194193g.hashCode() + ei6.m39071h(this.f194192f, ei6.m39071h(this.f194191e, (iHashCode + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31, 31), 31)) * 31;
        Button button = this.f194194h;
        int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        Disclaimer disclaimer = this.f194195i;
        int iHashCode4 = disclaimer != null ? disclaimer.hashCode() : 0;
        return this.f194197k.hashCode() + ((this.f194196j.hashCode() + ((iHashCode3 + iHashCode4) * 31)) * 31);
    }
}
