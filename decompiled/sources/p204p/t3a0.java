package p204p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class t3a0 implements v3a0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f216734a;

    public t3a0(Throwable th) {
        this.f216734a = th;
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: d */
    public final boolean mo79983d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3a0) && wj50.m88271j(this.f216734a, ((t3a0) obj).f216734a);
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: f */
    public final Object mo52252f(Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8) {
        return function8.apply(this);
    }

    public final int hashCode() {
        return this.f216734a.hashCode();
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: i */
    public final void mo52254i(Consumer consumer, Consumer consumer2, Consumer consumer3, Consumer consumer4, Consumer consumer5, Consumer consumer6, Consumer consumer7, Consumer consumer8) {
        consumer8.accept(this);
    }
}
