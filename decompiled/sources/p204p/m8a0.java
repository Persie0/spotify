package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m8a0 {

    /* JADX INFO: renamed from: a */
    public final long f140996a;

    /* JADX INFO: renamed from: b */
    public final float f140997b;

    /* JADX INFO: renamed from: c */
    public final long f140998c;

    public m8a0(kop kopVar) {
        this.f140996a = kopVar.f124839a;
        this.f140997b = kopVar.f124840b;
        this.f140998c = kopVar.f124841c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8a0)) {
            return false;
        }
        m8a0 m8a0Var = (m8a0) obj;
        return this.f140996a == m8a0Var.f140996a && this.f140997b == m8a0Var.f140997b && this.f140998c == m8a0Var.f140998c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f140996a), Float.valueOf(this.f140997b), Long.valueOf(this.f140998c));
    }
}
