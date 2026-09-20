package p204p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class j3a0 implements v3a0 {

    /* JADX INFO: renamed from: a */
    public final Object f108329a;

    public j3a0(Object obj) {
        this.f108329a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3a0) && wj50.m88271j(this.f108329a, ((j3a0) obj).f108329a);
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: f */
    public final Object mo52252f(Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8) {
        return function5.apply(this);
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: g */
    public final boolean mo52253g() {
        return true;
    }

    public final int hashCode() {
        Object obj = this.f108329a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: i */
    public final void mo52254i(Consumer consumer, Consumer consumer2, Consumer consumer3, Consumer consumer4, Consumer consumer5, Consumer consumer6, Consumer consumer7, Consumer consumer8) {
        consumer5.accept(this);
    }
}
