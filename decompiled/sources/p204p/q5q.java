package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class q5q implements nly0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ r5q f185573a;

    public q5q(r5q r5qVar) {
        this.f185573a = r5qVar;
    }

    @Override // p204p.nly0
    /* JADX INFO: renamed from: f */
    public final float mo42170f(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        r5q r5qVar = this.f185573a;
        float fFloatValue = ((Number) r5qVar.f196086a.invoke(Float.valueOf(f))).floatValue();
        r5qVar.f196090e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        r5qVar.f196091f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
