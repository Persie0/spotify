package p204p;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class s861 {

    /* JADX INFO: renamed from: a */
    public final Object f206576a = new Object();

    /* JADX INFO: renamed from: b */
    public final Size f206577b;

    /* JADX INFO: renamed from: c */
    public final cns f206578c;

    /* JADX INFO: renamed from: d */
    public final ifb f206579d;

    /* JADX INFO: renamed from: e */
    public final boolean f206580e;

    /* JADX INFO: renamed from: f */
    public final jbb f206581f;

    /* JADX INFO: renamed from: g */
    public final gbb f206582g;

    /* JADX INFO: renamed from: h */
    public final jbb f206583h;

    /* JADX INFO: renamed from: i */
    public final gbb f206584i;

    /* JADX INFO: renamed from: j */
    public final gbb f206585j;

    /* JADX INFO: renamed from: k */
    public final ue40 f206586k;

    /* JADX INFO: renamed from: l */
    public p28 f206587l;

    /* JADX INFO: renamed from: m */
    public r861 f206588m;

    /* JADX INFO: renamed from: n */
    public Executor f206589n;

    static {
        Range range = j28.f107949f;
    }

    public s861(Size size, ifb ifbVar, boolean z, cns cnsVar, r761 r761Var) {
        this.f206577b = size;
        this.f206579d = ifbVar;
        this.f206580e = z;
        this.f206578c = cnsVar;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i = 0;
        jbb jbbVarM63736l = n5h1.m63736l(new hbb() { // from class: p.o861
            @Override // p204p.hbb
            public final Object attachCompleter(gbb gbbVar) {
                switch (i) {
                    case 0:
                        atomicReference.set(gbbVar);
                        return str + "-cancellation";
                    case 1:
                        atomicReference.set(gbbVar);
                        return str + "-status";
                    default:
                        atomicReference.set(gbbVar);
                        return str + "-Surface";
                }
            }
        });
        gbb gbbVar = (gbb) atomicReference.get();
        gbbVar.getClass();
        this.f206585j = gbbVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i2 = 1;
        jbb jbbVarM63736l2 = n5h1.m63736l(new hbb() { // from class: p.o861
            @Override // p204p.hbb
            public final Object attachCompleter(gbb gbbVar2) {
                switch (i2) {
                    case 0:
                        atomicReference2.set(gbbVar2);
                        return str + "-cancellation";
                    case 1:
                        atomicReference2.set(gbbVar2);
                        return str + "-status";
                    default:
                        atomicReference2.set(gbbVar2);
                        return str + "-Surface";
                }
            }
        });
        this.f206583h = jbbVarM63736l2;
        jbbVarM63736l2.mo28322a(new lk00(0, jbbVarM63736l2, new sr31(12, gbbVar, jbbVarM63736l)), e95.m38202g());
        gbb gbbVar2 = (gbb) atomicReference2.get();
        gbbVar2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i3 = 2;
        jbb jbbVarM63736l3 = n5h1.m63736l(new hbb() { // from class: p.o861
            @Override // p204p.hbb
            public final Object attachCompleter(gbb gbbVar3) {
                switch (i3) {
                    case 0:
                        atomicReference3.set(gbbVar3);
                        return str + "-cancellation";
                    case 1:
                        atomicReference3.set(gbbVar3);
                        return str + "-status";
                    default:
                        atomicReference3.set(gbbVar3);
                        return str + "-Surface";
                }
            }
        });
        this.f206581f = jbbVarM63736l3;
        gbb gbbVar3 = (gbb) atomicReference3.get();
        gbbVar3.getClass();
        this.f206582g = gbbVar3;
        ue40 ue40Var = new ue40(this, size);
        this.f206586k = ue40Var;
        u790 u790VarM89920K = x4w0.m89920K(ue40Var.f144309e);
        jbbVarM63736l3.mo28322a(new lk00(0, jbbVarM63736l3, new cx21(u790VarM89920K, gbbVar2, str, 23)), e95.m38202g());
        u790VarM89920K.mo28322a(new abq(this, 1), e95.m38202g());
        ekr ekrVarM38202g = e95.m38202g();
        AtomicReference atomicReference4 = new AtomicReference(null);
        jbb jbbVarM63736l4 = n5h1.m63736l(new k9w0(16, this, atomicReference4));
        jbbVarM63736l4.mo28322a(new lk00(0, jbbVarM63736l4, new wiy0(r761Var, 24)), ekrVarM38202g);
        gbb gbbVar4 = (gbb) atomicReference4.get();
        gbbVar4.getClass();
        this.f206584i = gbbVar4;
    }

    /* JADX INFO: renamed from: a */
    public final void m77462a(final Surface surface, Executor executor, final y8j y8jVar) {
        if (!this.f206582g.m44211b(surface)) {
            jbb jbbVar = this.f206581f;
            if (!jbbVar.isCancelled()) {
                wj50.m88281r(null, jbbVar.f110727b.isDone());
                try {
                    jbbVar.get();
                    final int i = 0;
                    executor.execute(new Runnable() { // from class: p.p861
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    y8jVar.accept(new o28(3, surface));
                                    break;
                                default:
                                    y8jVar.accept(new o28(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i2 = 1;
                    executor.execute(new Runnable() { // from class: p.p861
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    y8jVar.accept(new o28(3, surface));
                                    break;
                                default:
                                    y8jVar.accept(new o28(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        ae41 ae41Var = new ae41(7, y8jVar, surface);
        jbb jbbVar2 = this.f206583h;
        jbbVar2.mo28322a(new lk00(0, jbbVar2, ae41Var), executor);
    }

    /* JADX INFO: renamed from: b */
    public final void m77463b(Executor executor, r861 r861Var) {
        p28 p28Var;
        synchronized (this.f206576a) {
            this.f206588m = r861Var;
            this.f206589n = executor;
            p28Var = this.f206587l;
        }
        if (p28Var != null) {
            executor.execute(new n861(r861Var, p28Var, 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m77464c() {
        this.f206582g.m44212c(new DeferrableSurface$SurfaceUnavailableException("Surface request will not complete."));
    }
}
