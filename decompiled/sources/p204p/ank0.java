package p204p;

import io.reactivex.rxjava3.core.Emitter;

/* JADX INFO: loaded from: classes10.dex */
public final class ank0 extends bnk0 {

    /* JADX INFO: renamed from: a */
    public final Object f17460a;

    public ank0(Emitter emitter) {
        this.f17460a = emitter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ank0) && wj50.m88271j(this.f17460a, ((ank0) obj).f17460a);
    }

    public final int hashCode() {
        Object obj = this.f17460a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
