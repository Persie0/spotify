package com.spotify.mobius.extras.patterns;

import com.spotify.mobius.Update;
import com.spotify.mobius.functions.BiFunction;
import com.spotify.mobius.functions.Function;
import p204p.s571;

/* JADX INFO: loaded from: classes8.dex */
final class AutoValue_InnerUpdate<M, E, F, MI, EI, FI> extends InnerUpdate<M, E, F, MI, EI, FI> {

    /* JADX INFO: renamed from: a */
    public final Update f5756a;

    /* JADX INFO: renamed from: b */
    public final Function f5757b;

    /* JADX INFO: renamed from: c */
    public final Function f5758c;

    /* JADX INFO: renamed from: d */
    public final BiFunction f5759d;

    /* JADX INFO: renamed from: e */
    public final InnerEffectHandler f5760e;

    public static final class Builder<M, E, F, MI, EI, FI> extends InnerUpdate.Builder<M, E, F, MI, EI, FI> {

        /* JADX INFO: renamed from: a */
        public Update f5761a;

        /* JADX INFO: renamed from: b */
        public Function f5762b;

        /* JADX INFO: renamed from: c */
        public Function f5763c;

        /* JADX INFO: renamed from: d */
        public BiFunction f5764d;

        /* JADX INFO: renamed from: e */
        public InnerEffectHandler f5765e;

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        /* JADX INFO: renamed from: a */
        public final InnerUpdate mo15638a() {
            String strM77250i = this.f5761a == null ? " innerUpdate" : "";
            if (this.f5762b == null) {
                strM77250i = strM77250i.concat(" modelExtractor");
            }
            if (this.f5763c == null) {
                strM77250i = s571.m77250i(strM77250i, " eventExtractor");
            }
            if (this.f5764d == null) {
                strM77250i = s571.m77250i(strM77250i, " modelUpdater");
            }
            if (this.f5765e == null) {
                strM77250i = s571.m77250i(strM77250i, " innerEffectHandler");
            }
            if (strM77250i.isEmpty()) {
                return new AutoValue_InnerUpdate(this.f5761a, this.f5762b, this.f5763c, this.f5764d, this.f5765e);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM77250i));
        }

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        /* JADX INFO: renamed from: b */
        public final InnerUpdate.Builder mo15639b(Function function) {
            this.f5763c = function;
            return this;
        }

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        /* JADX INFO: renamed from: c */
        public final InnerUpdate.Builder mo15640c(InnerEffectHandler innerEffectHandler) {
            this.f5765e = innerEffectHandler;
            return this;
        }

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        /* JADX INFO: renamed from: d */
        public final InnerUpdate.Builder mo15641d(Update update) {
            this.f5761a = update;
            return this;
        }

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        /* JADX INFO: renamed from: e */
        public final InnerUpdate.Builder mo15642e(Function function) {
            this.f5762b = function;
            return this;
        }

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        /* JADX INFO: renamed from: f */
        public final InnerUpdate.Builder mo15643f(BiFunction biFunction) {
            this.f5764d = biFunction;
            return this;
        }
    }

    public AutoValue_InnerUpdate(Update update, Function function, Function function2, BiFunction biFunction, InnerEffectHandler innerEffectHandler) {
        this.f5756a = update;
        this.f5757b = function;
        this.f5758c = function2;
        this.f5759d = biFunction;
        this.f5760e = innerEffectHandler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InnerUpdate) {
            AutoValue_InnerUpdate autoValue_InnerUpdate = (AutoValue_InnerUpdate) ((InnerUpdate) obj);
            if (this.f5756a.equals(autoValue_InnerUpdate.f5756a) && this.f5757b.equals(autoValue_InnerUpdate.f5757b) && this.f5758c.equals(autoValue_InnerUpdate.f5758c) && this.f5759d.equals(autoValue_InnerUpdate.f5759d) && this.f5760e.equals(autoValue_InnerUpdate.f5760e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f5756a.hashCode() ^ 1000003) * 1000003) ^ this.f5757b.hashCode()) * 1000003) ^ this.f5758c.hashCode()) * 1000003) ^ this.f5759d.hashCode()) * 1000003) ^ this.f5760e.hashCode();
    }

    public final String toString() {
        return "InnerUpdate{innerUpdate=" + this.f5756a + ", modelExtractor=" + this.f5757b + ", eventExtractor=" + this.f5758c + ", modelUpdater=" + this.f5759d + ", innerEffectHandler=" + this.f5760e + "}";
    }
}
