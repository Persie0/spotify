package p204p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class o3a0 implements v3a0 {

    /* JADX INFO: renamed from: a */
    public static final o3a0 f161331a = new o3a0();

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: c */
    public final boolean mo66186c() {
        return true;
    }

    public final boolean equals(Object obj) {
        return obj instanceof o3a0;
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: f */
    public final Object mo52252f(Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8) {
        return function2.apply(this);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p204p.v3a0
    /* JADX INFO: renamed from: i */
    public final void mo52254i(Consumer consumer, Consumer consumer2, Consumer consumer3, Consumer consumer4, Consumer consumer5, Consumer consumer6, Consumer consumer7, Consumer consumer8) {
        consumer2.accept(this);
    }
}
