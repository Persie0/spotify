package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class pn70 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mfb f179330a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xuk f179331b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f179332c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f179333d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f179334e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f179335f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ kqi0 f179336g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ egm0 f179337h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xre f179338i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn70(mfb mfbVar, xuk xukVar, kqi0 kqi0Var, kqi0 kqi0Var2, Context context, long j, kqi0 kqi0Var3, egm0 egm0Var, xre xreVar) {
        super(0);
        this.f179330a = mfbVar;
        this.f179331b = xukVar;
        this.f179332c = kqi0Var;
        this.f179333d = kqi0Var2;
        this.f179334e = context;
        this.f179335f = j;
        this.f179336g = kqi0Var3;
        this.f179337h = egm0Var;
        this.f179338i = xreVar;
    }

    @Override // p204p.eh00
    public final Object invoke() throws Exception {
        on70 on70Var = new on70(this.f179331b, this.f179332c, this.f179333d, this.f179334e, this.f179335f, this.f179336g, this.f179337h, this.f179338i);
        mfb mfbVar = this.f179330a;
        mfbVar.f143009c = on70Var;
        mfbVar.f143012f = 2;
        if (lzj.m60353c(mfbVar.f143007a, "android.permission.CAMERA") == 0) {
            mfbVar.m61622c();
        } else {
            mfbVar.f143016j.mo24737a("android.permission.CAMERA");
        }
        return w2a1.f247311a;
    }
}
