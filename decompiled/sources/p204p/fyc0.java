package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class fyc0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74698a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hmv f74699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fyc0(hmv hmvVar, int i) {
        super(1);
        this.f74698a = i;
        this.f74699b = hmvVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f74698a) {
            case 0:
                x161 x161Var = (x161) obj;
                mzn0 mzn0Var = x161Var.f257074a;
                boolean zM88271j = wj50.m88271j(mzn0Var.f148736f, "spotify:playlist:37i9dQZF1EYkqdzj48dyYq");
                hmv hmvVar = this.f74699b;
                if (zM88271j) {
                    hmvVar.invoke(jwc0.f116620a);
                } else {
                    String str = mzn0Var.f148736f;
                    if (str != null) {
                        hmvVar.invoke(new ywc0(str));
                    } else {
                        hmvVar.invoke(new kxc0(mzn0Var.f148735e, x161Var.f257075b));
                    }
                }
                return w2a1.f247311a;
            case 1:
                r550 r550Var = (r550) obj;
                if (!(r550Var instanceof r550)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f74699b.invoke(new uwc0(r550Var.f195967a));
                return w2a1.f247311a;
            case 2:
                jcx0 jcx0Var = (jcx0) obj;
                boolean z = jcx0Var.f111200b;
                hmv hmvVar2 = this.f74699b;
                if (z) {
                    hmvVar2.invoke(fxc0.f74334a);
                } else {
                    hmvVar2.invoke(new gxc0(jcx0Var.f111199a));
                }
                return w2a1.f247311a;
            case 3:
                y4f y4fVar = (y4f) obj;
                boolean z2 = y4fVar instanceof u4f;
                hmv hmvVar3 = this.f74699b;
                if (z2) {
                    hmvVar3.invoke(new ywc0(((u4f) y4fVar).f226679a));
                } else if (y4fVar instanceof w4f) {
                    hmvVar3.invoke(new bwc0(((w4f) y4fVar).f247801a));
                } else if (y4fVar instanceof v4f) {
                    hmvVar3.invoke(new nxc0(((v4f) y4fVar).f237140a));
                } else {
                    if (!(y4fVar instanceof x4f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x4f x4fVar = (x4f) y4fVar;
                    hmvVar3.invoke(new mxc0(x4fVar.f258080a, x4fVar.f258081b, x4fVar.f258082c, x4fVar.f258083d));
                }
                return w2a1.f247311a;
            case 4:
                aov aovVar = (aov) obj;
                if (aovVar instanceof ynv) {
                    this.f74699b.invoke(new ywc0(((ynv) aovVar).f274509a));
                }
                return w2a1.f247311a;
            case 5:
                this.f74699b.invoke(new ywc0(((at61) obj).f19606a));
                return w2a1.f247311a;
            default:
                String str2 = ((aca1) obj).f14307a;
                if (str2 != null) {
                    this.f74699b.invoke(new ywc0(str2));
                }
                return w2a1.f247311a;
        }
    }
}
