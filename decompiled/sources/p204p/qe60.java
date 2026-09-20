package p204p;

import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class qe60 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ re60 f187853b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ UrlResponseInfo f187854c;

    public /* synthetic */ qe60(re60 re60Var, UrlResponseInfo urlResponseInfo, int i) {
        this.f187852a = i;
        this.f187853b = re60Var;
        this.f187854c = urlResponseInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f187852a) {
            case 0:
                UrlResponseInfo urlResponseInfo = this.f187854c;
                re60 re60Var = this.f187853b;
                ue60 ue60Var = re60Var.f198294d;
                try {
                    re60Var.f198291a.onCanceled(ue60Var, urlResponseInfo);
                } catch (Exception unused) {
                    ue60Var.f229438y = true;
                }
                re60Var.m75385d();
                ue60Var.f229432s.f68353e.decrementAndGet();
                break;
            default:
                UrlResponseInfo urlResponseInfo2 = this.f187854c;
                re60 re60Var2 = this.f187853b;
                ue60 ue60Var2 = re60Var2.f198294d;
                try {
                    re60Var2.f198291a.onSucceeded(ue60Var2, urlResponseInfo2);
                } catch (Exception unused2) {
                    ue60Var2.f229438y = true;
                }
                re60Var2.m75385d();
                ue60Var2.f229432s.f68353e.decrementAndGet();
                break;
        }
    }
}
