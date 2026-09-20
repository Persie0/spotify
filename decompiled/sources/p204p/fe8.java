package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class fe8 extends te8 {

    /* JADX INFO: renamed from: a */
    public final String f68709a;

    /* JADX INFO: renamed from: b */
    public final UUID f68710b;

    public fe8(String str, UUID uuid) {
        this.f68709a = str;
        this.f68710b = uuid;
    }

    @Override // p204p.te8
    /* JADX INFO: renamed from: a */
    public final String mo32497a() {
        return this.f68709a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe8)) {
            return false;
        }
        fe8 fe8Var = (fe8) obj;
        return wj50.m88271j(this.f68709a, fe8Var.f68709a) && wj50.m88271j(this.f68710b, fe8Var.f68710b);
    }

    public final int hashCode() {
        return this.f68710b.hashCode() + (this.f68709a.hashCode() * 31);
    }
}
