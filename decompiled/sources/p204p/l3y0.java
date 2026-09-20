package p204p;

import android.content.Context;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class l3y0 {

    /* JADX INFO: renamed from: d */
    public static final String[] f129457d = {"auth_server_url", "api_server_url"};

    /* JADX INFO: renamed from: a */
    public final Context f129458a;

    /* JADX INFO: renamed from: b */
    public final fus0 f129459b;

    /* JADX INFO: renamed from: c */
    public xul0 f129460c = C2244p5.f174033a;

    public l3y0(fus0 fus0Var, Context context) {
        this.f129459b = fus0Var;
        this.f129458a = context;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m58031a() {
        Context context = this.f129458a;
        fus0 fus0Var = this.f129459b;
        int i = 11;
        return fus0Var.m42744a(context).doOnDispose(new vv2(fus0Var, i)).doOnTerminate(new vv2(fus0Var, i));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58032b(cy30 cy30Var) {
        Bundle bundle = new Bundle();
        bundle.putStringArray("additional", f129457d);
        bundle.putString("scope", "openid");
        if (!this.f129460c.mo49279c()) {
            return false;
        }
        return ((ay30) cy30Var).m27500v1((String) this.f129460c.mo49278b(), bundle);
    }
}
