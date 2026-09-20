package p204p;

import android.content.Context;
import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
public final class o1t {

    /* JADX INFO: renamed from: a */
    public final Context f160842a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f160843b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f160844c;

    /* JADX INFO: renamed from: d */
    public final i4t0 f160845d;

    /* JADX INFO: renamed from: e */
    public final cp80 f160846e;

    public o1t(Context context, x0t x0tVar, wel0 wel0Var, yum yumVar, yum yumVar2, yum yumVar3) {
        this.f160842a = context;
        this.f160843b = yumVar;
        this.f160844c = yumVar2;
        this.f160845d = yumVar3;
        ep80 ep80VarM87892b = wel0Var.m87892b();
        hra.m48369o(ep80VarM87892b, new ysk(Collections.singletonList(new sec1(xiz0.f261974a, "select_all")), 27), false, new l1t(this, 0));
        hra.m48369o(ep80VarM87892b, new nmp(27, x0tVar.f256968a, this), false, new l1t(this, 1));
        hra.m48369o(ep80VarM87892b, new g7p(x0tVar.f256968a, 27), true, new l1t(this, 2));
        this.f160846e = ep80VarM87892b.m39637a();
    }
}
