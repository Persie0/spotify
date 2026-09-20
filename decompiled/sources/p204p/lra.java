package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class lra implements e9y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d7y0 f136246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gw41 f136247b;

    public lra(d7y0 d7y0Var, gw41 gw41Var) {
        this.f136246a = d7y0Var;
        this.f136247b = gw41Var;
    }

    @Override // p204p.e9y0
    /* JADX INFO: renamed from: f */
    public final Bundle mo25168f() {
        try {
            return this.f136246a.mo27874Q(this.f136247b.getState());
        } catch (Exception unused) {
            return pp91.m70528i();
        }
    }
}
