package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lw70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f137478b;

    public /* synthetic */ lw70(Object obj, int i) {
        this.f137477a = i;
        this.f137478b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, p.ktz0] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f137477a) {
            case 0:
                num.intValue();
                return this.f137478b;
            default:
                int iIntValue = num.intValue();
                StringBuilder sb = new StringBuilder();
                ?? r1 = this.f137478b;
                sb.append(r1.mo33223f(iIntValue));
                sb.append(": ");
                sb.append(r1.mo33225h(iIntValue).mo33226i());
                return sb.toString();
        }
    }
}
