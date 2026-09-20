package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class kf8 implements pf8 {

    /* JADX INFO: renamed from: a */
    public final String f122089a;

    /* JADX INFO: renamed from: b */
    public final UUID f122090b;

    public kf8(String str, UUID uuid) {
        this.f122089a = str;
        this.f122090b = uuid;
    }

    @Override // p204p.pf8
    /* JADX INFO: renamed from: a */
    public final String mo38720a() {
        return this.f122089a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kf8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kf8 kf8Var = (kf8) obj;
        return wj50.m88271j(this.f122089a, kf8Var.f122089a) && wj50.m88271j(this.f122090b, kf8Var.f122090b);
    }

    public final int hashCode() {
        return this.f122090b.hashCode() + (this.f122089a.hashCode() * 31);
    }
}
