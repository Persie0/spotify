package p204p;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes2.dex */
public final class ay7 implements xv41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zv41 f21119a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zv41 f21120b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lsi0 f21121c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicInteger f21122d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rlv0 f21123e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mb61 f21124f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ juk f21125g;

    /* JADX WARN: Multi-variable type inference failed */
    public ay7(zv41 zv41Var, lsi0 lsi0Var, AtomicInteger atomicInteger, rlv0 rlv0Var, th00 th00Var, juk jukVar) {
        this.f21120b = zv41Var;
        this.f21121c = lsi0Var;
        this.f21122d = atomicInteger;
        this.f21123e = rlv0Var;
        this.f21124f = (mb61) th00Var;
        this.f21125g = jukVar;
        this.f21119a = zv41Var;
    }

    @Override // p204p.eb11
    /* JADX INFO: renamed from: c */
    public final List mo27502c() {
        return this.f21119a.mo27502c();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011d A[Catch: all -> 0x0127, TryCatch #1 {all -> 0x0127, blocks: (B:46:0x0117, B:48:0x011d, B:50:0x0123, B:53:0x0129), top: B:62:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0123 A[Catch: all -> 0x0127, TryCatch #1 {all -> 0x0127, blocks: (B:46:0x0117, B:48:0x011d, B:50:0x0123, B:53:0x0129), top: B:62:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.io.Serializable, java.lang.Object, p.juk, p.niz, p.zv41] */
    /* JADX WARN: Type inference failed for: r15v7, types: [p.juk, p.niz, p.zv41] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        yx7 yx7Var;
        niz nizVar2;
        juk jukVar;
        Object obj;
        zv41 zv41Var;
        rlv0 rlv0Var;
        AtomicInteger atomicInteger;
        ?? r9;
        fbk fbkVar2;
        ?? r15;
        Throwable th;
        ?? r16;
        ?? r7;
        xuk xukVar;
        if (fbkVar instanceof yx7) {
            yx7Var = (yx7) fbkVar;
            int i = yx7Var.f277159t;
            if ((i & Integer.MIN_VALUE) != 0) {
                yx7Var.f277159t = i - Integer.MIN_VALUE;
            } else {
                yx7Var = new yx7(this, fbkVar);
            }
        } else {
            yx7Var = new yx7(this, fbkVar);
        }
        Object obj2 = yx7Var.f277157h;
        int i2 = yx7Var.f277159t;
        zv41 zv41Var2 = this.f21120b;
        rlv0 rlv0Var2 = this.f21123e;
        AtomicInteger atomicInteger2 = this.f21122d;
        lsi0 lsi0Var = this.f21121c;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                zv41 zv41Var3 = yx7Var.f277156g;
                juk jukVar2 = yx7Var.f277155f;
                th00 th00Var = (th00) yx7Var.f277154e;
                rlv0 rlv0Var3 = (rlv0) yx7Var.f277153d;
                atomicInteger = (AtomicInteger) yx7Var.f277152c;
                jsi0 jsi0Var = (jsi0) yx7Var.f277151b;
                niz nizVar3 = yx7Var.f277150a;
                bga.m29073P(obj2);
                zv41Var = zv41Var3;
                rlv0Var = rlv0Var3;
                jukVar = jukVar2;
                obj = th00Var;
                nizVar2 = nizVar3;
                r9 = jsi0Var;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rlv0Var2 = (rlv0) yx7Var.f277154e;
                    atomicInteger2 = (AtomicInteger) yx7Var.f277153d;
                    jsi0 jsi0Var2 = (jsi0) yx7Var.f277152c;
                    th = (Throwable) yx7Var.f277151b;
                    bga.m29073P(obj2);
                    r16 = 0;
                    r7 = jsi0Var2;
                    try {
                        if (atomicInteger2.decrementAndGet() == 0) {
                            xukVar = (xuk) rlv0Var2.f200373a;
                            if (xukVar != null) {
                                kk40.m56680v(xukVar, null);
                            }
                            rlv0Var2.f200373a = r16;
                        }
                        throw th;
                    } finally {
                        r7.mo54249c(r16);
                    }
                }
                try {
                    bga.m29073P(obj2);
                    throw new KotlinNothingValueException();
                } catch (Throwable th2) {
                    th = th2;
                    yukVar = yukVar;
                    r15 = 0;
                }
            }
            yx7Var.f277150a = r15;
            yx7Var.f277151b = th;
            yx7Var.f277152c = lsi0Var;
            yx7Var.f277153d = atomicInteger2;
            yx7Var.f277154e = rlv0Var2;
            yx7Var.f277155f = r15;
            yx7Var.f277156g = r15;
            yx7Var.f277159t = 3;
            if (lsi0Var.mo54248a(yx7Var) == yukVar) {
                return yukVar;
            }
            th = th;
            r7 = lsi0Var;
            r16 = r15;
            if (atomicInteger2.decrementAndGet() == 0) {
                xukVar = (xuk) rlv0Var2.f200373a;
                if (xukVar != null) {
                    kk40.m56680v(xukVar, null);
                }
                rlv0Var2.f200373a = r16;
            }
            throw th;
        }
        bga.m29073P(obj2);
        nizVar2 = nizVar;
        yx7Var.f277150a = nizVar2;
        yx7Var.f277151b = lsi0Var;
        yx7Var.f277152c = atomicInteger2;
        yx7Var.f277153d = rlv0Var2;
        mb61 mb61Var = this.f21124f;
        yx7Var.f277154e = mb61Var;
        juk jukVar3 = this.f21125g;
        yx7Var.f277155f = jukVar3;
        yx7Var.f277156g = zv41Var2;
        yx7Var.f277159t = 1;
        if (lsi0Var.mo54248a(yx7Var) == yukVar) {
            return yukVar;
        }
        jukVar = jukVar3;
        obj = mb61Var;
        zv41Var = zv41Var2;
        rlv0Var = rlv0Var2;
        atomicInteger = atomicInteger2;
        r9 = lsi0Var;
        try {
            if (atomicInteger.incrementAndGet() == 1 && rlv0Var.f200373a == null) {
                c9k c9kVarM56661c = kk40.m56661c(yx7Var.getContext().mo26608y(qlg1.m73202g()));
                rlv0Var.f200373a = c9kVarM56661c;
                fbkVar2 = null;
                r15 = 0;
                try {
                    x0h1.m89578u(c9kVarM56661c, null, 0, new ez4(obj, jukVar, zv41Var, fbkVar2, 18), 3);
                } catch (Throwable th3) {
                    th = th3;
                    r9.mo54249c(fbkVar2);
                    throw th;
                }
            } else {
                r15 = 0;
            }
            r9.mo54249c(r15);
            try {
                yx7Var.f277150a = r15;
                yx7Var.f277151b = r15;
                yx7Var.f277152c = r15;
                yx7Var.f277153d = r15;
                yx7Var.f277154e = r15;
                yx7Var.f277155f = r15;
                yx7Var.f277156g = r15;
                yx7Var.f277159t = 2;
                zv41Var2.collect(nizVar2, yx7Var);
                return yukVar;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            fbkVar2 = null;
        }
    }

    @Override // p204p.xv41
    public final Object getValue() {
        return this.f21119a.getValue();
    }
}
