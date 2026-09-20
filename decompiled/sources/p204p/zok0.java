package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class zok0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284808a;

    /* JADX INFO: renamed from: b */
    public int f284809b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f284810c;

    /* JADX INFO: renamed from: d */
    public niz f284811d;

    /* JADX INFO: renamed from: e */
    public Iterator f284812e;

    /* JADX INFO: renamed from: f */
    public int f284813f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zok0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f284810c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284808a = obj;
        this.f284809b |= Integer.MIN_VALUE;
        return this.f284810c.emit(null, this);
    }
}
