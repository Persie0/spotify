package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class eh3 implements ba80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59471a;

    /* JADX INFO: renamed from: b */
    public final hqe1 f59472b;

    public /* synthetic */ eh3(hqe1 hqe1Var, int i) {
        this.f59471a = i;
        this.f59472b = hqe1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f59471a) {
            case 0:
                aa80 aa80Var = (aa80) obj;
                oe70 oe70Var = aa80Var.f13784a;
                b450 b450Var = aa80Var.f13785b;
                int i = b450Var.f278778a;
                wr31 wr31Var = aa80Var.f13787d;
                List list = aa80Var.f13788e;
                List list2 = aa80Var.f13790g;
                int i2 = (b450Var.f278779b + 1) - i;
                boolean z = aa80Var.f13789f;
                hqe1 hqe1Var = this.f59472b;
                return new z980(i, i2, oe70Var, hqe1Var.m48255n(), hqe1Var.m48251j(), wr31Var, z, true, (ibj) null, list, list2, 768);
            case 1:
                aa80 aa80Var2 = (aa80) obj;
                oe70 oe70Var2 = aa80Var2.f13784a;
                b450 b450Var2 = aa80Var2.f13785b;
                int i3 = b450Var2.f278778a;
                ibj ibjVar = aa80Var2.f13786c;
                int i4 = (b450Var2.f278779b + 1) - i3;
                hqe1 hqe1Var2 = this.f59472b;
                boolean zM48255n = hqe1Var2.m48255n();
                boolean zM48251j = hqe1Var2.m48251j();
                boolean z2 = aa80Var2.f13789f;
                wr31 wr31Var2 = wr31.RECENTLY_PLAYED_OR_ADDED;
                lau lauVar = lau.f131415a;
                return new z980(i3, i4, oe70Var2, zM48255n, zM48251j, wr31Var2, z2, true, false, ibjVar, (List) lauVar, (List) lauVar);
            default:
                aa80 aa80Var3 = (aa80) obj;
                oe70 oe70Var3 = aa80Var3.f13784a;
                b450 b450Var3 = aa80Var3.f13785b;
                int i5 = b450Var3.f278778a;
                ibj ibjVar2 = aa80Var3.f13786c;
                wr31 wr31Var3 = aa80Var3.f13787d;
                List list3 = aa80Var3.f13788e;
                List list4 = aa80Var3.f13790g;
                int i6 = (b450Var3.f278779b + 1) - i5;
                hqe1 hqe1Var3 = this.f59472b;
                return new z980(i5, i6, oe70Var3, hqe1Var3.m48255n(), hqe1Var3.m48251j(), wr31Var3, aa80Var3.f13789f, true, ibjVar2, list3, list4, 256);
        }
    }
}
