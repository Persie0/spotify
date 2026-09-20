package p204p;

import com.google.protobuf.Empty;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyResponse;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: classes9.dex */
public final class a140 implements Supplier {

    /* JADX INFO: renamed from: b */
    public static final a140 f11322b = new a140(0);

    /* JADX INFO: renamed from: c */
    public static final a140 f11323c = new a140(1);

    /* JADX INFO: renamed from: d */
    public static final a140 f11324d = new a140(2);

    /* JADX INFO: renamed from: e */
    public static final a140 f11325e = new a140(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11326a;

    public /* synthetic */ a140(int i) {
        this.f11326a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        switch (this.f11326a) {
            case 0:
                return EsOfflinePlugin$IdentifyResponse.m16052o();
            case 1:
                return Empty.m1933n();
            case 2:
                return ziu0.f283246a;
            default:
                return j5d1.f108942a;
        }
    }
}
