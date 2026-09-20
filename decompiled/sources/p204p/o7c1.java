package p204p;

import com.spotify.home.evopage.mobius.Event;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class o7c1 implements Function {

    /* JADX INFO: renamed from: a */
    public static final o7c1 f162514a = new o7c1();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return Event.VideoSettingsChanged.INSTANCE;
    }
}
