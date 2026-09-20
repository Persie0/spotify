package p204p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gnt {
    /* JADX INFO: renamed from: a */
    public static final void m45317a(RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilder, Class cls, gh00 gh00Var) {
        subtypeEffectHandlerBuilder.m15665g(cls, new ent(gh00Var));
    }

    /* JADX INFO: renamed from: b */
    public static void m45318b(RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilder, Class cls, Consumer consumer, Scheduler scheduler) {
        subtypeEffectHandlerBuilder.m15665g(cls, new C2263po(12, scheduler, consumer));
    }
}
