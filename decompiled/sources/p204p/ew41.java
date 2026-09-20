package p204p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes2.dex */
public final class ew41 implements fmu0 {

    /* JADX INFO: renamed from: a */
    public final Object f63430a;

    public ew41(xv41 xv41Var) {
        this.f63430a = xv41Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fiz] */
    @Override // p204p.fmu0
    /* JADX INFO: renamed from: a */
    public final fiz mo26211a() {
        return this.f63430a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, p.fiz] */
    @Override // p204p.fmu0
    /* JADX INFO: renamed from: b */
    public final Object mo26212b(th00 th00Var, fbk fbkVar) {
        dw41 dw41Var;
        if (fbkVar instanceof dw41) {
            dw41Var = (dw41) fbkVar;
            int i = dw41Var.f53604c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dw41Var.f53604c = i - Integer.MIN_VALUE;
            } else {
                dw41Var = new dw41(this, fbkVar);
            }
        } else {
            dw41Var = new dw41(this, fbkVar);
        }
        Object obj = dw41Var.f53602a;
        int i2 = dw41Var.f53604c;
        if (i2 == 0) {
            bga.m29073P(obj);
            pw00 pw00Var = new pw00(0, th00Var);
            dw41Var.f53604c = 1;
            Object objCollect = this.f63430a.collect(pw00Var, dw41Var);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.xv41] */
    @Override // p204p.fmu0
    public final Object getValue() {
        return this.f63430a.getValue();
    }
}
