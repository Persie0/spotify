package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class mla {

    /* JADX INFO: renamed from: a */
    public final String f144799a;

    /* JADX INFO: renamed from: b */
    public final UUID f144800b;

    public mla(String str, UUID uuid) {
        this.f144799a = str;
        this.f144800b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mla)) {
            return false;
        }
        mla mlaVar = (mla) obj;
        return wj50.m88271j(this.f144799a, mlaVar.f144799a) && wj50.m88271j(this.f144800b, mlaVar.f144800b);
    }

    public final int hashCode() {
        return this.f144800b.hashCode() + (this.f144799a.hashCode() * 31);
    }
}
