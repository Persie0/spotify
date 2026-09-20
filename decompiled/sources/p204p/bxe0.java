package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.Alignment;

/* JADX INFO: loaded from: classes8.dex */
public final class bxe0 {

    /* JADX INFO: renamed from: a */
    public final Alignment f31829a;

    /* JADX INFO: renamed from: b */
    public final Signifier f31830b;

    /* JADX INFO: renamed from: c */
    public final HeaderContent f31831c;

    /* JADX INFO: renamed from: d */
    public final AccessoryContent f31832d;

    /* JADX INFO: renamed from: e */
    public final BackgroundColor f31833e;

    /* JADX INFO: renamed from: f */
    public final MessageText f31834f;

    /* JADX INFO: renamed from: g */
    public final MessageText f31835g;

    /* JADX INFO: renamed from: h */
    public final Button f31836h;

    /* JADX INFO: renamed from: i */
    public final Button f31837i;

    /* JADX INFO: renamed from: j */
    public final Button f31838j;

    /* JADX INFO: renamed from: k */
    public final Button f31839k;

    /* JADX INFO: renamed from: l */
    public final Disclaimer f31840l;

    public bxe0(Alignment alignment, Signifier signifier, HeaderContent headerContent, AccessoryContent accessoryContent, BackgroundColor backgroundColor, MessageText messageText, MessageText messageText2, Button button, Button button2, Button button3, Button button4, Disclaimer disclaimer, int i) {
        alignment = (i & 1) != 0 ? null : alignment;
        signifier = (i & 2) != 0 ? null : signifier;
        headerContent = (i & 4) != 0 ? null : headerContent;
        accessoryContent = (i & 8) != 0 ? null : accessoryContent;
        button4 = (i & 1024) != 0 ? null : button4;
        disclaimer = (i & 2048) != 0 ? null : disclaimer;
        this.f31829a = alignment;
        this.f31830b = signifier;
        this.f31831c = headerContent;
        this.f31832d = accessoryContent;
        this.f31833e = backgroundColor;
        this.f31834f = messageText;
        this.f31835g = messageText2;
        this.f31836h = button;
        this.f31837i = button2;
        this.f31838j = button3;
        this.f31839k = button4;
        this.f31840l = disclaimer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxe0)) {
            return false;
        }
        bxe0 bxe0Var = (bxe0) obj;
        return this.f31829a == bxe0Var.f31829a && wj50.m88271j(this.f31830b, bxe0Var.f31830b) && wj50.m88271j(this.f31831c, bxe0Var.f31831c) && wj50.m88271j(this.f31832d, bxe0Var.f31832d) && wj50.m88271j(this.f31833e, bxe0Var.f31833e) && wj50.m88271j(this.f31834f, bxe0Var.f31834f) && wj50.m88271j(this.f31835g, bxe0Var.f31835g) && wj50.m88271j(this.f31836h, bxe0Var.f31836h) && wj50.m88271j(this.f31837i, bxe0Var.f31837i) && wj50.m88271j(this.f31838j, bxe0Var.f31838j) && wj50.m88271j(this.f31839k, bxe0Var.f31839k) && wj50.m88271j(this.f31840l, bxe0Var.f31840l);
    }

    public final int hashCode() {
        Alignment alignment = this.f31829a;
        int iHashCode = (alignment == null ? 0 : alignment.hashCode()) * 31;
        Signifier signifier = this.f31830b;
        int iHashCode2 = (iHashCode + (signifier == null ? 0 : signifier.hashCode())) * 31;
        HeaderContent headerContent = this.f31831c;
        int iHashCode3 = (iHashCode2 + (headerContent == null ? 0 : headerContent.hashCode())) * 31;
        AccessoryContent accessoryContent = this.f31832d;
        int iHashCode4 = (iHashCode3 + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
        BackgroundColor backgroundColor = this.f31833e;
        int iM39071h = ei6.m39071h(this.f31835g, ei6.m39071h(this.f31834f, (iHashCode4 + (backgroundColor == null ? 0 : backgroundColor.hashCode())) * 31, 31), 31);
        Button button = this.f31836h;
        int iHashCode5 = (iM39071h + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.f31837i;
        int iHashCode6 = (iHashCode5 + (button2 == null ? 0 : button2.hashCode())) * 31;
        Button button3 = this.f31838j;
        int iHashCode7 = (iHashCode6 + (button3 == null ? 0 : button3.hashCode())) * 31;
        Button button4 = this.f31839k;
        int iHashCode8 = (iHashCode7 + (button4 == null ? 0 : button4.hashCode())) * 31;
        Disclaimer disclaimer = this.f31840l;
        return iHashCode8 + (disclaimer != null ? disclaimer.hashCode() : 0);
    }
}
