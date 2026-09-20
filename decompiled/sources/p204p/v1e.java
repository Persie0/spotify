package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.checkout.pageactivityproxy.PageActivityProxy;
import com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class v1e {

    /* JADX INFO: renamed from: a */
    public final hkq0 f236332a;

    /* JADX INFO: renamed from: b */
    public final hae f236333b;

    public v1e(hkq0 hkq0Var, hae haeVar) {
        this.f236332a = hkq0Var;
        this.f236333b = haeVar;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m84461a(Context context, q1e q1eVar) {
        h7e h7eVarM50058b;
        e1e e1eVar = q1eVar.f184301a;
        Uri uri = q1eVar.f184303c;
        if (this.f236332a.m47850a(uri)) {
            String string = uri.toString();
            Intent intent = new Intent(context, (Class<?>) PremiumCheckoutActivity.class);
            intent.putExtra("EXTRA_ARGS", new qjq0(string, e1eVar, false));
            return intent;
        }
        iae iaeVar = (iae) this.f236333b;
        if (iaeVar.m50059c(uri) && (h7eVarM50058b = iaeVar.m50058b(e1eVar, uri)) != null) {
            return iaeVar.m50057a(context, h7eVarM50058b);
        }
        Intent intentM60990e = m6b.m60990e(context, PageActivityProxy.class, "EXTRA_PAGE_URI", xoc1.f264097h2.f243453a);
        intentM60990e.putExtra("EXTRA_INPUT", q1eVar);
        intentM60990e.putExtra("EXTRA_INPUT_CLASS_NAME", q1e.class.getName());
        return intentM60990e;
    }
}
