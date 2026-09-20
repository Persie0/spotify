package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class qv81 {

    /* JADX INFO: renamed from: a */
    public final xre f192939a;

    /* JADX INFO: renamed from: b */
    public final int f192940b;

    /* JADX INFO: renamed from: c */
    public final int f192941c;

    /* JADX INFO: renamed from: d */
    public final int f192942d;

    /* JADX INFO: renamed from: e */
    public final float f192943e;

    /* JADX INFO: renamed from: f */
    public final tc41 f192944f;

    /* JADX INFO: renamed from: g */
    public final tc41 f192945g;

    public qv81(Context context, xre xreVar) {
        this.f192939a = xreVar;
        this.f192940b = wqg1.m88767v(64.0f, context.getResources());
        this.f192941c = wqg1.m88767v(64.0f, context.getResources());
        this.f192942d = wqg1.m88767v(4.0f, context.getResources());
        this.f192943e = wqg1.m88767v(2.0f, context.getResources());
        float fM88767v = wqg1.m88767v(20.0f, context.getResources());
        this.f192944f = new tc41(context, vc41.PLAY, fM88767v);
        this.f192945g = new tc41(context, vc41.PAUSE, fM88767v);
    }
}
