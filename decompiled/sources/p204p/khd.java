package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class khd extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LinkedHashMap f122611b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ khd(int i, LinkedHashMap linkedHashMap) {
        super(1);
        this.f122610a = i;
        this.f122611b = linkedHashMap;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f122610a) {
            case 0:
                return (String) this.f122611b.get((String) obj);
            case 1:
                return (String) this.f122611b.get((String) obj);
            case 2:
                ((cqx) obj).m33647b(eua1.class, this.f122611b.keySet(), false);
                return w2a1.f247311a;
            default:
                ((cqx) obj).m33647b(eua1.class, this.f122611b.keySet(), false);
                return w2a1.f247311a;
        }
    }
}
