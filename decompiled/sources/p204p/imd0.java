package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;

/* JADX INFO: loaded from: classes3.dex */
public final class imd0 extends smd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Messenger f103689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f103690b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xpo f103691c;

    public imd0(xpo xpoVar, jmd0 jmd0Var, int i, Intent intent, Messenger messenger, int i2) {
        this.f103691c = xpoVar;
        this.f103689a = messenger;
        this.f103690b = i2;
    }

    @Override // p204p.smd0
    /* JADX INFO: renamed from: a */
    public final void mo36781a(String str, Bundle bundle) {
        int i = lmd0.f134946f;
        if (this.f103691c.m91711j(this.f103689a) >= 0) {
            if (str == null) {
                lmd0.m59427d(this.f103689a, 4, this.f103690b, 0, bundle, null);
                return;
            }
            Bundle bundleM36606f = dq60.m36606f("error", str);
            lmd0.m59427d(this.f103689a, 4, this.f103690b, 0, bundle, bundleM36606f);
        }
    }

    @Override // p204p.smd0
    /* JADX INFO: renamed from: b */
    public final void mo36782b(Bundle bundle) {
        int i = lmd0.f134946f;
        if (this.f103691c.m91711j(this.f103689a) >= 0) {
            lmd0.m59427d(this.f103689a, 3, this.f103690b, 0, bundle, null);
        }
    }
}
