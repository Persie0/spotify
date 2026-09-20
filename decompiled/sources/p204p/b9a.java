package p204p;

import com.spotify.messages.BootstrapRequestNonAuth;

/* JADX INFO: loaded from: classes10.dex */
public final class b9a {

    /* JADX INFO: renamed from: a */
    public final n6x f24805a;

    /* JADX INFO: renamed from: a */
    public void m28462a(long j, int i, int i2, String str, String str2, String str3, y6q0 y6q0Var) {
        e9a e9aVarM13721v = BootstrapRequestNonAuth.m13721v();
        e9aVarM13721v.m38239t(j);
        e9aVarM13721v.m38242w(i);
        e9aVarM13721v.m38237r(str);
        e9aVarM13721v.m38240u(i2);
        e9aVarM13721v.m38238s(kwg1.m57533e());
        e9aVarM13721v.m38235m(y6q0Var.m92969b());
        if (str2 != null) {
            e9aVarM13721v.m38236q(str2);
        }
        if (str3 != null) {
            e9aVarM13721v.m38241v(str3);
        }
        this.f24805a.mo27070c("BootstrapRequestNonAuth", ((BootstrapRequestNonAuth) e9aVarM13721v.build()).toByteArray());
    }

    /* JADX INFO: renamed from: b */
    public void m28463b(long j, Integer num, y6q0 y6q0Var) {
        e9a e9aVarM13721v = BootstrapRequestNonAuth.m13721v();
        e9aVarM13721v.m38239t(j);
        e9aVarM13721v.m38237r("timeout");
        e9aVarM13721v.m38238s(kwg1.m57533e());
        if (num != null) {
            e9aVarM13721v.m38242w(num.intValue());
        }
        e9aVarM13721v.m38235m(y6q0Var.m92969b());
        this.f24805a.mo27070c("BootstrapRequestNonAuth", ((BootstrapRequestNonAuth) e9aVarM13721v.build()).toByteArray());
    }

    /* JADX INFO: renamed from: c */
    public void m28464c(String str, byte[] bArr) {
        this.f24805a.mo27070c(str, bArr);
    }
}
