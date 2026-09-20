package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mfq implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143136a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f143137b;

    public /* synthetic */ mfq(int i, eh00 eh00Var) {
        this.f143136a = i;
        this.f143137b = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f143136a) {
            case 0:
                return Float.valueOf(w45.f247707c.mo30276a(((Number) this.f143137b.invoke()).floatValue()));
            case 1:
                return Float.valueOf(1.0f - ((Number) this.f143137b.invoke()).floatValue());
            case 2:
                return Boolean.valueOf(((Number) this.f143137b.invoke()).floatValue() < 0.5f);
            case 3:
                this.f143137b.invoke();
                return Boolean.TRUE;
            case 4:
                this.f143137b.invoke();
                return Boolean.TRUE;
            case 5:
                float fFloatValue = ((Number) this.f143137b.invoke()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(fFloatValue);
            default:
                float fFloatValue2 = ((Number) this.f143137b.invoke()).floatValue();
                if (fFloatValue2 < 0.0f) {
                    fFloatValue2 = 0.0f;
                }
                if (fFloatValue2 > 1.0f) {
                    fFloatValue2 = 1.0f;
                }
                return Float.valueOf(fFloatValue2);
        }
    }
}
