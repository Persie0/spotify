package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class rzo {

    /* JADX INFO: renamed from: a */
    public final qre0 f204191a;

    /* JADX INFO: renamed from: b */
    public final a0a f204192b;

    /* JADX INFO: renamed from: c */
    public final zv41 f204193c;

    public rzo(qre0 qre0Var, a0a a0aVar, b0a b0aVar, luk lukVar) {
        this.f204191a = qre0Var;
        this.f204192b = a0aVar;
        c9k c9kVarM36621u = dq60.m36621u(lukVar);
        this.f204193c = jag1.m52819d(new pzo(new Date()));
        int iIntValue = ((Number) b0aVar.mo24334e()).intValue();
        if (a0aVar.isEnabled()) {
            x0h1.m89578u(c9kVarM36621u, null, 0, new nm8(iIntValue, 3, this, null), 3);
        }
    }
}
