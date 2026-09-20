package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText;

/* JADX INFO: loaded from: classes8.dex */
public final class n2f0 {

    /* JADX INFO: renamed from: a */
    public final Header f149753a;

    /* JADX INFO: renamed from: b */
    public final MessageText f149754b;

    /* JADX INFO: renamed from: c */
    public final AccessoryContent f149755c;

    /* JADX INFO: renamed from: d */
    public final Button f149756d;

    /* JADX INFO: renamed from: e */
    public final Button f149757e;

    public n2f0(Header header, MessageText messageText, AccessoryContent accessoryContent, Button button, Button button2) {
        this.f149753a = header;
        this.f149754b = messageText;
        this.f149755c = accessoryContent;
        this.f149756d = button;
        this.f149757e = button2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2f0)) {
            return false;
        }
        n2f0 n2f0Var = (n2f0) obj;
        return wj50.m88271j(this.f149753a, n2f0Var.f149753a) && wj50.m88271j(this.f149754b, n2f0Var.f149754b) && wj50.m88271j(this.f149755c, n2f0Var.f149755c) && wj50.m88271j(this.f149756d, n2f0Var.f149756d) && wj50.m88271j(this.f149757e, n2f0Var.f149757e);
    }

    public final int hashCode() {
        Header header = this.f149753a;
        int iM39071h = ei6.m39071h(this.f149754b, (header == null ? 0 : header.hashCode()) * 31, 31);
        AccessoryContent accessoryContent = this.f149755c;
        int iHashCode = (iM39071h + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
        Button button = this.f149756d;
        int iHashCode2 = (iHashCode + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.f149757e;
        return iHashCode2 + (button2 != null ? button2.hashCode() : 0);
    }
}
