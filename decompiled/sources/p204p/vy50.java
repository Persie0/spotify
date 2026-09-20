package p204p;

import com.spotify.music.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class vy50 implements z8l {

    /* JADX INFO: renamed from: a */
    public final mb80 f245944a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f245945b;

    /* JADX INFO: renamed from: c */
    public final tc31 f245946c;

    /* JADX INFO: renamed from: d */
    public final tey f245947d;

    /* JADX INFO: renamed from: e */
    public final vxx f245948e;

    public vy50(mb80 mb80Var, z9j0 z9j0Var, tc31 tc31Var, tey teyVar, vxx vxxVar) {
        this.f245944a = mb80Var;
        this.f245945b = z9j0Var;
        this.f245946c = tc31Var;
        this.f245947d = teyVar;
        this.f245948e = vxxVar;
    }

    @Override // p204p.z8l
    /* JADX INFO: renamed from: a */
    public final Object mo27514a(n8l n8lVar, fbk fbkVar) {
        if (!((nx50) this.f245944a.f141820e.mo61350a().getValue()).f159369b) {
            return null;
        }
        return new j8l(rqu.f201886c, new Integer(R.string.create_menu_item_jam_title), null, new Integer(R.string.create_menu_item_jam_description), null, null, null, 5, new g8l(if50.f101660U0, new yrv(2, this, vy50.class, "onClick", "onClick(Lcom/spotify/ubi/logger/InteractionLoggingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 15)), 476);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r4.invoke(r0) == r5) goto L39;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m86704b(d850 d850Var, boolean z, fbk fbkVar) {
        uy50 uy50Var;
        Object c6x0Var;
        if (fbkVar instanceof uy50) {
            uy50Var = (uy50) fbkVar;
            int i = uy50Var.f235160d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uy50Var.f235160d = i - Integer.MIN_VALUE;
            } else {
                uy50Var = new uy50(this, fbkVar);
            }
        } else {
            uy50Var = new uy50(this, fbkVar);
        }
        Object objM86684D = uy50Var.f235158b;
        int i2 = uy50Var.f235160d;
        Object obj = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    z = uy50Var.f235157a;
                    bga.m29073P(objM86684D);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM86684D);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM86684D);
            vxx vxxVar = this.f245948e;
            ka60 ka60Var = ka60.f120808a;
            z650 z650Var = d850Var.f46380a;
            uy50Var.f235157a = z;
            uy50Var.f235160d = 1;
            objM86684D = vxxVar.m86684D(ka60Var, z650Var, null, uy50Var);
            if (objM86684D == obj) {
            }
            return obj;
            c6x0Var = (gh00) objM86684D;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        gh00 gh00Var = (gh00) (c6x0Var instanceof c6x0 ? null : c6x0Var);
        if (gh00Var != null) {
            if (z) {
                this.f245945b.mo47345e();
            }
            uy50Var.f235157a = z;
            uy50Var.f235160d = 2;
        }
        return w2a1.f247311a;
    }
}
