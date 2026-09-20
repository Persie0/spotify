package p204p;

import com.google.android.gms.internal.cast.zzaac;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ebh1 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final gbh1 f57939a;

    /* JADX INFO: renamed from: b */
    public gbh1 f57940b;

    public ebh1(gbh1 gbh1Var) {
        this.f57939a = gbh1Var;
        if (gbh1Var.m44229k()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f57940b = (gbh1) gbh1Var.mo24628j(4, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m38389b() {
        if (this.f57940b.m44229k()) {
            return;
        }
        gbh1 gbh1Var = (gbh1) this.f57939a.mo24628j(4, null);
        hch1.f89793c.m47121a(gbh1Var.getClass()).mo32259b(gbh1Var, this.f57940b);
        this.f57940b = gbh1Var;
    }

    /* JADX INFO: renamed from: c */
    public final gbh1 m38390c() {
        if (!this.f57940b.m44229k()) {
            return this.f57940b;
        }
        gbh1 gbh1Var = this.f57940b;
        gbh1Var.getClass();
        hch1.f89793c.m47121a(gbh1Var.getClass()).mo32263f(gbh1Var);
        gbh1Var.m44230l();
        return this.f57940b;
    }

    public final Object clone() {
        ebh1 ebh1Var = (ebh1) this.f57939a.mo24628j(5, null);
        ebh1Var.f57940b = m38390c();
        return ebh1Var;
    }

    /* JADX INFO: renamed from: d */
    public final gbh1 m38391d() {
        gbh1 gbh1VarM38390c = m38390c();
        gbh1VarM38390c.getClass();
        boolean z = true;
        byte bByteValue = ((Byte) gbh1VarM38390c.mo24628j(1, null)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                z = false;
            } else {
                boolean zMo32262e = hch1.f89793c.m47121a(gbh1VarM38390c.getClass()).mo32262e(gbh1VarM38390c);
                gbh1VarM38390c.mo24628j(2, true == zMo32262e ? gbh1VarM38390c : null);
                z = zMo32262e;
            }
        }
        if (z) {
            return gbh1VarM38390c;
        }
        throw new zzaac("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
