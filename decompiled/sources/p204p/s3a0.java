package p204p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: classes10.dex */
public final class s3a0 implements v3a0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f205248a;

    /* JADX INFO: renamed from: b */
    public final xgj0 f205249b;

    public s3a0(Throwable th, xgj0 xgj0Var) {
        this.f205248a = th;
        this.f205249b = xgj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3a0)) {
            return false;
        }
        s3a0 s3a0Var = (s3a0) obj;
        return wj50.m88271j(this.f205248a, s3a0Var.f205248a) && this.f205249b == s3a0Var.f205249b;
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: f */
    public final Object mo52252f(Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8) {
        return function7.apply(this);
    }

    public final int hashCode() {
        return this.f205249b.hashCode() + (this.f205248a.hashCode() * 31);
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: i */
    public final void mo52254i(Consumer consumer, Consumer consumer2, Consumer consumer3, Consumer consumer4, Consumer consumer5, Consumer consumer6, Consumer consumer7, Consumer consumer8) {
        consumer7.accept(this);
    }
}
