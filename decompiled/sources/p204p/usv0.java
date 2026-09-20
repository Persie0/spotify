package p204p;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class usv0 implements g7x0 {

    /* JADX INFO: renamed from: a */
    public final zv41 f233691a = jag1.m52819d(0);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.g7x0
    /* JADX INFO: renamed from: a */
    public final Object mo35507a(fbk fbkVar) {
        tsv0 tsv0Var;
        if (fbkVar instanceof tsv0) {
            tsv0Var = (tsv0) fbkVar;
            int i = tsv0Var.f223437c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tsv0Var.f223437c = i - Integer.MIN_VALUE;
            } else {
                tsv0Var = new tsv0(this, (ibk) fbkVar);
            }
        } else {
            tsv0Var = new tsv0(this, (ibk) fbkVar);
        }
        Object obj = tsv0Var.f223435a;
        int i2 = tsv0Var.f223437c;
        fbk fbkVar2 = null;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                hvi0 hvi0Var = cks.f39079b;
                long jM54449D = jwg1.m54449D(5, ils.SECONDS);
                a7s0 a7s0Var = new a7s0(this, fbkVar2, 20);
                tsv0Var.f223437c = 1;
                Object objM76979t = s1h1.m76979t(jM54449D, a7s0Var, tsv0Var);
                yuk yukVar = yuk.f276404a;
                if (objM76979t == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (TimeoutCancellationException unused) {
            Integer numM74180J = qyg1.m74180J(0);
            zv41 zv41Var = this.f233691a;
            zv41Var.getClass();
            zv41Var.m97091m(null, numM74180J);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public final ssv0 m83914b() {
        zv41 zv41Var;
        Object value;
        do {
            zv41Var = this.f233691a;
            value = zv41Var.getValue();
        } while (!zv41Var.m97089k(value, Integer.valueOf(((Number) value).intValue() + 1)));
        return new ssv0(this);
    }
}
