package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class nzi {

    /* JADX INFO: renamed from: e */
    public static final List f160089e;

    /* JADX INFO: renamed from: f */
    public static final List f160090f;

    /* JADX INFO: renamed from: g */
    public static final nzi f160091g;

    /* JADX INFO: renamed from: h */
    public static final nzi f160092h;

    /* JADX INFO: renamed from: a */
    public final boolean f160093a;

    /* JADX INFO: renamed from: b */
    public final boolean f160094b;

    /* JADX INFO: renamed from: c */
    public final String[] f160095c;

    /* JADX INFO: renamed from: d */
    public final String[] f160096d;

    static {
        pde pdeVar = pde.f176442r;
        pde pdeVar2 = pde.f176443s;
        pde pdeVar3 = pde.f176444t;
        pde pdeVar4 = pde.f176436l;
        pde pdeVar5 = pde.f176438n;
        pde pdeVar6 = pde.f176437m;
        pde pdeVar7 = pde.f176439o;
        pde pdeVar8 = pde.f176441q;
        pde pdeVar9 = pde.f176440p;
        List listM46715L = h6f.m46715L(pdeVar, pdeVar2, pdeVar3, pdeVar4, pdeVar5, pdeVar6, pdeVar7, pdeVar8, pdeVar9);
        f160089e = listM46715L;
        List listM46715L2 = h6f.m46715L(pdeVar, pdeVar2, pdeVar3, pdeVar4, pdeVar5, pdeVar6, pdeVar7, pdeVar8, pdeVar9, pde.f176434j, pde.f176435k, pde.f176432h, pde.f176433i, pde.f176430f, pde.f176431g, pde.f176429e);
        f160090f = listM46715L2;
        mzi mziVar = new mzi();
        pde[] pdeVarArr = (pde[]) listM46715L.toArray(new pde[0]);
        mziVar.m63250b((pde[]) Arrays.copyOf(pdeVarArr, pdeVarArr.length));
        gx71 gx71Var = gx71.TLS_1_3;
        gx71 gx71Var2 = gx71.TLS_1_2;
        mziVar.m63251c(gx71Var, gx71Var2);
        mziVar.f148717b = true;
        mziVar.m63249a();
        mzi mziVar2 = new mzi();
        pde[] pdeVarArr2 = (pde[]) listM46715L2.toArray(new pde[0]);
        mziVar2.m63250b((pde[]) Arrays.copyOf(pdeVarArr2, pdeVarArr2.length));
        mziVar2.m63251c(gx71Var, gx71Var2);
        mziVar2.f148717b = true;
        f160091g = mziVar2.m63249a();
        mzi mziVar3 = new mzi();
        pde[] pdeVarArr3 = (pde[]) listM46715L2.toArray(new pde[0]);
        mziVar3.m63250b((pde[]) Arrays.copyOf(pdeVarArr3, pdeVarArr3.length));
        mziVar3.m63251c(gx71Var, gx71Var2, gx71.TLS_1_1, gx71.TLS_1_0);
        mziVar3.f148717b = true;
        mziVar3.m63249a();
        f160092h = new nzi(false, false, null, null);
    }

    public nzi(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f160093a = z;
        this.f160094b = z2;
        this.f160095c = strArr;
        this.f160096d = strArr2;
    }

    /* JADX INFO: renamed from: a */
    public final void m65964a(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        wj50.m88279p(enabledCipherSuites);
        String[] strArr = this.f160095c;
        if (strArr != null) {
            enabledCipherSuites = a0f1.m24350k(strArr, enabledCipherSuites, pde.f176427c);
        }
        String[] strArr2 = this.f160096d;
        String[] strArrM24350k = strArr2 != null ? a0f1.m24350k(sSLSocket.getEnabledProtocols(), strArr2, mxi0.f148051a) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        wj50.m88279p(supportedCipherSuites);
        ode odeVar = pde.f176427c;
        byte[] bArr = a0f1.f11072a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (odeVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.f160093a;
        if (!z2) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr3.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(strArrM24350k, strArrM24350k.length);
        if (!z2) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr5.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        nzi nziVar = new nzi(z2, this.f160094b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (nziVar.m65966c() != null) {
            sSLSocket.setEnabledProtocols(nziVar.f160096d);
        }
        if (nziVar.m65965b() != null) {
            sSLSocket.setEnabledCipherSuites(nziVar.f160095c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m65965b() {
        String[] strArr = this.f160095c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(pde.f176426b.m24953G(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m65966c() {
        String[] strArr = this.f160096d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g0b1.m43273o(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nzi)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        nzi nziVar = (nzi) obj;
        boolean z = nziVar.f160093a;
        boolean z2 = this.f160093a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f160095c, nziVar.f160095c) && Arrays.equals(this.f160096d, nziVar.f160096d) && this.f160094b == nziVar.f160094b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f160093a) {
            return 17;
        }
        String[] strArr = this.f160095c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f160096d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f160094b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f160093a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(m65965b(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(m65966c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return s571.m77253l(sb, this.f160094b, ')');
    }
}
