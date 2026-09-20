package p204p;

import com.spotify.messages.PushNotificationInteractionV1;

/* JADX INFO: loaded from: classes2.dex */
public final class p6x {

    /* JADX INFO: renamed from: a */
    public final xre f174514a;

    /* JADX INFO: renamed from: b */
    public final qre0 f174515b;

    public p6x(xre xreVar, qre0 qre0Var) {
        this.f174514a = xreVar;
        this.f174515b = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m69213a(String str, String str2, String str3, String str4, String str5) {
        set0 set0VarM14392t = PushNotificationInteractionV1.m14392t();
        set0VarM14392t.m77959s(str);
        if (str2 != null) {
            set0VarM14392t.m77960t(str2);
        }
        if (str3 != null) {
            set0VarM14392t.m77957q(str3);
        }
        if (str4 != null) {
            set0VarM14392t.m77958r(str4);
        }
        if (str5 != null) {
            set0VarM14392t.m77956m(str5);
        }
        ((wy3) this.f174514a).getClass();
        set0VarM14392t.m77961u(System.currentTimeMillis());
        this.f174515b.m73616a(set0VarM14392t.build());
    }
}
