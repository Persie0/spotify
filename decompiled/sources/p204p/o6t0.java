package p204p;

import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o6t0 implements t6t0, r121 {

    /* JADX INFO: renamed from: a */
    public final UUID f162410a;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f162412c;

    /* JADX INFO: renamed from: b */
    public final String f162411b = "event";

    /* JADX INFO: renamed from: d */
    public final m221 f162413d = m221.EVENT;

    public o6t0(UUID uuid, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.f162410a = uuid;
        this.f162412c = copyOnWriteArrayList;
    }

    @Override // p204p.r121
    /* JADX INFO: renamed from: a */
    public final m221 mo66363a() {
        return this.f162413d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6t0)) {
            return false;
        }
        o6t0 o6t0Var = (o6t0) obj;
        return wj50.m88271j(this.f162410a, o6t0Var.f162410a) && wj50.m88271j(this.f162411b, o6t0Var.f162411b) && wj50.m88271j(this.f162412c, o6t0Var.f162412c);
    }

    @Override // p204p.r121
    public final UUID getId() {
        return this.f162410a;
    }

    @Override // p204p.r121
    public final String getKey() {
        return this.f162411b;
    }

    public final int hashCode() {
        return this.f162412c.hashCode() + s571.m77243b(this.f162410a.hashCode() * 31, 31, this.f162411b);
    }
}
