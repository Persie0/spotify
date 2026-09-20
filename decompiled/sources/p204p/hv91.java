package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class hv91 {

    /* JADX INFO: renamed from: a */
    public final Uri f95635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iv91 f95636b;

    public hv91(Uri uri, iv91 iv91Var) {
        this.f95636b = iv91Var;
        this.f95635a = uri;
    }

    /* JADX INFO: renamed from: a */
    public final void m48760a() {
        String str;
        ck60 ck60VarM51738b = iv91.m51738b(this.f95635a);
        if (ck60VarM51738b == null || (str = ck60VarM51738b.f38826f) == null) {
            return;
        }
        this.f95636b.f106176b.m87298i().m41767a(new hsw(str.concat(":end")));
    }
}
