package p204p;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class bri0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f30099a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final lsi0 f30100b = msi0.m62770a();

    /* JADX INFO: renamed from: a */
    public static final void m30300a(bri0 bri0Var, yqi0 yqi0Var) {
        yqi0 yqi0Var2;
        AtomicReference atomicReference = bri0Var.f30099a;
        do {
            yqi0Var2 = (yqi0) atomicReference.get();
            if (yqi0Var2 != null && yqi0Var.f275253a.compareTo(yqi0Var2.f275253a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!rkh0.m75737k(atomicReference, yqi0Var2, yqi0Var));
        if (yqi0Var2 != null) {
            yqi0Var2.f275254b.mo26601e(new MutationInterruptedException());
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m30301b(xqi0 xqi0Var, gh00 gh00Var, ibk ibkVar) {
        return kk40.m56684z(new nm0(xqi0Var, this, gh00Var, (fbk) null), ibkVar);
    }
}
