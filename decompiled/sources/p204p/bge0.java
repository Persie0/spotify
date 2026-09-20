package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class bge0 {

    /* JADX INFO: renamed from: a */
    public final z9j0 f26923a;

    /* JADX INFO: renamed from: b */
    public final nge0 f26924b;

    public bge0(z9j0 z9j0Var, nge0 nge0Var) {
        this.f26923a = z9j0Var;
        this.f26924b = nge0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29119a(String str) {
        if (!this.f26924b.f153687a.m44712a()) {
            return false;
        }
        String string = new Uri.Builder().encodedPath("spotify:internal:membership-upsell-sheet").appendQueryParameter("showUri", str).build().toString();
        if (string == null) {
            throw new IllegalStateException("uri was not set!");
        }
        this.f26923a.mo63651f(new p6j0(string, "", false, false, 0, 0, false, null, null, null));
        return true;
    }
}
