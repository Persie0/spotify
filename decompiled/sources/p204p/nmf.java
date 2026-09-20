package p204p;

import android.content.Intent;
import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class nmf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f155417a;

    /* JADX INFO: renamed from: b */
    public final Object f155418b;

    public /* synthetic */ nmf(Object obj, int i) {
        this.f155417a = i;
        this.f155418b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX INFO: renamed from: a */
    public final ivb0 m64816a(Intent intent) {
        boolean z;
        boolean zEquals;
        String strM32949o;
        switch (this.f155417a) {
            case 0:
                String dataString = intent.getDataString();
                if (dataString == null) {
                    return null;
                }
                if (!xoc1.f264070e.m83613a(dataString)) {
                    dataString = null;
                }
                if (dataString == null) {
                    return null;
                }
                voc1 voc1Var = new voc1(dataString);
                String stringExtra = intent.getStringExtra("com.spotify.podcast.EXTRA_COMMENT_ID_ORIGINATED_FROM_COMMENT_THREAD");
                if (stringExtra != null) {
                    if (stringExtra.length() == 0) {
                        stringExtra = null;
                    }
                    if (stringExtra != null) {
                        return new lmf(this, dataString, "spotify:comment:".concat(stringExtra), voc1Var);
                    }
                }
                if (intent.getBooleanExtra("com.spotify.podcast.EXTRA_ORIGINATED_FROM_COMMENTS", false)) {
                    return new mmf(this, dataString, voc1Var);
                }
                return null;
            case 1:
                String dataString2 = intent.getDataString();
                if (dataString2 == null) {
                    return null;
                }
                kl1 kl1Var = (kl1) this.f155418b;
                Uri uri = Uri.parse(dataString2);
                kl1Var.getClass();
                if (!kl1.m56794b(uri)) {
                    String string = uri.toString();
                    Uri uri2 = kl1Var.f123773g;
                    if (uri2 != null) {
                        String string2 = uri2.toString();
                        Set set = dd41.f47702f;
                        if (r46.m74709B(string2, gn80.TRACK, gn80.TRACK_AUTOPLAY)) {
                            zEquals = wl51.m88486j1(wl51.m88484h1(uri2.toString(), "/"), "?").equals(wl51.m88484h1(string, ":"));
                        } else {
                            zEquals = false;
                        }
                    } else {
                        zEquals = false;
                    }
                    z = zEquals;
                }
                if (!z) {
                    dataString2 = null;
                }
                if (dataString2 != null) {
                    return new d5y0(this);
                }
                return null;
            default:
                String dataString3 = intent.getDataString();
                if (dataString3 == null) {
                    return null;
                }
                try {
                    Set set2 = dd41.f47702f;
                    dd41 dd41VarM74726U = r46.m74726U(dataString3);
                    he41 he41Var = dd41VarM74726U.f47710d;
                    if (!wj50.m88271j(he41Var != null ? he41Var.getType() : null, avp0.f20242e) || dd41VarM74726U.m35710h().length() <= 0 || !wj50.m88271j(dd41VarM74726U.m35716n("openWorkoutSettings"), "true")) {
                        dataString3 = null;
                    }
                } catch (IllegalArgumentException | UnsupportedOperationException unused) {
                }
                if (dataString3 == null || (strM32949o = cjc.m32949o(dataString3)) == null) {
                    return null;
                }
                return new w8e1(this, strM32949o);
        }
    }
}
