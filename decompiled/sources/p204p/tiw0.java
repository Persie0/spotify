package p204p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$RemoveCommand;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes9.dex */
public final class tiw0 implements Function {

    /* JADX INFO: renamed from: a */
    public static final tiw0 f220759a = new tiw0();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        String strConcat;
        EsOfflinePlugin$RemoveCommand.Query query = (EsOfflinePlugin$RemoveCommand.Query) obj;
        gva gvaVarM28374a = b7f0.m28374a(query.getMetadataMap());
        return (gvaVarM28374a == null || (strConcat = "spotify:track:".concat(mx8.m63085a(gvaVarM28374a.m45891s()))) == null) ? query.getLink() : strConcat;
    }
}
