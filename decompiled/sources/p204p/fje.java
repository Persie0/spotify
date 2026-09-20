package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fje implements w6q0 {

    /* JADX INFO: renamed from: a */
    public final String f70205a;

    /* JADX INFO: renamed from: b */
    public final String f70206b;

    public fje(String str, String str2) {
        this.f70205a = str;
        this.f70206b = str2;
    }

    @Override // p204p.x6q0
    /* JADX INFO: renamed from: a */
    public String mo29381a() {
        return this.f70205a;
    }

    @Override // p204p.x6q0
    /* JADX INFO: renamed from: b */
    public final boolean mo41803b() {
        return false;
    }

    @Override // p204p.x6q0
    public final String getPolicyId() {
        return this.f70206b;
    }

    @Override // p204p.w6q0
    public final String getStringValue() {
        return mo29381a();
    }
}
