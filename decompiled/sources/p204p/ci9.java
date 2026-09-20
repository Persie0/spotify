package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes10.dex */
public final class ci9 extends ibk {

    /* JADX INFO: renamed from: a */
    public Bitmap f38253a;

    /* JADX INFO: renamed from: b */
    public ovy f38254b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f38255c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ei9 f38256d;

    /* JADX INFO: renamed from: e */
    public int f38257e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci9(ei9 ei9Var, ibk ibkVar) {
        super(ibkVar);
        this.f38256d = ei9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38255c = obj;
        this.f38257e |= Integer.MIN_VALUE;
        return this.f38256d.m39085a(null, this);
    }
}
