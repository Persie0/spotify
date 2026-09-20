package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class noe0 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f156675a;

    public noe0(String str) {
        this.f156675a = str;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        Object obj2 = ((s6x0) obj).f206218a;
        ArrayList arrayList = new ArrayList();
        if (!(obj2 instanceof c6x0)) {
            arrayList.add(new hhv(this.f156675a, ((MessageResponse.Success) obj2).getToken()));
        }
        return g6f.m43728j1(arrayList);
    }
}
