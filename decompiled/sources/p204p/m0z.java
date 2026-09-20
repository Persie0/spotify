package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class m0z {

    /* JADX INFO: renamed from: a */
    public final boolean f138776a;

    /* JADX INFO: renamed from: b */
    public final List f138777b;

    public m0z(List list, boolean z) {
        this.f138776a = z;
        this.f138777b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0z)) {
            return false;
        }
        m0z m0zVar = (m0z) obj;
        return this.f138776a == m0zVar.f138776a && wj50.m88271j(this.f138777b, m0zVar.f138777b);
    }

    public final int hashCode() {
        return this.f138777b.hashCode() + (Boolean.hashCode(this.f138776a) * 31);
    }
}
