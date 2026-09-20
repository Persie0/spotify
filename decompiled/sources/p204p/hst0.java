package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public final class hst0 implements ixi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94802a;

    /* JADX INFO: renamed from: b */
    public final Object f94803b;

    /* JADX INFO: renamed from: c */
    public final Object f94804c;

    public /* synthetic */ hst0(int i, Object obj, Object obj2) {
        this.f94802a = i;
        this.f94803b = obj;
        this.f94804c = obj2;
    }

    @Override // p204p.ixi
    /* JADX INFO: renamed from: a */
    public final hxi mo34319a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f94802a) {
            case 0:
                return ((lyh) this.f94803b).m60257b(context, layoutInflater, viewGroup, (n890) this.f94804c);
            case 1:
                return new sev0(viewGroup, layoutInflater, (c2o) this.f94804c, (aaq0) this.f94803b);
            default:
                b3o b3oVar = (b3o) this.f94803b;
                rmm0 rmm0Var = (rmm0) this.f94804c;
                cdn cdnVar = (cdn) b3oVar.f23085a.f171807c;
                z9j0 z9j0Var = (z9j0) ((gqw0) cdnVar.f36916c).f83568c.get();
                jg31.m53271i(z9j0Var);
                return new xlc0(z9j0Var, viewGroup, layoutInflater, rmm0Var, (c3o) ((h4t0) cdnVar.f36915b).get());
        }
    }
}
