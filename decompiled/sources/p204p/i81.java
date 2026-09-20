package p204p;

import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class i81 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99658a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hog0 f99659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i81(hog0 hog0Var, int i) {
        super(1);
        this.f99658a = i;
        this.f99659b = hog0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f99658a;
        int i2 = 0;
        hog0 hog0Var = this.f99659b;
        switch (i) {
            case 0:
                ((Number) obj).intValue();
                return hog0Var.mo24361d();
            case 1:
                return new oq91(new i81(hog0Var, i2));
            default:
                ((Number) obj).intValue();
                yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = hog0Var.f93537b;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return nap.m64023p(arrayList, zt91VarM94607a, arrayList);
        }
    }
}
