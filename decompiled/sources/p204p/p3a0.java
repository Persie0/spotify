package p204p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class p3a0 implements v3a0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f173596a;

    /* JADX INFO: renamed from: b */
    public final xgj0 f173597b;

    public p3a0(Throwable th, xgj0 xgj0Var) {
        this.f173596a = th;
        this.f173597b = xgj0Var;
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: e */
    public final boolean mo68998e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3a0)) {
            return false;
        }
        p3a0 p3a0Var = (p3a0) obj;
        return wj50.m88271j(this.f173596a, p3a0Var.f173596a) && this.f173597b == p3a0Var.f173597b;
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: f */
    public final Object mo52252f(Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8) {
        return function6.apply(this);
    }

    public final int hashCode() {
        return this.f173597b.hashCode() + (this.f173596a.hashCode() * 31);
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: i */
    public final void mo52254i(Consumer consumer, Consumer consumer2, Consumer consumer3, Consumer consumer4, Consumer consumer5, Consumer consumer6, Consumer consumer7, Consumer consumer8) {
        consumer6.accept(this);
    }
}
