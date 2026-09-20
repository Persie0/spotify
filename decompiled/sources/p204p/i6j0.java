package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class i6j0 implements o6j0 {

    /* JADX INFO: renamed from: a */
    public final UUID f99258a;

    public i6j0(UUID uuid) {
        this.f99258a = uuid;
    }

    /* JADX INFO: renamed from: a */
    public final UUID m49811a() {
        return this.f99258a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6j0) && wj50.m88271j(this.f99258a, ((i6j0) obj).f99258a);
    }

    public final int hashCode() {
        return this.f99258a.hashCode();
    }
}
