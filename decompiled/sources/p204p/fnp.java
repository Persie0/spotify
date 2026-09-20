package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class fnp implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71341a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f71342b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f71343c;

    public /* synthetic */ fnp(eb11 eb11Var, List list, int i) {
        this.f71341a = i;
        this.f71342b = eb11Var;
        this.f71343c = list;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f71341a) {
            case 0:
                Object objCollect = this.f71342b.collect(new sn2(nizVar, this.f71343c, 1), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f71342b.collect(new sn2(nizVar, this.f71343c, 2), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
