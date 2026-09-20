package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes10.dex */
public final class di9 extends ibk {

    /* JADX INFO: renamed from: a */
    public Bitmap f49279a;

    /* JADX INFO: renamed from: b */
    public Bitmap.CompressFormat f49280b;

    /* JADX INFO: renamed from: c */
    public int f49281c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f49282d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ei9 f49283e;

    /* JADX INFO: renamed from: f */
    public int f49284f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di9(ei9 ei9Var, ibk ibkVar) {
        super(ibkVar);
        this.f49283e = ei9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f49282d = obj;
        this.f49284f |= Integer.MIN_VALUE;
        return this.f49283e.m39086b(null, null, 0, this);
    }
}
