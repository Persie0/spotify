package p204p;

import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes4.dex */
public final class tsf1 extends cdo implements qfo {
    @Override // p204p.qfo
    /* JADX INFO: renamed from: c */
    public final String mo1524c() {
        DataHolder dataHolder = this.f36920a;
        int i = this.f36921b;
        dataHolder.m1503n0(i, "asset_key");
        return dataHolder.f1864d[this.f36922c].getString(i, dataHolder.f1863c.getInt("asset_key"));
    }

    @Override // p204p.zc00
    public final /* synthetic */ Object freeze() {
        return new ksf1(this);
    }

    @Override // p204p.qfo
    public final String getId() {
        DataHolder dataHolder = this.f36920a;
        int i = this.f36921b;
        dataHolder.m1503n0(i, "asset_id");
        return dataHolder.f1864d[this.f36922c].getString(i, dataHolder.f1863c.getInt("asset_id"));
    }
}
