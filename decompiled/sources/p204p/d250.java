package p204p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes6.dex */
public final class d250 implements fmu0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e250 f44482a;

    public d250(e250 e250Var) {
        this.f44482a = e250Var;
    }

    @Override // p204p.fmu0
    /* JADX INFO: renamed from: a */
    public final fiz mo26211a() {
        return new nzx0(new f620(this.f44482a, null, 21));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.fmu0
    /* JADX INFO: renamed from: b */
    public final Object mo26212b(th00 th00Var, fbk fbkVar) {
        c250 c250Var;
        if (fbkVar instanceof c250) {
            c250Var = (c250) fbkVar;
            int i = c250Var.f33299c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c250Var.f33299c = i - Integer.MIN_VALUE;
            } else {
                c250Var = new c250(this, fbkVar);
            }
        } else {
            c250Var = new c250(this, fbkVar);
        }
        Object obj = c250Var.f33297a;
        yuk yukVar = yuk.f276404a;
        int i2 = c250Var.f33299c;
        e250 e250Var = this.f44482a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                throw new KotlinNothingValueException();
            }
            bga.m29073P(obj);
            int i3 = e250Var.f55357e + 1;
            e250Var.f55357e = i3;
            if (i3 == 1) {
                e250Var.m37591e();
            }
            wpi0 wpi0Var = e250Var.f55356d;
            c250Var.f33299c = 1;
            wpi0Var.mo26212b(th00Var, c250Var);
            return yukVar;
        } catch (Throwable th) {
            e250.m37587a(e250Var);
            throw th;
        }
    }

    @Override // p204p.fmu0
    public final Object getValue() {
        e250 e250Var = this.f44482a;
        fmu0 fmu0Var = e250Var.f55355c;
        return fmu0Var == null ? (b250) e250Var.f55356d.f253772a.getValue() : e250Var.m37588b((b250) fmu0Var.getValue());
    }
}
