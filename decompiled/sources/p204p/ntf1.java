package p204p;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ntf1 extends cdo implements pfo {

    /* JADX INFO: renamed from: d */
    public final int f158061d;

    public ntf1(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f158061d = i2;
    }

    @Override // p204p.zc00
    public final /* synthetic */ Object freeze() {
        return new ysf1(this);
    }

    @Override // p204p.pfo
    public final byte[] getData() {
        DataHolder dataHolder = this.f36920a;
        int i = this.f36921b;
        dataHolder.m1503n0(i, "data");
        return dataHolder.f1864d[this.f36922c].getBlob(i, dataHolder.f1863c.getInt("data"));
    }

    @Override // p204p.pfo
    public final Uri getUri() {
        DataHolder dataHolder = this.f36920a;
        int i = this.f36921b;
        dataHolder.m1503n0(i, "path");
        return Uri.parse(dataHolder.f1864d[this.f36922c].getString(i, dataHolder.f1863c.getInt("path")));
    }

    @Override // p204p.pfo
    /* JADX INFO: renamed from: h */
    public final Map mo33841h() {
        int i = this.f158061d;
        HashMap map = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            tsf1 tsf1Var = new tsf1(this.f36920a, this.f36921b + i2);
            DataHolder dataHolder = tsf1Var.f36920a;
            int i3 = tsf1Var.f36921b;
            dataHolder.m1503n0(i3, "asset_key");
            if (dataHolder.f1864d[tsf1Var.f36922c].getString(i3, dataHolder.f1863c.getInt("asset_key")) != null) {
                int i4 = tsf1Var.f36921b;
                dataHolder.m1503n0(i4, "asset_key");
                map.put(dataHolder.f1864d[tsf1Var.f36922c].getString(i4, dataHolder.f1863c.getInt("asset_key")), tsf1Var);
            }
        }
        return map;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        DataHolder dataHolder = this.f36920a;
        int i = this.f36921b;
        dataHolder.m1503n0(i, "data");
        byte[] blob = dataHolder.f1864d[this.f36922c].getBlob(i, dataHolder.f1863c.getInt("data"));
        Map mapMo33841h = mo33841h();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(getUri())));
        sb.append(", dataSz=".concat((blob == null ? "null" : Integer.valueOf(blob.length)).toString()));
        HashMap map = (HashMap) mapMo33841h;
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
}
