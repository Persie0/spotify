package p204p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeDefer;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeSwitchIfEmpty;

/* JADX INFO: loaded from: classes8.dex */
public final class we0 {

    /* JADX INFO: renamed from: a */
    public final Object f250391a;

    /* JADX INFO: renamed from: b */
    public final Object f250392b;

    /* JADX INFO: renamed from: c */
    public final hky0 f250393c;

    public we0(gh00 gh00Var, gh00 gh00Var2, hky0 hky0Var) {
        this.f250391a = gh00Var;
        this.f250392b = gh00Var2;
        this.f250393c = hky0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.gh00] */
    /* JADX INFO: renamed from: a */
    public final MaybeSwitchIfEmpty m87854a(ContextTrack contextTrack) {
        Object objM66541c = this.f250393c.f92553a.m66541c(this.f250391a.invoke(contextTrack));
        Maybe maybeM23363f = objM66541c != null ? Maybe.m23363f(objM66541c) : MaybeEmpty.f8264a;
        MaybeDefer maybeDefer = new MaybeDefer(new ve0(0, this, contextTrack));
        maybeM23363f.getClass();
        return new MaybeSwitchIfEmpty(maybeM23363f, maybeDefer);
    }
}
