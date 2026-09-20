package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes11.dex */
public final class xd91 implements af10 {

    /* JADX INFO: renamed from: b */
    public static final xd91 f260418b = new xd91(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260419a;

    public /* synthetic */ xd91(int i) {
        this.f260419a = i;
    }

    @Override // p204p.af10
    /* JADX INFO: renamed from: a */
    public final xms mo25796a(eh00 eh00Var) {
        switch (this.f260419a) {
            case 0:
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                return new xms(0.0f, xgg1.m90870r4().f36166c, "spotify-transsion-card-widget", eh00Var, 25);
            default:
                AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
                return new mzk(0.0f, xgg1.m90870r4().f36166c, "spotify-miui-recommendations-widget", eh00Var, 57);
        }
    }
}
