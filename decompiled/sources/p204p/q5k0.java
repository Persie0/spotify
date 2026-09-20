package p204p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;

/* JADX INFO: loaded from: classes8.dex */
public interface q5k0 {
    /* JADX INFO: renamed from: a */
    default Maybe mo37593a(ContextTrack contextTrack) {
        return MaybeEmpty.f8264a;
    }

    /* JADX INFO: renamed from: b */
    default void mo72195b(f220 f220Var, k380 k380Var) {
        mo33469e(f220Var);
    }

    /* JADX INFO: renamed from: c */
    default Maybe mo67108c(ContextTrack contextTrack, String str) {
        return mo37593a(contextTrack);
    }

    /* JADX INFO: renamed from: d */
    up60 mo33468d();

    /* JADX INFO: renamed from: e */
    void mo33469e(f220 f220Var);

    /* JADX INFO: renamed from: f */
    default void mo33470f(f220 f220Var, mky0 mky0Var, k380 k380Var) {
        mo72195b(f220Var, k380Var);
    }
}
