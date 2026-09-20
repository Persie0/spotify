package p204p;

import java.util.Collections;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes6.dex */
public final class d951 implements xv41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46691a = 0;

    /* JADX INFO: renamed from: b */
    public final xv41 f46692b;

    /* JADX INFO: renamed from: c */
    public final Object f46693c;

    /* JADX WARN: Multi-variable type inference failed */
    public d951(gh00 gh00Var, xv41 xv41Var) {
        this.f46693c = (qe70) gh00Var;
        this.f46692b = xv41Var;
    }

    @Override // p204p.eb11
    /* JADX INFO: renamed from: c */
    public final List mo27502c() {
        switch (this.f46691a) {
            case 0:
                return Collections.singletonList(getValue());
            default:
                return this.f46692b.mo27502c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r7v3, types: [p.gh00, p.qe70] */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        c951 c951Var;
        et51 et51Var;
        switch (this.f46691a) {
            case 0:
                if (fbkVar instanceof c951) {
                    c951Var = (c951) fbkVar;
                    int i = c951Var.f35407c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c951Var.f35407c = i - Integer.MIN_VALUE;
                    } else {
                        c951Var = new c951(this, fbkVar);
                    }
                } else {
                    c951Var = new c951(this, fbkVar);
                }
                Object obj = c951Var.f35405a;
                int i2 = c951Var.f35407c;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    fiz fizVarM62953p = mvl0.m62953p(new ad01(this.f46692b, (qe70) this.f46693c, 1));
                    c951Var.f35407c = 1;
                    Object objCollect = fizVarM62953p.collect(nizVar, c951Var);
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
                throw new IllegalStateException("StateFlow.collect never completes");
            default:
                if (fbkVar instanceof et51) {
                    et51Var = (et51) fbkVar;
                    int i3 = et51Var.f62628c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        et51Var.f62628c = i3 - Integer.MIN_VALUE;
                    } else {
                        et51Var = new et51(this, fbkVar);
                    }
                } else {
                    et51Var = new et51(this, fbkVar);
                }
                Object obj2 = et51Var.f62626a;
                int i4 = et51Var.f62628c;
                if (i4 == 0) {
                    bga.m29073P(obj2);
                    dt51 dt51Var = new dt51(nizVar, (q950) this.f46693c);
                    et51Var.f62628c = 1;
                    Object objCollect2 = this.f46692b.collect(dt51Var, et51Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objCollect2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.gh00, p.qe70] */
    @Override // p204p.xv41
    public final Object getValue() {
        switch (this.f46691a) {
            case 0:
                return ((qe70) this.f46693c).invoke(this.f46692b.getValue());
            default:
                return this.f46692b.getValue();
        }
    }

    public d951(xv41 xv41Var, q950 q950Var) {
        this.f46692b = xv41Var;
        this.f46693c = q950Var;
    }
}
