package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingKey;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class kwa implements Function {

    /* JADX INFO: renamed from: a */
    public static final kwa f127034a = new kwa();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        pqm0 pqm0Var;
        ArrayList arrayList = new ArrayList();
        for (kpe0 kpe0Var : (List) obj) {
            String strM98354fromPersistedValuexZxBVag = CappingKey.INSTANCE.m98354fromPersistedValuexZxBVag(kpe0Var.f125049a);
            if (strM98354fromPersistedValuexZxBVag != null) {
                CappingKey cappingKeyM98347boximpl = CappingKey.m98347boximpl(CappingKey.m98347boximpl(strM98354fromPersistedValuexZxBVag).m98353unboximpl());
                CappingState cappingState = kpe0Var.f125050b;
                if (cappingState == null) {
                    cappingState = new CappingState(0, 0L, (Set) null, 7, (DefaultConstructorMarker) null);
                }
                pqm0Var = new pqm0(cappingKeyM98347boximpl, cappingState);
            } else {
                pqm0Var = null;
            }
            if (pqm0Var != null) {
                arrayList.add(pqm0Var);
            }
        }
        return kkc0.m56705r0(arrayList);
    }
}
