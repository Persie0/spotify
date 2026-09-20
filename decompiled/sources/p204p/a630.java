package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class a630 {

    /* JADX INFO: renamed from: a */
    public final UUID f12681a;

    public a630(UUID uuid) {
        this.f12681a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a630) && wj50.m88271j(this.f12681a, ((a630) obj).f12681a);
    }

    public final int hashCode() {
        return this.f12681a.hashCode();
    }
}
