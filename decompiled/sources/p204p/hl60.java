package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class hl60 extends sl60 {

    /* JADX INFO: renamed from: a */
    public final boolean f92623a;

    /* JADX INFO: renamed from: b */
    public final ktz0 f92624b;

    /* JADX INFO: renamed from: c */
    public final String f92625c;

    public hl60(Object obj, boolean z, ktz0 ktz0Var) {
        this.f92623a = z;
        this.f92624b = ktz0Var;
        this.f92625c = obj.toString();
        if (ktz0Var != null && !ktz0Var.mo51606d()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // p204p.sl60
    /* JADX INFO: renamed from: a */
    public final String mo47869a() {
        return this.f92625c;
    }

    @Override // p204p.sl60
    /* JADX INFO: renamed from: b */
    public final boolean mo47870b() {
        return this.f92623a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hl60.class != obj.getClass()) {
            return false;
        }
        hl60 hl60Var = (hl60) obj;
        return this.f92623a == hl60Var.f92623a && wj50.m88271j(this.f92625c, hl60Var.f92625c);
    }

    public final int hashCode() {
        return this.f92625c.hashCode() + (Boolean.hashCode(this.f92623a) * 31);
    }

    @Override // p204p.sl60
    public final String toString() {
        boolean z = this.f92623a;
        String str = this.f92625c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        nl51.m64720a(sb, str);
        return sb.toString();
    }

    public /* synthetic */ hl60(Serializable serializable, boolean z) {
        this(serializable, z, null);
    }
}
