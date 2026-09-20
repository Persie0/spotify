package p204p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public final class lvs extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LinkedHashSet f137382b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lvs(LinkedHashSet linkedHashSet, int i) {
        super(1);
        this.f137381a = i;
        this.f137382b = linkedHashSet;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f137381a) {
            case 0:
                return Boolean.valueOf(this.f137382b.contains(((hys) obj).f96654a));
            default:
                long jLongValue = ((Number) obj).longValue();
                return new j691(new q22(22, jLongValue), new ek5(this.f137382b, 1));
        }
    }
}
