package p204p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public final class a4k0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LinkedHashSet f12275b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pj31 f12276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4k0(LinkedHashSet linkedHashSet, pj31 pj31Var, int i) {
        super(0);
        this.f12274a = i;
        this.f12275b = linkedHashSet;
        this.f12276c = pj31Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f12274a) {
            case 0:
                this.f12275b.add(new y2k0(this.f12276c.f178135b, 2));
                break;
            default:
                pj31 pj31Var = this.f12276c;
                this.f12275b.add(new x2k0(pj31Var.f178150q, pj31Var.f178135b));
                break;
        }
        return w2a1.f247311a;
    }
}
