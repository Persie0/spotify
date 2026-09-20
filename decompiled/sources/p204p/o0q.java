package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class o0q extends ibk {

    /* JADX INFO: renamed from: a */
    public rgr0 f160440a;

    /* JADX INFO: renamed from: b */
    public cx50 f160441b;

    /* JADX INFO: renamed from: c */
    public Iterator f160442c;

    /* JADX INFO: renamed from: d */
    public int f160443d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f160444e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ p0q f160445f;

    /* JADX INFO: renamed from: g */
    public int f160446g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0q(p0q p0qVar, ibk ibkVar) {
        super(ibkVar);
        this.f160445f = p0qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f160444e = obj;
        this.f160446g |= Integer.MIN_VALUE;
        return this.f160445f.m68725a(null, null, this);
    }
}
