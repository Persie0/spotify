package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class lf80 extends ibk {

    /* JADX INFO: renamed from: a */
    public fw80 f132845a;

    /* JADX INFO: renamed from: b */
    public Iterator f132846b;

    /* JADX INFO: renamed from: c */
    public int f132847c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f132848d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nf80 f132849e;

    /* JADX INFO: renamed from: f */
    public int f132850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf80(nf80 nf80Var, ibk ibkVar) {
        super(ibkVar);
        this.f132849e = nf80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f132848d = obj;
        this.f132850f |= Integer.MIN_VALUE;
        return this.f132849e.m64337m(null, null, this);
    }
}
