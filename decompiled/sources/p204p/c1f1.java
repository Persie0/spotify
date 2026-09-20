package p204p;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.integrity.internal.C0150af;

/* JADX INFO: loaded from: classes.dex */
public abstract class c1f1 extends d3f1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d1f1 f33086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1f1(d1f1 d1f1Var, ev61 ev61Var) {
        super(ev61Var);
        this.f33086b = d1f1Var;
    }

    @Override // p204p.d3f1
    /* JADX INFO: renamed from: a */
    public final void mo31263a(Exception exc) {
        if (!(exc instanceof C0150af)) {
            super.mo31263a(exc);
        } else if (d1f1.m34634d(this.f33086b)) {
            super.mo31263a(new StandardIntegrityException(-2, exc));
        } else {
            super.mo31263a(new StandardIntegrityException(-9, exc));
        }
    }
}
