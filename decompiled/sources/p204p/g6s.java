package p204p;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class g6s implements zed0 {

    /* JADX INFO: renamed from: a */
    public final i9s f77101a;

    /* JADX INFO: renamed from: b */
    public final String f77102b = bm51.m29801l0(UUID.randomUUID().toString(), "-", "");

    public g6s(i9s i9sVar) {
        this.f77101a = i9sVar;
    }

    @Override // p204p.zed0
    /* JADX INFO: renamed from: a */
    public final String mo43762a() {
        return this.f77101a.f100067a;
    }

    @Override // p204p.zed0
    /* JADX INFO: renamed from: b */
    public final String mo43763b() {
        return this.f77102b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6s) && wj50.m88271j(this.f77101a, ((g6s) obj).f77101a);
    }

    public final int hashCode() {
        return this.f77101a.hashCode();
    }

    @Override // p204p.zed0
    public final Map metadata() {
        return this.f77101a.f100068b;
    }
}
