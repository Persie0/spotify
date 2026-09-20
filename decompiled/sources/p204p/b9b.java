package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class b9b {

    /* JADX INFO: renamed from: a */
    public final UUID f24816a;

    /* JADX INFO: renamed from: b */
    public final h9b f24817b;

    /* JADX INFO: renamed from: c */
    public final boolean f24818c;

    public b9b(UUID uuid, h9b h9bVar, boolean z) {
        this.f24816a = uuid;
        this.f24817b = h9bVar;
        this.f24818c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9b)) {
            return false;
        }
        b9b b9bVar = (b9b) obj;
        return wj50.m88271j(this.f24816a, b9bVar.f24816a) && wj50.m88271j(this.f24817b, b9bVar.f24817b) && this.f24818c == b9bVar.f24818c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24818c) + ((this.f24817b.hashCode() + (this.f24816a.hashCode() * 31)) * 31);
    }
}
