package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class nc8 implements oc8 {

    /* JADX INFO: renamed from: a */
    public final UUID f152458a;

    public nc8(UUID uuid) {
        this.f152458a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (nc8.class.equals(obj != null ? obj.getClass() : null)) {
            return wj50.m88271j(this.f152458a, ((nc8) obj).f152458a);
        }
        return false;
    }

    @Override // p204p.oc8
    public final UUID getUuid() {
        return this.f152458a;
    }

    public final int hashCode() {
        return this.f152458a.hashCode();
    }
}
