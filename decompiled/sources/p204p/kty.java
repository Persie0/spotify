package p204p;

import io.reactivex.rxjava3.functions.Function;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class kty implements Function {

    /* JADX INFO: renamed from: a */
    public final String f126405a;

    /* JADX INFO: renamed from: b */
    public final String f126406b;

    public /* synthetic */ kty(String str, String str2) {
        this.f126405a = str;
        this.f126406b = str2;
    }

    /* JADX INFO: renamed from: a */
    public String m57363a() {
        return this.f126405a;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        CollectionDecorateResponse collectionDecorateResponse = (CollectionDecorateResponse) obj;
        if (collectionDecorateResponse.m97483s() > 0) {
            return (CollectionTrack) g6f.m43741q0(collectionDecorateResponse.m97484t());
        }
        int iM97550o = collectionDecorateResponse.m97482r().m97550o();
        String strM97551q = collectionDecorateResponse.m97482r().m97551q();
        StringBuilder sbM38573v = edb.m38573v("Couldn't load metadata for track ", this.f126405a, " contextUri: ", this.f126406b, " code: ");
        sbM38573v.append(iM97550o);
        sbM38573v.append(" reason: ");
        sbM38573v.append(strM97551q);
        na6.m63957e(sbM38573v.toString());
        return CollectionTrack.m97531q();
    }

    /* JADX INFO: renamed from: b */
    public String m57364b() {
        return this.f126406b;
    }
}
