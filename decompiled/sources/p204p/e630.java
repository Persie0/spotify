package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class e630 {

    /* JADX INFO: renamed from: a */
    public final UUID f56530a;

    /* JADX INFO: renamed from: b */
    public final UUID f56531b;

    public e630(UUID uuid, UUID uuid2) {
        this.f56530a = uuid;
        this.f56531b = uuid2;
    }

    /* JADX INFO: renamed from: a */
    public final UUID m37869a() {
        return this.f56530a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e630)) {
            return false;
        }
        e630 e630Var = (e630) obj;
        return wj50.m88271j(this.f56530a, e630Var.f56530a) && wj50.m88271j(this.f56531b, e630Var.f56531b);
    }

    public final int hashCode() {
        return this.f56531b.hashCode() + (this.f56530a.hashCode() * 31);
    }
}
