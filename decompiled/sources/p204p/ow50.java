package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ow50 extends r591 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qh00 f170645c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow50(Iterator it, qh00 qh00Var) {
        super(it, 0);
        this.f170645c = qh00Var;
    }

    @Override // p204p.r591
    /* JADX INFO: renamed from: a */
    public final Object mo41890a(Object obj) {
        return this.f170645c.apply(obj);
    }
}
