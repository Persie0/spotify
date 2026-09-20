package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.WebViewTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.p123v1.proto.Webview;

/* JADX INFO: loaded from: classes2.dex */
public final class omd1 implements gh00 {
    @Override // p204p.gh00
    public final Object invoke(Object obj) throws MessageParsingException {
        Webview webview = (Webview) obj;
        int iM17317q = webview.m17317q();
        if ((iM17317q == 0 ? -1 : nmd1.f155411a[edb.m38547C(iM17317q)]) == 1) {
            return new Format.WebView(new WebViewTemplate.BasicWebView(webview.m17316o().m17112p(), webview.m17316o().m17111o()));
        }
        throw new MessageParsingException(fte0.UNSUPPORTED_TEMPLATE);
    }
}
