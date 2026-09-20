package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class mc8 implements oc8 {

    /* JADX INFO: renamed from: a */
    public final h2a1 f142094a;

    /* JADX INFO: renamed from: b */
    public final UUID f142095b;

    public mc8(h2a1 h2a1Var) {
        this.f142094a = h2a1Var;
        UUID uuid = xc8.f260119a;
        this.f142095b = xc8.f260124f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mc8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        mc8 mc8Var = (mc8) obj;
        return wj50.m88271j(this.f142095b, mc8Var.f142095b) && this.f142094a == mc8Var.f142094a;
    }

    @Override // p204p.oc8
    public final UUID getUuid() {
        return this.f142095b;
    }

    public final int hashCode() {
        return this.f142094a.hashCode() + (this.f142095b.hashCode() * 31);
    }
}
