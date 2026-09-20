package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bpm0 implements ihz {

    /* JADX INFO: renamed from: a */
    public final y931 f29545a;

    /* JADX INFO: renamed from: b */
    public final xom0 f29546b;

    public bpm0(y931 y931Var, xom0 xom0Var) {
        this.f29545a = y931Var;
        this.f29546b = xom0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.ihz
    /* JADX INFO: renamed from: a */
    public final Object mo30162a(nly0 nly0Var, float f, fbk fbkVar) throws Throwable {
        apm0 apm0Var;
        if (fbkVar instanceof apm0) {
            apm0Var = (apm0) fbkVar;
            int i = apm0Var.f17986c;
            if ((i & Integer.MIN_VALUE) != 0) {
                apm0Var.f17986c = i - Integer.MIN_VALUE;
            } else {
                apm0Var = new apm0(this, (ibk) fbkVar);
            }
        } else {
            apm0Var = new apm0(this, (ibk) fbkVar);
        }
        Object objM93141d = apm0Var.f17984a;
        int i2 = apm0Var.f17986c;
        if (i2 == 0) {
            bga.m29073P(objM93141d);
            rv70 rv70Var = new rv70(13, this, nly0Var);
            apm0Var.f17986c = 1;
            objM93141d = this.f29545a.m93141d(nly0Var, f, rv70Var, apm0Var);
            yuk yukVar = yuk.f276404a;
            if (objM93141d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM93141d);
        }
        float fFloatValue = ((Number) objM93141d).floatValue();
        xom0 xom0Var = this.f29546b;
        i82 i82Var = xom0Var.f264315d;
        i82 i82Var2 = xom0Var.f264315d;
        if (i82Var.m49923p() != 0.0f && Math.abs(i82Var2.m49923p()) < 0.001d) {
            int iM49922o = i82Var2.m49922o();
            if (xom0Var.f264322k.mo28415b()) {
                x0h1.m89578u(((lom0) xom0Var.f264324m.getValue()).f135477s, null, 0, new eom0(xom0Var, null, 2), 3);
            }
            xom0Var.m91561u(0.0f, iM49922o, false);
        } else {
            qyg1.m74179I(i82Var2.m49923p());
        }
        return qyg1.m74179I(fFloatValue);
    }
}
