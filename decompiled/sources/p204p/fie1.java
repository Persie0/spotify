package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class fie1 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69875a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f69876b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f69877c;

    public /* synthetic */ fie1(fiz fizVar, Object obj, int i) {
        this.f69875a = i;
        this.f69876b = fizVar;
        this.f69877c = obj;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) throws Throwable {
        switch (this.f69875a) {
            case 0:
                Object objCollect = ((onc) this.f69876b).collect(new di91(25, nizVar, (yya1) this.f69877c), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = ((vjz) this.f69876b).collect(new v1a(23, nizVar, (ArrayList) this.f69877c), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            case 2:
                Object objCollect3 = ((yab) this.f69876b).collect(new di91(26, nizVar, (ite1) this.f69877c), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
            default:
                Object objCollect4 = this.f69876b.collect(new di91(27, nizVar, (eb90) this.f69877c), fbkVar);
                return objCollect4 == yuk.f276404a ? objCollect4 : w2a1.f247311a;
        }
    }
}
