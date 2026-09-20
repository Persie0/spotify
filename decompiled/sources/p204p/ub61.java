package p204p;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.input.pointer.PointerInputResetException;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ub61 extends exh0 implements o6q0, yqq, n6q0 {

    /* JADX INFO: renamed from: M0 */
    public Object f228637M0;

    /* JADX INFO: renamed from: N0 */
    public Object f228638N0;

    /* JADX INFO: renamed from: O0 */
    public Object[] f228639O0;

    /* JADX INFO: renamed from: P0 */
    public PointerInputEventHandler f228640P0;

    /* JADX INFO: renamed from: Q0 */
    public di41 f228641Q0;

    /* JADX INFO: renamed from: R0 */
    public e6q0 f228642R0 = pb61.f175726a;

    /* JADX INFO: renamed from: S0 */
    public final qqi0 f228643S0;

    /* JADX INFO: renamed from: T0 */
    public final qqi0 f228644T0;

    /* JADX INFO: renamed from: U0 */
    public final qqi0 f228645U0;

    /* JADX INFO: renamed from: V0 */
    public e6q0 f228646V0;

    /* JADX INFO: renamed from: W0 */
    public long f228647W0;

    public ub61(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f228637M0 = obj;
        this.f228638N0 = obj2;
        this.f228639O0 = objArr;
        this.f228640P0 = pointerInputEventHandler;
        qqi0 qqi0Var = new qqi0(0, new sb61[16]);
        this.f228643S0 = qqi0Var;
        this.f228644T0 = qqi0Var;
        this.f228645U0 = new qqi0(0, new sb61[16]);
        this.f228647W0 = 0L;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        m82716J1();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p204p.n6q0
    /* JADX INFO: renamed from: E0 */
    public final void mo39625E0(e6q0 e6q0Var, f6q0 f6q0Var, long j) {
        this.f228647W0 = j;
        if (f6q0Var == f6q0.f66485a) {
            this.f228642R0 = e6q0Var;
        }
        fbk fbkVar = null;
        if (this.f228641Q0 == null) {
            this.f228641Q0 = x0h1.m89578u(m40262v1(), null, 4, new v831(this, fbkVar, 18), 1);
        }
        m82715I1(e6q0Var, f6q0Var);
        ?? r5 = e6q0Var.f56704a;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            if (!ex60.m40178l((k6q0) r5.get(i))) {
                this.f228646V0 = e6q0Var;
            }
        }
        e6q0Var = null;
        this.f228646V0 = e6q0Var;
    }

    /* JADX INFO: renamed from: H1 */
    public final Object m82714H1(th00 th00Var, fbk fbkVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
        hqbVar.m48222q();
        sb61 sb61Var = new sb61(this, hqbVar);
        synchronized (this.f228644T0) {
            this.f228643S0.m73556b(sb61Var);
            s95.m77558h(th00Var, sb61Var, sb61Var).resumeWith(w2a1.f247311a);
        }
        hqbVar.mo42415l(new tb61(sb61Var, 0));
        return hqbVar.m48221p();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /* JADX INFO: renamed from: I1 */
    public final void m82715I1(e6q0 e6q0Var, f6q0 f6q0Var) {
        Object[] objArr;
        int i;
        int i2;
        sb61 sb61Var;
        hqb hqbVar;
        hqb hqbVar2;
        synchronized (this.f228644T0) {
            qqi0 qqi0Var = this.f228645U0;
            qqi0Var.m73558d(qqi0Var.f191610c, this.f228643S0);
        }
        try {
            int iOrdinal = f6q0Var.ordinal();
            if (iOrdinal == 0) {
                qqi0 qqi0Var2 = this.f228645U0;
                objArr = qqi0Var2.f191608a;
                i = qqi0Var2.f191610c;
                for (i2 = 0; i2 < i; i2++) {
                    sb61Var = (sb61) objArr[i2];
                    if (f6q0Var != sb61Var.f207369d && (hqbVar = sb61Var.f207368c) != null) {
                        sb61Var.f207368c = null;
                        hqbVar.resumeWith(e6q0Var);
                    }
                }
            } else if (iOrdinal == 1) {
                qqi0 qqi0Var3 = this.f228645U0;
                int i3 = qqi0Var3.f191610c - 1;
                Object[] objArr2 = qqi0Var3.f191608a;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        sb61 sb61Var2 = (sb61) objArr2[i3];
                        if (f6q0Var == sb61Var2.f207369d && (hqbVar2 = sb61Var2.f207368c) != null) {
                            sb61Var2.f207368c = null;
                            hqbVar2.resumeWith(e6q0Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                qqi0 qqi0Var4 = this.f228645U0;
                objArr = qqi0Var4.f191608a;
                i = qqi0Var4.f191610c;
                while (i2 < i) {
                    sb61Var = (sb61) objArr[i2];
                    if (f6q0Var != sb61Var.f207369d) {
                    }
                }
            }
            this.f228645U0.m73561g();
        } catch (Throwable th) {
            this.f228645U0.m73561g();
            throw th;
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final void m82716J1() {
        di41 di41Var = this.f228641Q0;
        if (di41Var != null) {
            di41Var.mo38779R(new PointerInputResetException());
            this.f228641Q0 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p204p.n6q0
    /* JADX INFO: renamed from: M0 */
    public final void mo39628M0() {
        e6q0 e6q0Var = this.f228646V0;
        if (e6q0Var == null) {
            return;
        }
        ?? r1 = e6q0Var.f56704a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            if (((k6q0) r1.get(i)).m55606f()) {
                ArrayList arrayList = new ArrayList(r1.size());
                int size2 = r1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    k6q0 k6q0Var = (k6q0) r1.get(i2);
                    arrayList.add(new k6q0(k6q0Var.m55604d(), k6q0Var.m55611k(), k6q0Var.m55605e(), k6q0Var.m55607g(), k6q0Var.m55611k(), k6q0Var.m55605e(), k6q0Var.m55606f(), k6q0Var.m55606f(), k6q0Var.m55610j()));
                }
                e6q0 e6q0Var2 = new e6q0(arrayList, null);
                this.f228642R0 = e6q0Var2;
                m82715I1(e6q0Var2, f6q0.f66485a);
                m82715I1(e6q0Var2, f6q0.f66486b);
                m82715I1(e6q0Var2, f6q0.f66487c);
                this.f228646V0 = null;
                return;
            }
        }
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return wjg1.m88319I(this).f135664X0.mo24617W0();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return wjg1.m88319I(this).f135664X0.mo24619j();
    }

    @Override // p204p.jlq
    /* JADX INFO: renamed from: l */
    public final void mo33590l() {
        m82716J1();
    }

    @Override // p204p.n6q0
    /* JADX INFO: renamed from: m1 */
    public final void mo63786m1() {
        m82716J1();
    }
}
