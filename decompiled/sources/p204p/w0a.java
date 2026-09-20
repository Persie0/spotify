package p204p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class w0a extends ibk {

    /* JADX INFO: renamed from: a */
    public int f246676a;

    /* JADX INFO: renamed from: b */
    public hb11 f246677b;

    /* JADX INFO: renamed from: c */
    public guf f246678c;

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f246679d;

    /* JADX INFO: renamed from: e */
    public x0a f246680e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f246681f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ y0a f246682g;

    /* JADX INFO: renamed from: h */
    public int f246683h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0a(y0a y0aVar, ibk ibkVar) {
        super(ibkVar);
        this.f246682g = y0aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f246681f = obj;
        this.f246683h |= Integer.MIN_VALUE;
        return this.f246682g.m92557c(this);
    }
}
