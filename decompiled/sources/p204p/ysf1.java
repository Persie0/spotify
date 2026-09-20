package p204p;

import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ysf1 implements pfo {

    /* JADX INFO: renamed from: a */
    public final Uri f275770a;

    /* JADX INFO: renamed from: b */
    public final byte[] f275771b;

    /* JADX INFO: renamed from: c */
    public final Map f275772c;

    public ysf1(ntf1 ntf1Var) {
        this.f275770a = ntf1Var.getUri();
        this.f275771b = ntf1Var.getData();
        HashMap map = new HashMap();
        for (Map.Entry entry : ((HashMap) ntf1Var.mo33841h()).entrySet()) {
            if (entry.getKey() != null) {
                map.put((String) entry.getKey(), (qfo) ((qfo) entry.getValue()).freeze());
            }
        }
        this.f275772c = Collections.unmodifiableMap(map);
    }

    @Override // p204p.pfo
    public final byte[] getData() {
        return this.f275771b;
    }

    @Override // p204p.pfo
    public final Uri getUri() {
        return this.f275770a;
    }

    @Override // p204p.pfo
    /* JADX INFO: renamed from: h */
    public final Map mo33841h() {
        return this.f275772c;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        sb.append("uri=".concat(String.valueOf(this.f275770a)));
        byte[] bArr = this.f275771b;
        sb.append(", dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Map map = this.f275772c;
        sb.append(", numAssets=" + map.size());
        if (zIsLoggable && !map.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : map.entrySet()) {
                sb.append(str + ((String) entry.getKey()) + ": " + ((qfo) entry.getValue()).getId());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // p204p.zc00
    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }
}
