package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class r13 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194703a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz[] f194704b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f194705c;

    public /* synthetic */ r13(fiz[] fizVarArr, List list, int i) {
        this.f194703a = i;
        this.f194704b = fizVarArr;
        this.f194705c = list;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f194703a) {
            case 0:
                fiz[] fizVarArr = this.f194704b;
                Object objM85470k = vgg1.m85470k(fbkVar, nizVar, new p13(fizVarArr, 0), new q13(0, this.f194705c, null), fizVarArr);
                return objM85470k == yuk.f276404a ? objM85470k : w2a1.f247311a;
            default:
                fiz[] fizVarArr2 = this.f194704b;
                Object objM85470k2 = vgg1.m85470k(fbkVar, nizVar, new p13(fizVarArr2, 10), new q13(1, this.f194705c, null), fizVarArr2);
                return objM85470k2 == yuk.f276404a ? objM85470k2 : w2a1.f247311a;
        }
    }
}
