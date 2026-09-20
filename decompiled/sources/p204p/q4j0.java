package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class q4j0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Iterator f185199a;

    /* JADX INFO: renamed from: b */
    public int f185200b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f185201c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ r4j0 f185202d;

    /* JADX INFO: renamed from: e */
    public int f185203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4j0(r4j0 r4j0Var, fbk fbkVar) {
        super(fbkVar);
        this.f185202d = r4j0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185201c = obj;
        this.f185203e |= Integer.MIN_VALUE;
        return this.f185202d.mo69110b(this);
    }
}
