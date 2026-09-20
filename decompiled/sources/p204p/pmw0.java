package p204p;

import android.view.View;
import androidx.datastore.core.CorruptionException;

/* JADX INFO: loaded from: classes3.dex */
public final class pmw0 implements evk, InterfaceC1667ah {

    /* JADX INFO: renamed from: a */
    public final qe70 f179244a;

    /* JADX WARN: Multi-variable type inference failed */
    public pmw0(eh00 eh00Var) {
        this.f179244a = (qe70) eh00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    @Override // p204p.evk
    /* JADX INFO: renamed from: c */
    public Object mo40110c(CorruptionException corruptionException) {
        return this.f179244a.invoke(corruptionException);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p.eh00, p.qe70] */
    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        this.f179244a.invoke();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pmw0(gh00 gh00Var) {
        this.f179244a = (qe70) gh00Var;
    }
}
