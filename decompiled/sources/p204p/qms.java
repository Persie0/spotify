package p204p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class qms extends ibk {

    /* JADX INFO: renamed from: a */
    public Collection f190387a;

    /* JADX INFO: renamed from: b */
    public Iterator f190388b;

    /* JADX INFO: renamed from: c */
    public String f190389c;

    /* JADX INFO: renamed from: d */
    public int f190390d;

    /* JADX INFO: renamed from: e */
    public int f190391e;

    /* JADX INFO: renamed from: f */
    public int f190392f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f190393g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ rms f190394h;

    /* JADX INFO: renamed from: i */
    public int f190395i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qms(rms rmsVar, ibk ibkVar) {
        super(ibkVar);
        this.f190394h = rmsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f190393g = obj;
        this.f190395i |= Integer.MIN_VALUE;
        return rms.m75974e(this.f190394h, null, this);
    }
}
