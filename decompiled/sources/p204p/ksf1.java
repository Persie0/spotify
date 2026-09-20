package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ksf1 implements qfo {

    /* JADX INFO: renamed from: a */
    public final String f125946a;

    /* JADX INFO: renamed from: b */
    public final String f125947b;

    public ksf1(tsf1 tsf1Var) {
        this.f125946a = tsf1Var.getId();
        this.f125947b = tsf1Var.mo1524c();
    }

    @Override // p204p.qfo
    /* JADX INFO: renamed from: c */
    public final String mo1524c() {
        return this.f125947b;
    }

    @Override // p204p.qfo
    public final String getId() {
        return this.f125946a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetEntity[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.f125946a;
        if (str == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(str);
        }
        sb.append(", key=");
        return dq60.m36616p(this.f125947b, "]", sb);
    }

    @Override // p204p.zc00
    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }
}
