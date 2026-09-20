package p204p;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s6t0 implements t6t0, r121 {

    /* JADX INFO: renamed from: a */
    public final UUID f206194a;

    /* JADX INFO: renamed from: b */
    public final String f206195b;

    /* JADX INFO: renamed from: c */
    public final long f206196c;

    /* JADX INFO: renamed from: d */
    public final long f206197d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f206198e;

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArrayList f206199f;

    /* JADX INFO: renamed from: g */
    public final m221 f206200g;

    public s6t0(UUID uuid, String str, long j, long j2, ConcurrentHashMap concurrentHashMap, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.f206194a = uuid;
        this.f206195b = str;
        this.f206196c = j;
        this.f206197d = j2;
        this.f206198e = concurrentHashMap;
        this.f206199f = copyOnWriteArrayList;
        this.f206200g = m221.TRACE;
    }

    @Override // p204p.r121
    /* JADX INFO: renamed from: a */
    public final m221 mo66363a() {
        return this.f206200g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6t0)) {
            return false;
        }
        s6t0 s6t0Var = (s6t0) obj;
        return wj50.m88271j(this.f206194a, s6t0Var.f206194a) && wj50.m88271j(this.f206195b, s6t0Var.f206195b) && this.f206196c == s6t0Var.f206196c && this.f206197d == s6t0Var.f206197d && wj50.m88271j(this.f206198e, s6t0Var.f206198e) && wj50.m88271j(this.f206199f, s6t0Var.f206199f);
    }

    @Override // p204p.r121
    public final UUID getId() {
        return this.f206194a;
    }

    @Override // p204p.r121
    public final String getKey() {
        return this.f206195b;
    }

    public final int hashCode() {
        return this.f206199f.hashCode() + ((this.f206198e.hashCode() + dq60.m36605e(dq60.m36605e(s571.m77243b(this.f206194a.hashCode() * 31, 31, this.f206195b), this.f206196c, 31), this.f206197d, 31)) * 31);
    }

    public /* synthetic */ s6t0(UUID uuid, String str, long j, long j2, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        this(uuid, str, j, (i & 8) != 0 ? 0L : j2, new ConcurrentHashMap(), (i & 32) != 0 ? new CopyOnWriteArrayList() : copyOnWriteArrayList);
    }
}
