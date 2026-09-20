package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class gzi0 {

    /* JADX INFO: renamed from: a */
    public final UUID f85957a;

    public gzi0(UUID uuid) {
        this.f85957a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzi0) && wj50.m88271j(this.f85957a, ((gzi0) obj).f85957a);
    }

    public final int hashCode() {
        return this.f85957a.hashCode();
    }
}
