package p204p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x2q extends ibk {

    /* JADX INFO: renamed from: a */
    public Collection f257540a;

    /* JADX INFO: renamed from: b */
    public Iterator f257541b;

    /* JADX INFO: renamed from: c */
    public Collection f257542c;

    /* JADX INFO: renamed from: d */
    public int f257543d;

    /* JADX INFO: renamed from: e */
    public int f257544e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f257545f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ z2q f257546g;

    /* JADX INFO: renamed from: h */
    public int f257547h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2q(z2q z2qVar, ibk ibkVar) {
        super(ibkVar);
        this.f257546g = z2qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f257545f = obj;
        this.f257547h |= Integer.MIN_VALUE;
        return z2q.m95230a(this.f257546g, null, this);
    }
}
