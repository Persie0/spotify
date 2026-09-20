package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class eoo0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f61456b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ voc1 f61457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eoo0(List list, voc1 voc1Var, int i) {
        super(1);
        this.f61455a = i;
        this.f61456b = list;
        this.f61457c = voc1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f61455a) {
            case 0:
                bkg0 bkg0Var = (bkg0) obj;
                List list = this.f61456b;
                return list.size() == 1 ? bkg0Var.m29680e(((ContextTrack) g6f.m43741q0(list)).uri()) : bkg0Var.m29680e(this.f61457c.f243453a);
            default:
                khg0 khg0Var = (khg0) obj;
                List list2 = this.f61456b;
                return list2.size() == 1 ? khg0Var.m56435e(((ContextTrack) g6f.m43741q0(list2)).uri()) : khg0Var.m56435e(this.f61457c.f243453a);
        }
    }
}
