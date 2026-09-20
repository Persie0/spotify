package p204p;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k3t0 implements amk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118971a;

    @Override // p204p.eeu
    /* JADX INFO: renamed from: a */
    public final void mo24360a(Object obj, Object obj2) {
        switch (this.f118971a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                bmk0 bmk0Var = (bmk0) obj2;
                bmk0Var.mo29864a(l3t0.f129431g, entry.getKey());
                bmk0Var.mo29864a(l3t0.f129432h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
