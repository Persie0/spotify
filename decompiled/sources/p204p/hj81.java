package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class hj81 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f91987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ro80 f91988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rkm f91989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj81(ro80 ro80Var, rkm rkmVar, int i) {
        super(1);
        this.f91987a = i;
        this.f91988b = ro80Var;
        this.f91989c = rkmVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f91987a) {
            case 0:
                rkm rkmVar = this.f91989c;
                this.f91988b.add(((foo0) rkmVar.f200101d).m42311a((voc1) rkmVar.f200097H, Collections.singletonList((ContextTrack) obj)));
                break;
            default:
                rkm rkmVar2 = this.f91989c;
                this.f91988b.add(((foo0) rkmVar2.f200102e).m42311a((voc1) rkmVar2.f200097H, Collections.singletonList((ContextTrack) obj)));
                break;
        }
        return w2a1.f247311a;
    }
}
