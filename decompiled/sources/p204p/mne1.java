package p204p;

import com.spotify.mobius.functions.Consumer;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class mne1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145417a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tw90 f145418b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mne1(tw90 tw90Var, int i) {
        super(1);
        this.f145417a = i;
        this.f145418b = tw90Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f145417a;
        w2a1 w2a1Var = w2a1.f247311a;
        tw90 tw90Var = this.f145418b;
        switch (i) {
            case 0:
                wg61 wg61Var = hne1.f93317d;
                hne1 hne1Var = (hne1) ((Map) hne1.f93321h.getValue()).get(((zle1) obj).f283997a);
                if (hne1Var == null) {
                    hne1Var = hne1.f93322i;
                }
                Consumer consumer = (Consumer) tw90Var.f224388h;
                if (consumer != null) {
                    consumer.accept(new ome1(hne1Var.f93326c));
                }
                break;
            default:
                wg61 wg61Var2 = jne1.f114091d;
                jne1 jne1Var = (jne1) ((Map) jne1.f114095h.getValue()).get(((zle1) obj).f283997a);
                if (jne1Var == null) {
                    jne1Var = jne1.f114096i;
                }
                Consumer consumer2 = (Consumer) tw90Var.f224388h;
                if (consumer2 != null) {
                    consumer2.accept(new qme1(jne1Var.f114100c));
                }
                break;
        }
        return w2a1Var;
    }
}
