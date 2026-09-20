package p204p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class w8y extends jld1 {

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ int f249034M0 = 0;

    /* JADX INFO: renamed from: L0 */
    public boolean f249035L0;

    /* JADX INFO: renamed from: g */
    public static void m87475g(w8y w8yVar) {
        super.cancel();
    }

    @Override // p204p.jld1
    /* JADX INFO: renamed from: c */
    public final Bundle mo53675c(String str) {
        Bundle bundleM63346E = n0b1.m63346E(Uri.parse(str).getQuery());
        String string = bundleM63346E.getString("bridge_args");
        bundleM63346E.remove("bridge_args");
        if (!n0b1.m63385y(string)) {
            try {
                bundleM63346E.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", jra.m54180a(new JSONObject(string)));
            } catch (JSONException unused) {
                p8y p8yVar = p8y.f175080a;
            }
        }
        String string2 = bundleM63346E.getString("method_results");
        bundleM63346E.remove("method_results");
        if (!n0b1.m63385y(string2)) {
            try {
                bundleM63346E.putBundle("com.facebook.platform.protocol.RESULT_ARGS", jra.m54180a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                p8y p8yVar2 = p8y.f175080a;
            }
        }
        bundleM63346E.remove("version");
        bundleM63346E.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", axi0.m27416g());
        return bundleM63346E;
    }

    @Override // p204p.jld1, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        ild1 ild1Var = this.f113591d;
        if (!this.f113586X || this.f113596i || ild1Var == null || !ild1Var.isShown()) {
            super.cancel();
        } else {
            if (this.f249035L0) {
                return;
            }
            this.f249035L0 = true;
            ild1Var.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new kep(this, 23), 1500L);
        }
    }
}
