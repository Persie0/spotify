package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.TooltipAlignment;

/* JADX INFO: loaded from: classes8.dex */
public final class y2f0 {

    /* JADX INFO: renamed from: a */
    public final MessageText f268601a;

    /* JADX INFO: renamed from: b */
    public final Header f268602b;

    /* JADX INFO: renamed from: c */
    public final AccessoryContent f268603c;

    /* JADX INFO: renamed from: d */
    public final Button f268604d;

    /* JADX INFO: renamed from: e */
    public final TooltipAlignment f268605e;

    public y2f0(TooltipAlignment tooltipAlignment, MessageText messageText, AccessoryContent accessoryContent, Header header, Button button) {
        this.f268601a = messageText;
        this.f268602b = header;
        this.f268603c = accessoryContent;
        this.f268604d = button;
        this.f268605e = tooltipAlignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2f0)) {
            return false;
        }
        y2f0 y2f0Var = (y2f0) obj;
        return wj50.m88271j(this.f268601a, y2f0Var.f268601a) && wj50.m88271j(this.f268602b, y2f0Var.f268602b) && wj50.m88271j(this.f268603c, y2f0Var.f268603c) && wj50.m88271j(this.f268604d, y2f0Var.f268604d) && this.f268605e == y2f0Var.f268605e;
    }

    public final int hashCode() {
        int iHashCode = this.f268601a.hashCode() * 31;
        Header header = this.f268602b;
        int iHashCode2 = (iHashCode + (header == null ? 0 : header.hashCode())) * 31;
        AccessoryContent accessoryContent = this.f268603c;
        int iHashCode3 = (iHashCode2 + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
        Button button = this.f268604d;
        return this.f268605e.hashCode() + ((iHashCode3 + (button != null ? button.hashCode() : 0)) * 31);
    }
}
