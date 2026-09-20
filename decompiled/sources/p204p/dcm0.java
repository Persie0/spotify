package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class dcm0 {

    /* JADX INFO: renamed from: a */
    public final wpi0 f47580a;

    /* JADX INFO: renamed from: b */
    public final wg61 f47581b;

    /* JADX INFO: renamed from: c */
    public final wg61 f47582c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fcm0 f47583d;

    public dcm0(fcm0 fcm0Var) {
        this.f47583d = fcm0Var;
        this.f47580a = new wpi0(fcm0Var.f68152f);
        this.f47581b = new wg61(new nzk0(fcm0Var, 9));
        this.f47582c = new wg61(new vvk0(fcm0Var, 25));
    }

    /* JADX INFO: renamed from: a */
    public final String m35663a() {
        return (String) this.f47581b.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final Object m35664b(Class cls) {
        return ((pcm0) this.f47583d.m41328a()).mo60822f(cls);
    }

    /* JADX INFO: renamed from: c */
    public final void m35665c(String str) {
        this.f47583d.f68153g.mo24745d(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m35666d(String str, d850 d850Var, Bundle bundle) {
        this.f47583d.f68153g.mo24744b(str, d850Var, bundle);
    }

    /* JADX INFO: renamed from: e */
    public final Object m35667e(Class cls) {
        Object objMo48941a = this.f47583d.f68151e.mo48941a(cls);
        if (objMo48941a != null) {
            return objMo48941a;
        }
        throw new IllegalStateException(("Unsupported page accessory: " + cls).toString());
    }
}
