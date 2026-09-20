package p204p;

import com.spotify.offline.offlineplugin_proto.EnumC1081g;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes9.dex */
public final class w040 implements Function {

    /* JADX INFO: renamed from: a */
    public static final w040 f246637a = new w040();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? EnumC1081g.COMPLETE : EnumC1081g.MISSING;
    }
}
