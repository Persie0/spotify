package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class nx4 {

    /* JADX INFO: renamed from: a */
    public final gw4 f159355a;

    /* JADX INFO: renamed from: b */
    public final kqi0 f159356b;

    /* JADX INFO: renamed from: c */
    public final kqi0 f159357c;

    /* JADX INFO: renamed from: d */
    public final kqi0 f159358d;

    public nx4(gw4 gw4Var, kqi0 kqi0Var, kqi0 kqi0Var2, kqi0 kqi0Var3) {
        this.f159355a = gw4Var;
        this.f159356b = kqi0Var;
        this.f159357c = kqi0Var2;
        this.f159358d = kqi0Var3;
    }

    /* JADX INFO: renamed from: a */
    public final g9t m65815a() {
        g9t g9tVar = (g9t) this.f159358d.getValue();
        if (g9tVar != null) {
            return g9tVar;
        }
        g9t g9tVar2 = (g9t) this.f159356b.getValue();
        kqi0 kqi0Var = this.f159357c;
        if (g9tVar2 == null) {
            return (g9t) kqi0Var.getValue();
        }
        g9t g9tVar3 = (g9t) kqi0Var.getValue();
        if (g9tVar3 == null) {
            return null;
        }
        float fFloatValue = ((Number) this.f159355a.m45912e()).floatValue();
        return fFloatValue >= 1.0f ? g9tVar3 : vzg1.m86898p(g9tVar2, g9tVar3, fFloatValue);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m65816b() {
        g9t g9tVar;
        g9t g9tVar2;
        return (((Number) this.f159355a.m45912e()).floatValue() >= 1.0f || this.f159358d.getValue() != null || (g9tVar = (g9t) this.f159356b.getValue()) == null || (g9tVar2 = (g9t) this.f159357c.getValue()) == null || ((ArrayList) g9tVar.m44133b()).size() == ((ArrayList) g9tVar2.m44133b()).size()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final void m65817c(g9t g9tVar) {
        this.f159358d.setValue(g9tVar);
        this.f159357c.setValue(g9tVar);
    }
}
