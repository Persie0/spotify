package p204p;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes11.dex */
public final class bc6 implements Function {

    /* JADX INFO: renamed from: a */
    public static final bc6 f25786a = new bc6();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return LoggingParams.builder().interactionId(((z650) obj).f279709a).build();
    }
}
