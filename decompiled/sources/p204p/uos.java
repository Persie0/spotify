package p204p;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class uos implements Function {

    /* JADX INFO: renamed from: a */
    public static final uos f232508a = new uos();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return xul0.m92201d(LoggingParams.builder().interactionId(((z650) obj).f279709a).build());
    }
}
