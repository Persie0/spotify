package p204p;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes8.dex */
public final class dod0 implements znd0 {

    /* JADX INFO: renamed from: a */
    public final r9d0 f51024a;

    public dod0(r9d0 r9d0Var) {
        this.f51024a = r9d0Var;
    }

    @Override // p204p.znd0
    /* JADX INFO: renamed from: a */
    public final Single mo33497a(String str, vnd0 vnd0Var, int i) {
        return m36527d(str).map(new us30(12, vnd0Var, str));
    }

    @Override // p204p.znd0
    /* JADX INFO: renamed from: b */
    public final Maybe mo33498b(int i, String str, String str2) {
        return m36527d(str).map(new xba0(27)).flatMapMaybe(new two(str2, 6));
    }

    @Override // p204p.znd0
    /* JADX INFO: renamed from: c */
    public final Single mo33499c(int i, String str, String str2) {
        return m36527d(str).map(new xba0(27));
    }

    /* JADX INFO: renamed from: d */
    public final Single m36527d(String str) {
        for (o9d0 o9d0Var : this.f51024a.m75049e()) {
            if (o9d0Var.mo37703l().equals(str)) {
                return Single.just(o9d0Var);
            }
        }
        return Single.create(new us30(13, this, str));
    }
}
